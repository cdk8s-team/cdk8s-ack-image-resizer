package imports.aws.k8s.services.s3;

/**
 * A filter that identifies the subset of objects to which the replication rule applies.
 * <p>
 * A Filter must specify exactly one Prefix, Tag, or an And child element.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.410Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecReplicationRulesFilter")
@software.amazon.jsii.Jsii.Proxy(BucketSpecReplicationRulesFilter.Jsii$Proxy.class)
public interface BucketSpecReplicationRulesFilter extends software.amazon.jsii.JsiiSerializable {

    /**
     * A container for specifying rule filters.
     * <p>
     * The filters determine the subset of objects to which the rule applies. This element is required only if you specify more than one filter.
     * For example:
     * <p>
     * <ul>
     * <li>If you specify both a Prefix and a Tag filter, wrap these filters in    an And tag.</li>
     * <li>If you specify a filter based on multiple tags, wrap the Tag elements    in an And tag.</li>
     * </ul>
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecReplicationRulesFilterAnd getAnd() {
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
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecReplicationRulesFilterTag getTag() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecReplicationRulesFilter}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecReplicationRulesFilter}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecReplicationRulesFilter> {
        imports.aws.k8s.services.s3.BucketSpecReplicationRulesFilterAnd and;
        java.lang.String prefix;
        imports.aws.k8s.services.s3.BucketSpecReplicationRulesFilterTag tag;

        /**
         * Sets the value of {@link BucketSpecReplicationRulesFilter#getAnd}
         * @param and A container for specifying rule filters.
         *            The filters determine the subset of objects to which the rule applies. This element is required only if you specify more than one filter.
         *            For example:
         *            <p>
         *            <ul>
         *            <li>If you specify both a Prefix and a Tag filter, wrap these filters in    an And tag.</li>
         *            <li>If you specify a filter based on multiple tags, wrap the Tag elements    in an And tag.</li>
         *            </ul>
         * @return {@code this}
         */
        public Builder and(imports.aws.k8s.services.s3.BucketSpecReplicationRulesFilterAnd and) {
            this.and = and;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecReplicationRulesFilter#getPrefix}
         * @param prefix the value to be set.
         * @return {@code this}
         */
        public Builder prefix(java.lang.String prefix) {
            this.prefix = prefix;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecReplicationRulesFilter#getTag}
         * @param tag A container of a key value name pair.
         * @return {@code this}
         */
        public Builder tag(imports.aws.k8s.services.s3.BucketSpecReplicationRulesFilterTag tag) {
            this.tag = tag;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecReplicationRulesFilter}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecReplicationRulesFilter build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecReplicationRulesFilter}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecReplicationRulesFilter {
        private final imports.aws.k8s.services.s3.BucketSpecReplicationRulesFilterAnd and;
        private final java.lang.String prefix;
        private final imports.aws.k8s.services.s3.BucketSpecReplicationRulesFilterTag tag;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.and = software.amazon.jsii.Kernel.get(this, "and", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecReplicationRulesFilterAnd.class));
            this.prefix = software.amazon.jsii.Kernel.get(this, "prefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tag = software.amazon.jsii.Kernel.get(this, "tag", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecReplicationRulesFilterTag.class));
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
        public final imports.aws.k8s.services.s3.BucketSpecReplicationRulesFilterAnd getAnd() {
            return this.and;
        }

        @Override
        public final java.lang.String getPrefix() {
            return this.prefix;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecReplicationRulesFilterTag getTag() {
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
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecReplicationRulesFilter"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecReplicationRulesFilter.Jsii$Proxy that = (BucketSpecReplicationRulesFilter.Jsii$Proxy) o;

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
