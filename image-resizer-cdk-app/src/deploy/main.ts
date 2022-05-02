import * as cdk from 'aws-cdk-lib';
import { aws_eks as eks } from 'aws-cdk-lib';
import * as cdk8s from 'cdk8s';
import { Construct } from 'constructs';
import * as iam from './imports/iam.services.k8s.aws';
import * as lambda from './imports/lambda.services.k8s.aws';
import * as s3 from './imports/s3.services.k8s.aws';

const APP_NAME = 's3-image-resizer'

export interface ImageResizerProps extends cdk8s.ChartProps {
  readonly region: string;
  readonly account: string;
}

export class ImageResizer extends cdk8s.Chart {
  constructor(scope: Construct, id: string, props: ImageResizerProps) {
    super(scope, id, props);

    const region = props.region;
    const account = props.account;

    const commonMetadata = { name: APP_NAME, namespace: 'default' }

    new iam.Role(this, 'Role', {
      metadata: commonMetadata,
      spec: {
        name: APP_NAME,
        description: `IAM role for ${APP_NAME} applications`,
        assumeRolePolicyDocument: '{"Version":"2012-10-17","Statement":[{"Effect":"Allow","Principal":{"Service":["lambda.amazonaws.com"]},"Action":["sts:AssumeRole"]}]}',
        policies: [
          'arn:aws:iam::aws:policy/service-role/AWSLambdaBasicExecutionRole',
          'arn:aws:iam::aws:policy/service-role/AWSLambdaVPCAccessExecutionRole',
          'arn:aws:iam::aws:policy/AWSLambda_ReadOnlyAccess',
          'arn:aws:iam::aws:policy/AWSXrayWriteOnlyAccess',
          'arn:aws:iam::aws:policy/AmazonS3FullAccess',
        ],
        maxSessionDuration: 3600,
        tags: [{ 'key': 'application', 'value': APP_NAME }],
      },
    });

    new lambda.Function(this, 'Function', {
      metadata: commonMetadata,
      spec: {
        name: APP_NAME,
        code: { imageUri: `${account}.dkr.ecr.${region}.amazonaws.com/${APP_NAME}:latest` },
        packageType: 'Image',
        description: `Function resources for ${APP_NAME} applications`,
        memorySize: 512,
        timeout: 10,
        tracingConfig: { mode: 'Active' },
        role: `arn:aws:iam::${account}:role/${APP_NAME}`,
      },
    });

    new s3.Bucket(this, 'Bucket', {
      metadata: commonMetadata,
      spec: {
        name: APP_NAME,
        notification: {
          lambdaFunctionConfigurations: [{
            id: APP_NAME,
            events: ['s3:ObjectCreated:*'],
            filter: { key: { filterRules: [{ name: 'Prefix', value: 'inbound/' }] } },
            lambdaFunctionArn: `arn:aws:lambda:${region}:${account}:function:${APP_NAME}`,
          }],
        },
      }
    });
  }
}

export class ImageResizerStack extends cdk.Stack {

  constructor(scope: Construct, id: string, props?: cdk.StackProps) {
    super(scope, id, props);

    const clusterName = cdk.Fn.importValue('ACKClusterName').toString();
    const kubectlRoleArn = cdk.Fn.importValue('ACKClusterRoleARN').toString();
    const cluster = eks.Cluster.fromClusterAttributes(this, "ACKCluster", { clusterName, kubectlRoleArn });

    cluster.addCdk8sChart('ImageResizer', new ImageResizer(new cdk8s.App(), 'ImageResizer', {
      account: this.account,
      region: this.region,
    }));
  }

}

const app = new cdk.App();
new ImageResizerStack(app, 'ImageResizer');
app.synth();
