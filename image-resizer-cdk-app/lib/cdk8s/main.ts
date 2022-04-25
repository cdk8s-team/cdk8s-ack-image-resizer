import { App, Chart, ChartProps } from 'cdk8s';
import { Construct } from 'constructs';
import { Role } from './imports/iam.services.k8s.aws';
import { Function } from './imports/lambda.services.k8s.aws';
import { Bucket } from './imports/s3.services.k8s.aws';


export class ACKChart extends Chart {
  constructor(scope: Construct, id: string, props: ChartProps = {}) {
    super(scope, id, props);

    const appName = 'ack-image-resizer';
    const region = process.env.CDK_DEFAULT_REGION;
    const account = process.env.CDK_DEFAULT_ACCOUNT;
    const defaultTag = {
      'key': 'application',
      'value': appName
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
        code: { imageUri: `${account}.dkr.ecr.${region}.amazonaws.com/${appName}:latest` },
        packageType: 'Image',
        description: 'Function resources for ' + appName + ' applications',
        memorySize: 512,
        timeout: 10,
        tracingConfig: { mode: 'Active' },
        role: `arn:aws:iam::${account}:role/${appName}`,

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
              lambdaFunctionArn: `arn:aws:lambda:${region}:${account}:function:${appName}`,
            }],
        },
      }
    });

  }
}

const app = new App();
new ACKChart(app, 'cdk8s');
app.synth();

