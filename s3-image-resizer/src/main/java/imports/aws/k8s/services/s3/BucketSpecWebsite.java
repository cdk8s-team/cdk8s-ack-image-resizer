package imports.aws.k8s.services.s3;

/**
 * Container for the request.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.414Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecWebsite")
@software.amazon.jsii.Jsii.Proxy(BucketSpecWebsite.Jsii$Proxy.class)
public interface BucketSpecWebsite extends software.amazon.jsii.JsiiSerializable {

    /**
     * The error information.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecWebsiteErrorDocument getErrorDocument() {
        return null;
    }

    /**
     * Container for the Suffix element.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecWebsiteIndexDocument getIndexDocument() {
        return null;
    }

    /**
     * Specifies the redirect behavior of all requests to a website endpoint of an Amazon S3 bucket.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecWebsiteRedirectAllRequestsTo getRedirectAllRequestsTo() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.k8s.services.s3.BucketSpecWebsiteRoutingRules> getRoutingRules() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecWebsite}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecWebsite}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecWebsite> {
        imports.aws.k8s.services.s3.BucketSpecWebsiteErrorDocument errorDocument;
        imports.aws.k8s.services.s3.BucketSpecWebsiteIndexDocument indexDocument;
        imports.aws.k8s.services.s3.BucketSpecWebsiteRedirectAllRequestsTo redirectAllRequestsTo;
        java.util.List<imports.aws.k8s.services.s3.BucketSpecWebsiteRoutingRules> routingRules;

        /**
         * Sets the value of {@link BucketSpecWebsite#getErrorDocument}
         * @param errorDocument The error information.
         * @return {@code this}
         */
        public Builder errorDocument(imports.aws.k8s.services.s3.BucketSpecWebsiteErrorDocument errorDocument) {
            this.errorDocument = errorDocument;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecWebsite#getIndexDocument}
         * @param indexDocument Container for the Suffix element.
         * @return {@code this}
         */
        public Builder indexDocument(imports.aws.k8s.services.s3.BucketSpecWebsiteIndexDocument indexDocument) {
            this.indexDocument = indexDocument;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecWebsite#getRedirectAllRequestsTo}
         * @param redirectAllRequestsTo Specifies the redirect behavior of all requests to a website endpoint of an Amazon S3 bucket.
         * @return {@code this}
         */
        public Builder redirectAllRequestsTo(imports.aws.k8s.services.s3.BucketSpecWebsiteRedirectAllRequestsTo redirectAllRequestsTo) {
            this.redirectAllRequestsTo = redirectAllRequestsTo;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecWebsite#getRoutingRules}
         * @param routingRules the value to be set.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder routingRules(java.util.List<? extends imports.aws.k8s.services.s3.BucketSpecWebsiteRoutingRules> routingRules) {
            this.routingRules = (java.util.List<imports.aws.k8s.services.s3.BucketSpecWebsiteRoutingRules>)routingRules;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecWebsite}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecWebsite build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecWebsite}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecWebsite {
        private final imports.aws.k8s.services.s3.BucketSpecWebsiteErrorDocument errorDocument;
        private final imports.aws.k8s.services.s3.BucketSpecWebsiteIndexDocument indexDocument;
        private final imports.aws.k8s.services.s3.BucketSpecWebsiteRedirectAllRequestsTo redirectAllRequestsTo;
        private final java.util.List<imports.aws.k8s.services.s3.BucketSpecWebsiteRoutingRules> routingRules;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.errorDocument = software.amazon.jsii.Kernel.get(this, "errorDocument", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecWebsiteErrorDocument.class));
            this.indexDocument = software.amazon.jsii.Kernel.get(this, "indexDocument", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecWebsiteIndexDocument.class));
            this.redirectAllRequestsTo = software.amazon.jsii.Kernel.get(this, "redirectAllRequestsTo", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecWebsiteRedirectAllRequestsTo.class));
            this.routingRules = software.amazon.jsii.Kernel.get(this, "routingRules", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecWebsiteRoutingRules.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.errorDocument = builder.errorDocument;
            this.indexDocument = builder.indexDocument;
            this.redirectAllRequestsTo = builder.redirectAllRequestsTo;
            this.routingRules = (java.util.List<imports.aws.k8s.services.s3.BucketSpecWebsiteRoutingRules>)builder.routingRules;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecWebsiteErrorDocument getErrorDocument() {
            return this.errorDocument;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecWebsiteIndexDocument getIndexDocument() {
            return this.indexDocument;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecWebsiteRedirectAllRequestsTo getRedirectAllRequestsTo() {
            return this.redirectAllRequestsTo;
        }

        @Override
        public final java.util.List<imports.aws.k8s.services.s3.BucketSpecWebsiteRoutingRules> getRoutingRules() {
            return this.routingRules;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getErrorDocument() != null) {
                data.set("errorDocument", om.valueToTree(this.getErrorDocument()));
            }
            if (this.getIndexDocument() != null) {
                data.set("indexDocument", om.valueToTree(this.getIndexDocument()));
            }
            if (this.getRedirectAllRequestsTo() != null) {
                data.set("redirectAllRequestsTo", om.valueToTree(this.getRedirectAllRequestsTo()));
            }
            if (this.getRoutingRules() != null) {
                data.set("routingRules", om.valueToTree(this.getRoutingRules()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecWebsite"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecWebsite.Jsii$Proxy that = (BucketSpecWebsite.Jsii$Proxy) o;

            if (this.errorDocument != null ? !this.errorDocument.equals(that.errorDocument) : that.errorDocument != null) return false;
            if (this.indexDocument != null ? !this.indexDocument.equals(that.indexDocument) : that.indexDocument != null) return false;
            if (this.redirectAllRequestsTo != null ? !this.redirectAllRequestsTo.equals(that.redirectAllRequestsTo) : that.redirectAllRequestsTo != null) return false;
            return this.routingRules != null ? this.routingRules.equals(that.routingRules) : that.routingRules == null;
        }

        @Override
        public final int hashCode() {
            int result = this.errorDocument != null ? this.errorDocument.hashCode() : 0;
            result = 31 * result + (this.indexDocument != null ? this.indexDocument.hashCode() : 0);
            result = 31 * result + (this.redirectAllRequestsTo != null ? this.redirectAllRequestsTo.hashCode() : 0);
            result = 31 * result + (this.routingRules != null ? this.routingRules.hashCode() : 0);
            return result;
        }
    }
}
