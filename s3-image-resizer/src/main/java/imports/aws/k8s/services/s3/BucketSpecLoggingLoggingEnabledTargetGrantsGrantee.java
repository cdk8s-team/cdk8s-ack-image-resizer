package imports.aws.k8s.services.s3;

/**
 * Container for the person being granted permissions.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.403Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecLoggingLoggingEnabledTargetGrantsGrantee")
@software.amazon.jsii.Jsii.Proxy(BucketSpecLoggingLoggingEnabledTargetGrantsGrantee.Jsii$Proxy.class)
public interface BucketSpecLoggingLoggingEnabledTargetGrantsGrantee extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDisplayName() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getEmailAddress() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getType() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getURi() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecLoggingLoggingEnabledTargetGrantsGrantee}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecLoggingLoggingEnabledTargetGrantsGrantee}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecLoggingLoggingEnabledTargetGrantsGrantee> {
        java.lang.String displayName;
        java.lang.String emailAddress;
        java.lang.String id;
        java.lang.String type;
        java.lang.String uRi;

        /**
         * Sets the value of {@link BucketSpecLoggingLoggingEnabledTargetGrantsGrantee#getDisplayName}
         * @param displayName the value to be set.
         * @return {@code this}
         */
        public Builder displayName(java.lang.String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecLoggingLoggingEnabledTargetGrantsGrantee#getEmailAddress}
         * @param emailAddress the value to be set.
         * @return {@code this}
         */
        public Builder emailAddress(java.lang.String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecLoggingLoggingEnabledTargetGrantsGrantee#getId}
         * @param id the value to be set.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecLoggingLoggingEnabledTargetGrantsGrantee#getType}
         * @param type the value to be set.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecLoggingLoggingEnabledTargetGrantsGrantee#getURi}
         * @param uRi the value to be set.
         * @return {@code this}
         */
        public Builder uRi(java.lang.String uRi) {
            this.uRi = uRi;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecLoggingLoggingEnabledTargetGrantsGrantee}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecLoggingLoggingEnabledTargetGrantsGrantee build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecLoggingLoggingEnabledTargetGrantsGrantee}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecLoggingLoggingEnabledTargetGrantsGrantee {
        private final java.lang.String displayName;
        private final java.lang.String emailAddress;
        private final java.lang.String id;
        private final java.lang.String type;
        private final java.lang.String uRi;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.displayName = software.amazon.jsii.Kernel.get(this, "displayName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.emailAddress = software.amazon.jsii.Kernel.get(this, "emailAddress", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.uRi = software.amazon.jsii.Kernel.get(this, "uRi", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.displayName = builder.displayName;
            this.emailAddress = builder.emailAddress;
            this.id = builder.id;
            this.type = builder.type;
            this.uRi = builder.uRi;
        }

        @Override
        public final java.lang.String getDisplayName() {
            return this.displayName;
        }

        @Override
        public final java.lang.String getEmailAddress() {
            return this.emailAddress;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final java.lang.String getURi() {
            return this.uRi;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getDisplayName() != null) {
                data.set("displayName", om.valueToTree(this.getDisplayName()));
            }
            if (this.getEmailAddress() != null) {
                data.set("emailAddress", om.valueToTree(this.getEmailAddress()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getType() != null) {
                data.set("type", om.valueToTree(this.getType()));
            }
            if (this.getURi() != null) {
                data.set("uRi", om.valueToTree(this.getURi()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecLoggingLoggingEnabledTargetGrantsGrantee"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecLoggingLoggingEnabledTargetGrantsGrantee.Jsii$Proxy that = (BucketSpecLoggingLoggingEnabledTargetGrantsGrantee.Jsii$Proxy) o;

            if (this.displayName != null ? !this.displayName.equals(that.displayName) : that.displayName != null) return false;
            if (this.emailAddress != null ? !this.emailAddress.equals(that.emailAddress) : that.emailAddress != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.type != null ? !this.type.equals(that.type) : that.type != null) return false;
            return this.uRi != null ? this.uRi.equals(that.uRi) : that.uRi == null;
        }

        @Override
        public final int hashCode() {
            int result = this.displayName != null ? this.displayName.hashCode() : 0;
            result = 31 * result + (this.emailAddress != null ? this.emailAddress.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.type != null ? this.type.hashCode() : 0);
            result = 31 * result + (this.uRi != null ? this.uRi.hashCode() : 0);
            return result;
        }
    }
}
