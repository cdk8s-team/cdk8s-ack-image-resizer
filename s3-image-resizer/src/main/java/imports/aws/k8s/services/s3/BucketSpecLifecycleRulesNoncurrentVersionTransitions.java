package imports.aws.k8s.services.s3;

/**
 * Container for the transition rule that describes when noncurrent objects transition to the STANDARD_IA, ONEZONE_IA, INTELLIGENT_TIERING, GLACIER, or DEEP_ARCHIVE storage class.
 * <p>
 * If your bucket is versioning-enabled (or versioning is suspended), you can set this action to request that Amazon S3 transition noncurrent object versions to the STANDARD_IA, ONEZONE_IA, INTELLIGENT_TIERING, GLACIER, or DEEP_ARCHIVE storage class at a specific period in the object's lifetime.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.402Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecLifecycleRulesNoncurrentVersionTransitions")
@software.amazon.jsii.Jsii.Proxy(BucketSpecLifecycleRulesNoncurrentVersionTransitions.Jsii$Proxy.class)
public interface BucketSpecLifecycleRulesNoncurrentVersionTransitions extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getNoncurrentDays() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getStorageClass() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecLifecycleRulesNoncurrentVersionTransitions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecLifecycleRulesNoncurrentVersionTransitions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecLifecycleRulesNoncurrentVersionTransitions> {
        java.lang.Number noncurrentDays;
        java.lang.String storageClass;

        /**
         * Sets the value of {@link BucketSpecLifecycleRulesNoncurrentVersionTransitions#getNoncurrentDays}
         * @param noncurrentDays the value to be set.
         * @return {@code this}
         */
        public Builder noncurrentDays(java.lang.Number noncurrentDays) {
            this.noncurrentDays = noncurrentDays;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecLifecycleRulesNoncurrentVersionTransitions#getStorageClass}
         * @param storageClass the value to be set.
         * @return {@code this}
         */
        public Builder storageClass(java.lang.String storageClass) {
            this.storageClass = storageClass;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecLifecycleRulesNoncurrentVersionTransitions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecLifecycleRulesNoncurrentVersionTransitions build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecLifecycleRulesNoncurrentVersionTransitions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecLifecycleRulesNoncurrentVersionTransitions {
        private final java.lang.Number noncurrentDays;
        private final java.lang.String storageClass;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.noncurrentDays = software.amazon.jsii.Kernel.get(this, "noncurrentDays", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.storageClass = software.amazon.jsii.Kernel.get(this, "storageClass", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.noncurrentDays = builder.noncurrentDays;
            this.storageClass = builder.storageClass;
        }

        @Override
        public final java.lang.Number getNoncurrentDays() {
            return this.noncurrentDays;
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

            if (this.getNoncurrentDays() != null) {
                data.set("noncurrentDays", om.valueToTree(this.getNoncurrentDays()));
            }
            if (this.getStorageClass() != null) {
                data.set("storageClass", om.valueToTree(this.getStorageClass()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecLifecycleRulesNoncurrentVersionTransitions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecLifecycleRulesNoncurrentVersionTransitions.Jsii$Proxy that = (BucketSpecLifecycleRulesNoncurrentVersionTransitions.Jsii$Proxy) o;

            if (this.noncurrentDays != null ? !this.noncurrentDays.equals(that.noncurrentDays) : that.noncurrentDays != null) return false;
            return this.storageClass != null ? this.storageClass.equals(that.storageClass) : that.storageClass == null;
        }

        @Override
        public final int hashCode() {
            int result = this.noncurrentDays != null ? this.noncurrentDays.hashCode() : 0;
            result = 31 * result + (this.storageClass != null ? this.storageClass.hashCode() : 0);
            return result;
        }
    }
}
