package imports.aws.k8s.services.s3;

/**
 * Container for granting information.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.403Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecLoggingLoggingEnabledTargetGrants")
@software.amazon.jsii.Jsii.Proxy(BucketSpecLoggingLoggingEnabledTargetGrants.Jsii$Proxy.class)
public interface BucketSpecLoggingLoggingEnabledTargetGrants extends software.amazon.jsii.JsiiSerializable {

    /**
     * Container for the person being granted permissions.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecLoggingLoggingEnabledTargetGrantsGrantee getGrantee() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPermission() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecLoggingLoggingEnabledTargetGrants}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecLoggingLoggingEnabledTargetGrants}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecLoggingLoggingEnabledTargetGrants> {
        imports.aws.k8s.services.s3.BucketSpecLoggingLoggingEnabledTargetGrantsGrantee grantee;
        java.lang.String permission;

        /**
         * Sets the value of {@link BucketSpecLoggingLoggingEnabledTargetGrants#getGrantee}
         * @param grantee Container for the person being granted permissions.
         * @return {@code this}
         */
        public Builder grantee(imports.aws.k8s.services.s3.BucketSpecLoggingLoggingEnabledTargetGrantsGrantee grantee) {
            this.grantee = grantee;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecLoggingLoggingEnabledTargetGrants#getPermission}
         * @param permission the value to be set.
         * @return {@code this}
         */
        public Builder permission(java.lang.String permission) {
            this.permission = permission;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecLoggingLoggingEnabledTargetGrants}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecLoggingLoggingEnabledTargetGrants build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecLoggingLoggingEnabledTargetGrants}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecLoggingLoggingEnabledTargetGrants {
        private final imports.aws.k8s.services.s3.BucketSpecLoggingLoggingEnabledTargetGrantsGrantee grantee;
        private final java.lang.String permission;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.grantee = software.amazon.jsii.Kernel.get(this, "grantee", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecLoggingLoggingEnabledTargetGrantsGrantee.class));
            this.permission = software.amazon.jsii.Kernel.get(this, "permission", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.grantee = builder.grantee;
            this.permission = builder.permission;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecLoggingLoggingEnabledTargetGrantsGrantee getGrantee() {
            return this.grantee;
        }

        @Override
        public final java.lang.String getPermission() {
            return this.permission;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getGrantee() != null) {
                data.set("grantee", om.valueToTree(this.getGrantee()));
            }
            if (this.getPermission() != null) {
                data.set("permission", om.valueToTree(this.getPermission()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecLoggingLoggingEnabledTargetGrants"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecLoggingLoggingEnabledTargetGrants.Jsii$Proxy that = (BucketSpecLoggingLoggingEnabledTargetGrants.Jsii$Proxy) o;

            if (this.grantee != null ? !this.grantee.equals(that.grantee) : that.grantee != null) return false;
            return this.permission != null ? this.permission.equals(that.permission) : that.permission == null;
        }

        @Override
        public final int hashCode() {
            int result = this.grantee != null ? this.grantee.hashCode() : 0;
            result = 31 * result + (this.permission != null ? this.permission.hashCode() : 0);
            return result;
        }
    }
}
