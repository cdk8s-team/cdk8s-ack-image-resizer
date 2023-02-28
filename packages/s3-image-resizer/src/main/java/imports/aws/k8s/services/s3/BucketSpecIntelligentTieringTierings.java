package imports.aws.k8s.services.s3;

/**
 * The S3 Intelligent-Tiering storage class is designed to optimize storage costs by automatically moving data to the most cost-effective storage access tier, without additional operational overhead.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.398Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecIntelligentTieringTierings")
@software.amazon.jsii.Jsii.Proxy(BucketSpecIntelligentTieringTierings.Jsii$Proxy.class)
public interface BucketSpecIntelligentTieringTierings extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAccessTier() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getDays() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecIntelligentTieringTierings}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecIntelligentTieringTierings}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecIntelligentTieringTierings> {
        java.lang.String accessTier;
        java.lang.Number days;

        /**
         * Sets the value of {@link BucketSpecIntelligentTieringTierings#getAccessTier}
         * @param accessTier the value to be set.
         * @return {@code this}
         */
        public Builder accessTier(java.lang.String accessTier) {
            this.accessTier = accessTier;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecIntelligentTieringTierings#getDays}
         * @param days the value to be set.
         * @return {@code this}
         */
        public Builder days(java.lang.Number days) {
            this.days = days;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecIntelligentTieringTierings}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecIntelligentTieringTierings build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecIntelligentTieringTierings}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecIntelligentTieringTierings {
        private final java.lang.String accessTier;
        private final java.lang.Number days;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.accessTier = software.amazon.jsii.Kernel.get(this, "accessTier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.days = software.amazon.jsii.Kernel.get(this, "days", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.accessTier = builder.accessTier;
            this.days = builder.days;
        }

        @Override
        public final java.lang.String getAccessTier() {
            return this.accessTier;
        }

        @Override
        public final java.lang.Number getDays() {
            return this.days;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAccessTier() != null) {
                data.set("accessTier", om.valueToTree(this.getAccessTier()));
            }
            if (this.getDays() != null) {
                data.set("days", om.valueToTree(this.getDays()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecIntelligentTieringTierings"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecIntelligentTieringTierings.Jsii$Proxy that = (BucketSpecIntelligentTieringTierings.Jsii$Proxy) o;

            if (this.accessTier != null ? !this.accessTier.equals(that.accessTier) : that.accessTier != null) return false;
            return this.days != null ? this.days.equals(that.days) : that.days == null;
        }

        @Override
        public final int hashCode() {
            int result = this.accessTier != null ? this.accessTier.hashCode() : 0;
            result = 31 * result + (this.days != null ? this.days.hashCode() : 0);
            return result;
        }
    }
}
