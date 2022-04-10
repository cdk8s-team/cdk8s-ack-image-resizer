import { App, aws_eks as eks, Stack, StackProps } from 'aws-cdk-lib';
import { ManagedPolicy } from 'aws-cdk-lib/aws-iam';
import { Construct } from 'constructs';

export class MyStack extends Stack {
  constructor(scope: Construct, id: string, props: StackProps = {}) {

    const ACKNamespace = 'ack-system';
    const ACKS3ServiceAccountName = 'ack-s3-controller';
    const ACKLambdaServiceAccountName = 'ack-lambda-controller';
    const ACKIAMServiceAccountName = 'ack-iam-controller';
    super(scope, id, props);
    // provisiong a cluster
    const cluster =
      new eks.FargateCluster(this, 'eks-ack-cdk8s', {
        version: eks.KubernetesVersion.V1_21,
        clusterName: 'eks-ack-cdk8s',
      });
    cluster.addFargateProfile('ACKFargateProfile', {
      selectors: [{ namespace: 'ack-system' }],
    });


    const namespace = cluster.addManifest('namespace', {
      apiVersion: 'v1',
      kind: 'Namespace',
      metadata: {
        name: ACKNamespace,
      },
    });

    const ackS3ServiceAccount = cluster.addServiceAccount(
      'ACKS3SA',
      {
        name: ACKS3ServiceAccountName,
        namespace: ACKNamespace,
      },
    );
    ackS3ServiceAccount.node.addDependency(namespace);

    ackS3ServiceAccount.role.addManagedPolicy(
      ManagedPolicy.fromAwsManagedPolicyName('AmazonS3FullAccess'));

    const ackLambdaServiceAccount = cluster.addServiceAccount(
      'ACKLambdaSA',
      {
        name: ACKLambdaServiceAccountName,
        namespace: ACKNamespace,
      },
    );
    ackLambdaServiceAccount.node.addDependency(namespace);

    ackLambdaServiceAccount.role.addManagedPolicy(
      ManagedPolicy.fromAwsManagedPolicyName('AWSLambda_FullAccess'));

    const ackIAMServiceAccount = cluster.addServiceAccount(
      'ACKIAMSA',
      {
        name: ACKIAMServiceAccountName,
        namespace: ACKNamespace,
      },
    );
    ackIAMServiceAccount.node.addDependency(namespace);

    ackIAMServiceAccount.role.addManagedPolicy(
      ManagedPolicy.fromAwsManagedPolicyName('IAMFullAccess'));


    // cluster.addHelmChart(
    //   ACKS3Helm,
    //   {

    //   }
    // );

    // new eks.HelmChart(
    //   this,
    //   'AckS3',
    //   {
    //     cluster,
    //     chart: 's3-chart',
    //     release: 's3-chart',
    //     repository: 'oci://public.ecr.aws/aws-controllers-k8s/s3-chart',
    //     version: 'v0.0.19',
    //     namespace: 'ack-system',
    //     createNamespace: true,
    //   });


    // cluster.addHelmChart(
    //   'AckS3', {
    //   chart: 'ack-s3',
    // release: 'ack-s3',
    //   repository: 'oci://public.ecr.aws/aws-controllers-k8s/s3-chart',
    //   version: 'v0.0.19',
    //   namespace: 'ack-system',
    //   createNamespace: true,
    // });
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