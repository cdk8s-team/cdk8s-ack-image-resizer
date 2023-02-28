package imports.aws.k8s.services.s3;

/**
 * Specifies when noncurrent object versions expire.
 * <p>
 * Upon expiration, Amazon S3 permanently deletes the noncurrent object versions. You set this lifecycle configuration action on a bucket that has versioning enabled (or suspended) to request that Amazon S3 delete noncurrent object versions at a specific period in the object's lifetime.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.401Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecLifecycleRulesNoncurrentVersionExpiration")
@software.amazon.jsii.Jsii.Proxy(BucketSpecLifecycleRulesNoncurrentVersionExpiration.Jsii$Proxy.class)
public interface BucketSpecLifecycleRulesNoncurrentVersionExpiration extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getNoncurrentDays() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecLifecycleRulesNoncurrentVersionExpiration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecLifecycleRulesNoncurrentVersionExpiration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecLifecycleRulesNoncurrentVersionExpiration> {
        java.lang.Number noncurrentDays;

        /**
         * Sets the value of {@link BucketSpecLifecycleRulesNoncurrentVersionExpiration#getNoncurrentDays}
         * @param noncurrentDays the value to be set.
         * @return {@code this}
         */
        public Builder noncurrentDays(java.lang.Number noncurrentDays) {
            this.noncurrentDays = noncurrentDays;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecLifecycleRulesNoncurrentVersionExpiration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecLifecycleRulesNoncurrentVersionExpiration build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecLifecycleRulesNoncurrentVersionExpiration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecLifecycleRulesNoncurrentVersionExpiration {
        private final java.lang.Number noncurrentDays;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.noncurrentDays = software.amazon.jsii.Kernel.get(this, "noncurrentDays", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.noncurrentDays = builder.noncurrentDays;
        }

        @Override
        public final java.lang.Number getNoncurrentDays() {
            return this.noncurrentDays;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getNoncurrentDays() != null) {
                data.set("noncurrentDays", om.valueToTree(this.getNoncurrentDays()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecLifecycleRulesNoncurrentVersionExpiration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecLifecycleRulesNoncurrentVersionExpiration.Jsii$Proxy that = (BucketSpecLifecycleRulesNoncurrentVersionExpiration.Jsii$Proxy) o;

            return this.noncurrentDays != null ? this.noncurrentDays.equals(that.noncurrentDays) : that.noncurrentDays == null;
        }

        @Override
        public final int hashCode() {
            int result = this.noncurrentDays != null ? this.noncurrentDays.hashCode() : 0;
            return result;
        }
    }
}
