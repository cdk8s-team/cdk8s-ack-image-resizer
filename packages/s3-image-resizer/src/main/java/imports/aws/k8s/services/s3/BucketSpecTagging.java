package imports.aws.k8s.services.s3;

/**
 * Container for the TagSet and Tag elements.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.413Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecTagging")
@software.amazon.jsii.Jsii.Proxy(BucketSpecTagging.Jsii$Proxy.class)
public interface BucketSpecTagging extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.k8s.services.s3.BucketSpecTaggingTagSet> getTagSet() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecTagging}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecTagging}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecTagging> {
        java.util.List<imports.aws.k8s.services.s3.BucketSpecTaggingTagSet> tagSet;

        /**
         * Sets the value of {@link BucketSpecTagging#getTagSet}
         * @param tagSet the value to be set.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder tagSet(java.util.List<? extends imports.aws.k8s.services.s3.BucketSpecTaggingTagSet> tagSet) {
            this.tagSet = (java.util.List<imports.aws.k8s.services.s3.BucketSpecTaggingTagSet>)tagSet;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecTagging}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecTagging build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecTagging}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecTagging {
        private final java.util.List<imports.aws.k8s.services.s3.BucketSpecTaggingTagSet> tagSet;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.tagSet = software.amazon.jsii.Kernel.get(this, "tagSet", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecTaggingTagSet.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.tagSet = (java.util.List<imports.aws.k8s.services.s3.BucketSpecTaggingTagSet>)builder.tagSet;
        }

        @Override
        public final java.util.List<imports.aws.k8s.services.s3.BucketSpecTaggingTagSet> getTagSet() {
            return this.tagSet;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getTagSet() != null) {
                data.set("tagSet", om.valueToTree(this.getTagSet()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecTagging"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecTagging.Jsii$Proxy that = (BucketSpecTagging.Jsii$Proxy) o;

            return this.tagSet != null ? this.tagSet.equals(that.tagSet) : that.tagSet == null;
        }

        @Override
        public final int hashCode() {
            int result = this.tagSet != null ? this.tagSet.hashCode() : 0;
            return result;
        }
    }
}
