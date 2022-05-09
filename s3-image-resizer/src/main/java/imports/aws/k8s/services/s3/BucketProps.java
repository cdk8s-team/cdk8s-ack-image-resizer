package imports.aws.k8s.services.s3;

/**
 * Bucket is the Schema for the Buckets API.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.387Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketProps")
@software.amazon.jsii.Jsii.Proxy(BucketProps.Jsii$Proxy.class)
public interface BucketProps extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    default @org.jetbrains.annotations.Nullable org.cdk8s.ApiObjectMetadata getMetadata() {
        return null;
    }

    /**
     * BucketSpec defines the desired state of Bucket.
     * <p>
     * In terms of implementation, a Bucket is a resource. An Amazon S3 bucket name is globally unique, and the namespace is shared by all Amazon Web Services accounts.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpec getSpec() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketProps}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketProps}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketProps> {
        org.cdk8s.ApiObjectMetadata metadata;
        imports.aws.k8s.services.s3.BucketSpec spec;

        /**
         * Sets the value of {@link BucketProps#getMetadata}
         * @param metadata the value to be set.
         * @return {@code this}
         */
        public Builder metadata(org.cdk8s.ApiObjectMetadata metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Sets the value of {@link BucketProps#getSpec}
         * @param spec BucketSpec defines the desired state of Bucket.
         *             In terms of implementation, a Bucket is a resource. An Amazon S3 bucket name is globally unique, and the namespace is shared by all Amazon Web Services accounts.
         * @return {@code this}
         */
        public Builder spec(imports.aws.k8s.services.s3.BucketSpec spec) {
            this.spec = spec;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketProps}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketProps build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketProps}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketProps {
        private final org.cdk8s.ApiObjectMetadata metadata;
        private final imports.aws.k8s.services.s3.BucketSpec spec;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.metadata = software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.forClass(org.cdk8s.ApiObjectMetadata.class));
            this.spec = software.amazon.jsii.Kernel.get(this, "spec", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpec.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.metadata = builder.metadata;
            this.spec = builder.spec;
        }

        @Override
        public final org.cdk8s.ApiObjectMetadata getMetadata() {
            return this.metadata;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpec getSpec() {
            return this.spec;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }
            if (this.getSpec() != null) {
                data.set("spec", om.valueToTree(this.getSpec()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketProps"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketProps.Jsii$Proxy that = (BucketProps.Jsii$Proxy) o;

            if (this.metadata != null ? !this.metadata.equals(that.metadata) : that.metadata != null) return false;
            return this.spec != null ? this.spec.equals(that.spec) : that.spec == null;
        }

        @Override
        public final int hashCode() {
            int result = this.metadata != null ? this.metadata.hashCode() : 0;
            result = 31 * result + (this.spec != null ? this.spec.hashCode() : 0);
            return result;
        }
    }
}
