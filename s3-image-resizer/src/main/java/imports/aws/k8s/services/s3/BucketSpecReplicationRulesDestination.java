package imports.aws.k8s.services.s3;

/**
 * Specifies information about where to publish analysis or configuration results for an Amazon S3 bucket and S3 Replication Time Control (S3 RTC).
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.409Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecReplicationRulesDestination")
@software.amazon.jsii.Jsii.Proxy(BucketSpecReplicationRulesDestination.Jsii$Proxy.class)
public interface BucketSpecReplicationRulesDestination extends software.amazon.jsii.JsiiSerializable {

    /**
     * A container for information about access control for replicas.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecReplicationRulesDestinationAccessControlTranslation getAccessControlTranslation() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAccount() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getBucket() {
        return null;
    }

    /**
     * Specifies encryption-related information for an Amazon S3 bucket that is a destination for replicated objects.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecReplicationRulesDestinationEncryptionConfiguration getEncryptionConfiguration() {
        return null;
    }

    /**
     * A container specifying replication metrics-related settings enabling replication metrics and events.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecReplicationRulesDestinationMetrics getMetrics() {
        return null;
    }

    /**
     * A container specifying S3 Replication Time Control (S3 RTC) related information, including whether S3 RTC is enabled and the time when all objects and operations on objects must be replicated.
     * <p>
     * Must be specified together with a Metrics block.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecReplicationRulesDestinationReplicationTime getReplicationTime() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getStorageClass() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecReplicationRulesDestination}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecReplicationRulesDestination}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecReplicationRulesDestination> {
        imports.aws.k8s.services.s3.BucketSpecReplicationRulesDestinationAccessControlTranslation accessControlTranslation;
        java.lang.String account;
        java.lang.String bucket;
        imports.aws.k8s.services.s3.BucketSpecReplicationRulesDestinationEncryptionConfiguration encryptionConfiguration;
        imports.aws.k8s.services.s3.BucketSpecReplicationRulesDestinationMetrics metrics;
        imports.aws.k8s.services.s3.BucketSpecReplicationRulesDestinationReplicationTime replicationTime;
        java.lang.String storageClass;

        /**
         * Sets the value of {@link BucketSpecReplicationRulesDestination#getAccessControlTranslation}
         * @param accessControlTranslation A container for information about access control for replicas.
         * @return {@code this}
         */
        public Builder accessControlTranslation(imports.aws.k8s.services.s3.BucketSpecReplicationRulesDestinationAccessControlTranslation accessControlTranslation) {
            this.accessControlTranslation = accessControlTranslation;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecReplicationRulesDestination#getAccount}
         * @param account the value to be set.
         * @return {@code this}
         */
        public Builder account(java.lang.String account) {
            this.account = account;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecReplicationRulesDestination#getBucket}
         * @param bucket the value to be set.
         * @return {@code this}
         */
        public Builder bucket(java.lang.String bucket) {
            this.bucket = bucket;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecReplicationRulesDestination#getEncryptionConfiguration}
         * @param encryptionConfiguration Specifies encryption-related information for an Amazon S3 bucket that is a destination for replicated objects.
         * @return {@code this}
         */
        public Builder encryptionConfiguration(imports.aws.k8s.services.s3.BucketSpecReplicationRulesDestinationEncryptionConfiguration encryptionConfiguration) {
            this.encryptionConfiguration = encryptionConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecReplicationRulesDestination#getMetrics}
         * @param metrics A container specifying replication metrics-related settings enabling replication metrics and events.
         * @return {@code this}
         */
        public Builder metrics(imports.aws.k8s.services.s3.BucketSpecReplicationRulesDestinationMetrics metrics) {
            this.metrics = metrics;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecReplicationRulesDestination#getReplicationTime}
         * @param replicationTime A container specifying S3 Replication Time Control (S3 RTC) related information, including whether S3 RTC is enabled and the time when all objects and operations on objects must be replicated.
         *                        Must be specified together with a Metrics block.
         * @return {@code this}
         */
        public Builder replicationTime(imports.aws.k8s.services.s3.BucketSpecReplicationRulesDestinationReplicationTime replicationTime) {
            this.replicationTime = replicationTime;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecReplicationRulesDestination#getStorageClass}
         * @param storageClass the value to be set.
         * @return {@code this}
         */
        public Builder storageClass(java.lang.String storageClass) {
            this.storageClass = storageClass;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecReplicationRulesDestination}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecReplicationRulesDestination build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecReplicationRulesDestination}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecReplicationRulesDestination {
        private final imports.aws.k8s.services.s3.BucketSpecReplicationRulesDestinationAccessControlTranslation accessControlTranslation;
        private final java.lang.String account;
        private final java.lang.String bucket;
        private final imports.aws.k8s.services.s3.BucketSpecReplicationRulesDestinationEncryptionConfiguration encryptionConfiguration;
        private final imports.aws.k8s.services.s3.BucketSpecReplicationRulesDestinationMetrics metrics;
        private final imports.aws.k8s.services.s3.BucketSpecReplicationRulesDestinationReplicationTime replicationTime;
        private final java.lang.String storageClass;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.accessControlTranslation = software.amazon.jsii.Kernel.get(this, "accessControlTranslation", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecReplicationRulesDestinationAccessControlTranslation.class));
            this.account = software.amazon.jsii.Kernel.get(this, "account", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.bucket = software.amazon.jsii.Kernel.get(this, "bucket", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.encryptionConfiguration = software.amazon.jsii.Kernel.get(this, "encryptionConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecReplicationRulesDestinationEncryptionConfiguration.class));
            this.metrics = software.amazon.jsii.Kernel.get(this, "metrics", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecReplicationRulesDestinationMetrics.class));
            this.replicationTime = software.amazon.jsii.Kernel.get(this, "replicationTime", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecReplicationRulesDestinationReplicationTime.class));
            this.storageClass = software.amazon.jsii.Kernel.get(this, "storageClass", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.accessControlTranslation = builder.accessControlTranslation;
            this.account = builder.account;
            this.bucket = builder.bucket;
            this.encryptionConfiguration = builder.encryptionConfiguration;
            this.metrics = builder.metrics;
            this.replicationTime = builder.replicationTime;
            this.storageClass = builder.storageClass;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecReplicationRulesDestinationAccessControlTranslation getAccessControlTranslation() {
            return this.accessControlTranslation;
        }

        @Override
        public final java.lang.String getAccount() {
            return this.account;
        }

        @Override
        public final java.lang.String getBucket() {
            return this.bucket;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecReplicationRulesDestinationEncryptionConfiguration getEncryptionConfiguration() {
            return this.encryptionConfiguration;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecReplicationRulesDestinationMetrics getMetrics() {
            return this.metrics;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecReplicationRulesDestinationReplicationTime getReplicationTime() {
            return this.replicationTime;
        }

        @Override
        public final java.lang.String getStorageClass() {
            return this.storageClass;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAccessControlTranslation() != null) {
                data.set("accessControlTranslation", om.valueToTree(this.getAccessControlTranslation()));
            }
            if (this.getAccount() != null) {
                data.set("account", om.valueToTree(this.getAccount()));
            }
            if (this.getBucket() != null) {
                data.set("bucket", om.valueToTree(this.getBucket()));
            }
            if (this.getEncryptionConfiguration() != null) {
                data.set("encryptionConfiguration", om.valueToTree(this.getEncryptionConfiguration()));
            }
            if (this.getMetrics() != null) {
                data.set("metrics", om.valueToTree(this.getMetrics()));
            }
            if (this.getReplicationTime() != null) {
                data.set("replicationTime", om.valueToTree(this.getReplicationTime()));
            }
            if (this.getStorageClass() != null) {
                data.set("storageClass", om.valueToTree(this.getStorageClass()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecReplicationRulesDestination"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecReplicationRulesDestination.Jsii$Proxy that = (BucketSpecReplicationRulesDestination.Jsii$Proxy) o;

            if (this.accessControlTranslation != null ? !this.accessControlTranslation.equals(that.accessControlTranslation) : that.accessControlTranslation != null) return false;
            if (this.account != null ? !this.account.equals(that.account) : that.account != null) return false;
            if (this.bucket != null ? !this.bucket.equals(that.bucket) : that.bucket != null) return false;
            if (this.encryptionConfiguration != null ? !this.encryptionConfiguration.equals(that.encryptionConfiguration) : that.encryptionConfiguration != null) return false;
            if (this.metrics != null ? !this.metrics.equals(that.metrics) : that.metrics != null) return false;
            if (this.replicationTime != null ? !this.replicationTime.equals(that.replicationTime) : that.replicationTime != null) return false;
            return this.storageClass != null ? this.storageClass.equals(that.storageClass) : that.storageClass == null;
        }

        @Override
        public final int hashCode() {
            int result = this.accessControlTranslation != null ? this.accessControlTranslation.hashCode() : 0;
            result = 31 * result + (this.account != null ? this.account.hashCode() : 0);
            result = 31 * result + (this.bucket != null ? this.bucket.hashCode() : 0);
            result = 31 * result + (this.encryptionConfiguration != null ? this.encryptionConfiguration.hashCode() : 0);
            result = 31 * result + (this.metrics != null ? this.metrics.hashCode() : 0);
            result = 31 * result + (this.replicationTime != null ? this.replicationTime.hashCode() : 0);
            result = 31 * result + (this.storageClass != null ? this.storageClass.hashCode() : 0);
            return result;
        }
    }
}
