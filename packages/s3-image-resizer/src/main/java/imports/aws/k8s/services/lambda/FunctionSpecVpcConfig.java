package imports.aws.k8s.services.lambda;

/**
 * For network connectivity to Amazon Web Services resources in a VPC, specify a list of security groups and subnets in the VPC.
 * <p>
 * When you connect a function to a VPC, it can only access resources and the internet through that VPC. For more information, see VPC Settings (https://docs.aws.amazon.com/lambda/latest/dg/configuration-vpc.html).
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:22:11.950Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.lambda.$Module.class, fqn = "awsk8sserviceslambda.FunctionSpecVpcConfig")
@software.amazon.jsii.Jsii.Proxy(FunctionSpecVpcConfig.Jsii$Proxy.class)
public interface FunctionSpecVpcConfig extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSecurityGroupIDs() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSubnetIDs() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link FunctionSpecVpcConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link FunctionSpecVpcConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<FunctionSpecVpcConfig> {
        java.util.List<java.lang.String> securityGroupIDs;
        java.util.List<java.lang.String> subnetIDs;

        /**
         * Sets the value of {@link FunctionSpecVpcConfig#getSecurityGroupIDs}
         * @param securityGroupIDs the value to be set.
         * @return {@code this}
         */
        public Builder securityGroupIDs(java.util.List<java.lang.String> securityGroupIDs) {
            this.securityGroupIDs = securityGroupIDs;
            return this;
        }

        /**
         * Sets the value of {@link FunctionSpecVpcConfig#getSubnetIDs}
         * @param subnetIDs the value to be set.
         * @return {@code this}
         */
        public Builder subnetIDs(java.util.List<java.lang.String> subnetIDs) {
            this.subnetIDs = subnetIDs;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link FunctionSpecVpcConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public FunctionSpecVpcConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link FunctionSpecVpcConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements FunctionSpecVpcConfig {
        private final java.util.List<java.lang.String> securityGroupIDs;
        private final java.util.List<java.lang.String> subnetIDs;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.securityGroupIDs = software.amazon.jsii.Kernel.get(this, "securityGroupIDs", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.subnetIDs = software.amazon.jsii.Kernel.get(this, "subnetIDs", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.securityGroupIDs = builder.securityGroupIDs;
            this.subnetIDs = builder.subnetIDs;
        }

        @Override
        public final java.util.List<java.lang.String> getSecurityGroupIDs() {
            return this.securityGroupIDs;
        }

        @Override
        public final java.util.List<java.lang.String> getSubnetIDs() {
            return this.subnetIDs;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getSecurityGroupIDs() != null) {
                data.set("securityGroupIDs", om.valueToTree(this.getSecurityGroupIDs()));
            }
            if (this.getSubnetIDs() != null) {
                data.set("subnetIDs", om.valueToTree(this.getSubnetIDs()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sserviceslambda.FunctionSpecVpcConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            FunctionSpecVpcConfig.Jsii$Proxy that = (FunctionSpecVpcConfig.Jsii$Proxy) o;

            if (this.securityGroupIDs != null ? !this.securityGroupIDs.equals(that.securityGroupIDs) : that.securityGroupIDs != null) return false;
            return this.subnetIDs != null ? this.subnetIDs.equals(that.subnetIDs) : that.subnetIDs == null;
        }

        @Override
        public final int hashCode() {
            int result = this.securityGroupIDs != null ? this.securityGroupIDs.hashCode() : 0;
            result = 31 * result + (this.subnetIDs != null ? this.subnetIDs.hashCode() : 0);
            return result;
        }
    }
}
