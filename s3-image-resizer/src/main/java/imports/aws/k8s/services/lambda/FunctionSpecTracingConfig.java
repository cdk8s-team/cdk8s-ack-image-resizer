package imports.aws.k8s.services.lambda;

/**
 * Set Mode to Active to sample and trace a subset of incoming requests with X-Ray (https://docs.aws.amazon.com/lambda/latest/dg/services-xray.html).
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:22:11.950Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.lambda.$Module.class, fqn = "awsk8sserviceslambda.FunctionSpecTracingConfig")
@software.amazon.jsii.Jsii.Proxy(FunctionSpecTracingConfig.Jsii$Proxy.class)
public interface FunctionSpecTracingConfig extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getMode() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link FunctionSpecTracingConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link FunctionSpecTracingConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<FunctionSpecTracingConfig> {
        java.lang.String mode;

        /**
         * Sets the value of {@link FunctionSpecTracingConfig#getMode}
         * @param mode the value to be set.
         * @return {@code this}
         */
        public Builder mode(java.lang.String mode) {
            this.mode = mode;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link FunctionSpecTracingConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public FunctionSpecTracingConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link FunctionSpecTracingConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements FunctionSpecTracingConfig {
        private final java.lang.String mode;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.mode = software.amazon.jsii.Kernel.get(this, "mode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.mode = builder.mode;
        }

        @Override
        public final java.lang.String getMode() {
            return this.mode;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMode() != null) {
                data.set("mode", om.valueToTree(this.getMode()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sserviceslambda.FunctionSpecTracingConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            FunctionSpecTracingConfig.Jsii$Proxy that = (FunctionSpecTracingConfig.Jsii$Proxy) o;

            return this.mode != null ? this.mode.equals(that.mode) : that.mode == null;
        }

        @Override
        public final int hashCode() {
            int result = this.mode != null ? this.mode.hashCode() : 0;
            return result;
        }
    }
}
