package imports.aws.k8s.services.s3;

/**
 * Container for data related to the storage class analysis for an Amazon S3 bucket for export.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.395Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecAnalyticsStorageClassAnalysisDataExport")
@software.amazon.jsii.Jsii.Proxy(BucketSpecAnalyticsStorageClassAnalysisDataExport.Jsii$Proxy.class)
public interface BucketSpecAnalyticsStorageClassAnalysisDataExport extends software.amazon.jsii.JsiiSerializable {

    /**
     * Where to publish the analytics results.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecAnalyticsStorageClassAnalysisDataExportDestination getDestination() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getOutputSchemaVersion() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecAnalyticsStorageClassAnalysisDataExport}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecAnalyticsStorageClassAnalysisDataExport}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecAnalyticsStorageClassAnalysisDataExport> {
        imports.aws.k8s.services.s3.BucketSpecAnalyticsStorageClassAnalysisDataExportDestination destination;
        java.lang.String outputSchemaVersion;

        /**
         * Sets the value of {@link BucketSpecAnalyticsStorageClassAnalysisDataExport#getDestination}
         * @param destination Where to publish the analytics results.
         * @return {@code this}
         */
        public Builder destination(imports.aws.k8s.services.s3.BucketSpecAnalyticsStorageClassAnalysisDataExportDestination destination) {
            this.destination = destination;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecAnalyticsStorageClassAnalysisDataExport#getOutputSchemaVersion}
         * @param outputSchemaVersion the value to be set.
         * @return {@code this}
         */
        public Builder outputSchemaVersion(java.lang.String outputSchemaVersion) {
            this.outputSchemaVersion = outputSchemaVersion;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecAnalyticsStorageClassAnalysisDataExport}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecAnalyticsStorageClassAnalysisDataExport build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecAnalyticsStorageClassAnalysisDataExport}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecAnalyticsStorageClassAnalysisDataExport {
        private final imports.aws.k8s.services.s3.BucketSpecAnalyticsStorageClassAnalysisDataExportDestination destination;
        private final java.lang.String outputSchemaVersion;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.destination = software.amazon.jsii.Kernel.get(this, "destination", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecAnalyticsStorageClassAnalysisDataExportDestination.class));
            this.outputSchemaVersion = software.amazon.jsii.Kernel.get(this, "outputSchemaVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.destination = builder.destination;
            this.outputSchemaVersion = builder.outputSchemaVersion;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecAnalyticsStorageClassAnalysisDataExportDestination getDestination() {
            return this.destination;
        }

        @Override
        public final java.lang.String getOutputSchemaVersion() {
            return this.outputSchemaVersion;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getDestination() != null) {
                data.set("destination", om.valueToTree(this.getDestination()));
            }
            if (this.getOutputSchemaVersion() != null) {
                data.set("outputSchemaVersion", om.valueToTree(this.getOutputSchemaVersion()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecAnalyticsStorageClassAnalysisDataExport"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecAnalyticsStorageClassAnalysisDataExport.Jsii$Proxy that = (BucketSpecAnalyticsStorageClassAnalysisDataExport.Jsii$Proxy) o;

            if (this.destination != null ? !this.destination.equals(that.destination) : that.destination != null) return false;
            return this.outputSchemaVersion != null ? this.outputSchemaVersion.equals(that.outputSchemaVersion) : that.outputSchemaVersion == null;
        }

        @Override
        public final int hashCode() {
            int result = this.destination != null ? this.destination.hashCode() : 0;
            result = 31 * result + (this.outputSchemaVersion != null ? this.outputSchemaVersion.hashCode() : 0);
            return result;
        }
    }
}
