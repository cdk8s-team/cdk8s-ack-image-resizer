package imports.aws.k8s.services.s3;

/**
 * The container element for an ownership control rule.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.407Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecOwnershipControlsRules")
@software.amazon.jsii.Jsii.Proxy(BucketSpecOwnershipControlsRules.Jsii$Proxy.class)
public interface BucketSpecOwnershipControlsRules extends software.amazon.jsii.JsiiSerializable {

    /**
     * The container element for object ownership for a bucket's ownership controls.
     * <p>
     * BucketOwnerPreferred - Objects uploaded to the bucket change ownership to the bucket owner if the objects are uploaded with the bucket-owner-full-control canned ACL.
     * ObjectWriter - The uploading account will own the object if the object is uploaded with the bucket-owner-full-control canned ACL.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getObjectOwnership() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecOwnershipControlsRules}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecOwnershipControlsRules}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecOwnershipControlsRules> {
        java.lang.String objectOwnership;

        /**
         * Sets the value of {@link BucketSpecOwnershipControlsRules#getObjectOwnership}
         * @param objectOwnership The container element for object ownership for a bucket's ownership controls.
         *                        BucketOwnerPreferred - Objects uploaded to the bucket change ownership to the bucket owner if the objects are uploaded with the bucket-owner-full-control canned ACL.
         *                        ObjectWriter - The uploading account will own the object if the object is uploaded with the bucket-owner-full-control canned ACL.
         * @return {@code this}
         */
        public Builder objectOwnership(java.lang.String objectOwnership) {
            this.objectOwnership = objectOwnership;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecOwnershipControlsRules}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecOwnershipControlsRules build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecOwnershipControlsRules}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecOwnershipControlsRules {
        private final java.lang.String objectOwnership;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.objectOwnership = software.amazon.jsii.Kernel.get(this, "objectOwnership", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.objectOwnership = builder.objectOwnership;
        }

        @Override
        public final java.lang.String getObjectOwnership() {
            return this.objectOwnership;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getObjectOwnership() != null) {
                data.set("objectOwnership", om.valueToTree(this.getObjectOwnership()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecOwnershipControlsRules"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecOwnershipControlsRules.Jsii$Proxy that = (BucketSpecOwnershipControlsRules.Jsii$Proxy) o;

            return this.objectOwnership != null ? this.objectOwnership.equals(that.objectOwnership) : that.objectOwnership == null;
        }

        @Override
        public final int hashCode() {
            int result = this.objectOwnership != null ? this.objectOwnership.hashCode() : 0;
            return result;
        }
    }
}
