package deploy;

import software.amazon.awscdk.App;

public class Main {
  public static void main(final String[] args) {
    App app = new App();
    new ImageResizerStack(app, "s3-image-resizer");
    app.synth();
  }
}