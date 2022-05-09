package imports.aws.k8s.services.s3;

/**
 * Specifies a metrics configuration filter.
 * <p>
 * The metrics configuration only includes objects that meet the filter's criteria. A filter must be a prefix, an object tag, an access point ARN, or a conjunction (MetricsAndOperator). For more information, see PutBucketMetricsConfiguration (https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketMetricsConfiguration.html).
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.403Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecMetricsFilter")
@software.amazon.jsii.Jsii.Proxy(BucketSpecMetricsFilter.Jsii$Proxy.class)
public interface BucketSpecMetricsFilter extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAccessPointArn() {
        return null;
    }

    /**
     * A conjunction (logical AND) of predicates, which is used in evaluating a metrics filter.
     * <p>
     * The operator must have at least two predicates, and an object must match all of the predicates in order for the filter to apply.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecMetricsFilterAnd getAnd() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPrefix() {
        return null;
    }

    /**
     * A container of a key value name pair.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecMetricsFilterTag getTag() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecMetricsFilter}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecMetricsFilter}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecMetricsFilter> {
        java.lang.String accessPointArn;
        imports.aws.k8s.services.s3.BucketSpecMetricsFilterAnd and;
        java.lang.String prefix;
        imports.aws.k8s.services.s3.BucketSpecMetricsFilterTag tag;

        /**
         * Sets the value of {@link BucketSpecMetricsFilter#getAccessPointArn}
         * @param accessPointArn the value to be set.
         * @return {@code this}
         */
        public Builder accessPointArn(java.lang.String accessPointArn) {
            this.accessPointArn = accessPointArn;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecMetricsFilter#getAnd}
         * @param and A conjunction (logical AND) of predicates, which is used in evaluating a metrics filter.
         *            The operator must have at least two predicates, and an object must match all of the predicates in order for the filter to apply.
         * @return {@code this}
         */
        public Builder and(imports.aws.k8s.services.s3.BucketSpecMetricsFilterAnd and) {
            this.and = and;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecMetricsFilter#getPrefix}
         * @param prefix the value to be set.
         * @return {@code this}
         */
        public Builder prefix(java.lang.String prefix) {
            this.prefix = prefix;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecMetricsFilter#getTag}
         * @param tag A container of a key value name pair.
         * @return {@code this}
         */
        public Builder tag(imports.aws.k8s.services.s3.BucketSpecMetricsFilterTag tag) {
            this.tag = tag;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecMetricsFilter}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecMetricsFilter build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecMetricsFilter}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecMetricsFilter {
        private final java.lang.String accessPointArn;
        private final imports.aws.k8s.services.s3.BucketSpecMetricsFilterAnd and;
        private final java.lang.String prefix;
        private final imports.aws.k8s.services.s3.BucketSpecMetricsFilterTag tag;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.accessPointArn = software.amazon.jsii.Kernel.get(this, "accessPointArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.and = software.amazon.jsii.Kernel.get(this, "and", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecMetricsFilterAnd.class));
            this.prefix = software.amazon.jsii.Kernel.get(this, "prefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tag = software.amazon.jsii.Kernel.get(this, "tag", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecMetricsFilterTag.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.accessPointArn = builder.accessPointArn;
            this.and = builder.and;
            this.prefix = builder.prefix;
            this.tag = builder.tag;
        }

        @Override
        public final java.lang.String getAccessPointArn() {
            return this.accessPointArn;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecMetricsFilterAnd getAnd() {
            return this.and;
        }

        @Override
        public final java.lang.String getPrefix() {
            return this.prefix;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecMetricsFilterTag getTag() {
            return this.tag;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAccessPointArn() != null) {
                data.set("accessPointArn", om.valueToTree(this.getAccessPointArn()));
            }
            if (this.getAnd() != null) {
                data.set("and", om.valueToTree(this.getAnd()));
            }
            if (this.getPrefix() != null) {
                data.set("prefix", om.valueToTree(this.getPrefix()));
            }
            if (this.getTag() != null) {
                data.set("tag", om.valueToTree(this.getTag()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecMetricsFilter"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecMetricsFilter.Jsii$Proxy that = (BucketSpecMetricsFilter.Jsii$Proxy) o;

            if (this.accessPointArn != null ? !this.accessPointArn.equals(that.accessPointArn) : that.accessPointArn != null) return false;
            if (this.and != null ? !this.and.equals(that.and) : that.and != null) return false;
            if (this.prefix != null ? !this.prefix.equals(that.prefix) : that.prefix != null) return false;
            return this.tag != null ? this.tag.equals(that.tag) : that.tag == null;
        }

        @Override
        public final int hashCode() {
            int result = this.accessPointArn != null ? this.accessPointArn.hashCode() : 0;
            result = 31 * result + (this.and != null ? this.and.hashCode() : 0);
            result = 31 * result + (this.prefix != null ? this.prefix.hashCode() : 0);
            result = 31 * result + (this.tag != null ? this.tag.hashCode() : 0);
            return result;
        }
    }
}
