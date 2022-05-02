import * as cdk from 'aws-cdk-lib';
import { aws_eks as eks } from 'aws-cdk-lib';
import { IManagedPolicy, ManagedPolicy } from 'aws-cdk-lib/aws-iam';
import { Construct } from 'constructs';

const NAMESPACE_NAME = 'ack-system';

export class AckClusterStack extends cdk.Stack {

  private readonly cluster: eks.Cluster;
  private readonly namespace: eks.KubernetesManifest;

  constructor(scope: Construct, id: string, props: cdk.StackProps = {}) {
    super(scope, id, props);

    this.cluster = new eks.FargateCluster(this, 'eks-ack-cdk8s', {
      version: eks.KubernetesVersion.V1_21,
      clusterName: 'ack-cluster',
    });

    this.cluster.addFargateProfile('ACKFargateProfile', { selectors: [{ namespace: NAMESPACE_NAME }] });

    this.namespace = this.cluster.addManifest('namespace', {
      apiVersion: 'v1',
      kind: 'Namespace',
      metadata: { name: NAMESPACE_NAME },
    });

    this.addAckController('s3-chart', 'v0.1.0', ManagedPolicy.fromAwsManagedPolicyName('AmazonS3FullAccess'));
    this.addAckController('lambda-chart', 'v0.0.14', ManagedPolicy.fromAwsManagedPolicyName('AWSLambda_FullAccess'));
    this.addAckController('iam-chart', 'v0.0.13', ManagedPolicy.fromAwsManagedPolicyName('IAMFullAccess'));

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
  }

  private addAckController(chart: string, version: string, policy: IManagedPolicy) {

    const sa = this.cluster.addServiceAccount(`${chart}-sa`, {
      namespace: NAMESPACE_NAME,
    });

    sa.node.addDependency(this.namespace);
    sa.role.addManagedPolicy(policy);

    this.cluster.addHelmChart(chart, {
      chart,
      release: chart,
      repository: `oci://public.ecr.aws/aws-controllers-k8s/${chart}`,
      version,
      namespace: NAMESPACE_NAME,
      createNamespace: true,
      values: {
        serviceAccount: { create: false },
        aws: { region: this.region },
      },
    });

  }
}

const app = new cdk.App();

new AckClusterStack(app, 'ack-cluster', {
  env: {
    account: process.env.CDK_DEFAULT_ACCOUNT,
    region: process.env.CDK_DEFAULT_REGION,
  }
});

app.synth();

