package imports.aws.k8s.services.iam;

/**
 * Role is the Schema for the Roles API.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T23:07:01.840Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.iam.$Module.class, fqn = "awsk8sservicesiam.RoleProps")
@software.amazon.jsii.Jsii.Proxy(RoleProps.Jsii$Proxy.class)
public interface RoleProps extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    default @org.jetbrains.annotations.Nullable org.cdk8s.ApiObjectMetadata getMetadata() {
        return null;
    }

    /**
     * RoleSpec defines the desired state of Role.
     * <p>
     * Contains information about an IAM role. This structure is returned as a response element in several API operations that interact with roles.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.iam.RoleSpec getSpec() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link RoleProps}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link RoleProps}
     */
    public static final class Builder implements software.amazon.jsii.Builder<RoleProps> {
        org.cdk8s.ApiObjectMetadata metadata;
        imports.aws.k8s.services.iam.RoleSpec spec;

        /**
         * Sets the value of {@link RoleProps#getMetadata}
         * @param metadata the value to be set.
         * @return {@code this}
         */
        public Builder metadata(org.cdk8s.ApiObjectMetadata metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Sets the value of {@link RoleProps#getSpec}
         * @param spec RoleSpec defines the desired state of Role.
         *             Contains information about an IAM role. This structure is returned as a response element in several API operations that interact with roles.
         * @return {@code this}
         */
        public Builder spec(imports.aws.k8s.services.iam.RoleSpec spec) {
            this.spec = spec;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link RoleProps}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public RoleProps build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link RoleProps}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements RoleProps {
        private final org.cdk8s.ApiObjectMetadata metadata;
        private final imports.aws.k8s.services.iam.RoleSpec spec;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.metadata = software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.forClass(org.cdk8s.ApiObjectMetadata.class));
            this.spec = software.amazon.jsii.Kernel.get(this, "spec", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.iam.RoleSpec.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.metadata = builder.metadata;
            this.spec = builder.spec;
        }

        @Override
        public final org.cdk8s.ApiObjectMetadata getMetadata() {
            return this.metadata;
        }

        @Override
        public final imports.aws.k8s.services.iam.RoleSpec getSpec() {
            return this.spec;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }
            if (this.getSpec() != null) {
                data.set("spec", om.valueToTree(this.getSpec()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicesiam.RoleProps"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            RoleProps.Jsii$Proxy that = (RoleProps.Jsii$Proxy) o;

            if (this.metadata != null ? !this.metadata.equals(that.metadata) : that.metadata != null) return false;
            return this.spec != null ? this.spec.equals(that.spec) : that.spec == null;
        }

        @Override
        public final int hashCode() {
            int result = this.metadata != null ? this.metadata.hashCode() : 0;
            result = 31 * result + (this.spec != null ? this.spec.hashCode() : 0);
            return result;
        }
    }
}
