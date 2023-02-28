package imports.aws.k8s.services.s3;

/**
 * Specifies the days since the initiation of an incomplete multipart upload that Amazon S3 will wait before permanently removing all parts of the upload.
 * <p>
 * For more information, see Aborting Incomplete Multipart Uploads Using a Bucket Lifecycle Policy (https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html#mpu-abort-incomplete-mpu-lifecycle-config) in the Amazon S3 User Guide.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.400Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecLifecycleRulesAbortIncompleteMultipartUpload")
@software.amazon.jsii.Jsii.Proxy(BucketSpecLifecycleRulesAbortIncompleteMultipartUpload.Jsii$Proxy.class)
public interface BucketSpecLifecycleRulesAbortIncompleteMultipartUpload extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getDaysAfterInitiation() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecLifecycleRulesAbortIncompleteMultipartUpload}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecLifecycleRulesAbortIncompleteMultipartUpload}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecLifecycleRulesAbortIncompleteMultipartUpload> {
        java.lang.Number daysAfterInitiation;

        /**
         * Sets the value of {@link BucketSpecLifecycleRulesAbortIncompleteMultipartUpload#getDaysAfterInitiation}
         * @param daysAfterInitiation the value to be set.
         * @return {@code this}
         */
        public Builder daysAfterInitiation(java.lang.Number daysAfterInitiation) {
            this.daysAfterInitiation = daysAfterInitiation;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecLifecycleRulesAbortIncompleteMultipartUpload}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecLifecycleRulesAbortIncompleteMultipartUpload build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecLifecycleRulesAbortIncompleteMultipartUpload}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecLifecycleRulesAbortIncompleteMultipartUpload {
        private final java.lang.Number daysAfterInitiation;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.daysAfterInitiation = software.amazon.jsii.Kernel.get(this, "daysAfterInitiation", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.daysAfterInitiation = builder.daysAfterInitiation;
        }

        @Override
        public final java.lang.Number getDaysAfterInitiation() {
            return this.daysAfterInitiation;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getDaysAfterInitiation() != null) {
                data.set("daysAfterInitiation", om.valueToTree(this.getDaysAfterInitiation()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecLifecycleRulesAbortIncompleteMultipartUpload"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecLifecycleRulesAbortIncompleteMultipartUpload.Jsii$Proxy that = (BucketSpecLifecycleRulesAbortIncompleteMultipartUpload.Jsii$Proxy) o;

            return this.daysAfterInitiation != null ? this.daysAfterInitiation.equals(that.daysAfterInitiation) : that.daysAfterInitiation == null;
        }

        @Override
        public final int hashCode() {
            int result = this.daysAfterInitiation != null ? this.daysAfterInitiation.hashCode() : 0;
            return result;
        }
    }
}
