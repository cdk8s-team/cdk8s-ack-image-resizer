package imports.aws.k8s.services.s3;

/**
 * A container for replication rules.
 * <p>
 * You can add up to 1,000 rules. The maximum size of a replication configuration is 2 MB.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.408Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecReplication")
@software.amazon.jsii.Jsii.Proxy(BucketSpecReplication.Jsii$Proxy.class)
public interface BucketSpecReplication extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRole() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.k8s.services.s3.BucketSpecReplicationRules> getRules() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecReplication}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecReplication}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecReplication> {
        java.lang.String role;
        java.util.List<imports.aws.k8s.services.s3.BucketSpecReplicationRules> rules;

        /**
         * Sets the value of {@link BucketSpecReplication#getRole}
         * @param role the value to be set.
         * @return {@code this}
         */
        public Builder role(java.lang.String role) {
            this.role = role;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecReplication#getRules}
         * @param rules the value to be set.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder rules(java.util.List<? extends imports.aws.k8s.services.s3.BucketSpecReplicationRules> rules) {
            this.rules = (java.util.List<imports.aws.k8s.services.s3.BucketSpecReplicationRules>)rules;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecReplication}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecReplication build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecReplication}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecReplication {
        private final java.lang.String role;
        private final java.util.List<imports.aws.k8s.services.s3.BucketSpecReplicationRules> rules;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.role = software.amazon.jsii.Kernel.get(this, "role", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.rules = software.amazon.jsii.Kernel.get(this, "rules", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecReplicationRules.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.role = builder.role;
            this.rules = (java.util.List<imports.aws.k8s.services.s3.BucketSpecReplicationRules>)builder.rules;
        }

        @Override
        public final java.lang.String getRole() {
            return this.role;
        }

        @Override
        public final java.util.List<imports.aws.k8s.services.s3.BucketSpecReplicationRules> getRules() {
            return this.rules;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getRole() != null) {
                data.set("role", om.valueToTree(this.getRole()));
            }
            if (this.getRules() != null) {
                data.set("rules", om.valueToTree(this.getRules()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecReplication"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecReplication.Jsii$Proxy that = (BucketSpecReplication.Jsii$Proxy) o;

            if (this.role != null ? !this.role.equals(that.role) : that.role != null) return false;
            return this.rules != null ? this.rules.equals(that.rules) : that.rules == null;
        }

        @Override
        public final int hashCode() {
            int result = this.role != null ? this.role.hashCode() : 0;
            result = 31 * result + (this.rules != null ? this.rules.hashCode() : 0);
            return result;
        }
    }
}
