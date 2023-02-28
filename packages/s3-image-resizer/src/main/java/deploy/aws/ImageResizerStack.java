package deploy.aws;

import software.amazon.awscdk.Stack;

import org.cdk8s.App;

import deploy.k8s.ImageResizerChart;
import software.amazon.awscdk.Fn;
import software.amazon.awscdk.services.eks.ICluster;
import software.amazon.awscdk.services.eks.Cluster;
import software.amazon.awscdk.services.eks.ClusterAttributes;
import software.constructs.Construct;;

public class ImageResizerStack extends Stack {

  public ImageResizerStack(Construct scope, String id) {
    super(scope, id);

    String clusterName = Fn.importValue("ACKClusterName").toString();
    String kubectlRoleArn = Fn.importValue("ACKClusterRoleARN").toString();
    ICluster cluster = Cluster.fromClusterAttributes(this, "ACKCluster", ClusterAttributes.builder()
      .clusterName(clusterName)
      .kubectlRoleArn(kubectlRoleArn)
      .build());

    cluster.addCdk8sChart("ImageResizer", new ImageResizerChart(new App(), "ImageResizer",
      this.getRegion(), this.getAccount()
    ));
  }
}
