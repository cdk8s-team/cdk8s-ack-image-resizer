import { CoreV1Api, KubeConfig } from '@kubernetes/client-node';
import { App, Chart, ChartProps } from 'cdk8s';
import { Construct } from 'constructs';
import { Role } from './imports/iam.services.k8s.aws';
import { Function } from './imports/lambda.services.k8s.aws';
import { Bucket } from './imports/s3.services.k8s.aws';

export class MyChart extends Chart {
  constructor(scope: Construct, id: string, props: ChartProps = {}) {
    super(scope, id, props);

    const appName = 'ack-image-resizer';
    const region = 'eu-west-1';
    const accountNumber = '481121494044';
    const defaultTag = {
      'key': 'application',
      'value': 'ack-image-resizer'
    }
    // define resources here

    new Role(this, 'IAMRoleResources' + appName, {
      metadata: {
        name: appName,
        namespace: 'default',
      },
      spec: {
        name: appName,
        description: 'IAM role for ' + appName + ' applications',
        assumeRolePolicyDocument: '{"Version":"2012-10-17","Statement":[{"Effect":"Allow","Principal":{"Service":["lambda.amazonaws.com"]},"Action":["sts:AssumeRole"]}]}',
        policies: [
          'arn:aws:iam::aws:policy/service-role/AWSLambdaBasicExecutionRole',
          'arn:aws:iam::aws:policy/service-role/AWSLambdaVPCAccessExecutionRole',
          'arn:aws:iam::aws:policy/AWSLambda_ReadOnlyAccess',
          'arn:aws:iam::aws:policy/AWSXrayWriteOnlyAccess',
          'arn:aws:iam::aws:policy/AmazonS3FullAccess',
        ],
        maxSessionDuration: 3600,
        tags: [defaultTag],
      },
    });
    new Function(this, 'LambdaFunctionResource' + appName, {
      metadata: {
        name: appName,
        namespace: 'default',
      },
      spec: {
        name: appName,
        code: { imageUri: '481121494044.dkr.ecr.eu-west-1.amazonaws.com/ack-image-resizer:latest' },
        packageType: 'Image',
        description: 'Function resources for ' + appName + ' applications',
        memorySize: 512,
        timeout: 10,
        tracingConfig: { mode: 'Active' },
        // role: 'arn:aws:iam::481121494044:role/s3-java-functionRole-14HBJ7M2493ZN',
        role: 'arn:aws:iam::481121494044:role/' + appName,

      },

    });
    new Bucket(this, 'S3BucketResource' + appName, {
      metadata: {
        name: appName,
        namespace: 'default',
      },
      spec: {
        name: appName,
        notification: {
          lambdaFunctionConfigurations: [
            {
              id: appName,
              events: [
                's3:ObjectCreated:*'
              ],
              filter: {
                key: {
                  filterRules: [
                    { name: 'Prefix', value: 'inbound/' }
                  ]
                }
              },
              // lambdaFunctionArn: 'arn:aws:lambda:eu-west-1:481121494044:function:image-resizer',
              lambdaFunctionArn: `arn:aws:lambda:${region}:${accountNumber}:function:${appName}`,
            }],
        },
      }
    });

  }
}

const app = new App();
new MyChart(app, 'cdk8s');
app.synth();

const kc = new KubeConfig();
kc.loadFromDefault();

const k8sApi = kc.makeApiClient(CoreV1Api);
k8sApi.listNamespacedPod('default').then((res) => {
  console.log(res.body);
});
