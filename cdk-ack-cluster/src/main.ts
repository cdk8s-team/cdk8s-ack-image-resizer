import * as cdk from 'aws-cdk-lib';
import { App, aws_eks as eks, Stack, StackProps } from 'aws-cdk-lib';
import { ManagedPolicy } from 'aws-cdk-lib/aws-iam';
import { Construct } from 'constructs';


export class MyStack extends Stack {
  public readonly cluster: eks.Cluster;

  constructor(scope: Construct, id: string, props: StackProps = {}) {


    const ACKNamespace = 'ack-system';
    const ACKS3ServiceAccountName = 'ack-s3-controller';
    const ACKLambdaServiceAccountName = 'ack-lambda-controller';
    const ACKIAMServiceAccountName = 'ack-iam-controller';
    const ClusterName = 'eks-ack-cdk8s';


    super(scope, id, props);
    // provisiong a cluster
    this.cluster =
      new eks.FargateCluster(this, 'eks-ack-cdk8s', {
        version: eks.KubernetesVersion.V1_21,
        clusterName: ClusterName,
      });
    this.cluster.addFargateProfile('ACKFargateProfile', {
      selectors: [{ namespace: 'ack-system' }],
    });

    new cdk.CfnOutput(this, 'ACKClusterName', {
      value: this.cluster.clusterName,
      description: 'The name of the ACK Cluster',
      exportName: 'ACKClusterName',
    });
    new cdk.CfnOutput(this, 'ACKClusterRoleARN', {
      value: this.cluster.adminRole.roleArn,
      description: 'The role of the ACK Cluster',
      exportName: 'ACKClusterRoleARN',
    });


    const namespace = this.cluster.addManifest('namespace', {
      apiVersion: 'v1',
      kind: 'Namespace',
      metadata: {
        name: ACKNamespace,
      },
    });

    const ackS3ServiceAccount = this.cluster.addServiceAccount(
      'ACKS3SA',
      {
        name: ACKS3ServiceAccountName,
        namespace: ACKNamespace,
      },
    );
    ackS3ServiceAccount.node.addDependency(namespace);

    ackS3ServiceAccount.role.addManagedPolicy(
      ManagedPolicy.fromAwsManagedPolicyName('AmazonS3FullAccess'));

    this.cluster.addHelmChart(
      'AckS3Helm',
      {
        chart: 's3-chart',
        release: 's3-chart',
        repository: 'oci://public.ecr.aws/aws-controllers-k8s/s3-chart',
        version: 'v0.1.0',
        namespace: 'ack-system',
        createNamespace: true,
        values: {
          serviceAccount: { create: false },
          aws: { region: this.region },
        },
      },
    );

    const ackLambdaServiceAccount = this.cluster.addServiceAccount(
      'ACKLambdaSA',
      {
        name: ACKLambdaServiceAccountName,
        namespace: ACKNamespace,
      },
    );
    ackLambdaServiceAccount.node.addDependency(namespace);

    ackLambdaServiceAccount.role.addManagedPolicy(
      ManagedPolicy.fromAwsManagedPolicyName('AWSLambda_FullAccess'));

    this.cluster.addHelmChart(
      'AckLambdaHelm',
      {
        chart: 'lambda-chart',
        release: 'lambda-chart',
        repository: 'oci://public.ecr.aws/aws-controllers-k8s/lambda-chart',
        version: 'v0.0.14',
        namespace: 'ack-system',
        createNamespace: true,
        values: {
          serviceAccount: { create: false },
          aws: { region: this.region },
        },
      },
    );


    const ackIAMServiceAccount = this.cluster.addServiceAccount(
      'ACKIAMSA',
      {
        name: ACKIAMServiceAccountName,
        namespace: ACKNamespace,
      },
    );
    ackIAMServiceAccount.node.addDependency(namespace);

    ackIAMServiceAccount.role.addManagedPolicy(
      ManagedPolicy.fromAwsManagedPolicyName('IAMFullAccess'));

    this.cluster.addHelmChart(
      'AckIAMHelm',
      {
        chart: 'iam-chart',
        release: 'iam-chart',
        repository: 'oci://public.ecr.aws/aws-controllers-k8s/iam-chart',
        version: 'v0.0.13',
        namespace: 'ack-system',
        createNamespace: true,
        values: {
          serviceAccount: { create: false },
          aws: { region: this.region },
        },
      },
    );

  }
}

// for development, use account/region from cdk cli
const devEnv = {
  account: process.env.CDK_DEFAULT_ACCOUNT,
  region: process.env.CDK_DEFAULT_REGION,
};

const app = new App();

new MyStack(app, 'cdk8s-ack-image-resizer-dev', { env: devEnv });
// new MyStack(app, 'cdk8s-ack-image-resizer-prod', { env: prodEnv });

app.synth();

