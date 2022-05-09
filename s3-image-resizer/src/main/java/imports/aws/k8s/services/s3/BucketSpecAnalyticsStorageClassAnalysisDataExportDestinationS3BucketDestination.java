package imports.aws.k8s.services.s3;

/**
 * Contains information about where to publish the analytics results.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.395Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecAnalyticsStorageClassAnalysisDataExportDestinationS3BucketDestination")
@software.amazon.jsii.Jsii.Proxy(BucketSpecAnalyticsStorageClassAnalysisDataExportDestinationS3BucketDestination.Jsii$Proxy.class)
public interface BucketSpecAnalyticsStorageClassAnalysisDataExportDestinationS3BucketDestination extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getBucket() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getBucketAccountId() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFormat() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPrefix() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecAnalyticsStorageClassAnalysisDataExportDestinationS3BucketDestination}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecAnalyticsStorageClassAnalysisDataExportDestinationS3BucketDestination}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecAnalyticsStorageClassAnalysisDataExportDestinationS3BucketDestination> {
        java.lang.String bucket;
        java.lang.String bucketAccountId;
        java.lang.String format;
        java.lang.String prefix;

        /**
         * Sets the value of {@link BucketSpecAnalyticsStorageClassAnalysisDataExportDestinationS3BucketDestination#getBucket}
         * @param bucket the value to be set.
         * @return {@code this}
         */
        public Builder bucket(java.lang.String bucket) {
            this.bucket = bucket;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecAnalyticsStorageClassAnalysisDataExportDestinationS3BucketDestination#getBucketAccountId}
         * @param bucketAccountId the value to be set.
         * @return {@code this}
         */
        public Builder bucketAccountId(java.lang.String bucketAccountId) {
            this.bucketAccountId = bucketAccountId;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecAnalyticsStorageClassAnalysisDataExportDestinationS3BucketDestination#getFormat}
         * @param format the value to be set.
         * @return {@code this}
         */
        public Builder format(java.lang.String format) {
            this.format = format;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecAnalyticsStorageClassAnalysisDataExportDestinationS3BucketDestination#getPrefix}
         * @param prefix the value to be set.
         * @return {@code this}
         */
        public Builder prefix(java.lang.String prefix) {
            this.prefix = prefix;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecAnalyticsStorageClassAnalysisDataExportDestinationS3BucketDestination}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecAnalyticsStorageClassAnalysisDataExportDestinationS3BucketDestination build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecAnalyticsStorageClassAnalysisDataExportDestinationS3BucketDestination}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecAnalyticsStorageClassAnalysisDataExportDestinationS3BucketDestination {
        private final java.lang.String bucket;
        private final java.lang.String bucketAccountId;
        private final java.lang.String format;
        private final java.lang.String prefix;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.bucket = software.amazon.jsii.Kernel.get(this, "bucket", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.bucketAccountId = software.amazon.jsii.Kernel.get(this, "bucketAccountId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.format = software.amazon.jsii.Kernel.get(this, "format", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.prefix = software.amazon.jsii.Kernel.get(this, "prefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.bucket = builder.bucket;
            this.bucketAccountId = builder.bucketAccountId;
            this.format = builder.format;
            this.prefix = builder.prefix;
        }

        @Override
        public final java.lang.String getBucket() {
            return this.bucket;
        }

        @Override
        public final java.lang.String getBucketAccountId() {
            return this.bucketAccountId;
        }

        @Override
        public final java.lang.String getFormat() {
            return this.format;
        }

        @Override
        public final java.lang.String getPrefix() {
            return this.prefix;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getBucket() != null) {
                data.set("bucket", om.valueToTree(this.getBucket()));
            }
            if (this.getBucketAccountId() != null) {
                data.set("bucketAccountId", om.valueToTree(this.getBucketAccountId()));
            }
            if (this.getFormat() != null) {
                data.set("format", om.valueToTree(this.getFormat()));
            }
            if (this.getPrefix() != null) {
                data.set("prefix", om.valueToTree(this.getPrefix()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecAnalyticsStorageClassAnalysisDataExportDestinationS3BucketDestination"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecAnalyticsStorageClassAnalysisDataExportDestinationS3BucketDestination.Jsii$Proxy that = (BucketSpecAnalyticsStorageClassAnalysisDataExportDestinationS3BucketDestination.Jsii$Proxy) o;

            if (this.bucket != null ? !this.bucket.equals(that.bucket) : that.bucket != null) return false;
            if (this.bucketAccountId != null ? !this.bucketAccountId.equals(that.bucketAccountId) : that.bucketAccountId != null) return false;
            if (this.format != null ? !this.format.equals(that.format) : that.format != null) return false;
            return this.prefix != null ? this.prefix.equals(that.prefix) : that.prefix == null;
        }

        @Override
        public final int hashCode() {
            int result = this.bucket != null ? this.bucket.hashCode() : 0;
            result = 31 * result + (this.bucketAccountId != null ? this.bucketAccountId.hashCode() : 0);
            result = 31 * result + (this.format != null ? this.format.hashCode() : 0);
            result = 31 * result + (this.prefix != null ? this.prefix.hashCode() : 0);
            return result;
        }
    }
}
