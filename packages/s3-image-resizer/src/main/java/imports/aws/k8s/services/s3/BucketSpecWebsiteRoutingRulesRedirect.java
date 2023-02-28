package imports.aws.k8s.services.s3;

/**
 * Specifies how requests are redirected.
 * <p>
 * In the event of an error, you can specify a different error code to return.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.415Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecWebsiteRoutingRulesRedirect")
@software.amazon.jsii.Jsii.Proxy(BucketSpecWebsiteRoutingRulesRedirect.Jsii$Proxy.class)
public interface BucketSpecWebsiteRoutingRulesRedirect extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getHostName() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getHttpRedirectCode() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getProtocol() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getReplaceKeyPrefixWith() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getReplaceKeyWith() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecWebsiteRoutingRulesRedirect}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecWebsiteRoutingRulesRedirect}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecWebsiteRoutingRulesRedirect> {
        java.lang.String hostName;
        java.lang.String httpRedirectCode;
        java.lang.String protocol;
        java.lang.String replaceKeyPrefixWith;
        java.lang.String replaceKeyWith;

        /**
         * Sets the value of {@link BucketSpecWebsiteRoutingRulesRedirect#getHostName}
         * @param hostName the value to be set.
         * @return {@code this}
         */
        public Builder hostName(java.lang.String hostName) {
            this.hostName = hostName;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecWebsiteRoutingRulesRedirect#getHttpRedirectCode}
         * @param httpRedirectCode the value to be set.
         * @return {@code this}
         */
        public Builder httpRedirectCode(java.lang.String httpRedirectCode) {
            this.httpRedirectCode = httpRedirectCode;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecWebsiteRoutingRulesRedirect#getProtocol}
         * @param protocol the value to be set.
         * @return {@code this}
         */
        public Builder protocol(java.lang.String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecWebsiteRoutingRulesRedirect#getReplaceKeyPrefixWith}
         * @param replaceKeyPrefixWith the value to be set.
         * @return {@code this}
         */
        public Builder replaceKeyPrefixWith(java.lang.String replaceKeyPrefixWith) {
            this.replaceKeyPrefixWith = replaceKeyPrefixWith;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecWebsiteRoutingRulesRedirect#getReplaceKeyWith}
         * @param replaceKeyWith the value to be set.
         * @return {@code this}
         */
        public Builder replaceKeyWith(java.lang.String replaceKeyWith) {
            this.replaceKeyWith = replaceKeyWith;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecWebsiteRoutingRulesRedirect}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecWebsiteRoutingRulesRedirect build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecWebsiteRoutingRulesRedirect}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecWebsiteRoutingRulesRedirect {
        private final java.lang.String hostName;
        private final java.lang.String httpRedirectCode;
        private final java.lang.String protocol;
        private final java.lang.String replaceKeyPrefixWith;
        private final java.lang.String replaceKeyWith;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.hostName = software.amazon.jsii.Kernel.get(this, "hostName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.httpRedirectCode = software.amazon.jsii.Kernel.get(this, "httpRedirectCode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.protocol = software.amazon.jsii.Kernel.get(this, "protocol", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.replaceKeyPrefixWith = software.amazon.jsii.Kernel.get(this, "replaceKeyPrefixWith", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.replaceKeyWith = software.amazon.jsii.Kernel.get(this, "replaceKeyWith", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.hostName = builder.hostName;
            this.httpRedirectCode = builder.httpRedirectCode;
            this.protocol = builder.protocol;
            this.replaceKeyPrefixWith = builder.replaceKeyPrefixWith;
            this.replaceKeyWith = builder.replaceKeyWith;
        }

        @Override
        public final java.lang.String getHostName() {
            return this.hostName;
        }

        @Override
        public final java.lang.String getHttpRedirectCode() {
            return this.httpRedirectCode;
        }

        @Override
        public final java.lang.String getProtocol() {
            return this.protocol;
        }

        @Override
        public final java.lang.String getReplaceKeyPrefixWith() {
            return this.replaceKeyPrefixWith;
        }

        @Override
        public final java.lang.String getReplaceKeyWith() {
            return this.replaceKeyWith;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getHostName() != null) {
                data.set("hostName", om.valueToTree(this.getHostName()));
            }
            if (this.getHttpRedirectCode() != null) {
                data.set("httpRedirectCode", om.valueToTree(this.getHttpRedirectCode()));
            }
            if (this.getProtocol() != null) {
                data.set("protocol", om.valueToTree(this.getProtocol()));
            }
            if (this.getReplaceKeyPrefixWith() != null) {
                data.set("replaceKeyPrefixWith", om.valueToTree(this.getReplaceKeyPrefixWith()));
            }
            if (this.getReplaceKeyWith() != null) {
                data.set("replaceKeyWith", om.valueToTree(this.getReplaceKeyWith()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecWebsiteRoutingRulesRedirect"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecWebsiteRoutingRulesRedirect.Jsii$Proxy that = (BucketSpecWebsiteRoutingRulesRedirect.Jsii$Proxy) o;

            if (this.hostName != null ? !this.hostName.equals(that.hostName) : that.hostName != null) return false;
            if (this.httpRedirectCode != null ? !this.httpRedirectCode.equals(that.httpRedirectCode) : that.httpRedirectCode != null) return false;
            if (this.protocol != null ? !this.protocol.equals(that.protocol) : that.protocol != null) return false;
            if (this.replaceKeyPrefixWith != null ? !this.replaceKeyPrefixWith.equals(that.replaceKeyPrefixWith) : that.replaceKeyPrefixWith != null) return false;
            return this.replaceKeyWith != null ? this.replaceKeyWith.equals(that.replaceKeyWith) : that.replaceKeyWith == null;
        }

        @Override
        public final int hashCode() {
            int result = this.hostName != null ? this.hostName.hashCode() : 0;
            result = 31 * result + (this.httpRedirectCode != null ? this.httpRedirectCode.hashCode() : 0);
            result = 31 * result + (this.protocol != null ? this.protocol.hashCode() : 0);
            result = 31 * result + (this.replaceKeyPrefixWith != null ? this.replaceKeyPrefixWith.hashCode() : 0);
            result = 31 * result + (this.replaceKeyWith != null ? this.replaceKeyWith.hashCode() : 0);
            return result;
        }
    }
}
