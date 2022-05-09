package imports.aws.k8s.services.s3;

/**
 * Specifies the redirect behavior of all requests to a website endpoint of an Amazon S3 bucket.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.414Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecWebsiteRedirectAllRequestsTo")
@software.amazon.jsii.Jsii.Proxy(BucketSpecWebsiteRedirectAllRequestsTo.Jsii$Proxy.class)
public interface BucketSpecWebsiteRedirectAllRequestsTo extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getHostName() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getProtocol() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecWebsiteRedirectAllRequestsTo}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecWebsiteRedirectAllRequestsTo}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecWebsiteRedirectAllRequestsTo> {
        java.lang.String hostName;
        java.lang.String protocol;

        /**
         * Sets the value of {@link BucketSpecWebsiteRedirectAllRequestsTo#getHostName}
         * @param hostName the value to be set.
         * @return {@code this}
         */
        public Builder hostName(java.lang.String hostName) {
            this.hostName = hostName;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecWebsiteRedirectAllRequestsTo#getProtocol}
         * @param protocol the value to be set.
         * @return {@code this}
         */
        public Builder protocol(java.lang.String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecWebsiteRedirectAllRequestsTo}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecWebsiteRedirectAllRequestsTo build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecWebsiteRedirectAllRequestsTo}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecWebsiteRedirectAllRequestsTo {
        private final java.lang.String hostName;
        private final java.lang.String protocol;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.hostName = software.amazon.jsii.Kernel.get(this, "hostName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.protocol = software.amazon.jsii.Kernel.get(this, "protocol", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.hostName = builder.hostName;
            this.protocol = builder.protocol;
        }

        @Override
        public final java.lang.String getHostName() {
            return this.hostName;
        }

        @Override
        public final java.lang.String getProtocol() {
            return this.protocol;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getHostName() != null) {
                data.set("hostName", om.valueToTree(this.getHostName()));
            }
            if (this.getProtocol() != null) {
                data.set("protocol", om.valueToTree(this.getProtocol()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecWebsiteRedirectAllRequestsTo"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecWebsiteRedirectAllRequestsTo.Jsii$Proxy that = (BucketSpecWebsiteRedirectAllRequestsTo.Jsii$Proxy) o;

            if (this.hostName != null ? !this.hostName.equals(that.hostName) : that.hostName != null) return false;
            return this.protocol != null ? this.protocol.equals(that.protocol) : that.protocol == null;
        }

        @Override
        public final int hashCode() {
            int result = this.hostName != null ? this.hostName.hashCode() : 0;
            result = 31 * result + (this.protocol != null ? this.protocol.hashCode() : 0);
            return result;
        }
    }
}
