package imports.aws.k8s.services.s3;

/**
 * Container for logging status information.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.402Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecLogging")
@software.amazon.jsii.Jsii.Proxy(BucketSpecLogging.Jsii$Proxy.class)
public interface BucketSpecLogging extends software.amazon.jsii.JsiiSerializable {

    /**
     * Describes where logs are stored and the prefix that Amazon S3 assigns to all log object keys for a bucket.
     * <p>
     * For more information, see PUT Bucket logging (https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTlogging.html) in the Amazon S3 API Reference.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecLoggingLoggingEnabled getLoggingEnabled() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecLogging}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecLogging}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecLogging> {
        imports.aws.k8s.services.s3.BucketSpecLoggingLoggingEnabled loggingEnabled;

        /**
         * Sets the value of {@link BucketSpecLogging#getLoggingEnabled}
         * @param loggingEnabled Describes where logs are stored and the prefix that Amazon S3 assigns to all log object keys for a bucket.
         *                       For more information, see PUT Bucket logging (https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTlogging.html) in the Amazon S3 API Reference.
         * @return {@code this}
         */
        public Builder loggingEnabled(imports.aws.k8s.services.s3.BucketSpecLoggingLoggingEnabled loggingEnabled) {
            this.loggingEnabled = loggingEnabled;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecLogging}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecLogging build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecLogging}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecLogging {
        private final imports.aws.k8s.services.s3.BucketSpecLoggingLoggingEnabled loggingEnabled;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.loggingEnabled = software.amazon.jsii.Kernel.get(this, "loggingEnabled", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecLoggingLoggingEnabled.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.loggingEnabled = builder.loggingEnabled;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecLoggingLoggingEnabled getLoggingEnabled() {
            return this.loggingEnabled;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getLoggingEnabled() != null) {
                data.set("loggingEnabled", om.valueToTree(this.getLoggingEnabled()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecLogging"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecLogging.Jsii$Proxy that = (BucketSpecLogging.Jsii$Proxy) o;

            return this.loggingEnabled != null ? this.loggingEnabled.equals(that.loggingEnabled) : that.loggingEnabled == null;
        }

        @Override
        public final int hashCode() {
            int result = this.loggingEnabled != null ? this.loggingEnabled.hashCode() : 0;
            return result;
        }
    }
}
