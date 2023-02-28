package imports.aws.k8s.services.s3;

/**
 * A container for information about access control for replicas.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.409Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecReplicationRulesDestinationAccessControlTranslation")
@software.amazon.jsii.Jsii.Proxy(BucketSpecReplicationRulesDestinationAccessControlTranslation.Jsii$Proxy.class)
public interface BucketSpecReplicationRulesDestinationAccessControlTranslation extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getOwner() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecReplicationRulesDestinationAccessControlTranslation}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecReplicationRulesDestinationAccessControlTranslation}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecReplicationRulesDestinationAccessControlTranslation> {
        java.lang.String owner;

        /**
         * Sets the value of {@link BucketSpecReplicationRulesDestinationAccessControlTranslation#getOwner}
         * @param owner the value to be set.
         * @return {@code this}
         */
        public Builder owner(java.lang.String owner) {
            this.owner = owner;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecReplicationRulesDestinationAccessControlTranslation}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecReplicationRulesDestinationAccessControlTranslation build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecReplicationRulesDestinationAccessControlTranslation}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecReplicationRulesDestinationAccessControlTranslation {
        private final java.lang.String owner;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.owner = software.amazon.jsii.Kernel.get(this, "owner", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.owner = builder.owner;
        }

        @Override
        public final java.lang.String getOwner() {
            return this.owner;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getOwner() != null) {
                data.set("owner", om.valueToTree(this.getOwner()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecReplicationRulesDestinationAccessControlTranslation"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecReplicationRulesDestinationAccessControlTranslation.Jsii$Proxy that = (BucketSpecReplicationRulesDestinationAccessControlTranslation.Jsii$Proxy) o;

            return this.owner != null ? this.owner.equals(that.owner) : that.owner == null;
        }

        @Override
        public final int hashCode() {
            int result = this.owner != null ? this.owner.hashCode() : 0;
            return result;
        }
    }
}
