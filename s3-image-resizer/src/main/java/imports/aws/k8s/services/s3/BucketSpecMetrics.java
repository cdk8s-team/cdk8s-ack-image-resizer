package imports.aws.k8s.services.s3;

/**
 * Specifies a metrics configuration for the CloudWatch request metrics (specified by the metrics configuration ID) from an Amazon S3 bucket.
 * <p>
 * If you're updating an existing metrics configuration, note that this is a full replacement of the existing metrics configuration. If you don't include the elements you want to keep, they are erased. For more information, see PutBucketMetricsConfiguration (https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTMetricConfiguration.html).
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.403Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecMetrics")
@software.amazon.jsii.Jsii.Proxy(BucketSpecMetrics.Jsii$Proxy.class)
public interface BucketSpecMetrics extends software.amazon.jsii.JsiiSerializable {

    /**
     * Specifies a metrics configuration filter.
     * <p>
     * The metrics configuration only includes objects that meet the filter's criteria. A filter must be a prefix, an object tag, an access point ARN, or a conjunction (MetricsAndOperator). For more information, see PutBucketMetricsConfiguration (https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketMetricsConfiguration.html).
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecMetricsFilter getFilter() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecMetrics}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecMetrics}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecMetrics> {
        imports.aws.k8s.services.s3.BucketSpecMetricsFilter filter;
        java.lang.String id;

        /**
         * Sets the value of {@link BucketSpecMetrics#getFilter}
         * @param filter Specifies a metrics configuration filter.
         *               The metrics configuration only includes objects that meet the filter's criteria. A filter must be a prefix, an object tag, an access point ARN, or a conjunction (MetricsAndOperator). For more information, see PutBucketMetricsConfiguration (https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketMetricsConfiguration.html).
         * @return {@code this}
         */
        public Builder filter(imports.aws.k8s.services.s3.BucketSpecMetricsFilter filter) {
            this.filter = filter;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecMetrics#getId}
         * @param id the value to be set.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecMetrics}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecMetrics build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecMetrics}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecMetrics {
        private final imports.aws.k8s.services.s3.BucketSpecMetricsFilter filter;
        private final java.lang.String id;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.filter = software.amazon.jsii.Kernel.get(this, "filter", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecMetricsFilter.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.filter = builder.filter;
            this.id = builder.id;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecMetricsFilter getFilter() {
            return this.filter;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getFilter() != null) {
                data.set("filter", om.valueToTree(this.getFilter()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecMetrics"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecMetrics.Jsii$Proxy that = (BucketSpecMetrics.Jsii$Proxy) o;

            if (this.filter != null ? !this.filter.equals(that.filter) : that.filter != null) return false;
            return this.id != null ? this.id.equals(that.id) : that.id == null;
        }

        @Override
        public final int hashCode() {
            int result = this.filter != null ? this.filter.hashCode() : 0;
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            return result;
        }
    }
}
