package imports.aws.k8s.services.s3;

/**
 * Where to publish the analytics results.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.395Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecAnalyticsStorageClassAnalysisDataExportDestination")
@software.amazon.jsii.Jsii.Proxy(BucketSpecAnalyticsStorageClassAnalysisDataExportDestination.Jsii$Proxy.class)
public interface BucketSpecAnalyticsStorageClassAnalysisDataExportDestination extends software.amazon.jsii.JsiiSerializable {

    /**
     * Contains information about where to publish the analytics results.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecAnalyticsStorageClassAnalysisDataExportDestinationS3BucketDestination getS3BucketDestination() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecAnalyticsStorageClassAnalysisDataExportDestination}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecAnalyticsStorageClassAnalysisDataExportDestination}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecAnalyticsStorageClassAnalysisDataExportDestination> {
        imports.aws.k8s.services.s3.BucketSpecAnalyticsStorageClassAnalysisDataExportDestinationS3BucketDestination s3BucketDestination;

        /**
         * Sets the value of {@link BucketSpecAnalyticsStorageClassAnalysisDataExportDestination#getS3BucketDestination}
         * @param s3BucketDestination Contains information about where to publish the analytics results.
         * @return {@code this}
         */
        public Builder s3BucketDestination(imports.aws.k8s.services.s3.BucketSpecAnalyticsStorageClassAnalysisDataExportDestinationS3BucketDestination s3BucketDestination) {
            this.s3BucketDestination = s3BucketDestination;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecAnalyticsStorageClassAnalysisDataExportDestination}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecAnalyticsStorageClassAnalysisDataExportDestination build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecAnalyticsStorageClassAnalysisDataExportDestination}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecAnalyticsStorageClassAnalysisDataExportDestination {
        private final imports.aws.k8s.services.s3.BucketSpecAnalyticsStorageClassAnalysisDataExportDestinationS3BucketDestination s3BucketDestination;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.s3BucketDestination = software.amazon.jsii.Kernel.get(this, "s3BucketDestination", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecAnalyticsStorageClassAnalysisDataExportDestinationS3BucketDestination.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.s3BucketDestination = builder.s3BucketDestination;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecAnalyticsStorageClassAnalysisDataExportDestinationS3BucketDestination getS3BucketDestination() {
            return this.s3BucketDestination;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getS3BucketDestination() != null) {
                data.set("s3BucketDestination", om.valueToTree(this.getS3BucketDestination()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecAnalyticsStorageClassAnalysisDataExportDestination"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecAnalyticsStorageClassAnalysisDataExportDestination.Jsii$Proxy that = (BucketSpecAnalyticsStorageClassAnalysisDataExportDestination.Jsii$Proxy) o;

            return this.s3BucketDestination != null ? this.s3BucketDestination.equals(that.s3BucketDestination) : that.s3BucketDestination == null;
        }

        @Override
        public final int hashCode() {
            int result = this.s3BucketDestination != null ? this.s3BucketDestination.hashCode() : 0;
            return result;
        }
    }
}
