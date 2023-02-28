package imports.aws.k8s.services.s3;

/**
 * Specifies a cross-origin access rule for an Amazon S3 bucket.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.395Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecCorsCorsRules")
@software.amazon.jsii.Jsii.Proxy(BucketSpecCorsCorsRules.Jsii$Proxy.class)
public interface BucketSpecCorsCorsRules extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAllowedHeaders() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAllowedMethods() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAllowedOrigins() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getExposeHeaders() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMaxAgeSeconds() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecCorsCorsRules}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecCorsCorsRules}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecCorsCorsRules> {
        java.util.List<java.lang.String> allowedHeaders;
        java.util.List<java.lang.String> allowedMethods;
        java.util.List<java.lang.String> allowedOrigins;
        java.util.List<java.lang.String> exposeHeaders;
        java.lang.String id;
        java.lang.Number maxAgeSeconds;

        /**
         * Sets the value of {@link BucketSpecCorsCorsRules#getAllowedHeaders}
         * @param allowedHeaders the value to be set.
         * @return {@code this}
         */
        public Builder allowedHeaders(java.util.List<java.lang.String> allowedHeaders) {
            this.allowedHeaders = allowedHeaders;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecCorsCorsRules#getAllowedMethods}
         * @param allowedMethods the value to be set.
         * @return {@code this}
         */
        public Builder allowedMethods(java.util.List<java.lang.String> allowedMethods) {
            this.allowedMethods = allowedMethods;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecCorsCorsRules#getAllowedOrigins}
         * @param allowedOrigins the value to be set.
         * @return {@code this}
         */
        public Builder allowedOrigins(java.util.List<java.lang.String> allowedOrigins) {
            this.allowedOrigins = allowedOrigins;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecCorsCorsRules#getExposeHeaders}
         * @param exposeHeaders the value to be set.
         * @return {@code this}
         */
        public Builder exposeHeaders(java.util.List<java.lang.String> exposeHeaders) {
            this.exposeHeaders = exposeHeaders;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecCorsCorsRules#getId}
         * @param id the value to be set.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecCorsCorsRules#getMaxAgeSeconds}
         * @param maxAgeSeconds the value to be set.
         * @return {@code this}
         */
        public Builder maxAgeSeconds(java.lang.Number maxAgeSeconds) {
            this.maxAgeSeconds = maxAgeSeconds;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecCorsCorsRules}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecCorsCorsRules build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecCorsCorsRules}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecCorsCorsRules {
        private final java.util.List<java.lang.String> allowedHeaders;
        private final java.util.List<java.lang.String> allowedMethods;
        private final java.util.List<java.lang.String> allowedOrigins;
        private final java.util.List<java.lang.String> exposeHeaders;
        private final java.lang.String id;
        private final java.lang.Number maxAgeSeconds;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.allowedHeaders = software.amazon.jsii.Kernel.get(this, "allowedHeaders", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.allowedMethods = software.amazon.jsii.Kernel.get(this, "allowedMethods", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.allowedOrigins = software.amazon.jsii.Kernel.get(this, "allowedOrigins", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.exposeHeaders = software.amazon.jsii.Kernel.get(this, "exposeHeaders", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.maxAgeSeconds = software.amazon.jsii.Kernel.get(this, "maxAgeSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.allowedHeaders = builder.allowedHeaders;
            this.allowedMethods = builder.allowedMethods;
            this.allowedOrigins = builder.allowedOrigins;
            this.exposeHeaders = builder.exposeHeaders;
            this.id = builder.id;
            this.maxAgeSeconds = builder.maxAgeSeconds;
        }

        @Override
        public final java.util.List<java.lang.String> getAllowedHeaders() {
            return this.allowedHeaders;
        }

        @Override
        public final java.util.List<java.lang.String> getAllowedMethods() {
            return this.allowedMethods;
        }

        @Override
        public final java.util.List<java.lang.String> getAllowedOrigins() {
            return this.allowedOrigins;
        }

        @Override
        public final java.util.List<java.lang.String> getExposeHeaders() {
            return this.exposeHeaders;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final java.lang.Number getMaxAgeSeconds() {
            return this.maxAgeSeconds;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAllowedHeaders() != null) {
                data.set("allowedHeaders", om.valueToTree(this.getAllowedHeaders()));
            }
            if (this.getAllowedMethods() != null) {
                data.set("allowedMethods", om.valueToTree(this.getAllowedMethods()));
            }
            if (this.getAllowedOrigins() != null) {
                data.set("allowedOrigins", om.valueToTree(this.getAllowedOrigins()));
            }
            if (this.getExposeHeaders() != null) {
                data.set("exposeHeaders", om.valueToTree(this.getExposeHeaders()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getMaxAgeSeconds() != null) {
                data.set("maxAgeSeconds", om.valueToTree(this.getMaxAgeSeconds()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecCorsCorsRules"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecCorsCorsRules.Jsii$Proxy that = (BucketSpecCorsCorsRules.Jsii$Proxy) o;

            if (this.allowedHeaders != null ? !this.allowedHeaders.equals(that.allowedHeaders) : that.allowedHeaders != null) return false;
            if (this.allowedMethods != null ? !this.allowedMethods.equals(that.allowedMethods) : that.allowedMethods != null) return false;
            if (this.allowedOrigins != null ? !this.allowedOrigins.equals(that.allowedOrigins) : that.allowedOrigins != null) return false;
            if (this.exposeHeaders != null ? !this.exposeHeaders.equals(that.exposeHeaders) : that.exposeHeaders != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            return this.maxAgeSeconds != null ? this.maxAgeSeconds.equals(that.maxAgeSeconds) : that.maxAgeSeconds == null;
        }

        @Override
        public final int hashCode() {
            int result = this.allowedHeaders != null ? this.allowedHeaders.hashCode() : 0;
            result = 31 * result + (this.allowedMethods != null ? this.allowedMethods.hashCode() : 0);
            result = 31 * result + (this.allowedOrigins != null ? this.allowedOrigins.hashCode() : 0);
            result = 31 * result + (this.exposeHeaders != null ? this.exposeHeaders.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.maxAgeSeconds != null ? this.maxAgeSeconds.hashCode() : 0);
            return result;
        }
    }
}
