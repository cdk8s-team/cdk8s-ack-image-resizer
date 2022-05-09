package deploy;

import java.util.Arrays;

import org.cdk8s.ApiObjectMetadata;
import org.cdk8s.Chart;

import imports.aws.k8s.services.iam.Role;
import imports.aws.k8s.services.iam.RoleProps;
import imports.aws.k8s.services.iam.RoleSpec;
import imports.aws.k8s.services.iam.RoleSpecTags;
import imports.aws.k8s.services.lambda.Function;
import imports.aws.k8s.services.lambda.FunctionProps;
import imports.aws.k8s.services.lambda.FunctionSpec;
import imports.aws.k8s.services.lambda.FunctionSpecCode;
import imports.aws.k8s.services.lambda.FunctionSpecTracingConfig;
import imports.aws.k8s.services.s3.Bucket;
import imports.aws.k8s.services.s3.BucketProps;
import imports.aws.k8s.services.s3.BucketSpec;
import imports.aws.k8s.services.s3.BucketSpecNotification;
import imports.aws.k8s.services.s3.BucketSpecNotificationLambdaFunctionConfigurations;
import imports.aws.k8s.services.s3.BucketSpecNotificationLambdaFunctionConfigurationsFilter;
import imports.aws.k8s.services.s3.BucketSpecNotificationLambdaFunctionConfigurationsFilterKey;
import imports.aws.k8s.services.s3.BucketSpecNotificationLambdaFunctionConfigurationsFilterKeyFilterRules;
import software.constructs.Construct;

public class ImageResizerChart extends Chart {

  private static String APP_NAME = "s3-image-resizer";

  public ImageResizerChart(Construct scope, String id, String region, String account) {
    super(scope, id);

    ApiObjectMetadata commonMetadata = ApiObjectMetadata.builder()
        .name(APP_NAME)
        .namespace("default")
        .build();

    new Role(this, "Role", RoleProps.builder()
      .metadata(commonMetadata)
      .spec(RoleSpec.builder()
        .name(APP_NAME)
        .description(String.format("IAM role for %s applications", APP_NAME))
        .assumeRolePolicyDocument("{\"Version\":\"2012-10-17\",\"Statement\":[{\"Effect\":\"Allow\",\"Principal\":{\"Service\":[\"lambda.amazonaws.com\"]},\"Action\":[\"sts:AssumeRole\"]}]}")
        .policies(Arrays.asList(
          "arn:aws:iam::aws:policy/service-role/AWSLambdaBasicExecutionRole",
          "arn:aws:iam::aws:policy/service-role/AWSLambdaVPCAccessExecutionRole",
          "arn:aws:iam::aws:policy/AWSLambda_ReadOnlyAccess",
          "arn:aws:iam::aws:policy/AWSXrayWriteOnlyAccess",
          "arn:aws:iam::aws:policy/AmazonS3FullAccess"
        ))
        .maxSessionDuration(3600)
        .tags(Arrays.asList(
          RoleSpecTags.builder()
            .key("application")
            .value(APP_NAME)
            .build()
        ))
        .build())
      .build());

    new Function(this, "Function", FunctionProps.builder()
      .metadata(commonMetadata)
      .spec(FunctionSpec.builder()
        .name(APP_NAME)
        .code(FunctionSpecCode.builder()
          .imageUri(String.format("%s.dkr.ecr.%s.amazonaws.com/%s:latest", account, region, APP_NAME))
          .build())
        .packageType("Image")
        .description(String.format("Function resources for %s applications", APP_NAME))
        .memorySize(512)
        .timeout(10)
        .tracingConfig(FunctionSpecTracingConfig.builder()
          .mode("Active")
          .build())
        .role(String.format("arn:aws:iam::%s:role/%s", account, APP_NAME))
        .build())
      .build());

    new Bucket(this, "Bucket", BucketProps.builder()
      .metadata(commonMetadata)
      .spec(BucketSpec.builder()
        .name(APP_NAME)
        .notification(BucketSpecNotification.builder()
          .lambdaFunctionConfigurations(Arrays.asList(BucketSpecNotificationLambdaFunctionConfigurations.builder()
            .id(APP_NAME)
            .events(Arrays.asList("s3:ObjectCreated:*"))
            .filter(BucketSpecNotificationLambdaFunctionConfigurationsFilter.builder()
              .key(BucketSpecNotificationLambdaFunctionConfigurationsFilterKey.builder()
                .filterRules(Arrays.asList(BucketSpecNotificationLambdaFunctionConfigurationsFilterKeyFilterRules.builder()
                  .name("Prefix")
                  .value("inbound/")
                  .build()))
                .build())
              .build())
            .lambdaFunctionArn(String.format("arn:aws:lambda:%s:%s:function:%s", region, account, APP_NAME))
            .build()))
          .build())
        .build())
      .build());
  }

}
