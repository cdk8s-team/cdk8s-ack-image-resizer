package imports.aws.k8s.services.s3;

/**
 * Describes the default server-side encryption to apply to new objects in the bucket.
 * <p>
 * If a PUT Object request doesn't specify any server-side encryption, this default encryption will be applied. For more information, see PUT Bucket encryption (https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTencryption.html) in the Amazon S3 API Reference.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.396Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecEncryptionRulesApplyServerSideEncryptionByDefault")
@software.amazon.jsii.Jsii.Proxy(BucketSpecEncryptionRulesApplyServerSideEncryptionByDefault.Jsii$Proxy.class)
public interface BucketSpecEncryptionRulesApplyServerSideEncryptionByDefault extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getKmsMasterKeyId() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSseAlgorithm() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecEncryptionRulesApplyServerSideEncryptionByDefault}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecEncryptionRulesApplyServerSideEncryptionByDefault}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecEncryptionRulesApplyServerSideEncryptionByDefault> {
        java.lang.String kmsMasterKeyId;
        java.lang.String sseAlgorithm;

        /**
         * Sets the value of {@link BucketSpecEncryptionRulesApplyServerSideEncryptionByDefault#getKmsMasterKeyId}
         * @param kmsMasterKeyId the value to be set.
         * @return {@code this}
         */
        public Builder kmsMasterKeyId(java.lang.String kmsMasterKeyId) {
            this.kmsMasterKeyId = kmsMasterKeyId;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecEncryptionRulesApplyServerSideEncryptionByDefault#getSseAlgorithm}
         * @param sseAlgorithm the value to be set.
         * @return {@code this}
         */
        public Builder sseAlgorithm(java.lang.String sseAlgorithm) {
            this.sseAlgorithm = sseAlgorithm;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecEncryptionRulesApplyServerSideEncryptionByDefault}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecEncryptionRulesApplyServerSideEncryptionByDefault build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecEncryptionRulesApplyServerSideEncryptionByDefault}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecEncryptionRulesApplyServerSideEncryptionByDefault {
        private final java.lang.String kmsMasterKeyId;
        private final java.lang.String sseAlgorithm;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.kmsMasterKeyId = software.amazon.jsii.Kernel.get(this, "kmsMasterKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sseAlgorithm = software.amazon.jsii.Kernel.get(this, "sseAlgorithm", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.kmsMasterKeyId = builder.kmsMasterKeyId;
            this.sseAlgorithm = builder.sseAlgorithm;
        }

        @Override
        public final java.lang.String getKmsMasterKeyId() {
            return this.kmsMasterKeyId;
        }

        @Override
        public final java.lang.String getSseAlgorithm() {
            return this.sseAlgorithm;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getKmsMasterKeyId() != null) {
                data.set("kmsMasterKeyId", om.valueToTree(this.getKmsMasterKeyId()));
            }
            if (this.getSseAlgorithm() != null) {
                data.set("sseAlgorithm", om.valueToTree(this.getSseAlgorithm()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecEncryptionRulesApplyServerSideEncryptionByDefault"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecEncryptionRulesApplyServerSideEncryptionByDefault.Jsii$Proxy that = (BucketSpecEncryptionRulesApplyServerSideEncryptionByDefault.Jsii$Proxy) o;

            if (this.kmsMasterKeyId != null ? !this.kmsMasterKeyId.equals(that.kmsMasterKeyId) : that.kmsMasterKeyId != null) return false;
            return this.sseAlgorithm != null ? this.sseAlgorithm.equals(that.sseAlgorithm) : that.sseAlgorithm == null;
        }

        @Override
        public final int hashCode() {
            int result = this.kmsMasterKeyId != null ? this.kmsMasterKeyId.hashCode() : 0;
            result = 31 * result + (this.sseAlgorithm != null ? this.sseAlgorithm.hashCode() : 0);
            return result;
        }
    }
}
