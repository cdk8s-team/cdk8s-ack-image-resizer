package deploy.aws;

import software.amazon.awscdk.App;

public class Stack {
  public static void main(final String[] args) {
    App app = new App();
    new ImageResizerStack(app, "s3-image-resizer");
    app.synth();
  }
}