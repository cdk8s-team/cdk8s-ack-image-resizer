package imports.aws.k8s.services.s3;

/**
 * Describes where logs are stored and the prefix that Amazon S3 assigns to all log object keys for a bucket.
 * <p>
 * For more information, see PUT Bucket logging (https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTlogging.html) in the Amazon S3 API Reference.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.402Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecLoggingLoggingEnabled")
@software.amazon.jsii.Jsii.Proxy(BucketSpecLoggingLoggingEnabled.Jsii$Proxy.class)
public interface BucketSpecLoggingLoggingEnabled extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getTargetBucket() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.k8s.services.s3.BucketSpecLoggingLoggingEnabledTargetGrants> getTargetGrants() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getTargetPrefix() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecLoggingLoggingEnabled}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecLoggingLoggingEnabled}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecLoggingLoggingEnabled> {
        java.lang.String targetBucket;
        java.util.List<imports.aws.k8s.services.s3.BucketSpecLoggingLoggingEnabledTargetGrants> targetGrants;
        java.lang.String targetPrefix;

        /**
         * Sets the value of {@link BucketSpecLoggingLoggingEnabled#getTargetBucket}
         * @param targetBucket the value to be set.
         * @return {@code this}
         */
        public Builder targetBucket(java.lang.String targetBucket) {
            this.targetBucket = targetBucket;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecLoggingLoggingEnabled#getTargetGrants}
         * @param targetGrants the value to be set.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder targetGrants(java.util.List<? extends imports.aws.k8s.services.s3.BucketSpecLoggingLoggingEnabledTargetGrants> targetGrants) {
            this.targetGrants = (java.util.List<imports.aws.k8s.services.s3.BucketSpecLoggingLoggingEnabledTargetGrants>)targetGrants;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecLoggingLoggingEnabled#getTargetPrefix}
         * @param targetPrefix the value to be set.
         * @return {@code this}
         */
        public Builder targetPrefix(java.lang.String targetPrefix) {
            this.targetPrefix = targetPrefix;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecLoggingLoggingEnabled}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecLoggingLoggingEnabled build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecLoggingLoggingEnabled}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecLoggingLoggingEnabled {
        private final java.lang.String targetBucket;
        private final java.util.List<imports.aws.k8s.services.s3.BucketSpecLoggingLoggingEnabledTargetGrants> targetGrants;
        private final java.lang.String targetPrefix;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.targetBucket = software.amazon.jsii.Kernel.get(this, "targetBucket", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.targetGrants = software.amazon.jsii.Kernel.get(this, "targetGrants", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecLoggingLoggingEnabledTargetGrants.class)));
            this.targetPrefix = software.amazon.jsii.Kernel.get(this, "targetPrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.targetBucket = builder.targetBucket;
            this.targetGrants = (java.util.List<imports.aws.k8s.services.s3.BucketSpecLoggingLoggingEnabledTargetGrants>)builder.targetGrants;
            this.targetPrefix = builder.targetPrefix;
        }

        @Override
        public final java.lang.String getTargetBucket() {
            return this.targetBucket;
        }

        @Override
        public final java.util.List<imports.aws.k8s.services.s3.BucketSpecLoggingLoggingEnabledTargetGrants> getTargetGrants() {
            return this.targetGrants;
        }

        @Override
        public final java.lang.String getTargetPrefix() {
            return this.targetPrefix;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getTargetBucket() != null) {
                data.set("targetBucket", om.valueToTree(this.getTargetBucket()));
            }
            if (this.getTargetGrants() != null) {
                data.set("targetGrants", om.valueToTree(this.getTargetGrants()));
            }
            if (this.getTargetPrefix() != null) {
                data.set("targetPrefix", om.valueToTree(this.getTargetPrefix()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecLoggingLoggingEnabled"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecLoggingLoggingEnabled.Jsii$Proxy that = (BucketSpecLoggingLoggingEnabled.Jsii$Proxy) o;

            if (this.targetBucket != null ? !this.targetBucket.equals(that.targetBucket) : that.targetBucket != null) return false;
            if (this.targetGrants != null ? !this.targetGrants.equals(that.targetGrants) : that.targetGrants != null) return false;
            return this.targetPrefix != null ? this.targetPrefix.equals(that.targetPrefix) : that.targetPrefix == null;
        }

        @Override
        public final int hashCode() {
            int result = this.targetBucket != null ? this.targetBucket.hashCode() : 0;
            result = 31 * result + (this.targetGrants != null ? this.targetGrants.hashCode() : 0);
            result = 31 * result + (this.targetPrefix != null ? this.targetPrefix.hashCode() : 0);
            return result;
        }
    }
}
