package imports.aws.k8s.services.s3;

/**
 * Contains the type of server-side encryption used to encrypt the inventory results.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.399Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecInventoryDestinationS3BucketDestinationEncryption")
@software.amazon.jsii.Jsii.Proxy(BucketSpecInventoryDestinationS3BucketDestinationEncryption.Jsii$Proxy.class)
public interface BucketSpecInventoryDestinationS3BucketDestinationEncryption extends software.amazon.jsii.JsiiSerializable {

    /**
     * Specifies the use of SSE-KMS to encrypt delivered inventory reports.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecInventoryDestinationS3BucketDestinationEncryptionSseKms getSseKms() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecInventoryDestinationS3BucketDestinationEncryption}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecInventoryDestinationS3BucketDestinationEncryption}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecInventoryDestinationS3BucketDestinationEncryption> {
        imports.aws.k8s.services.s3.BucketSpecInventoryDestinationS3BucketDestinationEncryptionSseKms sseKms;

        /**
         * Sets the value of {@link BucketSpecInventoryDestinationS3BucketDestinationEncryption#getSseKms}
         * @param sseKms Specifies the use of SSE-KMS to encrypt delivered inventory reports.
         * @return {@code this}
         */
        public Builder sseKms(imports.aws.k8s.services.s3.BucketSpecInventoryDestinationS3BucketDestinationEncryptionSseKms sseKms) {
            this.sseKms = sseKms;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecInventoryDestinationS3BucketDestinationEncryption}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecInventoryDestinationS3BucketDestinationEncryption build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecInventoryDestinationS3BucketDestinationEncryption}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecInventoryDestinationS3BucketDestinationEncryption {
        private final imports.aws.k8s.services.s3.BucketSpecInventoryDestinationS3BucketDestinationEncryptionSseKms sseKms;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.sseKms = software.amazon.jsii.Kernel.get(this, "sseKms", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecInventoryDestinationS3BucketDestinationEncryptionSseKms.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.sseKms = builder.sseKms;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecInventoryDestinationS3BucketDestinationEncryptionSseKms getSseKms() {
            return this.sseKms;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getSseKms() != null) {
                data.set("sseKms", om.valueToTree(this.getSseKms()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecInventoryDestinationS3BucketDestinationEncryption"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecInventoryDestinationS3BucketDestinationEncryption.Jsii$Proxy that = (BucketSpecInventoryDestinationS3BucketDestinationEncryption.Jsii$Proxy) o;

            return this.sseKms != null ? this.sseKms.equals(that.sseKms) : that.sseKms == null;
        }

        @Override
        public final int hashCode() {
            int result = this.sseKms != null ? this.sseKms.hashCode() : 0;
            return result;
        }
    }
}
