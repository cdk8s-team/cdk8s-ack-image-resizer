import { aws_eks as eks, Stack, StackProps } from 'aws-cdk-lib';
import { Construct } from 'constructs';
// import * as sqs from 'aws-cdk-lib/aws-sqs';


export class ImageResizerCdkAppStack extends Stack {
  constructor(scope: Construct, id: string, props?: StackProps) {
    super(scope, id, props);

    // The code that defines your stack goes here
    // this.vpc = Vpc.fromLookup *
    cluster = eks.Cluster.fromClusterAttributes(scope, 'ACKCluster',
      {
        clusterName = ""
      });

    // example resource
    // const queue = new sqs.Queue(this, 'ImageResizerCdkAppQueue', {
    //   visibilityTimeout: cdk.Duration.seconds(300)
    // });
  }
}
