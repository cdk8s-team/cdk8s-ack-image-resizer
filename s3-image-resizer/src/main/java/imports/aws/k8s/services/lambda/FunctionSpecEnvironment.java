package imports.aws.k8s.services.lambda;

/**
 * Environment variables that are accessible from function code during execution.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:22:11.949Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.lambda.$Module.class, fqn = "awsk8sserviceslambda.FunctionSpecEnvironment")
@software.amazon.jsii.Jsii.Proxy(FunctionSpecEnvironment.Jsii$Proxy.class)
public interface FunctionSpecEnvironment extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getVariables() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link FunctionSpecEnvironment}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link FunctionSpecEnvironment}
     */
    public static final class Builder implements software.amazon.jsii.Builder<FunctionSpecEnvironment> {
        java.util.Map<java.lang.String, java.lang.String> variables;

        /**
         * Sets the value of {@link FunctionSpecEnvironment#getVariables}
         * @param variables the value to be set.
         * @return {@code this}
         */
        public Builder variables(java.util.Map<java.lang.String, java.lang.String> variables) {
            this.variables = variables;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link FunctionSpecEnvironment}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public FunctionSpecEnvironment build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link FunctionSpecEnvironment}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements FunctionSpecEnvironment {
        private final java.util.Map<java.lang.String, java.lang.String> variables;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.variables = software.amazon.jsii.Kernel.get(this, "variables", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.variables = builder.variables;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getVariables() {
            return this.variables;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getVariables() != null) {
                data.set("variables", om.valueToTree(this.getVariables()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sserviceslambda.FunctionSpecEnvironment"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            FunctionSpecEnvironment.Jsii$Proxy that = (FunctionSpecEnvironment.Jsii$Proxy) o;

            return this.variables != null ? this.variables.equals(that.variables) : that.variables == null;
        }

        @Override
        public final int hashCode() {
            int result = this.variables != null ? this.variables.hashCode() : 0;
            return result;
        }
    }
}
