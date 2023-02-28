package imports.aws.k8s.services.s3;

/**
 * Specifies the redirect behavior and when a redirect is applied.
 * <p>
 * For more information about routing rules, see Configuring advanced conditional redirects (https://docs.aws.amazon.com/AmazonS3/latest/dev/how-to-page-redirect.html#advanced-conditional-redirects) in the Amazon S3 User Guide.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.414Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecWebsiteRoutingRules")
@software.amazon.jsii.Jsii.Proxy(BucketSpecWebsiteRoutingRules.Jsii$Proxy.class)
public interface BucketSpecWebsiteRoutingRules extends software.amazon.jsii.JsiiSerializable {

    /**
     * A container for describing a condition that must be met for the specified redirect to apply.
     * <p>
     * For example, 1. If request is for pages in the /docs folder, redirect to the /documents folder. 2. If request results in HTTP error 4xx, redirect request to another host where you might process the error.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecWebsiteRoutingRulesCondition getCondition() {
        return null;
    }

    /**
     * Specifies how requests are redirected.
     * <p>
     * In the event of an error, you can specify a different error code to return.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecWebsiteRoutingRulesRedirect getRedirect() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecWebsiteRoutingRules}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecWebsiteRoutingRules}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecWebsiteRoutingRules> {
        imports.aws.k8s.services.s3.BucketSpecWebsiteRoutingRulesCondition condition;
        imports.aws.k8s.services.s3.BucketSpecWebsiteRoutingRulesRedirect redirect;

        /**
         * Sets the value of {@link BucketSpecWebsiteRoutingRules#getCondition}
         * @param condition A container for describing a condition that must be met for the specified redirect to apply.
         *                  For example, 1. If request is for pages in the /docs folder, redirect to the /documents folder. 2. If request results in HTTP error 4xx, redirect request to another host where you might process the error.
         * @return {@code this}
         */
        public Builder condition(imports.aws.k8s.services.s3.BucketSpecWebsiteRoutingRulesCondition condition) {
            this.condition = condition;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecWebsiteRoutingRules#getRedirect}
         * @param redirect Specifies how requests are redirected.
         *                 In the event of an error, you can specify a different error code to return.
         * @return {@code this}
         */
        public Builder redirect(imports.aws.k8s.services.s3.BucketSpecWebsiteRoutingRulesRedirect redirect) {
            this.redirect = redirect;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecWebsiteRoutingRules}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecWebsiteRoutingRules build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecWebsiteRoutingRules}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecWebsiteRoutingRules {
        private final imports.aws.k8s.services.s3.BucketSpecWebsiteRoutingRulesCondition condition;
        private final imports.aws.k8s.services.s3.BucketSpecWebsiteRoutingRulesRedirect redirect;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.condition = software.amazon.jsii.Kernel.get(this, "condition", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecWebsiteRoutingRulesCondition.class));
            this.redirect = software.amazon.jsii.Kernel.get(this, "redirect", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecWebsiteRoutingRulesRedirect.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.condition = builder.condition;
            this.redirect = builder.redirect;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecWebsiteRoutingRulesCondition getCondition() {
            return this.condition;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecWebsiteRoutingRulesRedirect getRedirect() {
            return this.redirect;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCondition() != null) {
                data.set("condition", om.valueToTree(this.getCondition()));
            }
            if (this.getRedirect() != null) {
                data.set("redirect", om.valueToTree(this.getRedirect()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecWebsiteRoutingRules"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecWebsiteRoutingRules.Jsii$Proxy that = (BucketSpecWebsiteRoutingRules.Jsii$Proxy) o;

            if (this.condition != null ? !this.condition.equals(that.condition) : that.condition != null) return false;
            return this.redirect != null ? this.redirect.equals(that.redirect) : that.redirect == null;
        }

        @Override
        public final int hashCode() {
            int result = this.condition != null ? this.condition.hashCode() : 0;
            result = 31 * result + (this.redirect != null ? this.redirect.hashCode() : 0);
            return result;
        }
    }
}
