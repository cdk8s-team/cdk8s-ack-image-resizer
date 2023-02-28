package imports.aws.k8s.services.s3;

/**
 * Specifies the schedule for generating inventory results.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.399Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecInventorySchedule")
@software.amazon.jsii.Jsii.Proxy(BucketSpecInventorySchedule.Jsii$Proxy.class)
public interface BucketSpecInventorySchedule extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFrequency() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecInventorySchedule}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecInventorySchedule}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecInventorySchedule> {
        java.lang.String frequency;

        /**
         * Sets the value of {@link BucketSpecInventorySchedule#getFrequency}
         * @param frequency the value to be set.
         * @return {@code this}
         */
        public Builder frequency(java.lang.String frequency) {
            this.frequency = frequency;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecInventorySchedule}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecInventorySchedule build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecInventorySchedule}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecInventorySchedule {
        private final java.lang.String frequency;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.frequency = software.amazon.jsii.Kernel.get(this, "frequency", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.frequency = builder.frequency;
        }

        @Override
        public final java.lang.String getFrequency() {
            return this.frequency;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getFrequency() != null) {
                data.set("frequency", om.valueToTree(this.getFrequency()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecInventorySchedule"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecInventorySchedule.Jsii$Proxy that = (BucketSpecInventorySchedule.Jsii$Proxy) o;

            return this.frequency != null ? this.frequency.equals(that.frequency) : that.frequency == null;
        }

        @Override
        public final int hashCode() {
            int result = this.frequency != null ? this.frequency.hashCode() : 0;
            return result;
        }
    }
}
