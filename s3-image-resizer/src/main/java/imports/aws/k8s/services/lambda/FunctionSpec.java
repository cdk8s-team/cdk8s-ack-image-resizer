package imports.aws.k8s.services.lambda;

/**
 * FunctionSpec defines the desired state of Function.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:22:11.942Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.lambda.$Module.class, fqn = "awsk8sserviceslambda.FunctionSpec")
@software.amazon.jsii.Jsii.Proxy(FunctionSpec.Jsii$Proxy.class)
public interface FunctionSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * The code for the function.
     */
    @org.jetbrains.annotations.NotNull imports.aws.k8s.services.lambda.FunctionSpecCode getCode();

    /**
     * The name of the Lambda function.
     * <p>
     * Name formats
     * <p>
     * <ul>
     * <li>Function name - my-function.</li>
     * <li>Function ARN - arn:aws:lambda:us-west-2:123456789012:function:my-function.</li>
     * <li>Partial ARN - 123456789012:function:my-function.
     * The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.</li>
     * </ul>
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * The Amazon Resource Name (ARN) of the function's execution role.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getRole();

    /**
     * The instruction set architecture that the function supports.
     * <p>
     * Enter a string array with one of the valid values. The default value is x86_64.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getArchitectures() {
        return null;
    }

    /**
     * To enable code signing for this function, specify the ARN of a code-signing configuration.
     * <p>
     * A code-signing configuration includes a set of signing profiles, which define the trusted publishers for this function.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCodeSigningConfigArn() {
        return null;
    }

    /**
     * A dead letter queue configuration that specifies the queue or topic where Lambda sends asynchronous events when they fail processing.
     * <p>
     * For more information, see Dead Letter Queues (https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#dlq).
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.lambda.FunctionSpecDeadLetterConfig getDeadLetterConfig() {
        return null;
    }

    /**
     * A description of the function.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    /**
     * Environment variables that are accessible from function code during execution.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.lambda.FunctionSpecEnvironment getEnvironment() {
        return null;
    }

    /**
     * Connection settings for an Amazon EFS file system.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.k8s.services.lambda.FunctionSpecFileSystemConfigs> getFileSystemConfigs() {
        return null;
    }

    /**
     * The name of the method within your code that Lambda calls to execute your function.
     * <p>
     * The format includes the file name. It can also include namespaces and other qualifiers, depending on the runtime. For more information, see Programming Model (https://docs.aws.amazon.com/lambda/latest/dg/programming-model-v2.html).
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getHandler() {
        return null;
    }

    /**
     * Container image configuration values (https://docs.aws.amazon.com/lambda/latest/dg/configuration-images.html#configuration-images-settings) that override the values in the container image Dockerfile.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.lambda.FunctionSpecImageConfig getImageConfig() {
        return null;
    }

    /**
     * The ARN of the Amazon Web Services Key Management Service (KMS) key that's used to encrypt your function's environment variables.
     * <p>
     * If it's not provided, Lambda uses a default service key.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getKmsKeyArn() {
        return null;
    }

    /**
     * A list of function layers (https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html) to add to the function's execution environment. Specify each layer by its ARN, including the version.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getLayers() {
        return null;
    }

    /**
     * The amount of memory available to the function (https://docs.aws.amazon.com/lambda/latest/dg/configuration-memory.html) at runtime. Increasing the function memory also increases its CPU allocation. The default value is 128 MB. The value can be any multiple of 1 MB.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMemorySize() {
        return null;
    }

    /**
     * The type of deployment package.
     * <p>
     * Set to Image for container image and set Zip for ZIP archive.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPackageType() {
        return null;
    }

    /**
     * Set to true to publish the first version of the function during creation.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getPublish() {
        return null;
    }

    /**
     * The number of simultaneous executions to reserve for the function.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getReservedConcurrentExecutions() {
        return null;
    }

    /**
     * The identifier of the function's runtime (https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html).
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRuntime() {
        return null;
    }

    /**
     * A list of tags (https://docs.aws.amazon.com/lambda/latest/dg/tagging.html) to apply to the function.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * The amount of time that Lambda allows a function to run before stopping it.
     * <p>
     * The default is 3 seconds. The maximum allowed value is 900 seconds. For additional information, see Lambda execution environment (https://docs.aws.amazon.com/lambda/latest/dg/runtimes-context.html).
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getTimeout() {
        return null;
    }

    /**
     * Set Mode to Active to sample and trace a subset of incoming requests with X-Ray (https://docs.aws.amazon.com/lambda/latest/dg/services-xray.html).
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.lambda.FunctionSpecTracingConfig getTracingConfig() {
        return null;
    }

    /**
     * For network connectivity to Amazon Web Services resources in a VPC, specify a list of security groups and subnets in the VPC.
     * <p>
     * When you connect a function to a VPC, it can only access resources and the internet through that VPC. For more information, see VPC Settings (https://docs.aws.amazon.com/lambda/latest/dg/configuration-vpc.html).
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.lambda.FunctionSpecVpcConfig getVpcConfig() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link FunctionSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link FunctionSpec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<FunctionSpec> {
        imports.aws.k8s.services.lambda.FunctionSpecCode code;
        java.lang.String name;
        java.lang.String role;
        java.util.List<java.lang.String> architectures;
        java.lang.String codeSigningConfigArn;
        imports.aws.k8s.services.lambda.FunctionSpecDeadLetterConfig deadLetterConfig;
        java.lang.String description;
        imports.aws.k8s.services.lambda.FunctionSpecEnvironment environment;
        java.util.List<imports.aws.k8s.services.lambda.FunctionSpecFileSystemConfigs> fileSystemConfigs;
        java.lang.String handler;
        imports.aws.k8s.services.lambda.FunctionSpecImageConfig imageConfig;
        java.lang.String kmsKeyArn;
        java.util.List<java.lang.String> layers;
        java.lang.Number memorySize;
        java.lang.String packageType;
        java.lang.Boolean publish;
        java.lang.Number reservedConcurrentExecutions;
        java.lang.String runtime;
        java.util.Map<java.lang.String, java.lang.String> tags;
        java.lang.Number timeout;
        imports.aws.k8s.services.lambda.FunctionSpecTracingConfig tracingConfig;
        imports.aws.k8s.services.lambda.FunctionSpecVpcConfig vpcConfig;

        /**
         * Sets the value of {@link FunctionSpec#getCode}
         * @param code The code for the function. This parameter is required.
         * @return {@code this}
         */
        public Builder code(imports.aws.k8s.services.lambda.FunctionSpecCode code) {
            this.code = code;
            return this;
        }

        /**
         * Sets the value of {@link FunctionSpec#getName}
         * @param name The name of the Lambda function. This parameter is required.
         *             Name formats
         *             <p>
         *             <ul>
         *             <li>Function name - my-function.</li>
         *             <li>Function ARN - arn:aws:lambda:us-west-2:123456789012:function:my-function.</li>
         *             <li>Partial ARN - 123456789012:function:my-function.
         *             The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.</li>
         *             </ul>
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link FunctionSpec#getRole}
         * @param role The Amazon Resource Name (ARN) of the function's execution role. This parameter is required.
         * @return {@code this}
         */
        public Builder role(java.lang.String role) {
            this.role = role;
            return this;
        }

        /**
         * Sets the value of {@link FunctionSpec#getArchitectures}
         * @param architectures The instruction set architecture that the function supports.
         *                      Enter a string array with one of the valid values. The default value is x86_64.
         * @return {@code this}
         */
        public Builder architectures(java.util.List<java.lang.String> architectures) {
            this.architectures = architectures;
            return this;
        }

        /**
         * Sets the value of {@link FunctionSpec#getCodeSigningConfigArn}
         * @param codeSigningConfigArn To enable code signing for this function, specify the ARN of a code-signing configuration.
         *                             A code-signing configuration includes a set of signing profiles, which define the trusted publishers for this function.
         * @return {@code this}
         */
        public Builder codeSigningConfigArn(java.lang.String codeSigningConfigArn) {
            this.codeSigningConfigArn = codeSigningConfigArn;
            return this;
        }

        /**
         * Sets the value of {@link FunctionSpec#getDeadLetterConfig}
         * @param deadLetterConfig A dead letter queue configuration that specifies the queue or topic where Lambda sends asynchronous events when they fail processing.
         *                         For more information, see Dead Letter Queues (https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#dlq).
         * @return {@code this}
         */
        public Builder deadLetterConfig(imports.aws.k8s.services.lambda.FunctionSpecDeadLetterConfig deadLetterConfig) {
            this.deadLetterConfig = deadLetterConfig;
            return this;
        }

        /**
         * Sets the value of {@link FunctionSpec#getDescription}
         * @param description A description of the function.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link FunctionSpec#getEnvironment}
         * @param environment Environment variables that are accessible from function code during execution.
         * @return {@code this}
         */
        public Builder environment(imports.aws.k8s.services.lambda.FunctionSpecEnvironment environment) {
            this.environment = environment;
            return this;
        }

        /**
         * Sets the value of {@link FunctionSpec#getFileSystemConfigs}
         * @param fileSystemConfigs Connection settings for an Amazon EFS file system.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder fileSystemConfigs(java.util.List<? extends imports.aws.k8s.services.lambda.FunctionSpecFileSystemConfigs> fileSystemConfigs) {
            this.fileSystemConfigs = (java.util.List<imports.aws.k8s.services.lambda.FunctionSpecFileSystemConfigs>)fileSystemConfigs;
            return this;
        }

        /**
         * Sets the value of {@link FunctionSpec#getHandler}
         * @param handler The name of the method within your code that Lambda calls to execute your function.
         *                The format includes the file name. It can also include namespaces and other qualifiers, depending on the runtime. For more information, see Programming Model (https://docs.aws.amazon.com/lambda/latest/dg/programming-model-v2.html).
         * @return {@code this}
         */
        public Builder handler(java.lang.String handler) {
            this.handler = handler;
            return this;
        }

        /**
         * Sets the value of {@link FunctionSpec#getImageConfig}
         * @param imageConfig Container image configuration values (https://docs.aws.amazon.com/lambda/latest/dg/configuration-images.html#configuration-images-settings) that override the values in the container image Dockerfile.
         * @return {@code this}
         */
        public Builder imageConfig(imports.aws.k8s.services.lambda.FunctionSpecImageConfig imageConfig) {
            this.imageConfig = imageConfig;
            return this;
        }

        /**
         * Sets the value of {@link FunctionSpec#getKmsKeyArn}
         * @param kmsKeyArn The ARN of the Amazon Web Services Key Management Service (KMS) key that's used to encrypt your function's environment variables.
         *                  If it's not provided, Lambda uses a default service key.
         * @return {@code this}
         */
        public Builder kmsKeyArn(java.lang.String kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }

        /**
         * Sets the value of {@link FunctionSpec#getLayers}
         * @param layers A list of function layers (https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html) to add to the function's execution environment. Specify each layer by its ARN, including the version.
         * @return {@code this}
         */
        public Builder layers(java.util.List<java.lang.String> layers) {
            this.layers = layers;
            return this;
        }

        /**
         * Sets the value of {@link FunctionSpec#getMemorySize}
         * @param memorySize The amount of memory available to the function (https://docs.aws.amazon.com/lambda/latest/dg/configuration-memory.html) at runtime. Increasing the function memory also increases its CPU allocation. The default value is 128 MB. The value can be any multiple of 1 MB.
         * @return {@code this}
         */
        public Builder memorySize(java.lang.Number memorySize) {
            this.memorySize = memorySize;
            return this;
        }

        /**
         * Sets the value of {@link FunctionSpec#getPackageType}
         * @param packageType The type of deployment package.
         *                    Set to Image for container image and set Zip for ZIP archive.
         * @return {@code this}
         */
        public Builder packageType(java.lang.String packageType) {
            this.packageType = packageType;
            return this;
        }

        /**
         * Sets the value of {@link FunctionSpec#getPublish}
         * @param publish Set to true to publish the first version of the function during creation.
         * @return {@code this}
         */
        public Builder publish(java.lang.Boolean publish) {
            this.publish = publish;
            return this;
        }

        /**
         * Sets the value of {@link FunctionSpec#getReservedConcurrentExecutions}
         * @param reservedConcurrentExecutions The number of simultaneous executions to reserve for the function.
         * @return {@code this}
         */
        public Builder reservedConcurrentExecutions(java.lang.Number reservedConcurrentExecutions) {
            this.reservedConcurrentExecutions = reservedConcurrentExecutions;
            return this;
        }

        /**
         * Sets the value of {@link FunctionSpec#getRuntime}
         * @param runtime The identifier of the function's runtime (https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html).
         * @return {@code this}
         */
        public Builder runtime(java.lang.String runtime) {
            this.runtime = runtime;
            return this;
        }

        /**
         * Sets the value of {@link FunctionSpec#getTags}
         * @param tags A list of tags (https://docs.aws.amazon.com/lambda/latest/dg/tagging.html) to apply to the function.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link FunctionSpec#getTimeout}
         * @param timeout The amount of time that Lambda allows a function to run before stopping it.
         *                The default is 3 seconds. The maximum allowed value is 900 seconds. For additional information, see Lambda execution environment (https://docs.aws.amazon.com/lambda/latest/dg/runtimes-context.html).
         * @return {@code this}
         */
        public Builder timeout(java.lang.Number timeout) {
            this.timeout = timeout;
            return this;
        }

        /**
         * Sets the value of {@link FunctionSpec#getTracingConfig}
         * @param tracingConfig Set Mode to Active to sample and trace a subset of incoming requests with X-Ray (https://docs.aws.amazon.com/lambda/latest/dg/services-xray.html).
         * @return {@code this}
         */
        public Builder tracingConfig(imports.aws.k8s.services.lambda.FunctionSpecTracingConfig tracingConfig) {
            this.tracingConfig = tracingConfig;
            return this;
        }

        /**
         * Sets the value of {@link FunctionSpec#getVpcConfig}
         * @param vpcConfig For network connectivity to Amazon Web Services resources in a VPC, specify a list of security groups and subnets in the VPC.
         *                  When you connect a function to a VPC, it can only access resources and the internet through that VPC. For more information, see VPC Settings (https://docs.aws.amazon.com/lambda/latest/dg/configuration-vpc.html).
         * @return {@code this}
         */
        public Builder vpcConfig(imports.aws.k8s.services.lambda.FunctionSpecVpcConfig vpcConfig) {
            this.vpcConfig = vpcConfig;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link FunctionSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public FunctionSpec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link FunctionSpec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements FunctionSpec {
        private final imports.aws.k8s.services.lambda.FunctionSpecCode code;
        private final java.lang.String name;
        private final java.lang.String role;
        private final java.util.List<java.lang.String> architectures;
        private final java.lang.String codeSigningConfigArn;
        private final imports.aws.k8s.services.lambda.FunctionSpecDeadLetterConfig deadLetterConfig;
        private final java.lang.String description;
        private final imports.aws.k8s.services.lambda.FunctionSpecEnvironment environment;
        private final java.util.List<imports.aws.k8s.services.lambda.FunctionSpecFileSystemConfigs> fileSystemConfigs;
        private final java.lang.String handler;
        private final imports.aws.k8s.services.lambda.FunctionSpecImageConfig imageConfig;
        private final java.lang.String kmsKeyArn;
        private final java.util.List<java.lang.String> layers;
        private final java.lang.Number memorySize;
        private final java.lang.String packageType;
        private final java.lang.Boolean publish;
        private final java.lang.Number reservedConcurrentExecutions;
        private final java.lang.String runtime;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.lang.Number timeout;
        private final imports.aws.k8s.services.lambda.FunctionSpecTracingConfig tracingConfig;
        private final imports.aws.k8s.services.lambda.FunctionSpecVpcConfig vpcConfig;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.code = software.amazon.jsii.Kernel.get(this, "code", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.lambda.FunctionSpecCode.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.role = software.amazon.jsii.Kernel.get(this, "role", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.architectures = software.amazon.jsii.Kernel.get(this, "architectures", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.codeSigningConfigArn = software.amazon.jsii.Kernel.get(this, "codeSigningConfigArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.deadLetterConfig = software.amazon.jsii.Kernel.get(this, "deadLetterConfig", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.lambda.FunctionSpecDeadLetterConfig.class));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.environment = software.amazon.jsii.Kernel.get(this, "environment", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.lambda.FunctionSpecEnvironment.class));
            this.fileSystemConfigs = software.amazon.jsii.Kernel.get(this, "fileSystemConfigs", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.lambda.FunctionSpecFileSystemConfigs.class)));
            this.handler = software.amazon.jsii.Kernel.get(this, "handler", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.imageConfig = software.amazon.jsii.Kernel.get(this, "imageConfig", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.lambda.FunctionSpecImageConfig.class));
            this.kmsKeyArn = software.amazon.jsii.Kernel.get(this, "kmsKeyArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.layers = software.amazon.jsii.Kernel.get(this, "layers", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.memorySize = software.amazon.jsii.Kernel.get(this, "memorySize", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.packageType = software.amazon.jsii.Kernel.get(this, "packageType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.publish = software.amazon.jsii.Kernel.get(this, "publish", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.reservedConcurrentExecutions = software.amazon.jsii.Kernel.get(this, "reservedConcurrentExecutions", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.runtime = software.amazon.jsii.Kernel.get(this, "runtime", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.timeout = software.amazon.jsii.Kernel.get(this, "timeout", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.tracingConfig = software.amazon.jsii.Kernel.get(this, "tracingConfig", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.lambda.FunctionSpecTracingConfig.class));
            this.vpcConfig = software.amazon.jsii.Kernel.get(this, "vpcConfig", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.lambda.FunctionSpecVpcConfig.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.code = java.util.Objects.requireNonNull(builder.code, "code is required");
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.role = java.util.Objects.requireNonNull(builder.role, "role is required");
            this.architectures = builder.architectures;
            this.codeSigningConfigArn = builder.codeSigningConfigArn;
            this.deadLetterConfig = builder.deadLetterConfig;
            this.description = builder.description;
            this.environment = builder.environment;
            this.fileSystemConfigs = (java.util.List<imports.aws.k8s.services.lambda.FunctionSpecFileSystemConfigs>)builder.fileSystemConfigs;
            this.handler = builder.handler;
            this.imageConfig = builder.imageConfig;
            this.kmsKeyArn = builder.kmsKeyArn;
            this.layers = builder.layers;
            this.memorySize = builder.memorySize;
            this.packageType = builder.packageType;
            this.publish = builder.publish;
            this.reservedConcurrentExecutions = builder.reservedConcurrentExecutions;
            this.runtime = builder.runtime;
            this.tags = builder.tags;
            this.timeout = builder.timeout;
            this.tracingConfig = builder.tracingConfig;
            this.vpcConfig = builder.vpcConfig;
        }

        @Override
        public final imports.aws.k8s.services.lambda.FunctionSpecCode getCode() {
            return this.code;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getRole() {
            return this.role;
        }

        @Override
        public final java.util.List<java.lang.String> getArchitectures() {
            return this.architectures;
        }

        @Override
        public final java.lang.String getCodeSigningConfigArn() {
            return this.codeSigningConfigArn;
        }

        @Override
        public final imports.aws.k8s.services.lambda.FunctionSpecDeadLetterConfig getDeadLetterConfig() {
            return this.deadLetterConfig;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final imports.aws.k8s.services.lambda.FunctionSpecEnvironment getEnvironment() {
            return this.environment;
        }

        @Override
        public final java.util.List<imports.aws.k8s.services.lambda.FunctionSpecFileSystemConfigs> getFileSystemConfigs() {
            return this.fileSystemConfigs;
        }

        @Override
        public final java.lang.String getHandler() {
            return this.handler;
        }

        @Override
        public final imports.aws.k8s.services.lambda.FunctionSpecImageConfig getImageConfig() {
            return this.imageConfig;
        }

        @Override
        public final java.lang.String getKmsKeyArn() {
            return this.kmsKeyArn;
        }

        @Override
        public final java.util.List<java.lang.String> getLayers() {
            return this.layers;
        }

        @Override
        public final java.lang.Number getMemorySize() {
            return this.memorySize;
        }

        @Override
        public final java.lang.String getPackageType() {
            return this.packageType;
        }

        @Override
        public final java.lang.Boolean getPublish() {
            return this.publish;
        }

        @Override
        public final java.lang.Number getReservedConcurrentExecutions() {
            return this.reservedConcurrentExecutions;
        }

        @Override
        public final java.lang.String getRuntime() {
            return this.runtime;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.lang.Number getTimeout() {
            return this.timeout;
        }

        @Override
        public final imports.aws.k8s.services.lambda.FunctionSpecTracingConfig getTracingConfig() {
            return this.tracingConfig;
        }

        @Override
        public final imports.aws.k8s.services.lambda.FunctionSpecVpcConfig getVpcConfig() {
            return this.vpcConfig;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("code", om.valueToTree(this.getCode()));
            data.set("name", om.valueToTree(this.getName()));
            data.set("role", om.valueToTree(this.getRole()));
            if (this.getArchitectures() != null) {
                data.set("architectures", om.valueToTree(this.getArchitectures()));
            }
            if (this.getCodeSigningConfigArn() != null) {
                data.set("codeSigningConfigArn", om.valueToTree(this.getCodeSigningConfigArn()));
            }
            if (this.getDeadLetterConfig() != null) {
                data.set("deadLetterConfig", om.valueToTree(this.getDeadLetterConfig()));
            }
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getEnvironment() != null) {
                data.set("environment", om.valueToTree(this.getEnvironment()));
            }
            if (this.getFileSystemConfigs() != null) {
                data.set("fileSystemConfigs", om.valueToTree(this.getFileSystemConfigs()));
            }
            if (this.getHandler() != null) {
                data.set("handler", om.valueToTree(this.getHandler()));
            }
            if (this.getImageConfig() != null) {
                data.set("imageConfig", om.valueToTree(this.getImageConfig()));
            }
            if (this.getKmsKeyArn() != null) {
                data.set("kmsKeyArn", om.valueToTree(this.getKmsKeyArn()));
            }
            if (this.getLayers() != null) {
                data.set("layers", om.valueToTree(this.getLayers()));
            }
            if (this.getMemorySize() != null) {
                data.set("memorySize", om.valueToTree(this.getMemorySize()));
            }
            if (this.getPackageType() != null) {
                data.set("packageType", om.valueToTree(this.getPackageType()));
            }
            if (this.getPublish() != null) {
                data.set("publish", om.valueToTree(this.getPublish()));
            }
            if (this.getReservedConcurrentExecutions() != null) {
                data.set("reservedConcurrentExecutions", om.valueToTree(this.getReservedConcurrentExecutions()));
            }
            if (this.getRuntime() != null) {
                data.set("runtime", om.valueToTree(this.getRuntime()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTimeout() != null) {
                data.set("timeout", om.valueToTree(this.getTimeout()));
            }
            if (this.getTracingConfig() != null) {
                data.set("tracingConfig", om.valueToTree(this.getTracingConfig()));
            }
            if (this.getVpcConfig() != null) {
                data.set("vpcConfig", om.valueToTree(this.getVpcConfig()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sserviceslambda.FunctionSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            FunctionSpec.Jsii$Proxy that = (FunctionSpec.Jsii$Proxy) o;

            if (!code.equals(that.code)) return false;
            if (!name.equals(that.name)) return false;
            if (!role.equals(that.role)) return false;
            if (this.architectures != null ? !this.architectures.equals(that.architectures) : that.architectures != null) return false;
            if (this.codeSigningConfigArn != null ? !this.codeSigningConfigArn.equals(that.codeSigningConfigArn) : that.codeSigningConfigArn != null) return false;
            if (this.deadLetterConfig != null ? !this.deadLetterConfig.equals(that.deadLetterConfig) : that.deadLetterConfig != null) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.environment != null ? !this.environment.equals(that.environment) : that.environment != null) return false;
            if (this.fileSystemConfigs != null ? !this.fileSystemConfigs.equals(that.fileSystemConfigs) : that.fileSystemConfigs != null) return false;
            if (this.handler != null ? !this.handler.equals(that.handler) : that.handler != null) return false;
            if (this.imageConfig != null ? !this.imageConfig.equals(that.imageConfig) : that.imageConfig != null) return false;
            if (this.kmsKeyArn != null ? !this.kmsKeyArn.equals(that.kmsKeyArn) : that.kmsKeyArn != null) return false;
            if (this.layers != null ? !this.layers.equals(that.layers) : that.layers != null) return false;
            if (this.memorySize != null ? !this.memorySize.equals(that.memorySize) : that.memorySize != null) return false;
            if (this.packageType != null ? !this.packageType.equals(that.packageType) : that.packageType != null) return false;
            if (this.publish != null ? !this.publish.equals(that.publish) : that.publish != null) return false;
            if (this.reservedConcurrentExecutions != null ? !this.reservedConcurrentExecutions.equals(that.reservedConcurrentExecutions) : that.reservedConcurrentExecutions != null) return false;
            if (this.runtime != null ? !this.runtime.equals(that.runtime) : that.runtime != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.timeout != null ? !this.timeout.equals(that.timeout) : that.timeout != null) return false;
            if (this.tracingConfig != null ? !this.tracingConfig.equals(that.tracingConfig) : that.tracingConfig != null) return false;
            return this.vpcConfig != null ? this.vpcConfig.equals(that.vpcConfig) : that.vpcConfig == null;
        }

        @Override
        public final int hashCode() {
            int result = this.code.hashCode();
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.role.hashCode());
            result = 31 * result + (this.architectures != null ? this.architectures.hashCode() : 0);
            result = 31 * result + (this.codeSigningConfigArn != null ? this.codeSigningConfigArn.hashCode() : 0);
            result = 31 * result + (this.deadLetterConfig != null ? this.deadLetterConfig.hashCode() : 0);
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.environment != null ? this.environment.hashCode() : 0);
            result = 31 * result + (this.fileSystemConfigs != null ? this.fileSystemConfigs.hashCode() : 0);
            result = 31 * result + (this.handler != null ? this.handler.hashCode() : 0);
            result = 31 * result + (this.imageConfig != null ? this.imageConfig.hashCode() : 0);
            result = 31 * result + (this.kmsKeyArn != null ? this.kmsKeyArn.hashCode() : 0);
            result = 31 * result + (this.layers != null ? this.layers.hashCode() : 0);
            result = 31 * result + (this.memorySize != null ? this.memorySize.hashCode() : 0);
            result = 31 * result + (this.packageType != null ? this.packageType.hashCode() : 0);
            result = 31 * result + (this.publish != null ? this.publish.hashCode() : 0);
            result = 31 * result + (this.reservedConcurrentExecutions != null ? this.reservedConcurrentExecutions.hashCode() : 0);
            result = 31 * result + (this.runtime != null ? this.runtime.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.timeout != null ? this.timeout.hashCode() : 0);
            result = 31 * result + (this.tracingConfig != null ? this.tracingConfig.hashCode() : 0);
            result = 31 * result + (this.vpcConfig != null ? this.vpcConfig.hashCode() : 0);
            return result;
        }
    }
}
