package imports.aws.k8s.services.s3;

/**
 * Specifies the S3 Intelligent-Tiering configuration for an Amazon S3 bucket.
 * <p>
 * For information about the S3 Intelligent-Tiering storage class, see Storage class for automatically optimizing frequently and infrequently accessed objects (https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html#sc-dynamic-data-access).
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.397Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecIntelligentTiering")
@software.amazon.jsii.Jsii.Proxy(BucketSpecIntelligentTiering.Jsii$Proxy.class)
public interface BucketSpecIntelligentTiering extends software.amazon.jsii.JsiiSerializable {

    /**
     * The Filter is used to identify objects that the S3 Intelligent-Tiering configuration applies to.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecIntelligentTieringFilter getFilter() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getStatus() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.k8s.services.s3.BucketSpecIntelligentTieringTierings> getTierings() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecIntelligentTiering}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecIntelligentTiering}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecIntelligentTiering> {
        imports.aws.k8s.services.s3.BucketSpecIntelligentTieringFilter filter;
        java.lang.String id;
        java.lang.String status;
        java.util.List<imports.aws.k8s.services.s3.BucketSpecIntelligentTieringTierings> tierings;

        /**
         * Sets the value of {@link BucketSpecIntelligentTiering#getFilter}
         * @param filter The Filter is used to identify objects that the S3 Intelligent-Tiering configuration applies to.
         * @return {@code this}
         */
        public Builder filter(imports.aws.k8s.services.s3.BucketSpecIntelligentTieringFilter filter) {
            this.filter = filter;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecIntelligentTiering#getId}
         * @param id the value to be set.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecIntelligentTiering#getStatus}
         * @param status the value to be set.
         * @return {@code this}
         */
        public Builder status(java.lang.String status) {
            this.status = status;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecIntelligentTiering#getTierings}
         * @param tierings the value to be set.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder tierings(java.util.List<? extends imports.aws.k8s.services.s3.BucketSpecIntelligentTieringTierings> tierings) {
            this.tierings = (java.util.List<imports.aws.k8s.services.s3.BucketSpecIntelligentTieringTierings>)tierings;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecIntelligentTiering}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecIntelligentTiering build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecIntelligentTiering}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecIntelligentTiering {
        private final imports.aws.k8s.services.s3.BucketSpecIntelligentTieringFilter filter;
        private final java.lang.String id;
        private final java.lang.String status;
        private final java.util.List<imports.aws.k8s.services.s3.BucketSpecIntelligentTieringTierings> tierings;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.filter = software.amazon.jsii.Kernel.get(this, "filter", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecIntelligentTieringFilter.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.status = software.amazon.jsii.Kernel.get(this, "status", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tierings = software.amazon.jsii.Kernel.get(this, "tierings", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecIntelligentTieringTierings.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.filter = builder.filter;
            this.id = builder.id;
            this.status = builder.status;
            this.tierings = (java.util.List<imports.aws.k8s.services.s3.BucketSpecIntelligentTieringTierings>)builder.tierings;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecIntelligentTieringFilter getFilter() {
            return this.filter;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final java.lang.String getStatus() {
            return this.status;
        }

        @Override
        public final java.util.List<imports.aws.k8s.services.s3.BucketSpecIntelligentTieringTierings> getTierings() {
            return this.tierings;
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
            if (this.getStatus() != null) {
                data.set("status", om.valueToTree(this.getStatus()));
            }
            if (this.getTierings() != null) {
                data.set("tierings", om.valueToTree(this.getTierings()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecIntelligentTiering"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecIntelligentTiering.Jsii$Proxy that = (BucketSpecIntelligentTiering.Jsii$Proxy) o;

            if (this.filter != null ? !this.filter.equals(that.filter) : that.filter != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.status != null ? !this.status.equals(that.status) : that.status != null) return false;
            return this.tierings != null ? this.tierings.equals(that.tierings) : that.tierings == null;
        }

        @Override
        public final int hashCode() {
            int result = this.filter != null ? this.filter.hashCode() : 0;
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.status != null ? this.status.hashCode() : 0);
            result = 31 * result + (this.tierings != null ? this.tierings.hashCode() : 0);
            return result;
        }
    }
}
