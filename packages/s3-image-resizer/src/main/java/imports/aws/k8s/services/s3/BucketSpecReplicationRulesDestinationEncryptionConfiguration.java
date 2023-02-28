package imports.aws.k8s.services.s3;

/**
 * Specifies encryption-related information for an Amazon S3 bucket that is a destination for replicated objects.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.409Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecReplicationRulesDestinationEncryptionConfiguration")
@software.amazon.jsii.Jsii.Proxy(BucketSpecReplicationRulesDestinationEncryptionConfiguration.Jsii$Proxy.class)
public interface BucketSpecReplicationRulesDestinationEncryptionConfiguration extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getReplicaKmsKeyId() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecReplicationRulesDestinationEncryptionConfiguration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecReplicationRulesDestinationEncryptionConfiguration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecReplicationRulesDestinationEncryptionConfiguration> {
        java.lang.String replicaKmsKeyId;

        /**
         * Sets the value of {@link BucketSpecReplicationRulesDestinationEncryptionConfiguration#getReplicaKmsKeyId}
         * @param replicaKmsKeyId the value to be set.
         * @return {@code this}
         */
        public Builder replicaKmsKeyId(java.lang.String replicaKmsKeyId) {
            this.replicaKmsKeyId = replicaKmsKeyId;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecReplicationRulesDestinationEncryptionConfiguration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecReplicationRulesDestinationEncryptionConfiguration build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecReplicationRulesDestinationEncryptionConfiguration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecReplicationRulesDestinationEncryptionConfiguration {
        private final java.lang.String replicaKmsKeyId;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.replicaKmsKeyId = software.amazon.jsii.Kernel.get(this, "replicaKmsKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.replicaKmsKeyId = builder.replicaKmsKeyId;
        }

        @Override
        public final java.lang.String getReplicaKmsKeyId() {
            return this.replicaKmsKeyId;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getReplicaKmsKeyId() != null) {
                data.set("replicaKmsKeyId", om.valueToTree(this.getReplicaKmsKeyId()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecReplicationRulesDestinationEncryptionConfiguration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecReplicationRulesDestinationEncryptionConfiguration.Jsii$Proxy that = (BucketSpecReplicationRulesDestinationEncryptionConfiguration.Jsii$Proxy) o;

            return this.replicaKmsKeyId != null ? this.replicaKmsKeyId.equals(that.replicaKmsKeyId) : that.replicaKmsKeyId == null;
        }

        @Override
        public final int hashCode() {
            int result = this.replicaKmsKeyId != null ? this.replicaKmsKeyId.hashCode() : 0;
            return result;
        }
    }
}
