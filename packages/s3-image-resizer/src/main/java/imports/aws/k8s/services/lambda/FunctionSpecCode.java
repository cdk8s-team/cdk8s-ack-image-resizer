package imports.aws.k8s.services.lambda;

/**
 * The code for the function.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:22:11.948Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.lambda.$Module.class, fqn = "awsk8sserviceslambda.FunctionSpecCode")
@software.amazon.jsii.Jsii.Proxy(FunctionSpecCode.Jsii$Proxy.class)
public interface FunctionSpecCode extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getImageUri() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getS3Bucket() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getS3Key() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getS3ObjectVersion() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getZipFile() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link FunctionSpecCode}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link FunctionSpecCode}
     */
    public static final class Builder implements software.amazon.jsii.Builder<FunctionSpecCode> {
        java.lang.String imageUri;
        java.lang.String s3Bucket;
        java.lang.String s3Key;
        java.lang.String s3ObjectVersion;
        java.lang.String zipFile;

        /**
         * Sets the value of {@link FunctionSpecCode#getImageUri}
         * @param imageUri the value to be set.
         * @return {@code this}
         */
        public Builder imageUri(java.lang.String imageUri) {
            this.imageUri = imageUri;
            return this;
        }

        /**
         * Sets the value of {@link FunctionSpecCode#getS3Bucket}
         * @param s3Bucket the value to be set.
         * @return {@code this}
         */
        public Builder s3Bucket(java.lang.String s3Bucket) {
            this.s3Bucket = s3Bucket;
            return this;
        }

        /**
         * Sets the value of {@link FunctionSpecCode#getS3Key}
         * @param s3Key the value to be set.
         * @return {@code this}
         */
        public Builder s3Key(java.lang.String s3Key) {
            this.s3Key = s3Key;
            return this;
        }

        /**
         * Sets the value of {@link FunctionSpecCode#getS3ObjectVersion}
         * @param s3ObjectVersion the value to be set.
         * @return {@code this}
         */
        public Builder s3ObjectVersion(java.lang.String s3ObjectVersion) {
            this.s3ObjectVersion = s3ObjectVersion;
            return this;
        }

        /**
         * Sets the value of {@link FunctionSpecCode#getZipFile}
         * @param zipFile the value to be set.
         * @return {@code this}
         */
        public Builder zipFile(java.lang.String zipFile) {
            this.zipFile = zipFile;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link FunctionSpecCode}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public FunctionSpecCode build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link FunctionSpecCode}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements FunctionSpecCode {
        private final java.lang.String imageUri;
        private final java.lang.String s3Bucket;
        private final java.lang.String s3Key;
        private final java.lang.String s3ObjectVersion;
        private final java.lang.String zipFile;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.imageUri = software.amazon.jsii.Kernel.get(this, "imageUri", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.s3Bucket = software.amazon.jsii.Kernel.get(this, "s3Bucket", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.s3Key = software.amazon.jsii.Kernel.get(this, "s3Key", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.s3ObjectVersion = software.amazon.jsii.Kernel.get(this, "s3ObjectVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.zipFile = software.amazon.jsii.Kernel.get(this, "zipFile", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.imageUri = builder.imageUri;
            this.s3Bucket = builder.s3Bucket;
            this.s3Key = builder.s3Key;
            this.s3ObjectVersion = builder.s3ObjectVersion;
            this.zipFile = builder.zipFile;
        }

        @Override
        public final java.lang.String getImageUri() {
            return this.imageUri;
        }

        @Override
        public final java.lang.String getS3Bucket() {
            return this.s3Bucket;
        }

        @Override
        public final java.lang.String getS3Key() {
            return this.s3Key;
        }

        @Override
        public final java.lang.String getS3ObjectVersion() {
            return this.s3ObjectVersion;
        }

        @Override
        public final java.lang.String getZipFile() {
            return this.zipFile;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getImageUri() != null) {
                data.set("imageUri", om.valueToTree(this.getImageUri()));
            }
            if (this.getS3Bucket() != null) {
                data.set("s3Bucket", om.valueToTree(this.getS3Bucket()));
            }
            if (this.getS3Key() != null) {
                data.set("s3Key", om.valueToTree(this.getS3Key()));
            }
            if (this.getS3ObjectVersion() != null) {
                data.set("s3ObjectVersion", om.valueToTree(this.getS3ObjectVersion()));
            }
            if (this.getZipFile() != null) {
                data.set("zipFile", om.valueToTree(this.getZipFile()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sserviceslambda.FunctionSpecCode"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            FunctionSpecCode.Jsii$Proxy that = (FunctionSpecCode.Jsii$Proxy) o;

            if (this.imageUri != null ? !this.imageUri.equals(that.imageUri) : that.imageUri != null) return false;
            if (this.s3Bucket != null ? !this.s3Bucket.equals(that.s3Bucket) : that.s3Bucket != null) return false;
            if (this.s3Key != null ? !this.s3Key.equals(that.s3Key) : that.s3Key != null) return false;
            if (this.s3ObjectVersion != null ? !this.s3ObjectVersion.equals(that.s3ObjectVersion) : that.s3ObjectVersion != null) return false;
            return this.zipFile != null ? this.zipFile.equals(that.zipFile) : that.zipFile == null;
        }

        @Override
        public final int hashCode() {
            int result = this.imageUri != null ? this.imageUri.hashCode() : 0;
            result = 31 * result + (this.s3Bucket != null ? this.s3Bucket.hashCode() : 0);
            result = 31 * result + (this.s3Key != null ? this.s3Key.hashCode() : 0);
            result = 31 * result + (this.s3ObjectVersion != null ? this.s3ObjectVersion.hashCode() : 0);
            result = 31 * result + (this.zipFile != null ? this.zipFile.hashCode() : 0);
            return result;
        }
    }
}
