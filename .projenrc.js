const { Cdk8sTeamNodeProject } = require('@cdk8s/projen-common');

const project = new Cdk8sTeamNodeProject({
  name: 'root',
  repoName: 'cdk8s-ack-image-resizer',
  release: false,
  defaultReleaseBranch: 'main',
  devDeps: [
    'lerna@^7.1.4',
    '@cdk8s/projen-common',
  ],
});

project.gitignore.exclude('dist/**');
project.gitignore.exclude('coverage/**');
project.package.addField('private', true);
project.package.addField('workspaces', {
  packages: ['packages/**']
});

project.compileTask.exec('lerna run build');

project.synth();