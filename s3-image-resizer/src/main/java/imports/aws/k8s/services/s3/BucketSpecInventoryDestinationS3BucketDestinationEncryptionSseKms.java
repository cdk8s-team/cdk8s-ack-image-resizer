package imports.aws.k8s.services.s3;

/**
 * Specifies the use of SSE-KMS to encrypt delivered inventory reports.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.399Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecInventoryDestinationS3BucketDestinationEncryptionSseKms")
@software.amazon.jsii.Jsii.Proxy(BucketSpecInventoryDestinationS3BucketDestinationEncryptionSseKms.Jsii$Proxy.class)
public interface BucketSpecInventoryDestinationS3BucketDestinationEncryptionSseKms extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getKeyId() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecInventoryDestinationS3BucketDestinationEncryptionSseKms}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecInventoryDestinationS3BucketDestinationEncryptionSseKms}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecInventoryDestinationS3BucketDestinationEncryptionSseKms> {
        java.lang.String keyId;

        /**
         * Sets the value of {@link BucketSpecInventoryDestinationS3BucketDestinationEncryptionSseKms#getKeyId}
         * @param keyId the value to be set.
         * @return {@code this}
         */
        public Builder keyId(java.lang.String keyId) {
            this.keyId = keyId;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecInventoryDestinationS3BucketDestinationEncryptionSseKms}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecInventoryDestinationS3BucketDestinationEncryptionSseKms build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecInventoryDestinationS3BucketDestinationEncryptionSseKms}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecInventoryDestinationS3BucketDestinationEncryptionSseKms {
        private final java.lang.String keyId;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.keyId = software.amazon.jsii.Kernel.get(this, "keyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.keyId = builder.keyId;
        }

        @Override
        public final java.lang.String getKeyId() {
            return this.keyId;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getKeyId() != null) {
                data.set("keyId", om.valueToTree(this.getKeyId()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecInventoryDestinationS3BucketDestinationEncryptionSseKms"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecInventoryDestinationS3BucketDestinationEncryptionSseKms.Jsii$Proxy that = (BucketSpecInventoryDestinationS3BucketDestinationEncryptionSseKms.Jsii$Proxy) o;

            return this.keyId != null ? this.keyId.equals(that.keyId) : that.keyId == null;
        }

        @Override
        public final int hashCode() {
            int result = this.keyId != null ? this.keyId.hashCode() : 0;
            return result;
        }
    }
}
