import { Testing } from 'cdk8s';
import { ACKChart } from './main';

describe('Placeholder', () => {
  test('Empty', () => {
    const app = Testing.app();
    const chart = new ACKChart(app, 'test-chart');
    const results = Testing.synth(chart)
    expect(results).toMatchSnapshot();
  });
});
