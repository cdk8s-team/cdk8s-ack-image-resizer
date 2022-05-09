package imports.aws.k8s.services.s3;

/**
 * A container for object key name prefix and suffix filtering rules.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.407Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecNotificationTopicConfigurationsFilterKey")
@software.amazon.jsii.Jsii.Proxy(BucketSpecNotificationTopicConfigurationsFilterKey.Jsii$Proxy.class)
public interface BucketSpecNotificationTopicConfigurationsFilterKey extends software.amazon.jsii.JsiiSerializable {

    /**
     * A list of containers for the key-value pair that defines the criteria for the filter rule.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.k8s.services.s3.BucketSpecNotificationTopicConfigurationsFilterKeyFilterRules> getFilterRules() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecNotificationTopicConfigurationsFilterKey}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecNotificationTopicConfigurationsFilterKey}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecNotificationTopicConfigurationsFilterKey> {
        java.util.List<imports.aws.k8s.services.s3.BucketSpecNotificationTopicConfigurationsFilterKeyFilterRules> filterRules;

        /**
         * Sets the value of {@link BucketSpecNotificationTopicConfigurationsFilterKey#getFilterRules}
         * @param filterRules A list of containers for the key-value pair that defines the criteria for the filter rule.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder filterRules(java.util.List<? extends imports.aws.k8s.services.s3.BucketSpecNotificationTopicConfigurationsFilterKeyFilterRules> filterRules) {
            this.filterRules = (java.util.List<imports.aws.k8s.services.s3.BucketSpecNotificationTopicConfigurationsFilterKeyFilterRules>)filterRules;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecNotificationTopicConfigurationsFilterKey}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecNotificationTopicConfigurationsFilterKey build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecNotificationTopicConfigurationsFilterKey}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecNotificationTopicConfigurationsFilterKey {
        private final java.util.List<imports.aws.k8s.services.s3.BucketSpecNotificationTopicConfigurationsFilterKeyFilterRules> filterRules;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.filterRules = software.amazon.jsii.Kernel.get(this, "filterRules", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecNotificationTopicConfigurationsFilterKeyFilterRules.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.filterRules = (java.util.List<imports.aws.k8s.services.s3.BucketSpecNotificationTopicConfigurationsFilterKeyFilterRules>)builder.filterRules;
        }

        @Override
        public final java.util.List<imports.aws.k8s.services.s3.BucketSpecNotificationTopicConfigurationsFilterKeyFilterRules> getFilterRules() {
            return this.filterRules;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getFilterRules() != null) {
                data.set("filterRules", om.valueToTree(this.getFilterRules()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecNotificationTopicConfigurationsFilterKey"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecNotificationTopicConfigurationsFilterKey.Jsii$Proxy that = (BucketSpecNotificationTopicConfigurationsFilterKey.Jsii$Proxy) o;

            return this.filterRules != null ? this.filterRules.equals(that.filterRules) : that.filterRules == null;
        }

        @Override
        public final int hashCode() {
            int result = this.filterRules != null ? this.filterRules.hashCode() : 0;
            return result;
        }
    }
}
