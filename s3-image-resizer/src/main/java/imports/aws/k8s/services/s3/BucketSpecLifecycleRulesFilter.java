package imports.aws.k8s.services.s3;

/**
 * The Filter is used to identify objects that a Lifecycle Rule applies to.
 * <p>
 * A Filter must have exactly one of Prefix, Tag, or And specified.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.401Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecLifecycleRulesFilter")
@software.amazon.jsii.Jsii.Proxy(BucketSpecLifecycleRulesFilter.Jsii$Proxy.class)
public interface BucketSpecLifecycleRulesFilter extends software.amazon.jsii.JsiiSerializable {

    /**
     * This is used in a Lifecycle Rule Filter to apply a logical AND to two or more predicates.
     * <p>
     * The Lifecycle Rule will apply to any object matching all of the predicates configured inside the And operator.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecLifecycleRulesFilterAnd getAnd() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPrefix() {
        return null;
    }

    /**
     * A container of a key value name pair.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecLifecycleRulesFilterTag getTag() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecLifecycleRulesFilter}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecLifecycleRulesFilter}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecLifecycleRulesFilter> {
        imports.aws.k8s.services.s3.BucketSpecLifecycleRulesFilterAnd and;
        java.lang.String prefix;
        imports.aws.k8s.services.s3.BucketSpecLifecycleRulesFilterTag tag;

        /**
         * Sets the value of {@link BucketSpecLifecycleRulesFilter#getAnd}
         * @param and This is used in a Lifecycle Rule Filter to apply a logical AND to two or more predicates.
         *            The Lifecycle Rule will apply to any object matching all of the predicates configured inside the And operator.
         * @return {@code this}
         */
        public Builder and(imports.aws.k8s.services.s3.BucketSpecLifecycleRulesFilterAnd and) {
            this.and = and;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecLifecycleRulesFilter#getPrefix}
         * @param prefix the value to be set.
         * @return {@code this}
         */
        public Builder prefix(java.lang.String prefix) {
            this.prefix = prefix;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecLifecycleRulesFilter#getTag}
         * @param tag A container of a key value name pair.
         * @return {@code this}
         */
        public Builder tag(imports.aws.k8s.services.s3.BucketSpecLifecycleRulesFilterTag tag) {
            this.tag = tag;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecLifecycleRulesFilter}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecLifecycleRulesFilter build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecLifecycleRulesFilter}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecLifecycleRulesFilter {
        private final imports.aws.k8s.services.s3.BucketSpecLifecycleRulesFilterAnd and;
        private final java.lang.String prefix;
        private final imports.aws.k8s.services.s3.BucketSpecLifecycleRulesFilterTag tag;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.and = software.amazon.jsii.Kernel.get(this, "and", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecLifecycleRulesFilterAnd.class));
            this.prefix = software.amazon.jsii.Kernel.get(this, "prefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tag = software.amazon.jsii.Kernel.get(this, "tag", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecLifecycleRulesFilterTag.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.and = builder.and;
            this.prefix = builder.prefix;
            this.tag = builder.tag;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecLifecycleRulesFilterAnd getAnd() {
            return this.and;
        }

        @Override
        public final java.lang.String getPrefix() {
            return this.prefix;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecLifecycleRulesFilterTag getTag() {
            return this.tag;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAnd() != null) {
                data.set("and", om.valueToTree(this.getAnd()));
            }
            if (this.getPrefix() != null) {
                data.set("prefix", om.valueToTree(this.getPrefix()));
            }
            if (this.getTag() != null) {
                data.set("tag", om.valueToTree(this.getTag()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecLifecycleRulesFilter"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecLifecycleRulesFilter.Jsii$Proxy that = (BucketSpecLifecycleRulesFilter.Jsii$Proxy) o;

            if (this.and != null ? !this.and.equals(that.and) : that.and != null) return false;
            if (this.prefix != null ? !this.prefix.equals(that.prefix) : that.prefix != null) return false;
            return this.tag != null ? this.tag.equals(that.tag) : that.tag == null;
        }

        @Override
        public final int hashCode() {
            int result = this.and != null ? this.and.hashCode() : 0;
            result = 31 * result + (this.prefix != null ? this.prefix.hashCode() : 0);
            result = 31 * result + (this.tag != null ? this.tag.hashCode() : 0);
            return result;
        }
    }
}
