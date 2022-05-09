package imports.aws.k8s.services.s3;

/**
 * Specifies the configuration for publishing messages to an Amazon Simple Queue Service (Amazon SQS) queue when Amazon S3 detects specified events.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.405Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecNotificationQueueConfigurations")
@software.amazon.jsii.Jsii.Proxy(BucketSpecNotificationQueueConfigurations.Jsii$Proxy.class)
public interface BucketSpecNotificationQueueConfigurations extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getEvents() {
        return null;
    }

    /**
     * Specifies object key name filtering rules.
     * <p>
     * For information about key name filtering, see Configuring Event Notifications (https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html) in the Amazon S3 User Guide.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecNotificationQueueConfigurationsFilter getFilter() {
        return null;
    }

    /**
     * An optional unique identifier for configurations in a notification configuration.
     * <p>
     * If you don't provide one, Amazon S3 will assign an ID.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getQueueArn() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecNotificationQueueConfigurations}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecNotificationQueueConfigurations}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecNotificationQueueConfigurations> {
        java.util.List<java.lang.String> events;
        imports.aws.k8s.services.s3.BucketSpecNotificationQueueConfigurationsFilter filter;
        java.lang.String id;
        java.lang.String queueArn;

        /**
         * Sets the value of {@link BucketSpecNotificationQueueConfigurations#getEvents}
         * @param events the value to be set.
         * @return {@code this}
         */
        public Builder events(java.util.List<java.lang.String> events) {
            this.events = events;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecNotificationQueueConfigurations#getFilter}
         * @param filter Specifies object key name filtering rules.
         *               For information about key name filtering, see Configuring Event Notifications (https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html) in the Amazon S3 User Guide.
         * @return {@code this}
         */
        public Builder filter(imports.aws.k8s.services.s3.BucketSpecNotificationQueueConfigurationsFilter filter) {
            this.filter = filter;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecNotificationQueueConfigurations#getId}
         * @param id An optional unique identifier for configurations in a notification configuration.
         *           If you don't provide one, Amazon S3 will assign an ID.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecNotificationQueueConfigurations#getQueueArn}
         * @param queueArn the value to be set.
         * @return {@code this}
         */
        public Builder queueArn(java.lang.String queueArn) {
            this.queueArn = queueArn;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecNotificationQueueConfigurations}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecNotificationQueueConfigurations build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecNotificationQueueConfigurations}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecNotificationQueueConfigurations {
        private final java.util.List<java.lang.String> events;
        private final imports.aws.k8s.services.s3.BucketSpecNotificationQueueConfigurationsFilter filter;
        private final java.lang.String id;
        private final java.lang.String queueArn;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.events = software.amazon.jsii.Kernel.get(this, "events", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.filter = software.amazon.jsii.Kernel.get(this, "filter", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecNotificationQueueConfigurationsFilter.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.queueArn = software.amazon.jsii.Kernel.get(this, "queueArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.events = builder.events;
            this.filter = builder.filter;
            this.id = builder.id;
            this.queueArn = builder.queueArn;
        }

        @Override
        public final java.util.List<java.lang.String> getEvents() {
            return this.events;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecNotificationQueueConfigurationsFilter getFilter() {
            return this.filter;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final java.lang.String getQueueArn() {
            return this.queueArn;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getEvents() != null) {
                data.set("events", om.valueToTree(this.getEvents()));
            }
            if (this.getFilter() != null) {
                data.set("filter", om.valueToTree(this.getFilter()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getQueueArn() != null) {
                data.set("queueArn", om.valueToTree(this.getQueueArn()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecNotificationQueueConfigurations"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecNotificationQueueConfigurations.Jsii$Proxy that = (BucketSpecNotificationQueueConfigurations.Jsii$Proxy) o;

            if (this.events != null ? !this.events.equals(that.events) : that.events != null) return false;
            if (this.filter != null ? !this.filter.equals(that.filter) : that.filter != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            return this.queueArn != null ? this.queueArn.equals(that.queueArn) : that.queueArn == null;
        }

        @Override
        public final int hashCode() {
            int result = this.events != null ? this.events.hashCode() : 0;
            result = 31 * result + (this.filter != null ? this.filter.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.queueArn != null ? this.queueArn.hashCode() : 0);
            return result;
        }
    }
}
