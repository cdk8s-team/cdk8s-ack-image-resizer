package imports.aws.k8s.services.s3;

/**
 * A lifecycle rule for individual objects in an Amazon S3 bucket.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.400Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecLifecycleRules")
@software.amazon.jsii.Jsii.Proxy(BucketSpecLifecycleRules.Jsii$Proxy.class)
public interface BucketSpecLifecycleRules extends software.amazon.jsii.JsiiSerializable {

    /**
     * Specifies the days since the initiation of an incomplete multipart upload that Amazon S3 will wait before permanently removing all parts of the upload.
     * <p>
     * For more information, see Aborting Incomplete Multipart Uploads Using a Bucket Lifecycle Policy (https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html#mpu-abort-incomplete-mpu-lifecycle-config) in the Amazon S3 User Guide.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecLifecycleRulesAbortIncompleteMultipartUpload getAbortIncompleteMultipartUpload() {
        return null;
    }

    /**
     * Container for the expiration for the lifecycle of the object.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecLifecycleRulesExpiration getExpiration() {
        return null;
    }

    /**
     * The Filter is used to identify objects that a Lifecycle Rule applies to.
     * <p>
     * A Filter must have exactly one of Prefix, Tag, or And specified.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecLifecycleRulesFilter getFilter() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * Specifies when noncurrent object versions expire.
     * <p>
     * Upon expiration, Amazon S3 permanently deletes the noncurrent object versions. You set this lifecycle configuration action on a bucket that has versioning enabled (or suspended) to request that Amazon S3 delete noncurrent object versions at a specific period in the object's lifetime.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecLifecycleRulesNoncurrentVersionExpiration getNoncurrentVersionExpiration() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.k8s.services.s3.BucketSpecLifecycleRulesNoncurrentVersionTransitions> getNoncurrentVersionTransitions() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPrefix() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getStatus() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.k8s.services.s3.BucketSpecLifecycleRulesTransitions> getTransitions() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecLifecycleRules}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecLifecycleRules}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecLifecycleRules> {
        imports.aws.k8s.services.s3.BucketSpecLifecycleRulesAbortIncompleteMultipartUpload abortIncompleteMultipartUpload;
        imports.aws.k8s.services.s3.BucketSpecLifecycleRulesExpiration expiration;
        imports.aws.k8s.services.s3.BucketSpecLifecycleRulesFilter filter;
        java.lang.String id;
        imports.aws.k8s.services.s3.BucketSpecLifecycleRulesNoncurrentVersionExpiration noncurrentVersionExpiration;
        java.util.List<imports.aws.k8s.services.s3.BucketSpecLifecycleRulesNoncurrentVersionTransitions> noncurrentVersionTransitions;
        java.lang.String prefix;
        java.lang.String status;
        java.util.List<imports.aws.k8s.services.s3.BucketSpecLifecycleRulesTransitions> transitions;

        /**
         * Sets the value of {@link BucketSpecLifecycleRules#getAbortIncompleteMultipartUpload}
         * @param abortIncompleteMultipartUpload Specifies the days since the initiation of an incomplete multipart upload that Amazon S3 will wait before permanently removing all parts of the upload.
         *                                       For more information, see Aborting Incomplete Multipart Uploads Using a Bucket Lifecycle Policy (https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html#mpu-abort-incomplete-mpu-lifecycle-config) in the Amazon S3 User Guide.
         * @return {@code this}
         */
        public Builder abortIncompleteMultipartUpload(imports.aws.k8s.services.s3.BucketSpecLifecycleRulesAbortIncompleteMultipartUpload abortIncompleteMultipartUpload) {
            this.abortIncompleteMultipartUpload = abortIncompleteMultipartUpload;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecLifecycleRules#getExpiration}
         * @param expiration Container for the expiration for the lifecycle of the object.
         * @return {@code this}
         */
        public Builder expiration(imports.aws.k8s.services.s3.BucketSpecLifecycleRulesExpiration expiration) {
            this.expiration = expiration;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecLifecycleRules#getFilter}
         * @param filter The Filter is used to identify objects that a Lifecycle Rule applies to.
         *               A Filter must have exactly one of Prefix, Tag, or And specified.
         * @return {@code this}
         */
        public Builder filter(imports.aws.k8s.services.s3.BucketSpecLifecycleRulesFilter filter) {
            this.filter = filter;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecLifecycleRules#getId}
         * @param id the value to be set.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecLifecycleRules#getNoncurrentVersionExpiration}
         * @param noncurrentVersionExpiration Specifies when noncurrent object versions expire.
         *                                    Upon expiration, Amazon S3 permanently deletes the noncurrent object versions. You set this lifecycle configuration action on a bucket that has versioning enabled (or suspended) to request that Amazon S3 delete noncurrent object versions at a specific period in the object's lifetime.
         * @return {@code this}
         */
        public Builder noncurrentVersionExpiration(imports.aws.k8s.services.s3.BucketSpecLifecycleRulesNoncurrentVersionExpiration noncurrentVersionExpiration) {
            this.noncurrentVersionExpiration = noncurrentVersionExpiration;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecLifecycleRules#getNoncurrentVersionTransitions}
         * @param noncurrentVersionTransitions the value to be set.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder noncurrentVersionTransitions(java.util.List<? extends imports.aws.k8s.services.s3.BucketSpecLifecycleRulesNoncurrentVersionTransitions> noncurrentVersionTransitions) {
            this.noncurrentVersionTransitions = (java.util.List<imports.aws.k8s.services.s3.BucketSpecLifecycleRulesNoncurrentVersionTransitions>)noncurrentVersionTransitions;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecLifecycleRules#getPrefix}
         * @param prefix the value to be set.
         * @return {@code this}
         */
        public Builder prefix(java.lang.String prefix) {
            this.prefix = prefix;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecLifecycleRules#getStatus}
         * @param status the value to be set.
         * @return {@code this}
         */
        public Builder status(java.lang.String status) {
            this.status = status;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecLifecycleRules#getTransitions}
         * @param transitions the value to be set.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder transitions(java.util.List<? extends imports.aws.k8s.services.s3.BucketSpecLifecycleRulesTransitions> transitions) {
            this.transitions = (java.util.List<imports.aws.k8s.services.s3.BucketSpecLifecycleRulesTransitions>)transitions;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecLifecycleRules}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecLifecycleRules build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecLifecycleRules}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecLifecycleRules {
        private final imports.aws.k8s.services.s3.BucketSpecLifecycleRulesAbortIncompleteMultipartUpload abortIncompleteMultipartUpload;
        private final imports.aws.k8s.services.s3.BucketSpecLifecycleRulesExpiration expiration;
        private final imports.aws.k8s.services.s3.BucketSpecLifecycleRulesFilter filter;
        private final java.lang.String id;
        private final imports.aws.k8s.services.s3.BucketSpecLifecycleRulesNoncurrentVersionExpiration noncurrentVersionExpiration;
        private final java.util.List<imports.aws.k8s.services.s3.BucketSpecLifecycleRulesNoncurrentVersionTransitions> noncurrentVersionTransitions;
        private final java.lang.String prefix;
        private final java.lang.String status;
        private final java.util.List<imports.aws.k8s.services.s3.BucketSpecLifecycleRulesTransitions> transitions;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.abortIncompleteMultipartUpload = software.amazon.jsii.Kernel.get(this, "abortIncompleteMultipartUpload", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecLifecycleRulesAbortIncompleteMultipartUpload.class));
            this.expiration = software.amazon.jsii.Kernel.get(this, "expiration", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecLifecycleRulesExpiration.class));
            this.filter = software.amazon.jsii.Kernel.get(this, "filter", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecLifecycleRulesFilter.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.noncurrentVersionExpiration = software.amazon.jsii.Kernel.get(this, "noncurrentVersionExpiration", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecLifecycleRulesNoncurrentVersionExpiration.class));
            this.noncurrentVersionTransitions = software.amazon.jsii.Kernel.get(this, "noncurrentVersionTransitions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecLifecycleRulesNoncurrentVersionTransitions.class)));
            this.prefix = software.amazon.jsii.Kernel.get(this, "prefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.status = software.amazon.jsii.Kernel.get(this, "status", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.transitions = software.amazon.jsii.Kernel.get(this, "transitions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecLifecycleRulesTransitions.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.abortIncompleteMultipartUpload = builder.abortIncompleteMultipartUpload;
            this.expiration = builder.expiration;
            this.filter = builder.filter;
            this.id = builder.id;
            this.noncurrentVersionExpiration = builder.noncurrentVersionExpiration;
            this.noncurrentVersionTransitions = (java.util.List<imports.aws.k8s.services.s3.BucketSpecLifecycleRulesNoncurrentVersionTransitions>)builder.noncurrentVersionTransitions;
            this.prefix = builder.prefix;
            this.status = builder.status;
            this.transitions = (java.util.List<imports.aws.k8s.services.s3.BucketSpecLifecycleRulesTransitions>)builder.transitions;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecLifecycleRulesAbortIncompleteMultipartUpload getAbortIncompleteMultipartUpload() {
            return this.abortIncompleteMultipartUpload;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecLifecycleRulesExpiration getExpiration() {
            return this.expiration;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecLifecycleRulesFilter getFilter() {
            return this.filter;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecLifecycleRulesNoncurrentVersionExpiration getNoncurrentVersionExpiration() {
            return this.noncurrentVersionExpiration;
        }

        @Override
        public final java.util.List<imports.aws.k8s.services.s3.BucketSpecLifecycleRulesNoncurrentVersionTransitions> getNoncurrentVersionTransitions() {
            return this.noncurrentVersionTransitions;
        }

        @Override
        public final java.lang.String getPrefix() {
            return this.prefix;
        }

        @Override
        public final java.lang.String getStatus() {
            return this.status;
        }

        @Override
        public final java.util.List<imports.aws.k8s.services.s3.BucketSpecLifecycleRulesTransitions> getTransitions() {
            return this.transitions;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAbortIncompleteMultipartUpload() != null) {
                data.set("abortIncompleteMultipartUpload", om.valueToTree(this.getAbortIncompleteMultipartUpload()));
            }
            if (this.getExpiration() != null) {
                data.set("expiration", om.valueToTree(this.getExpiration()));
            }
            if (this.getFilter() != null) {
                data.set("filter", om.valueToTree(this.getFilter()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getNoncurrentVersionExpiration() != null) {
                data.set("noncurrentVersionExpiration", om.valueToTree(this.getNoncurrentVersionExpiration()));
            }
            if (this.getNoncurrentVersionTransitions() != null) {
                data.set("noncurrentVersionTransitions", om.valueToTree(this.getNoncurrentVersionTransitions()));
            }
            if (this.getPrefix() != null) {
                data.set("prefix", om.valueToTree(this.getPrefix()));
            }
            if (this.getStatus() != null) {
                data.set("status", om.valueToTree(this.getStatus()));
            }
            if (this.getTransitions() != null) {
                data.set("transitions", om.valueToTree(this.getTransitions()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecLifecycleRules"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecLifecycleRules.Jsii$Proxy that = (BucketSpecLifecycleRules.Jsii$Proxy) o;

            if (this.abortIncompleteMultipartUpload != null ? !this.abortIncompleteMultipartUpload.equals(that.abortIncompleteMultipartUpload) : that.abortIncompleteMultipartUpload != null) return false;
            if (this.expiration != null ? !this.expiration.equals(that.expiration) : that.expiration != null) return false;
            if (this.filter != null ? !this.filter.equals(that.filter) : that.filter != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.noncurrentVersionExpiration != null ? !this.noncurrentVersionExpiration.equals(that.noncurrentVersionExpiration) : that.noncurrentVersionExpiration != null) return false;
            if (this.noncurrentVersionTransitions != null ? !this.noncurrentVersionTransitions.equals(that.noncurrentVersionTransitions) : that.noncurrentVersionTransitions != null) return false;
            if (this.prefix != null ? !this.prefix.equals(that.prefix) : that.prefix != null) return false;
            if (this.status != null ? !this.status.equals(that.status) : that.status != null) return false;
            return this.transitions != null ? this.transitions.equals(that.transitions) : that.transitions == null;
        }

        @Override
        public final int hashCode() {
            int result = this.abortIncompleteMultipartUpload != null ? this.abortIncompleteMultipartUpload.hashCode() : 0;
            result = 31 * result + (this.expiration != null ? this.expiration.hashCode() : 0);
            result = 31 * result + (this.filter != null ? this.filter.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.noncurrentVersionExpiration != null ? this.noncurrentVersionExpiration.hashCode() : 0);
            result = 31 * result + (this.noncurrentVersionTransitions != null ? this.noncurrentVersionTransitions.hashCode() : 0);
            result = 31 * result + (this.prefix != null ? this.prefix.hashCode() : 0);
            result = 31 * result + (this.status != null ? this.status.hashCode() : 0);
            result = 31 * result + (this.transitions != null ? this.transitions.hashCode() : 0);
            return result;
        }
    }
}
