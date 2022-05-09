package imports.aws.k8s.services.s3;

/**
 * Specifies the configuration and any analyses for the analytics filter of an Amazon S3 bucket.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.393Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecAnalytics")
@software.amazon.jsii.Jsii.Proxy(BucketSpecAnalytics.Jsii$Proxy.class)
public interface BucketSpecAnalytics extends software.amazon.jsii.JsiiSerializable {

    /**
     * The filter used to describe a set of objects for analyses.
     * <p>
     * A filter must have exactly one prefix, one tag, or one conjunction (AnalyticsAndOperator). If no filter is provided, all objects will be considered in any analysis.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecAnalyticsFilter getFilter() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * Specifies data related to access patterns to be collected and made available to analyze the tradeoffs between different storage classes for an Amazon S3 bucket.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecAnalyticsStorageClassAnalysis getStorageClassAnalysis() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecAnalytics}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecAnalytics}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecAnalytics> {
        imports.aws.k8s.services.s3.BucketSpecAnalyticsFilter filter;
        java.lang.String id;
        imports.aws.k8s.services.s3.BucketSpecAnalyticsStorageClassAnalysis storageClassAnalysis;

        /**
         * Sets the value of {@link BucketSpecAnalytics#getFilter}
         * @param filter The filter used to describe a set of objects for analyses.
         *               A filter must have exactly one prefix, one tag, or one conjunction (AnalyticsAndOperator). If no filter is provided, all objects will be considered in any analysis.
         * @return {@code this}
         */
        public Builder filter(imports.aws.k8s.services.s3.BucketSpecAnalyticsFilter filter) {
            this.filter = filter;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecAnalytics#getId}
         * @param id the value to be set.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecAnalytics#getStorageClassAnalysis}
         * @param storageClassAnalysis Specifies data related to access patterns to be collected and made available to analyze the tradeoffs between different storage classes for an Amazon S3 bucket.
         * @return {@code this}
         */
        public Builder storageClassAnalysis(imports.aws.k8s.services.s3.BucketSpecAnalyticsStorageClassAnalysis storageClassAnalysis) {
            this.storageClassAnalysis = storageClassAnalysis;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecAnalytics}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecAnalytics build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecAnalytics}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecAnalytics {
        private final imports.aws.k8s.services.s3.BucketSpecAnalyticsFilter filter;
        private final java.lang.String id;
        private final imports.aws.k8s.services.s3.BucketSpecAnalyticsStorageClassAnalysis storageClassAnalysis;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.filter = software.amazon.jsii.Kernel.get(this, "filter", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecAnalyticsFilter.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.storageClassAnalysis = software.amazon.jsii.Kernel.get(this, "storageClassAnalysis", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecAnalyticsStorageClassAnalysis.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.filter = builder.filter;
            this.id = builder.id;
            this.storageClassAnalysis = builder.storageClassAnalysis;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecAnalyticsFilter getFilter() {
            return this.filter;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecAnalyticsStorageClassAnalysis getStorageClassAnalysis() {
            return this.storageClassAnalysis;
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
            if (this.getStorageClassAnalysis() != null) {
                data.set("storageClassAnalysis", om.valueToTree(this.getStorageClassAnalysis()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecAnalytics"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecAnalytics.Jsii$Proxy that = (BucketSpecAnalytics.Jsii$Proxy) o;

            if (this.filter != null ? !this.filter.equals(that.filter) : that.filter != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            return this.storageClassAnalysis != null ? this.storageClassAnalysis.equals(that.storageClassAnalysis) : that.storageClassAnalysis == null;
        }

        @Override
        public final int hashCode() {
            int result = this.filter != null ? this.filter.hashCode() : 0;
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.storageClassAnalysis != null ? this.storageClassAnalysis.hashCode() : 0);
            return result;
        }
    }
}
