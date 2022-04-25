FROM public.ecr.aws/lambda/java:8.al2

# Assumes your function is named "app.js", and there is a package.json file in the app directory 
# COPY src pom.xml build.gradle  ${LAMBDA_TASK_ROOT}
# COPY build/distributions/image-resizer-app.zip ${LAMBDA_TASK_ROOT}/image-resizer-app.zip

COPY build/classes/java/main /var/task
COPY build/dependency/* /var/task/lib/

# RUN gradle -q packageLibs
# RUN mv build/distributions/s3-java.zip build/s3-java-lib.zip

# Set the CMD to your handler (could also be done as a parameter override outside of the Dockerfile)
CMD [ "example.Handler::handleRequest" ]  