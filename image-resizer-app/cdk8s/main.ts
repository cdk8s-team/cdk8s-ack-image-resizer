import { App, Chart, ChartProps } from 'cdk8s';
import { Construct } from 'constructs';
import { Bucket } from '../imports/s3.services.k8s.aws';

export class MyChart extends Chart {
  constructor(scope: Construct, id: string, props: ChartProps = {}) {
    super(scope, id, props);

    const appName = 'ack-image-resizer';
    // define resources here
    new Bucket(this, "A", {
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
              lambdaFunctionArn: 'arn:aws:lambda:eu-west-1:481121494044:function:image-resizer',
            }],
        },
      }
    });

  }
}

const app = new App();
new MyChart(app, 'cdk8s');
app.synth();
