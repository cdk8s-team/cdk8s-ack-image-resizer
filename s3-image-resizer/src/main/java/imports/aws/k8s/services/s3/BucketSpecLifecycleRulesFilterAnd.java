package imports.aws.k8s.services.s3;

/**
 * This is used in a Lifecycle Rule Filter to apply a logical AND to two or more predicates.
 * <p>
 * The Lifecycle Rule will apply to any object matching all of the predicates configured inside the And operator.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.401Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecLifecycleRulesFilterAnd")
@software.amazon.jsii.Jsii.Proxy(BucketSpecLifecycleRulesFilterAnd.Jsii$Proxy.class)
public interface BucketSpecLifecycleRulesFilterAnd extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPrefix() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.k8s.services.s3.BucketSpecLifecycleRulesFilterAndTags> getTags() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecLifecycleRulesFilterAnd}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecLifecycleRulesFilterAnd}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecLifecycleRulesFilterAnd> {
        java.lang.String prefix;
        java.util.List<imports.aws.k8s.services.s3.BucketSpecLifecycleRulesFilterAndTags> tags;

        /**
         * Sets the value of {@link BucketSpecLifecycleRulesFilterAnd#getPrefix}
         * @param prefix the value to be set.
         * @return {@code this}
         */
        public Builder prefix(java.lang.String prefix) {
            this.prefix = prefix;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecLifecycleRulesFilterAnd#getTags}
         * @param tags the value to be set.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder tags(java.util.List<? extends imports.aws.k8s.services.s3.BucketSpecLifecycleRulesFilterAndTags> tags) {
            this.tags = (java.util.List<imports.aws.k8s.services.s3.BucketSpecLifecycleRulesFilterAndTags>)tags;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecLifecycleRulesFilterAnd}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecLifecycleRulesFilterAnd build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecLifecycleRulesFilterAnd}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecLifecycleRulesFilterAnd {
        private final java.lang.String prefix;
        private final java.util.List<imports.aws.k8s.services.s3.BucketSpecLifecycleRulesFilterAndTags> tags;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.prefix = software.amazon.jsii.Kernel.get(this, "prefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecLifecycleRulesFilterAndTags.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.prefix = builder.prefix;
            this.tags = (java.util.List<imports.aws.k8s.services.s3.BucketSpecLifecycleRulesFilterAndTags>)builder.tags;
        }

        @Override
        public final java.lang.String getPrefix() {
            return this.prefix;
        }

        @Override
        public final java.util.List<imports.aws.k8s.services.s3.BucketSpecLifecycleRulesFilterAndTags> getTags() {
            return this.tags;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getPrefix() != null) {
                data.set("prefix", om.valueToTree(this.getPrefix()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecLifecycleRulesFilterAnd"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecLifecycleRulesFilterAnd.Jsii$Proxy that = (BucketSpecLifecycleRulesFilterAnd.Jsii$Proxy) o;

            if (this.prefix != null ? !this.prefix.equals(that.prefix) : that.prefix != null) return false;
            return this.tags != null ? this.tags.equals(that.tags) : that.tags == null;
        }

        @Override
        public final int hashCode() {
            int result = this.prefix != null ? this.prefix.hashCode() : 0;
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            return result;
        }
    }
}
