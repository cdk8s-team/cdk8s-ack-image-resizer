import * as cdk from 'aws-cdk-lib';
import { aws_eks as eks, Stack, StackProps } from 'aws-cdk-lib';
import * as cdk8s from 'cdk8s';
import { Construct } from 'constructs';
import { ACKChart } from './cdk8s/main';
// import * as sqs from 'aws-cdk-lib/aws-sqs';


export function importCluster(scope: Construct, clusterNameToImport: string | undefined, kubectlRoleARNImport: string | undefined): eks.ICluster {
  if (clusterNameToImport == null) {
    throw new Error('Cluster Name is not defined.');
  }
  return eks.Cluster.fromClusterAttributes(scope, "ACKCluster", {
    clusterName: clusterNameToImport,
    kubectlRoleArn: kubectlRoleARNImport,
  });
}

export class ImageResizerCdkAppStack extends Stack {
  constructor(scope: Construct, id: string, props?: StackProps) {
    super(scope, id, props);

    // The code that defines your stack goes here
    // this.vpc = Vpc.fromLookup *
    // const cluster = eks.Cluster.fromClusterAttributes(scope, 'ACKCluster',
    //   {
    //     clusterName: "eks-ack-cdk8s"
    //   });


    const clusterName = cdk.Fn.importValue('ACKClusterName').toString();
    const clusterKubectlRole = cdk.Fn.importValue('ACKClusterRoleARN').toString();
    const cluster = importCluster(this, clusterName, clusterKubectlRole);

    const ackCdk8sApp = new cdk8s.App();
    ackCdk8sApp.synth();
    cluster.addCdk8sChart('ACKCDK8sChart',
      new ACKChart(ackCdk8sApp, 'ACKCDK8sChart'));
    // cons`ole.log(cluster.clusterArn);
    // cluster.addCdk8sChart
    // cluster.addCdk8sChart
    // example resource
    // const queue = new sqs.Queue(this, 'ImageResizerCdkAppQueue', {
    //   visibilityTimeout: cdk.Duration.seconds(300)
    // });
  }
}
