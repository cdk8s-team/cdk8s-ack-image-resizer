package imports.aws.k8s.services.lambda;

/**
 * A dead letter queue configuration that specifies the queue or topic where Lambda sends asynchronous events when they fail processing.
 * <p>
 * For more information, see Dead Letter Queues (https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#dlq).
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:22:11.949Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.lambda.$Module.class, fqn = "awsk8sserviceslambda.FunctionSpecDeadLetterConfig")
@software.amazon.jsii.Jsii.Proxy(FunctionSpecDeadLetterConfig.Jsii$Proxy.class)
public interface FunctionSpecDeadLetterConfig extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getTargetArn() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link FunctionSpecDeadLetterConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link FunctionSpecDeadLetterConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<FunctionSpecDeadLetterConfig> {
        java.lang.String targetArn;

        /**
         * Sets the value of {@link FunctionSpecDeadLetterConfig#getTargetArn}
         * @param targetArn the value to be set.
         * @return {@code this}
         */
        public Builder targetArn(java.lang.String targetArn) {
            this.targetArn = targetArn;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link FunctionSpecDeadLetterConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public FunctionSpecDeadLetterConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link FunctionSpecDeadLetterConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements FunctionSpecDeadLetterConfig {
        private final java.lang.String targetArn;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.targetArn = software.amazon.jsii.Kernel.get(this, "targetArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.targetArn = builder.targetArn;
        }

        @Override
        public final java.lang.String getTargetArn() {
            return this.targetArn;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getTargetArn() != null) {
                data.set("targetArn", om.valueToTree(this.getTargetArn()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sserviceslambda.FunctionSpecDeadLetterConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            FunctionSpecDeadLetterConfig.Jsii$Proxy that = (FunctionSpecDeadLetterConfig.Jsii$Proxy) o;

            return this.targetArn != null ? this.targetArn.equals(that.targetArn) : that.targetArn == null;
        }

        @Override
        public final int hashCode() {
            int result = this.targetArn != null ? this.targetArn.hashCode() : 0;
            return result;
        }
    }
}
