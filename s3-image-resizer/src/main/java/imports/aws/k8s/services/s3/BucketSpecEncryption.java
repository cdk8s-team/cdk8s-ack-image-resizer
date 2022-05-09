package imports.aws.k8s.services.s3;

/**
 * Specifies the default server-side-encryption configuration.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.396Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecEncryption")
@software.amazon.jsii.Jsii.Proxy(BucketSpecEncryption.Jsii$Proxy.class)
public interface BucketSpecEncryption extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.k8s.services.s3.BucketSpecEncryptionRules> getRules() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecEncryption}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecEncryption}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecEncryption> {
        java.util.List<imports.aws.k8s.services.s3.BucketSpecEncryptionRules> rules;

        /**
         * Sets the value of {@link BucketSpecEncryption#getRules}
         * @param rules the value to be set.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder rules(java.util.List<? extends imports.aws.k8s.services.s3.BucketSpecEncryptionRules> rules) {
            this.rules = (java.util.List<imports.aws.k8s.services.s3.BucketSpecEncryptionRules>)rules;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecEncryption}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecEncryption build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecEncryption}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecEncryption {
        private final java.util.List<imports.aws.k8s.services.s3.BucketSpecEncryptionRules> rules;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.rules = software.amazon.jsii.Kernel.get(this, "rules", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecEncryptionRules.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.rules = (java.util.List<imports.aws.k8s.services.s3.BucketSpecEncryptionRules>)builder.rules;
        }

        @Override
        public final java.util.List<imports.aws.k8s.services.s3.BucketSpecEncryptionRules> getRules() {
            return this.rules;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getRules() != null) {
                data.set("rules", om.valueToTree(this.getRules()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecEncryption"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecEncryption.Jsii$Proxy that = (BucketSpecEncryption.Jsii$Proxy) o;

            return this.rules != null ? this.rules.equals(that.rules) : that.rules == null;
        }

        @Override
        public final int hashCode() {
            int result = this.rules != null ? this.rules.hashCode() : 0;
            return result;
        }
    }
}
