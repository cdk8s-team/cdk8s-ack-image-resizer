const { awscdk } = require('projen');
const project = new awscdk.AwsCdkTypeScriptApp({
  cdkVersion: '2.21.1',
  appEntrypoint: 'deploy/main.ts',
  github: false,
  defaultReleaseBranch: 'main',
  name: 'image-resizer-cdk-app',
  devDeps: [
    'cdk8s',
    'cdk8s-cli',
  ],
});

project.synth();