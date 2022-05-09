package imports.aws.k8s.services.s3;

/**
 * A container for describing a condition that must be met for the specified redirect to apply.
 * <p>
 * For example, 1. If request is for pages in the /docs folder, redirect to the /documents folder. 2. If request results in HTTP error 4xx, redirect request to another host where you might process the error.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.415Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecWebsiteRoutingRulesCondition")
@software.amazon.jsii.Jsii.Proxy(BucketSpecWebsiteRoutingRulesCondition.Jsii$Proxy.class)
public interface BucketSpecWebsiteRoutingRulesCondition extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getHttpErrorCodeReturnedEquals() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getKeyPrefixEquals() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecWebsiteRoutingRulesCondition}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecWebsiteRoutingRulesCondition}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecWebsiteRoutingRulesCondition> {
        java.lang.String httpErrorCodeReturnedEquals;
        java.lang.String keyPrefixEquals;

        /**
         * Sets the value of {@link BucketSpecWebsiteRoutingRulesCondition#getHttpErrorCodeReturnedEquals}
         * @param httpErrorCodeReturnedEquals the value to be set.
         * @return {@code this}
         */
        public Builder httpErrorCodeReturnedEquals(java.lang.String httpErrorCodeReturnedEquals) {
            this.httpErrorCodeReturnedEquals = httpErrorCodeReturnedEquals;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecWebsiteRoutingRulesCondition#getKeyPrefixEquals}
         * @param keyPrefixEquals the value to be set.
         * @return {@code this}
         */
        public Builder keyPrefixEquals(java.lang.String keyPrefixEquals) {
            this.keyPrefixEquals = keyPrefixEquals;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecWebsiteRoutingRulesCondition}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecWebsiteRoutingRulesCondition build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecWebsiteRoutingRulesCondition}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecWebsiteRoutingRulesCondition {
        private final java.lang.String httpErrorCodeReturnedEquals;
        private final java.lang.String keyPrefixEquals;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.httpErrorCodeReturnedEquals = software.amazon.jsii.Kernel.get(this, "httpErrorCodeReturnedEquals", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.keyPrefixEquals = software.amazon.jsii.Kernel.get(this, "keyPrefixEquals", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.httpErrorCodeReturnedEquals = builder.httpErrorCodeReturnedEquals;
            this.keyPrefixEquals = builder.keyPrefixEquals;
        }

        @Override
        public final java.lang.String getHttpErrorCodeReturnedEquals() {
            return this.httpErrorCodeReturnedEquals;
        }

        @Override
        public final java.lang.String getKeyPrefixEquals() {
            return this.keyPrefixEquals;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getHttpErrorCodeReturnedEquals() != null) {
                data.set("httpErrorCodeReturnedEquals", om.valueToTree(this.getHttpErrorCodeReturnedEquals()));
            }
            if (this.getKeyPrefixEquals() != null) {
                data.set("keyPrefixEquals", om.valueToTree(this.getKeyPrefixEquals()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecWebsiteRoutingRulesCondition"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecWebsiteRoutingRulesCondition.Jsii$Proxy that = (BucketSpecWebsiteRoutingRulesCondition.Jsii$Proxy) o;

            if (this.httpErrorCodeReturnedEquals != null ? !this.httpErrorCodeReturnedEquals.equals(that.httpErrorCodeReturnedEquals) : that.httpErrorCodeReturnedEquals != null) return false;
            return this.keyPrefixEquals != null ? this.keyPrefixEquals.equals(that.keyPrefixEquals) : that.keyPrefixEquals == null;
        }

        @Override
        public final int hashCode() {
            int result = this.httpErrorCodeReturnedEquals != null ? this.httpErrorCodeReturnedEquals.hashCode() : 0;
            result = 31 * result + (this.keyPrefixEquals != null ? this.keyPrefixEquals.hashCode() : 0);
            return result;
        }
    }
}
