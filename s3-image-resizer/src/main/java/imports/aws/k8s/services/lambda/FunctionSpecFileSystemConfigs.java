package imports.aws.k8s.services.lambda;

/**
 * Details about the connection between a Lambda function and an Amazon EFS file system (https://docs.aws.amazon.com/lambda/latest/dg/configuration-filesystem.html).
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:22:11.949Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.lambda.$Module.class, fqn = "awsk8sserviceslambda.FunctionSpecFileSystemConfigs")
@software.amazon.jsii.Jsii.Proxy(FunctionSpecFileSystemConfigs.Jsii$Proxy.class)
public interface FunctionSpecFileSystemConfigs extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getArn() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getLocalMountPath() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link FunctionSpecFileSystemConfigs}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link FunctionSpecFileSystemConfigs}
     */
    public static final class Builder implements software.amazon.jsii.Builder<FunctionSpecFileSystemConfigs> {
        java.lang.String arn;
        java.lang.String localMountPath;

        /**
         * Sets the value of {@link FunctionSpecFileSystemConfigs#getArn}
         * @param arn the value to be set.
         * @return {@code this}
         */
        public Builder arn(java.lang.String arn) {
            this.arn = arn;
            return this;
        }

        /**
         * Sets the value of {@link FunctionSpecFileSystemConfigs#getLocalMountPath}
         * @param localMountPath the value to be set.
         * @return {@code this}
         */
        public Builder localMountPath(java.lang.String localMountPath) {
            this.localMountPath = localMountPath;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link FunctionSpecFileSystemConfigs}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public FunctionSpecFileSystemConfigs build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link FunctionSpecFileSystemConfigs}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements FunctionSpecFileSystemConfigs {
        private final java.lang.String arn;
        private final java.lang.String localMountPath;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.arn = software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.localMountPath = software.amazon.jsii.Kernel.get(this, "localMountPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.arn = builder.arn;
            this.localMountPath = builder.localMountPath;
        }

        @Override
        public final java.lang.String getArn() {
            return this.arn;
        }

        @Override
        public final java.lang.String getLocalMountPath() {
            return this.localMountPath;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getArn() != null) {
                data.set("arn", om.valueToTree(this.getArn()));
            }
            if (this.getLocalMountPath() != null) {
                data.set("localMountPath", om.valueToTree(this.getLocalMountPath()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sserviceslambda.FunctionSpecFileSystemConfigs"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            FunctionSpecFileSystemConfigs.Jsii$Proxy that = (FunctionSpecFileSystemConfigs.Jsii$Proxy) o;

            if (this.arn != null ? !this.arn.equals(that.arn) : that.arn != null) return false;
            return this.localMountPath != null ? this.localMountPath.equals(that.localMountPath) : that.localMountPath == null;
        }

        @Override
        public final int hashCode() {
            int result = this.arn != null ? this.arn.hashCode() : 0;
            result = 31 * result + (this.localMountPath != null ? this.localMountPath.hashCode() : 0);
            return result;
        }
    }
}
