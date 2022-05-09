package imports.aws.k8s.services.s3;

/**
 * A container that describes additional filters for identifying the source objects that you want to replicate.
 * <p>
 * You can choose to enable or disable the replication of these objects. Currently, Amazon S3 supports only the filter that you can specify for objects created with server-side encryption using a customer managed key stored in Amazon Web Services Key Management Service (SSE-KMS).
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.413Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecReplicationRulesSourceSelectionCriteria")
@software.amazon.jsii.Jsii.Proxy(BucketSpecReplicationRulesSourceSelectionCriteria.Jsii$Proxy.class)
public interface BucketSpecReplicationRulesSourceSelectionCriteria extends software.amazon.jsii.JsiiSerializable {

    /**
     * A filter that you can specify for selection for modifications on replicas.
     * <p>
     * Amazon S3 doesn't replicate replica modifications by default. In the latest version of replication configuration (when Filter is specified), you can specify this element and set the status to Enabled to replicate modifications on replicas.
     * If you don't specify the Filter element, Amazon S3 assumes that the replication configuration is the earlier version, V1. In the earlier version, this element is not allowed.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecReplicationRulesSourceSelectionCriteriaReplicaModifications getReplicaModifications() {
        return null;
    }

    /**
     * A container for filter information for the selection of S3 objects encrypted with Amazon Web Services KMS.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecReplicationRulesSourceSelectionCriteriaSseKmsEncryptedObjects getSseKmsEncryptedObjects() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecReplicationRulesSourceSelectionCriteria}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecReplicationRulesSourceSelectionCriteria}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecReplicationRulesSourceSelectionCriteria> {
        imports.aws.k8s.services.s3.BucketSpecReplicationRulesSourceSelectionCriteriaReplicaModifications replicaModifications;
        imports.aws.k8s.services.s3.BucketSpecReplicationRulesSourceSelectionCriteriaSseKmsEncryptedObjects sseKmsEncryptedObjects;

        /**
         * Sets the value of {@link BucketSpecReplicationRulesSourceSelectionCriteria#getReplicaModifications}
         * @param replicaModifications A filter that you can specify for selection for modifications on replicas.
         *                             Amazon S3 doesn't replicate replica modifications by default. In the latest version of replication configuration (when Filter is specified), you can specify this element and set the status to Enabled to replicate modifications on replicas.
         *                             If you don't specify the Filter element, Amazon S3 assumes that the replication configuration is the earlier version, V1. In the earlier version, this element is not allowed.
         * @return {@code this}
         */
        public Builder replicaModifications(imports.aws.k8s.services.s3.BucketSpecReplicationRulesSourceSelectionCriteriaReplicaModifications replicaModifications) {
            this.replicaModifications = replicaModifications;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecReplicationRulesSourceSelectionCriteria#getSseKmsEncryptedObjects}
         * @param sseKmsEncryptedObjects A container for filter information for the selection of S3 objects encrypted with Amazon Web Services KMS.
         * @return {@code this}
         */
        public Builder sseKmsEncryptedObjects(imports.aws.k8s.services.s3.BucketSpecReplicationRulesSourceSelectionCriteriaSseKmsEncryptedObjects sseKmsEncryptedObjects) {
            this.sseKmsEncryptedObjects = sseKmsEncryptedObjects;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecReplicationRulesSourceSelectionCriteria}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecReplicationRulesSourceSelectionCriteria build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecReplicationRulesSourceSelectionCriteria}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecReplicationRulesSourceSelectionCriteria {
        private final imports.aws.k8s.services.s3.BucketSpecReplicationRulesSourceSelectionCriteriaReplicaModifications replicaModifications;
        private final imports.aws.k8s.services.s3.BucketSpecReplicationRulesSourceSelectionCriteriaSseKmsEncryptedObjects sseKmsEncryptedObjects;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.replicaModifications = software.amazon.jsii.Kernel.get(this, "replicaModifications", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecReplicationRulesSourceSelectionCriteriaReplicaModifications.class));
            this.sseKmsEncryptedObjects = software.amazon.jsii.Kernel.get(this, "sseKmsEncryptedObjects", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecReplicationRulesSourceSelectionCriteriaSseKmsEncryptedObjects.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.replicaModifications = builder.replicaModifications;
            this.sseKmsEncryptedObjects = builder.sseKmsEncryptedObjects;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecReplicationRulesSourceSelectionCriteriaReplicaModifications getReplicaModifications() {
            return this.replicaModifications;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecReplicationRulesSourceSelectionCriteriaSseKmsEncryptedObjects getSseKmsEncryptedObjects() {
            return this.sseKmsEncryptedObjects;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getReplicaModifications() != null) {
                data.set("replicaModifications", om.valueToTree(this.getReplicaModifications()));
            }
            if (this.getSseKmsEncryptedObjects() != null) {
                data.set("sseKmsEncryptedObjects", om.valueToTree(this.getSseKmsEncryptedObjects()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecReplicationRulesSourceSelectionCriteria"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecReplicationRulesSourceSelectionCriteria.Jsii$Proxy that = (BucketSpecReplicationRulesSourceSelectionCriteria.Jsii$Proxy) o;

            if (this.replicaModifications != null ? !this.replicaModifications.equals(that.replicaModifications) : that.replicaModifications != null) return false;
            return this.sseKmsEncryptedObjects != null ? this.sseKmsEncryptedObjects.equals(that.sseKmsEncryptedObjects) : that.sseKmsEncryptedObjects == null;
        }

        @Override
        public final int hashCode() {
            int result = this.replicaModifications != null ? this.replicaModifications.hashCode() : 0;
            result = 31 * result + (this.sseKmsEncryptedObjects != null ? this.sseKmsEncryptedObjects.hashCode() : 0);
            return result;
        }
    }
}
