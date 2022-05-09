package imports.aws.k8s.services.s3;

/**
 * Describes the cross-origin access configuration for objects in an Amazon S3 bucket.
 * <p>
 * For more information, see Enabling Cross-Origin Resource Sharing (https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html) in the Amazon S3 User Guide.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.395Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecCors")
@software.amazon.jsii.Jsii.Proxy(BucketSpecCors.Jsii$Proxy.class)
public interface BucketSpecCors extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.k8s.services.s3.BucketSpecCorsCorsRules> getCorsRules() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecCors}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecCors}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecCors> {
        java.util.List<imports.aws.k8s.services.s3.BucketSpecCorsCorsRules> corsRules;

        /**
         * Sets the value of {@link BucketSpecCors#getCorsRules}
         * @param corsRules the value to be set.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder corsRules(java.util.List<? extends imports.aws.k8s.services.s3.BucketSpecCorsCorsRules> corsRules) {
            this.corsRules = (java.util.List<imports.aws.k8s.services.s3.BucketSpecCorsCorsRules>)corsRules;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecCors}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecCors build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecCors}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecCors {
        private final java.util.List<imports.aws.k8s.services.s3.BucketSpecCorsCorsRules> corsRules;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.corsRules = software.amazon.jsii.Kernel.get(this, "corsRules", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecCorsCorsRules.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.corsRules = (java.util.List<imports.aws.k8s.services.s3.BucketSpecCorsCorsRules>)builder.corsRules;
        }

        @Override
        public final java.util.List<imports.aws.k8s.services.s3.BucketSpecCorsCorsRules> getCorsRules() {
            return this.corsRules;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCorsRules() != null) {
                data.set("corsRules", om.valueToTree(this.getCorsRules()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecCors"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecCors.Jsii$Proxy that = (BucketSpecCors.Jsii$Proxy) o;

            return this.corsRules != null ? this.corsRules.equals(that.corsRules) : that.corsRules == null;
        }

        @Override
        public final int hashCode() {
            int result = this.corsRules != null ? this.corsRules.hashCode() : 0;
            return result;
        }
    }
}
