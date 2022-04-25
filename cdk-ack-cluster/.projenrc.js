const { awscdk } = require('projen');
const project = new awscdk.AwsCdkTypeScriptApp({
  cdkVersion: '2.21.1',
  github: false,
  defaultReleaseBranch: 'main',
  name: 'cdk8s-ack-image-resizer',
});

project.synth();