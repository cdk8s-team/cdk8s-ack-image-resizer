package imports.aws.k8s.services.s3;

/**
 * Specifies whether Amazon S3 replicates delete markers.
 * <p>
 * If you specify a Filter in your replication configuration, you must also include a DeleteMarkerReplication element. If your Filter includes a Tag element, the DeleteMarkerReplication Status must be set to Disabled, because Amazon S3 does not support replicating delete markers for tag-based rules. For an example configuration, see Basic Rule Configuration (https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-add-config.html#replication-config-min-rule-config).
 * For more information about delete marker replication, see Basic Rule Configuration (https://docs.aws.amazon.com/AmazonS3/latest/dev/delete-marker-replication.html).
 * If you are using an earlier version of the replication configuration, Amazon S3 handles replication of delete markers differently. For more information, see Backward Compatibility (https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-add-config.html#replication-backward-compat-considerations).
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.409Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecReplicationRulesDeleteMarkerReplication")
@software.amazon.jsii.Jsii.Proxy(BucketSpecReplicationRulesDeleteMarkerReplication.Jsii$Proxy.class)
public interface BucketSpecReplicationRulesDeleteMarkerReplication extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getStatus() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecReplicationRulesDeleteMarkerReplication}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecReplicationRulesDeleteMarkerReplication}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecReplicationRulesDeleteMarkerReplication> {
        java.lang.String status;

        /**
         * Sets the value of {@link BucketSpecReplicationRulesDeleteMarkerReplication#getStatus}
         * @param status the value to be set.
         * @return {@code this}
         */
        public Builder status(java.lang.String status) {
            this.status = status;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecReplicationRulesDeleteMarkerReplication}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecReplicationRulesDeleteMarkerReplication build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecReplicationRulesDeleteMarkerReplication}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecReplicationRulesDeleteMarkerReplication {
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
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecReplicationRulesDeleteMarkerReplication"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecReplicationRulesDeleteMarkerReplication.Jsii$Proxy that = (BucketSpecReplicationRulesDeleteMarkerReplication.Jsii$Proxy) o;

            return this.status != null ? this.status.equals(that.status) : that.status == null;
        }

        @Override
        public final int hashCode() {
            int result = this.status != null ? this.status.hashCode() : 0;
            return result;
        }
    }
}
