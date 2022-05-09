package imports.aws.k8s.services.s3;

/**
 * A container for filter information for the selection of S3 objects encrypted with Amazon Web Services KMS.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.413Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecReplicationRulesSourceSelectionCriteriaSseKmsEncryptedObjects")
@software.amazon.jsii.Jsii.Proxy(BucketSpecReplicationRulesSourceSelectionCriteriaSseKmsEncryptedObjects.Jsii$Proxy.class)
public interface BucketSpecReplicationRulesSourceSelectionCriteriaSseKmsEncryptedObjects extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getStatus() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecReplicationRulesSourceSelectionCriteriaSseKmsEncryptedObjects}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecReplicationRulesSourceSelectionCriteriaSseKmsEncryptedObjects}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecReplicationRulesSourceSelectionCriteriaSseKmsEncryptedObjects> {
        java.lang.String status;

        /**
         * Sets the value of {@link BucketSpecReplicationRulesSourceSelectionCriteriaSseKmsEncryptedObjects#getStatus}
         * @param status the value to be set.
         * @return {@code this}
         */
        public Builder status(java.lang.String status) {
            this.status = status;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecReplicationRulesSourceSelectionCriteriaSseKmsEncryptedObjects}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecReplicationRulesSourceSelectionCriteriaSseKmsEncryptedObjects build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecReplicationRulesSourceSelectionCriteriaSseKmsEncryptedObjects}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecReplicationRulesSourceSelectionCriteriaSseKmsEncryptedObjects {
        private final java.lang.String status;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.status = software.amazon.jsii.Kernel.get(this, "status", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.status = builder.status;
        }

        @Override
        public final java.lang.String getStatus() {
            return this.status;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getStatus() != null) {
                data.set("status", om.valueToTree(this.getStatus()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecReplicationRulesSourceSelectionCriteriaSseKmsEncryptedObjects"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecReplicationRulesSourceSelectionCriteriaSseKmsEncryptedObjects.Jsii$Proxy that = (BucketSpecReplicationRulesSourceSelectionCriteriaSseKmsEncryptedObjects.Jsii$Proxy) o;

            return this.status != null ? this.status.equals(that.status) : that.status == null;
        }

        @Override
        public final int hashCode() {
            int result = this.status != null ? this.status.hashCode() : 0;
            return result;
        }
    }
}
