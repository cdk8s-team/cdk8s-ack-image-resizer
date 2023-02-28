package imports.aws.k8s.services.s3;

/**
 * Specifies the Amazon S3 object key name to filter on and whether to filter on the suffix or prefix of the key name.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.406Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecNotificationQueueConfigurationsFilterKeyFilterRules")
@software.amazon.jsii.Jsii.Proxy(BucketSpecNotificationQueueConfigurationsFilterKeyFilterRules.Jsii$Proxy.class)
public interface BucketSpecNotificationQueueConfigurationsFilterKeyFilterRules extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getValue() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecNotificationQueueConfigurationsFilterKeyFilterRules}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecNotificationQueueConfigurationsFilterKeyFilterRules}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecNotificationQueueConfigurationsFilterKeyFilterRules> {
        java.lang.String name;
        java.lang.String value;

        /**
         * Sets the value of {@link BucketSpecNotificationQueueConfigurationsFilterKeyFilterRules#getName}
         * @param name the value to be set.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecNotificationQueueConfigurationsFilterKeyFilterRules#getValue}
         * @param value the value to be set.
         * @return {@code this}
         */
        public Builder value(java.lang.String value) {
            this.value = value;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecNotificationQueueConfigurationsFilterKeyFilterRules}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecNotificationQueueConfigurationsFilterKeyFilterRules build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecNotificationQueueConfigurationsFilterKeyFilterRules}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecNotificationQueueConfigurationsFilterKeyFilterRules {
        private final java.lang.String name;
        private final java.lang.String value;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.value = software.amazon.jsii.Kernel.get(this, "value", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = builder.name;
            this.value = builder.value;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getValue() {
            return this.value;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getValue() != null) {
                data.set("value", om.valueToTree(this.getValue()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecNotificationQueueConfigurationsFilterKeyFilterRules"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecNotificationQueueConfigurationsFilterKeyFilterRules.Jsii$Proxy that = (BucketSpecNotificationQueueConfigurationsFilterKeyFilterRules.Jsii$Proxy) o;

            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            return this.value != null ? this.value.equals(that.value) : that.value == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name != null ? this.name.hashCode() : 0;
            result = 31 * result + (this.value != null ? this.value.hashCode() : 0);
            return result;
        }
    }
}
