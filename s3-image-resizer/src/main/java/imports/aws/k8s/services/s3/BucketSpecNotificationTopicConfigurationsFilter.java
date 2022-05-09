package imports.aws.k8s.services.s3;

/**
 * Specifies object key name filtering rules.
 * <p>
 * For information about key name filtering, see Configuring Event Notifications (https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html) in the Amazon S3 User Guide.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.407Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecNotificationTopicConfigurationsFilter")
@software.amazon.jsii.Jsii.Proxy(BucketSpecNotificationTopicConfigurationsFilter.Jsii$Proxy.class)
public interface BucketSpecNotificationTopicConfigurationsFilter extends software.amazon.jsii.JsiiSerializable {

    /**
     * A container for object key name prefix and suffix filtering rules.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecNotificationTopicConfigurationsFilterKey getKey() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecNotificationTopicConfigurationsFilter}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecNotificationTopicConfigurationsFilter}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecNotificationTopicConfigurationsFilter> {
        imports.aws.k8s.services.s3.BucketSpecNotificationTopicConfigurationsFilterKey key;

        /**
         * Sets the value of {@link BucketSpecNotificationTopicConfigurationsFilter#getKey}
         * @param key A container for object key name prefix and suffix filtering rules.
         * @return {@code this}
         */
        public Builder key(imports.aws.k8s.services.s3.BucketSpecNotificationTopicConfigurationsFilterKey key) {
            this.key = key;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecNotificationTopicConfigurationsFilter}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecNotificationTopicConfigurationsFilter build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecNotificationTopicConfigurationsFilter}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecNotificationTopicConfigurationsFilter {
        private final imports.aws.k8s.services.s3.BucketSpecNotificationTopicConfigurationsFilterKey key;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.key = software.amazon.jsii.Kernel.get(this, "key", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecNotificationTopicConfigurationsFilterKey.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.key = builder.key;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecNotificationTopicConfigurationsFilterKey getKey() {
            return this.key;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getKey() != null) {
                data.set("key", om.valueToTree(this.getKey()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecNotificationTopicConfigurationsFilter"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecNotificationTopicConfigurationsFilter.Jsii$Proxy that = (BucketSpecNotificationTopicConfigurationsFilter.Jsii$Proxy) o;

            return this.key != null ? this.key.equals(that.key) : that.key == null;
        }

        @Override
        public final int hashCode() {
            int result = this.key != null ? this.key.hashCode() : 0;
            return result;
        }
    }
}
