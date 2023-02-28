package imports.aws.k8s.services.s3;

/**
 * The error information.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.414Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecWebsiteErrorDocument")
@software.amazon.jsii.Jsii.Proxy(BucketSpecWebsiteErrorDocument.Jsii$Proxy.class)
public interface BucketSpecWebsiteErrorDocument extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getKey() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecWebsiteErrorDocument}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecWebsiteErrorDocument}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecWebsiteErrorDocument> {
        java.lang.String key;

        /**
         * Sets the value of {@link BucketSpecWebsiteErrorDocument#getKey}
         * @param key the value to be set.
         * @return {@code this}
         */
        public Builder key(java.lang.String key) {
            this.key = key;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecWebsiteErrorDocument}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecWebsiteErrorDocument build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecWebsiteErrorDocument}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecWebsiteErrorDocument {
        private final java.lang.String key;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.key = software.amazon.jsii.Kernel.get(this, "key", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.key = builder.key;
        }

        @Override
        public final java.lang.String getKey() {
            return this.key;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getKey() != null) {
                data.set("key", om.valueToTree(this.getKey()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecWebsiteErrorDocument"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecWebsiteErrorDocument.Jsii$Proxy that = (BucketSpecWebsiteErrorDocument.Jsii$Proxy) o;

            return this.key != null ? this.key.equals(that.key) : that.key == null;
        }

        @Override
        public final int hashCode() {
            int result = this.key != null ? this.key.hashCode() : 0;
            return result;
        }
    }
}
