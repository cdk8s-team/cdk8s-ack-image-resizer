package imports.aws.k8s.services.s3;

/**
 * Container for the expiration for the lifecycle of the object.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.401Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecLifecycleRulesExpiration")
@software.amazon.jsii.Jsii.Proxy(BucketSpecLifecycleRulesExpiration.Jsii$Proxy.class)
public interface BucketSpecLifecycleRulesExpiration extends software.amazon.jsii.JsiiSerializable {

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
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getExpiredObjectDeleteMarker() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecLifecycleRulesExpiration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecLifecycleRulesExpiration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecLifecycleRulesExpiration> {
        java.time.Instant date;
        java.lang.Number days;
        java.lang.Boolean expiredObjectDeleteMarker;

        /**
         * Sets the value of {@link BucketSpecLifecycleRulesExpiration#getDate}
         * @param date the value to be set.
         * @return {@code this}
         */
        public Builder date(java.time.Instant date) {
            this.date = date;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecLifecycleRulesExpiration#getDays}
         * @param days the value to be set.
         * @return {@code this}
         */
        public Builder days(java.lang.Number days) {
            this.days = days;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecLifecycleRulesExpiration#getExpiredObjectDeleteMarker}
         * @param expiredObjectDeleteMarker the value to be set.
         * @return {@code this}
         */
        public Builder expiredObjectDeleteMarker(java.lang.Boolean expiredObjectDeleteMarker) {
            this.expiredObjectDeleteMarker = expiredObjectDeleteMarker;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecLifecycleRulesExpiration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecLifecycleRulesExpiration build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecLifecycleRulesExpiration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecLifecycleRulesExpiration {
        private final java.time.Instant date;
        private final java.lang.Number days;
        private final java.lang.Boolean expiredObjectDeleteMarker;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.date = software.amazon.jsii.Kernel.get(this, "date", software.amazon.jsii.NativeType.forClass(java.time.Instant.class));
            this.days = software.amazon.jsii.Kernel.get(this, "days", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.expiredObjectDeleteMarker = software.amazon.jsii.Kernel.get(this, "expiredObjectDeleteMarker", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.date = builder.date;
            this.days = builder.days;
            this.expiredObjectDeleteMarker = builder.expiredObjectDeleteMarker;
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
        public final java.lang.Boolean getExpiredObjectDeleteMarker() {
            return this.expiredObjectDeleteMarker;
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
            if (this.getExpiredObjectDeleteMarker() != null) {
                data.set("expiredObjectDeleteMarker", om.valueToTree(this.getExpiredObjectDeleteMarker()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecLifecycleRulesExpiration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecLifecycleRulesExpiration.Jsii$Proxy that = (BucketSpecLifecycleRulesExpiration.Jsii$Proxy) o;

            if (this.date != null ? !this.date.equals(that.date) : that.date != null) return false;
            if (this.days != null ? !this.days.equals(that.days) : that.days != null) return false;
            return this.expiredObjectDeleteMarker != null ? this.expiredObjectDeleteMarker.equals(that.expiredObjectDeleteMarker) : that.expiredObjectDeleteMarker == null;
        }

        @Override
        public final int hashCode() {
            int result = this.date != null ? this.date.hashCode() : 0;
            result = 31 * result + (this.days != null ? this.days.hashCode() : 0);
            result = 31 * result + (this.expiredObjectDeleteMarker != null ? this.expiredObjectDeleteMarker.hashCode() : 0);
            return result;
        }
    }
}
