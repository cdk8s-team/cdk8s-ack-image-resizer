package imports.aws.k8s.services.s3;

/**
 * Container for Payer.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.413Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecRequestPayment")
@software.amazon.jsii.Jsii.Proxy(BucketSpecRequestPayment.Jsii$Proxy.class)
public interface BucketSpecRequestPayment extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPayer() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecRequestPayment}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecRequestPayment}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecRequestPayment> {
        java.lang.String payer;

        /**
         * Sets the value of {@link BucketSpecRequestPayment#getPayer}
         * @param payer the value to be set.
         * @return {@code this}
         */
        public Builder payer(java.lang.String payer) {
            this.payer = payer;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecRequestPayment}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecRequestPayment build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecRequestPayment}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecRequestPayment {
        private final java.lang.String payer;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.payer = software.amazon.jsii.Kernel.get(this, "payer", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.payer = builder.payer;
        }

        @Override
        public final java.lang.String getPayer() {
            return this.payer;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getPayer() != null) {
                data.set("payer", om.valueToTree(this.getPayer()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecRequestPayment"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecRequestPayment.Jsii$Proxy that = (BucketSpecRequestPayment.Jsii$Proxy) o;

            return this.payer != null ? this.payer.equals(that.payer) : that.payer == null;
        }

        @Override
        public final int hashCode() {
            int result = this.payer != null ? this.payer.hashCode() : 0;
            return result;
        }
    }
}
