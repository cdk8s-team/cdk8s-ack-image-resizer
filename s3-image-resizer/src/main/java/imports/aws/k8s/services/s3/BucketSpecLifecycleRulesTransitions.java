package imports.aws.k8s.services.s3;

/**
 * Specifies when an object transitions to a specified storage class.
 * <p>
 * For more information about Amazon S3 lifecycle configuration rules, see Transitioning Objects Using Amazon S3 Lifecycle (https://docs.aws.amazon.com/AmazonS3/latest/dev/lifecycle-transition-general-considerations.html) in the Amazon S3 User Guide.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.402Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecLifecycleRulesTransitions")
@software.amazon.jsii.Jsii.Proxy(BucketSpecLifecycleRulesTransitions.Jsii$Proxy.class)
public interface BucketSpecLifecycleRulesTransitions extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    default @org.jetbrains.annotations.Nullable java.time.Instant getDate() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getDays() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getStorageClass() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecLifecycleRulesTransitions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecLifecycleRulesTransitions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecLifecycleRulesTransitions> {
        java.time.Instant date;
        java.lang.Number days;
        java.lang.String storageClass;

        /**
         * Sets the value of {@link BucketSpecLifecycleRulesTransitions#getDate}
         * @param date the value to be set.
         * @return {@code this}
         */
        public Builder date(java.time.Instant date) {
            this.date = date;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecLifecycleRulesTransitions#getDays}
         * @param days the value to be set.
         * @return {@code this}
         */
        public Builder days(java.lang.Number days) {
            this.days = days;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecLifecycleRulesTransitions#getStorageClass}
         * @param storageClass the value to be set.
         * @return {@code this}
         */
        public Builder storageClass(java.lang.String storageClass) {
            this.storageClass = storageClass;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecLifecycleRulesTransitions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecLifecycleRulesTransitions build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecLifecycleRulesTransitions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecLifecycleRulesTransitions {
        private final java.time.Instant date;
        private final java.lang.Number days;
        private final java.lang.String storageClass;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.date = software.amazon.jsii.Kernel.get(this, "date", software.amazon.jsii.NativeType.forClass(java.time.Instant.class));
            this.days = software.amazon.jsii.Kernel.get(this, "days", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.storageClass = software.amazon.jsii.Kernel.get(this, "storageClass", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.date = builder.date;
            this.days = builder.days;
            this.storageClass = builder.storageClass;
        }

        @Override
        public final java.time.Instant getDate() {
            return this.date;
        }

        @Override
        public final java.lang.Number getDays() {
            return this.days;
        }

        @Override
        public final java.lang.String getStorageClass() {
            return this.storageClass;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getDate() != null) {
                data.set("date", om.valueToTree(this.getDate()));
            }
            if (this.getDays() != null) {
                data.set("days", om.valueToTree(this.getDays()));
            }
            if (this.getStorageClass() != null) {
                data.set("storageClass", om.valueToTree(this.getStorageClass()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecLifecycleRulesTransitions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecLifecycleRulesTransitions.Jsii$Proxy that = (BucketSpecLifecycleRulesTransitions.Jsii$Proxy) o;

            if (this.date != null ? !this.date.equals(that.date) : that.date != null) return false;
            if (this.days != null ? !this.days.equals(that.days) : that.days != null) return false;
            return this.storageClass != null ? this.storageClass.equals(that.storageClass) : that.storageClass == null;
        }

        @Override
        public final int hashCode() {
            int result = this.date != null ? this.date.hashCode() : 0;
            result = 31 * result + (this.days != null ? this.days.hashCode() : 0);
            result = 31 * result + (this.storageClass != null ? this.storageClass.hashCode() : 0);
            return result;
        }
    }
}
