package imports.aws.k8s.services.s3;

/**
 * Specifies the default server-side encryption configuration.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.396Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecEncryptionRules")
@software.amazon.jsii.Jsii.Proxy(BucketSpecEncryptionRules.Jsii$Proxy.class)
public interface BucketSpecEncryptionRules extends software.amazon.jsii.JsiiSerializable {

    /**
     * Describes the default server-side encryption to apply to new objects in the bucket.
     * <p>
     * If a PUT Object request doesn't specify any server-side encryption, this default encryption will be applied. For more information, see PUT Bucket encryption (https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTencryption.html) in the Amazon S3 API Reference.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecEncryptionRulesApplyServerSideEncryptionByDefault getApplyServerSideEncryptionByDefault() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getBucketKeyEnabled() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecEncryptionRules}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecEncryptionRules}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecEncryptionRules> {
        imports.aws.k8s.services.s3.BucketSpecEncryptionRulesApplyServerSideEncryptionByDefault applyServerSideEncryptionByDefault;
        java.lang.Boolean bucketKeyEnabled;

        /**
         * Sets the value of {@link BucketSpecEncryptionRules#getApplyServerSideEncryptionByDefault}
         * @param applyServerSideEncryptionByDefault Describes the default server-side encryption to apply to new objects in the bucket.
         *                                           If a PUT Object request doesn't specify any server-side encryption, this default encryption will be applied. For more information, see PUT Bucket encryption (https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTencryption.html) in the Amazon S3 API Reference.
         * @return {@code this}
         */
        public Builder applyServerSideEncryptionByDefault(imports.aws.k8s.services.s3.BucketSpecEncryptionRulesApplyServerSideEncryptionByDefault applyServerSideEncryptionByDefault) {
            this.applyServerSideEncryptionByDefault = applyServerSideEncryptionByDefault;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecEncryptionRules#getBucketKeyEnabled}
         * @param bucketKeyEnabled the value to be set.
         * @return {@code this}
         */
        public Builder bucketKeyEnabled(java.lang.Boolean bucketKeyEnabled) {
            this.bucketKeyEnabled = bucketKeyEnabled;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecEncryptionRules}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecEncryptionRules build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecEncryptionRules}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecEncryptionRules {
        private final imports.aws.k8s.services.s3.BucketSpecEncryptionRulesApplyServerSideEncryptionByDefault applyServerSideEncryptionByDefault;
        private final java.lang.Boolean bucketKeyEnabled;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.applyServerSideEncryptionByDefault = software.amazon.jsii.Kernel.get(this, "applyServerSideEncryptionByDefault", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecEncryptionRulesApplyServerSideEncryptionByDefault.class));
            this.bucketKeyEnabled = software.amazon.jsii.Kernel.get(this, "bucketKeyEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.applyServerSideEncryptionByDefault = builder.applyServerSideEncryptionByDefault;
            this.bucketKeyEnabled = builder.bucketKeyEnabled;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecEncryptionRulesApplyServerSideEncryptionByDefault getApplyServerSideEncryptionByDefault() {
            return this.applyServerSideEncryptionByDefault;
        }

        @Override
        public final java.lang.Boolean getBucketKeyEnabled() {
            return this.bucketKeyEnabled;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getApplyServerSideEncryptionByDefault() != null) {
                data.set("applyServerSideEncryptionByDefault", om.valueToTree(this.getApplyServerSideEncryptionByDefault()));
            }
            if (this.getBucketKeyEnabled() != null) {
                data.set("bucketKeyEnabled", om.valueToTree(this.getBucketKeyEnabled()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecEncryptionRules"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecEncryptionRules.Jsii$Proxy that = (BucketSpecEncryptionRules.Jsii$Proxy) o;

            if (this.applyServerSideEncryptionByDefault != null ? !this.applyServerSideEncryptionByDefault.equals(that.applyServerSideEncryptionByDefault) : that.applyServerSideEncryptionByDefault != null) return false;
            return this.bucketKeyEnabled != null ? this.bucketKeyEnabled.equals(that.bucketKeyEnabled) : that.bucketKeyEnabled == null;
        }

        @Override
        public final int hashCode() {
            int result = this.applyServerSideEncryptionByDefault != null ? this.applyServerSideEncryptionByDefault.hashCode() : 0;
            result = 31 * result + (this.bucketKeyEnabled != null ? this.bucketKeyEnabled.hashCode() : 0);
            return result;
        }
    }
}
