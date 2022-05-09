package deploy.k8s;

import org.cdk8s.App;

public class Chart {
  public static void main(final String[] args) {
    App app = new App();
    new ImageResizerChart(app, "ImageResizer", "us-east-1", "1223435455");
    app.synth();
  }
}