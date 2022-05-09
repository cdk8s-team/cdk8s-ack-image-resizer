package imports.aws.k8s.services.s3;

/**
 * A container for specifying the notification configuration of the bucket.
 * <p>
 * If this element is empty, notifications are turned off for the bucket.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.404Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecNotification")
@software.amazon.jsii.Jsii.Proxy(BucketSpecNotification.Jsii$Proxy.class)
public interface BucketSpecNotification extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.k8s.services.s3.BucketSpecNotificationLambdaFunctionConfigurations> getLambdaFunctionConfigurations() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.k8s.services.s3.BucketSpecNotificationQueueConfigurations> getQueueConfigurations() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.k8s.services.s3.BucketSpecNotificationTopicConfigurations> getTopicConfigurations() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecNotification}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecNotification}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecNotification> {
        java.util.List<imports.aws.k8s.services.s3.BucketSpecNotificationLambdaFunctionConfigurations> lambdaFunctionConfigurations;
        java.util.List<imports.aws.k8s.services.s3.BucketSpecNotificationQueueConfigurations> queueConfigurations;
        java.util.List<imports.aws.k8s.services.s3.BucketSpecNotificationTopicConfigurations> topicConfigurations;

        /**
         * Sets the value of {@link BucketSpecNotification#getLambdaFunctionConfigurations}
         * @param lambdaFunctionConfigurations the value to be set.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder lambdaFunctionConfigurations(java.util.List<? extends imports.aws.k8s.services.s3.BucketSpecNotificationLambdaFunctionConfigurations> lambdaFunctionConfigurations) {
            this.lambdaFunctionConfigurations = (java.util.List<imports.aws.k8s.services.s3.BucketSpecNotificationLambdaFunctionConfigurations>)lambdaFunctionConfigurations;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecNotification#getQueueConfigurations}
         * @param queueConfigurations the value to be set.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder queueConfigurations(java.util.List<? extends imports.aws.k8s.services.s3.BucketSpecNotificationQueueConfigurations> queueConfigurations) {
            this.queueConfigurations = (java.util.List<imports.aws.k8s.services.s3.BucketSpecNotificationQueueConfigurations>)queueConfigurations;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecNotification#getTopicConfigurations}
         * @param topicConfigurations the value to be set.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder topicConfigurations(java.util.List<? extends imports.aws.k8s.services.s3.BucketSpecNotificationTopicConfigurations> topicConfigurations) {
            this.topicConfigurations = (java.util.List<imports.aws.k8s.services.s3.BucketSpecNotificationTopicConfigurations>)topicConfigurations;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecNotification}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecNotification build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecNotification}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecNotification {
        private final java.util.List<imports.aws.k8s.services.s3.BucketSpecNotificationLambdaFunctionConfigurations> lambdaFunctionConfigurations;
        private final java.util.List<imports.aws.k8s.services.s3.BucketSpecNotificationQueueConfigurations> queueConfigurations;
        private final java.util.List<imports.aws.k8s.services.s3.BucketSpecNotificationTopicConfigurations> topicConfigurations;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.lambdaFunctionConfigurations = software.amazon.jsii.Kernel.get(this, "lambdaFunctionConfigurations", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecNotificationLambdaFunctionConfigurations.class)));
            this.queueConfigurations = software.amazon.jsii.Kernel.get(this, "queueConfigurations", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecNotificationQueueConfigurations.class)));
            this.topicConfigurations = software.amazon.jsii.Kernel.get(this, "topicConfigurations", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecNotificationTopicConfigurations.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.lambdaFunctionConfigurations = (java.util.List<imports.aws.k8s.services.s3.BucketSpecNotificationLambdaFunctionConfigurations>)builder.lambdaFunctionConfigurations;
            this.queueConfigurations = (java.util.List<imports.aws.k8s.services.s3.BucketSpecNotificationQueueConfigurations>)builder.queueConfigurations;
            this.topicConfigurations = (java.util.List<imports.aws.k8s.services.s3.BucketSpecNotificationTopicConfigurations>)builder.topicConfigurations;
        }

        @Override
        public final java.util.List<imports.aws.k8s.services.s3.BucketSpecNotificationLambdaFunctionConfigurations> getLambdaFunctionConfigurations() {
            return this.lambdaFunctionConfigurations;
        }

        @Override
        public final java.util.List<imports.aws.k8s.services.s3.BucketSpecNotificationQueueConfigurations> getQueueConfigurations() {
            return this.queueConfigurations;
        }

        @Override
        public final java.util.List<imports.aws.k8s.services.s3.BucketSpecNotificationTopicConfigurations> getTopicConfigurations() {
            return this.topicConfigurations;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getLambdaFunctionConfigurations() != null) {
                data.set("lambdaFunctionConfigurations", om.valueToTree(this.getLambdaFunctionConfigurations()));
            }
            if (this.getQueueConfigurations() != null) {
                data.set("queueConfigurations", om.valueToTree(this.getQueueConfigurations()));
            }
            if (this.getTopicConfigurations() != null) {
                data.set("topicConfigurations", om.valueToTree(this.getTopicConfigurations()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecNotification"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecNotification.Jsii$Proxy that = (BucketSpecNotification.Jsii$Proxy) o;

            if (this.lambdaFunctionConfigurations != null ? !this.lambdaFunctionConfigurations.equals(that.lambdaFunctionConfigurations) : that.lambdaFunctionConfigurations != null) return false;
            if (this.queueConfigurations != null ? !this.queueConfigurations.equals(that.queueConfigurations) : that.queueConfigurations != null) return false;
            return this.topicConfigurations != null ? this.topicConfigurations.equals(that.topicConfigurations) : that.topicConfigurations == null;
        }

        @Override
        public final int hashCode() {
            int result = this.lambdaFunctionConfigurations != null ? this.lambdaFunctionConfigurations.hashCode() : 0;
            result = 31 * result + (this.queueConfigurations != null ? this.queueConfigurations.hashCode() : 0);
            result = 31 * result + (this.topicConfigurations != null ? this.topicConfigurations.hashCode() : 0);
            return result;
        }
    }
}
