package imports.aws.k8s.services.s3;

/**
 * Container for the Suffix element.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.414Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecWebsiteIndexDocument")
@software.amazon.jsii.Jsii.Proxy(BucketSpecWebsiteIndexDocument.Jsii$Proxy.class)
public interface BucketSpecWebsiteIndexDocument extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSuffix() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecWebsiteIndexDocument}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecWebsiteIndexDocument}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecWebsiteIndexDocument> {
        java.lang.String suffix;

        /**
         * Sets the value of {@link BucketSpecWebsiteIndexDocument#getSuffix}
         * @param suffix the value to be set.
         * @return {@code this}
         */
        public Builder suffix(java.lang.String suffix) {
            this.suffix = suffix;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecWebsiteIndexDocument}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecWebsiteIndexDocument build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecWebsiteIndexDocument}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecWebsiteIndexDocument {
        private final java.lang.String suffix;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.suffix = software.amazon.jsii.Kernel.get(this, "suffix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.suffix = builder.suffix;
        }

        @Override
        public final java.lang.String getSuffix() {
            return this.suffix;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getSuffix() != null) {
                data.set("suffix", om.valueToTree(this.getSuffix()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecWebsiteIndexDocument"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecWebsiteIndexDocument.Jsii$Proxy that = (BucketSpecWebsiteIndexDocument.Jsii$Proxy) o;

            return this.suffix != null ? this.suffix.equals(that.suffix) : that.suffix == null;
        }

        @Override
        public final int hashCode() {
            int result = this.suffix != null ? this.suffix.hashCode() : 0;
            return result;
        }
    }
}
