package imports.aws.k8s.services.s3;

/**
 * The configuration information for the bucket.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.396Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecCreateBucketConfiguration")
@software.amazon.jsii.Jsii.Proxy(BucketSpecCreateBucketConfiguration.Jsii$Proxy.class)
public interface BucketSpecCreateBucketConfiguration extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getLocationConstraint() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecCreateBucketConfiguration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecCreateBucketConfiguration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecCreateBucketConfiguration> {
        java.lang.String locationConstraint;

        /**
         * Sets the value of {@link BucketSpecCreateBucketConfiguration#getLocationConstraint}
         * @param locationConstraint the value to be set.
         * @return {@code this}
         */
        public Builder locationConstraint(java.lang.String locationConstraint) {
            this.locationConstraint = locationConstraint;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecCreateBucketConfiguration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecCreateBucketConfiguration build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecCreateBucketConfiguration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecCreateBucketConfiguration {
        private final java.lang.String locationConstraint;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.locationConstraint = software.amazon.jsii.Kernel.get(this, "locationConstraint", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.locationConstraint = builder.locationConstraint;
        }

        @Override
        public final java.lang.String getLocationConstraint() {
            return this.locationConstraint;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getLocationConstraint() != null) {
                data.set("locationConstraint", om.valueToTree(this.getLocationConstraint()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecCreateBucketConfiguration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecCreateBucketConfiguration.Jsii$Proxy that = (BucketSpecCreateBucketConfiguration.Jsii$Proxy) o;

            return this.locationConstraint != null ? this.locationConstraint.equals(that.locationConstraint) : that.locationConstraint == null;
        }

        @Override
        public final int hashCode() {
            int result = this.locationConstraint != null ? this.locationConstraint.hashCode() : 0;
            return result;
        }
    }
}
