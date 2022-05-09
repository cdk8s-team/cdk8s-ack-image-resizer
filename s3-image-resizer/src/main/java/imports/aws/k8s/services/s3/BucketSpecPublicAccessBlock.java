package imports.aws.k8s.services.s3;

/**
 * The PublicAccessBlock configuration that you want to apply to this Amazon S3 bucket.
 * <p>
 * You can enable the configuration options in any combination. For more information about when Amazon S3 considers a bucket or object public, see The Meaning of "Public" (https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status) in the Amazon S3 User Guide.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.408Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecPublicAccessBlock")
@software.amazon.jsii.Jsii.Proxy(BucketSpecPublicAccessBlock.Jsii$Proxy.class)
public interface BucketSpecPublicAccessBlock extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getBlockPublicAcLs() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getBlockPublicPolicy() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getIgnorePublicAcLs() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getRestrictPublicBuckets() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecPublicAccessBlock}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecPublicAccessBlock}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecPublicAccessBlock> {
        java.lang.Boolean blockPublicAcLs;
        java.lang.Boolean blockPublicPolicy;
        java.lang.Boolean ignorePublicAcLs;
        java.lang.Boolean restrictPublicBuckets;

        /**
         * Sets the value of {@link BucketSpecPublicAccessBlock#getBlockPublicAcLs}
         * @param blockPublicAcLs the value to be set.
         * @return {@code this}
         */
        public Builder blockPublicAcLs(java.lang.Boolean blockPublicAcLs) {
            this.blockPublicAcLs = blockPublicAcLs;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecPublicAccessBlock#getBlockPublicPolicy}
         * @param blockPublicPolicy the value to be set.
         * @return {@code this}
         */
        public Builder blockPublicPolicy(java.lang.Boolean blockPublicPolicy) {
            this.blockPublicPolicy = blockPublicPolicy;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecPublicAccessBlock#getIgnorePublicAcLs}
         * @param ignorePublicAcLs the value to be set.
         * @return {@code this}
         */
        public Builder ignorePublicAcLs(java.lang.Boolean ignorePublicAcLs) {
            this.ignorePublicAcLs = ignorePublicAcLs;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecPublicAccessBlock#getRestrictPublicBuckets}
         * @param restrictPublicBuckets the value to be set.
         * @return {@code this}
         */
        public Builder restrictPublicBuckets(java.lang.Boolean restrictPublicBuckets) {
            this.restrictPublicBuckets = restrictPublicBuckets;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecPublicAccessBlock}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecPublicAccessBlock build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecPublicAccessBlock}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecPublicAccessBlock {
        private final java.lang.Boolean blockPublicAcLs;
        private final java.lang.Boolean blockPublicPolicy;
        private final java.lang.Boolean ignorePublicAcLs;
        private final java.lang.Boolean restrictPublicBuckets;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.blockPublicAcLs = software.amazon.jsii.Kernel.get(this, "blockPublicAcLs", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.blockPublicPolicy = software.amazon.jsii.Kernel.get(this, "blockPublicPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.ignorePublicAcLs = software.amazon.jsii.Kernel.get(this, "ignorePublicAcLs", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.restrictPublicBuckets = software.amazon.jsii.Kernel.get(this, "restrictPublicBuckets", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.blockPublicAcLs = builder.blockPublicAcLs;
            this.blockPublicPolicy = builder.blockPublicPolicy;
            this.ignorePublicAcLs = builder.ignorePublicAcLs;
            this.restrictPublicBuckets = builder.restrictPublicBuckets;
        }

        @Override
        public final java.lang.Boolean getBlockPublicAcLs() {
            return this.blockPublicAcLs;
        }

        @Override
        public final java.lang.Boolean getBlockPublicPolicy() {
            return this.blockPublicPolicy;
        }

        @Override
        public final java.lang.Boolean getIgnorePublicAcLs() {
            return this.ignorePublicAcLs;
        }

        @Override
        public final java.lang.Boolean getRestrictPublicBuckets() {
            return this.restrictPublicBuckets;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getBlockPublicAcLs() != null) {
                data.set("blockPublicAcLs", om.valueToTree(this.getBlockPublicAcLs()));
            }
            if (this.getBlockPublicPolicy() != null) {
                data.set("blockPublicPolicy", om.valueToTree(this.getBlockPublicPolicy()));
            }
            if (this.getIgnorePublicAcLs() != null) {
                data.set("ignorePublicAcLs", om.valueToTree(this.getIgnorePublicAcLs()));
            }
            if (this.getRestrictPublicBuckets() != null) {
                data.set("restrictPublicBuckets", om.valueToTree(this.getRestrictPublicBuckets()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecPublicAccessBlock"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecPublicAccessBlock.Jsii$Proxy that = (BucketSpecPublicAccessBlock.Jsii$Proxy) o;

            if (this.blockPublicAcLs != null ? !this.blockPublicAcLs.equals(that.blockPublicAcLs) : that.blockPublicAcLs != null) return false;
            if (this.blockPublicPolicy != null ? !this.blockPublicPolicy.equals(that.blockPublicPolicy) : that.blockPublicPolicy != null) return false;
            if (this.ignorePublicAcLs != null ? !this.ignorePublicAcLs.equals(that.ignorePublicAcLs) : that.ignorePublicAcLs != null) return false;
            return this.restrictPublicBuckets != null ? this.restrictPublicBuckets.equals(that.restrictPublicBuckets) : that.restrictPublicBuckets == null;
        }

        @Override
        public final int hashCode() {
            int result = this.blockPublicAcLs != null ? this.blockPublicAcLs.hashCode() : 0;
            result = 31 * result + (this.blockPublicPolicy != null ? this.blockPublicPolicy.hashCode() : 0);
            result = 31 * result + (this.ignorePublicAcLs != null ? this.ignorePublicAcLs.hashCode() : 0);
            result = 31 * result + (this.restrictPublicBuckets != null ? this.restrictPublicBuckets.hashCode() : 0);
            return result;
        }
    }
}
