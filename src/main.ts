import { App, aws_eks as eks, Stack, StackProps } from 'aws-cdk-lib';
import { Construct } from 'constructs';

export class MyStack extends Stack {
  constructor(scope: Construct, id: string, props: StackProps = {}) {
    super(scope, id, props);
    // provisiong a cluster
    const cluster = new eks.Cluster(this, 'hello-eks', {
      version: eks.KubernetesVersion.V1_21,
    });

    // cluster.addHelmChart()

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