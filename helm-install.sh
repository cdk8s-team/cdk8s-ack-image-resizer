HELM_EXPERIMENTAL_OCI=1 helm install  --namespace ack-system ack-lambda oci://public.ecr.aws/aws-controllers-k8s/lambda-chart --version v0.0.14 --set serviceAccount.create=false --set aws.region=eu-west-1

HELM_EXPERIMENTAL_OCI=1 helm install --namespace ack-system ack-s3 oci://public.ecr.aws/aws-controllers-k8s/s3-chart --version v0.0.19 --set serviceAccount.create=false --set aws.region=eu-west-1

HELM_EXPERIMENTAL_OCI=1 helm install --namespace ack-system ack-iam oci://public.ecr.aws/aws-controllers-k8s/iam-chart --version v0.0.12 --set serviceAccount.create=false --set aws.region=eu-west-1