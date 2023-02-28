package imports.aws.k8s.services.s3;

/**
 * BucketSpec defines the desired state of Bucket.
 * <p>
 * In terms of implementation, a Bucket is a resource. An Amazon S3 bucket name is globally unique, and the namespace is shared by all Amazon Web Services accounts.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.389Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpec")
@software.amazon.jsii.Jsii.Proxy(BucketSpec.Jsii$Proxy.class)
public interface BucketSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * The name of the bucket to create.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * Container for setting the transfer acceleration state.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecAccelerate getAccelerate() {
        return null;
    }

    /**
     * The canned ACL to apply to the bucket.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAcl() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.k8s.services.s3.BucketSpecAnalytics> getAnalytics() {
        return null;
    }

    /**
     * Describes the cross-origin access configuration for objects in an Amazon S3 bucket.
     * <p>
     * For more information, see Enabling Cross-Origin Resource Sharing (https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html) in the Amazon S3 User Guide.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecCors getCors() {
        return null;
    }

    /**
     * The configuration information for the bucket.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecCreateBucketConfiguration getCreateBucketConfiguration() {
        return null;
    }

    /**
     * Specifies the default server-side-encryption configuration.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecEncryption getEncryption() {
        return null;
    }

    /**
     * Allows grantee the read, write, read ACP, and write ACP permissions on the bucket.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getGrantFullControl() {
        return null;
    }

    /**
     * Allows grantee to list the objects in the bucket.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getGrantRead() {
        return null;
    }

    /**
     * Allows grantee to read the bucket ACL.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getGrantReadAcp() {
        return null;
    }

    /**
     * Allows grantee to create new objects in the bucket.
     * <p>
     * For the bucket and object owners of existing objects, also allows deletions and overwrites of those objects.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getGrantWrite() {
        return null;
    }

    /**
     * Allows grantee to write the ACL for the applicable bucket.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getGrantWriteAcp() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.k8s.services.s3.BucketSpecIntelligentTiering> getIntelligentTiering() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.k8s.services.s3.BucketSpecInventory> getInventory() {
        return null;
    }

    /**
     * Container for lifecycle rules.
     * <p>
     * You can add as many as 1,000 rules.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecLifecycle getLifecycle() {
        return null;
    }

    /**
     * Container for logging status information.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecLogging getLogging() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.k8s.services.s3.BucketSpecMetrics> getMetrics() {
        return null;
    }

    /**
     * A container for specifying the notification configuration of the bucket.
     * <p>
     * If this element is empty, notifications are turned off for the bucket.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecNotification getNotification() {
        return null;
    }

    /**
     * Specifies whether you want S3 Object Lock to be enabled for the new bucket.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getObjectLockEnabledForBucket() {
        return null;
    }

    /**
     * The OwnershipControls (BucketOwnerPreferred or ObjectWriter) that you want to apply to this Amazon S3 bucket.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecOwnershipControls getOwnershipControls() {
        return null;
    }

    /**
     * The bucket policy as a JSON document.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPolicy() {
        return null;
    }

    /**
     * The PublicAccessBlock configuration that you want to apply to this Amazon S3 bucket.
     * <p>
     * You can enable the configuration options in any combination. For more information about when Amazon S3 considers a bucket or object public, see The Meaning of "Public" (https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status) in the Amazon S3 User Guide.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecPublicAccessBlock getPublicAccessBlock() {
        return null;
    }

    /**
     * A container for replication rules.
     * <p>
     * You can add up to 1,000 rules. The maximum size of a replication configuration is 2 MB.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecReplication getReplication() {
        return null;
    }

    /**
     * Container for Payer.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecRequestPayment getRequestPayment() {
        return null;
    }

    /**
     * Container for the TagSet and Tag elements.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecTagging getTagging() {
        return null;
    }

    /**
     * Container for setting the versioning state.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecVersioning getVersioning() {
        return null;
    }

    /**
     * Container for the request.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecWebsite getWebsite() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpec> {
        java.lang.String name;
        imports.aws.k8s.services.s3.BucketSpecAccelerate accelerate;
        java.lang.String acl;
        java.util.List<imports.aws.k8s.services.s3.BucketSpecAnalytics> analytics;
        imports.aws.k8s.services.s3.BucketSpecCors cors;
        imports.aws.k8s.services.s3.BucketSpecCreateBucketConfiguration createBucketConfiguration;
        imports.aws.k8s.services.s3.BucketSpecEncryption encryption;
        java.lang.String grantFullControl;
        java.lang.String grantRead;
        java.lang.String grantReadAcp;
        java.lang.String grantWrite;
        java.lang.String grantWriteAcp;
        java.util.List<imports.aws.k8s.services.s3.BucketSpecIntelligentTiering> intelligentTiering;
        java.util.List<imports.aws.k8s.services.s3.BucketSpecInventory> inventory;
        imports.aws.k8s.services.s3.BucketSpecLifecycle lifecycle;
        imports.aws.k8s.services.s3.BucketSpecLogging logging;
        java.util.List<imports.aws.k8s.services.s3.BucketSpecMetrics> metrics;
        imports.aws.k8s.services.s3.BucketSpecNotification notification;
        java.lang.Boolean objectLockEnabledForBucket;
        imports.aws.k8s.services.s3.BucketSpecOwnershipControls ownershipControls;
        java.lang.String policy;
        imports.aws.k8s.services.s3.BucketSpecPublicAccessBlock publicAccessBlock;
        imports.aws.k8s.services.s3.BucketSpecReplication replication;
        imports.aws.k8s.services.s3.BucketSpecRequestPayment requestPayment;
        imports.aws.k8s.services.s3.BucketSpecTagging tagging;
        imports.aws.k8s.services.s3.BucketSpecVersioning versioning;
        imports.aws.k8s.services.s3.BucketSpecWebsite website;

        /**
         * Sets the value of {@link BucketSpec#getName}
         * @param name The name of the bucket to create. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpec#getAccelerate}
         * @param accelerate Container for setting the transfer acceleration state.
         * @return {@code this}
         */
        public Builder accelerate(imports.aws.k8s.services.s3.BucketSpecAccelerate accelerate) {
            this.accelerate = accelerate;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpec#getAcl}
         * @param acl The canned ACL to apply to the bucket.
         * @return {@code this}
         */
        public Builder acl(java.lang.String acl) {
            this.acl = acl;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpec#getAnalytics}
         * @param analytics the value to be set.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder analytics(java.util.List<? extends imports.aws.k8s.services.s3.BucketSpecAnalytics> analytics) {
            this.analytics = (java.util.List<imports.aws.k8s.services.s3.BucketSpecAnalytics>)analytics;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpec#getCors}
         * @param cors Describes the cross-origin access configuration for objects in an Amazon S3 bucket.
         *             For more information, see Enabling Cross-Origin Resource Sharing (https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html) in the Amazon S3 User Guide.
         * @return {@code this}
         */
        public Builder cors(imports.aws.k8s.services.s3.BucketSpecCors cors) {
            this.cors = cors;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpec#getCreateBucketConfiguration}
         * @param createBucketConfiguration The configuration information for the bucket.
         * @return {@code this}
         */
        public Builder createBucketConfiguration(imports.aws.k8s.services.s3.BucketSpecCreateBucketConfiguration createBucketConfiguration) {
            this.createBucketConfiguration = createBucketConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpec#getEncryption}
         * @param encryption Specifies the default server-side-encryption configuration.
         * @return {@code this}
         */
        public Builder encryption(imports.aws.k8s.services.s3.BucketSpecEncryption encryption) {
            this.encryption = encryption;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpec#getGrantFullControl}
         * @param grantFullControl Allows grantee the read, write, read ACP, and write ACP permissions on the bucket.
         * @return {@code this}
         */
        public Builder grantFullControl(java.lang.String grantFullControl) {
            this.grantFullControl = grantFullControl;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpec#getGrantRead}
         * @param grantRead Allows grantee to list the objects in the bucket.
         * @return {@code this}
         */
        public Builder grantRead(java.lang.String grantRead) {
            this.grantRead = grantRead;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpec#getGrantReadAcp}
         * @param grantReadAcp Allows grantee to read the bucket ACL.
         * @return {@code this}
         */
        public Builder grantReadAcp(java.lang.String grantReadAcp) {
            this.grantReadAcp = grantReadAcp;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpec#getGrantWrite}
         * @param grantWrite Allows grantee to create new objects in the bucket.
         *                   For the bucket and object owners of existing objects, also allows deletions and overwrites of those objects.
         * @return {@code this}
         */
        public Builder grantWrite(java.lang.String grantWrite) {
            this.grantWrite = grantWrite;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpec#getGrantWriteAcp}
         * @param grantWriteAcp Allows grantee to write the ACL for the applicable bucket.
         * @return {@code this}
         */
        public Builder grantWriteAcp(java.lang.String grantWriteAcp) {
            this.grantWriteAcp = grantWriteAcp;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpec#getIntelligentTiering}
         * @param intelligentTiering the value to be set.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder intelligentTiering(java.util.List<? extends imports.aws.k8s.services.s3.BucketSpecIntelligentTiering> intelligentTiering) {
            this.intelligentTiering = (java.util.List<imports.aws.k8s.services.s3.BucketSpecIntelligentTiering>)intelligentTiering;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpec#getInventory}
         * @param inventory the value to be set.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder inventory(java.util.List<? extends imports.aws.k8s.services.s3.BucketSpecInventory> inventory) {
            this.inventory = (java.util.List<imports.aws.k8s.services.s3.BucketSpecInventory>)inventory;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpec#getLifecycle}
         * @param lifecycle Container for lifecycle rules.
         *                  You can add as many as 1,000 rules.
         * @return {@code this}
         */
        public Builder lifecycle(imports.aws.k8s.services.s3.BucketSpecLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpec#getLogging}
         * @param logging Container for logging status information.
         * @return {@code this}
         */
        public Builder logging(imports.aws.k8s.services.s3.BucketSpecLogging logging) {
            this.logging = logging;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpec#getMetrics}
         * @param metrics the value to be set.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder metrics(java.util.List<? extends imports.aws.k8s.services.s3.BucketSpecMetrics> metrics) {
            this.metrics = (java.util.List<imports.aws.k8s.services.s3.BucketSpecMetrics>)metrics;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpec#getNotification}
         * @param notification A container for specifying the notification configuration of the bucket.
         *                     If this element is empty, notifications are turned off for the bucket.
         * @return {@code this}
         */
        public Builder notification(imports.aws.k8s.services.s3.BucketSpecNotification notification) {
            this.notification = notification;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpec#getObjectLockEnabledForBucket}
         * @param objectLockEnabledForBucket Specifies whether you want S3 Object Lock to be enabled for the new bucket.
         * @return {@code this}
         */
        public Builder objectLockEnabledForBucket(java.lang.Boolean objectLockEnabledForBucket) {
            this.objectLockEnabledForBucket = objectLockEnabledForBucket;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpec#getOwnershipControls}
         * @param ownershipControls The OwnershipControls (BucketOwnerPreferred or ObjectWriter) that you want to apply to this Amazon S3 bucket.
         * @return {@code this}
         */
        public Builder ownershipControls(imports.aws.k8s.services.s3.BucketSpecOwnershipControls ownershipControls) {
            this.ownershipControls = ownershipControls;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpec#getPolicy}
         * @param policy The bucket policy as a JSON document.
         * @return {@code this}
         */
        public Builder policy(java.lang.String policy) {
            this.policy = policy;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpec#getPublicAccessBlock}
         * @param publicAccessBlock The PublicAccessBlock configuration that you want to apply to this Amazon S3 bucket.
         *                          You can enable the configuration options in any combination. For more information about when Amazon S3 considers a bucket or object public, see The Meaning of "Public" (https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status) in the Amazon S3 User Guide.
         * @return {@code this}
         */
        public Builder publicAccessBlock(imports.aws.k8s.services.s3.BucketSpecPublicAccessBlock publicAccessBlock) {
            this.publicAccessBlock = publicAccessBlock;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpec#getReplication}
         * @param replication A container for replication rules.
         *                    You can add up to 1,000 rules. The maximum size of a replication configuration is 2 MB.
         * @return {@code this}
         */
        public Builder replication(imports.aws.k8s.services.s3.BucketSpecReplication replication) {
            this.replication = replication;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpec#getRequestPayment}
         * @param requestPayment Container for Payer.
         * @return {@code this}
         */
        public Builder requestPayment(imports.aws.k8s.services.s3.BucketSpecRequestPayment requestPayment) {
            this.requestPayment = requestPayment;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpec#getTagging}
         * @param tagging Container for the TagSet and Tag elements.
         * @return {@code this}
         */
        public Builder tagging(imports.aws.k8s.services.s3.BucketSpecTagging tagging) {
            this.tagging = tagging;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpec#getVersioning}
         * @param versioning Container for setting the versioning state.
         * @return {@code this}
         */
        public Builder versioning(imports.aws.k8s.services.s3.BucketSpecVersioning versioning) {
            this.versioning = versioning;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpec#getWebsite}
         * @param website Container for the request.
         * @return {@code this}
         */
        public Builder website(imports.aws.k8s.services.s3.BucketSpecWebsite website) {
            this.website = website;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpec {
        private final java.lang.String name;
        private final imports.aws.k8s.services.s3.BucketSpecAccelerate accelerate;
        private final java.lang.String acl;
        private final java.util.List<imports.aws.k8s.services.s3.BucketSpecAnalytics> analytics;
        private final imports.aws.k8s.services.s3.BucketSpecCors cors;
        private final imports.aws.k8s.services.s3.BucketSpecCreateBucketConfiguration createBucketConfiguration;
        private final imports.aws.k8s.services.s3.BucketSpecEncryption encryption;
        private final java.lang.String grantFullControl;
        private final java.lang.String grantRead;
        private final java.lang.String grantReadAcp;
        private final java.lang.String grantWrite;
        private final java.lang.String grantWriteAcp;
        private final java.util.List<imports.aws.k8s.services.s3.BucketSpecIntelligentTiering> intelligentTiering;
        private final java.util.List<imports.aws.k8s.services.s3.BucketSpecInventory> inventory;
        private final imports.aws.k8s.services.s3.BucketSpecLifecycle lifecycle;
        private final imports.aws.k8s.services.s3.BucketSpecLogging logging;
        private final java.util.List<imports.aws.k8s.services.s3.BucketSpecMetrics> metrics;
        private final imports.aws.k8s.services.s3.BucketSpecNotification notification;
        private final java.lang.Boolean objectLockEnabledForBucket;
        private final imports.aws.k8s.services.s3.BucketSpecOwnershipControls ownershipControls;
        private final java.lang.String policy;
        private final imports.aws.k8s.services.s3.BucketSpecPublicAccessBlock publicAccessBlock;
        private final imports.aws.k8s.services.s3.BucketSpecReplication replication;
        private final imports.aws.k8s.services.s3.BucketSpecRequestPayment requestPayment;
        private final imports.aws.k8s.services.s3.BucketSpecTagging tagging;
        private final imports.aws.k8s.services.s3.BucketSpecVersioning versioning;
        private final imports.aws.k8s.services.s3.BucketSpecWebsite website;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.accelerate = software.amazon.jsii.Kernel.get(this, "accelerate", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecAccelerate.class));
            this.acl = software.amazon.jsii.Kernel.get(this, "acl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.analytics = software.amazon.jsii.Kernel.get(this, "analytics", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecAnalytics.class)));
            this.cors = software.amazon.jsii.Kernel.get(this, "cors", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecCors.class));
            this.createBucketConfiguration = software.amazon.jsii.Kernel.get(this, "createBucketConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecCreateBucketConfiguration.class));
            this.encryption = software.amazon.jsii.Kernel.get(this, "encryption", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecEncryption.class));
            this.grantFullControl = software.amazon.jsii.Kernel.get(this, "grantFullControl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.grantRead = software.amazon.jsii.Kernel.get(this, "grantRead", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.grantReadAcp = software.amazon.jsii.Kernel.get(this, "grantReadAcp", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.grantWrite = software.amazon.jsii.Kernel.get(this, "grantWrite", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.grantWriteAcp = software.amazon.jsii.Kernel.get(this, "grantWriteAcp", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.intelligentTiering = software.amazon.jsii.Kernel.get(this, "intelligentTiering", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecIntelligentTiering.class)));
            this.inventory = software.amazon.jsii.Kernel.get(this, "inventory", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecInventory.class)));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecLifecycle.class));
            this.logging = software.amazon.jsii.Kernel.get(this, "logging", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecLogging.class));
            this.metrics = software.amazon.jsii.Kernel.get(this, "metrics", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecMetrics.class)));
            this.notification = software.amazon.jsii.Kernel.get(this, "notification", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecNotification.class));
            this.objectLockEnabledForBucket = software.amazon.jsii.Kernel.get(this, "objectLockEnabledForBucket", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.ownershipControls = software.amazon.jsii.Kernel.get(this, "ownershipControls", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecOwnershipControls.class));
            this.policy = software.amazon.jsii.Kernel.get(this, "policy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.publicAccessBlock = software.amazon.jsii.Kernel.get(this, "publicAccessBlock", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecPublicAccessBlock.class));
            this.replication = software.amazon.jsii.Kernel.get(this, "replication", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecReplication.class));
            this.requestPayment = software.amazon.jsii.Kernel.get(this, "requestPayment", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecRequestPayment.class));
            this.tagging = software.amazon.jsii.Kernel.get(this, "tagging", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecTagging.class));
            this.versioning = software.amazon.jsii.Kernel.get(this, "versioning", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecVersioning.class));
            this.website = software.amazon.jsii.Kernel.get(this, "website", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecWebsite.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.accelerate = builder.accelerate;
            this.acl = builder.acl;
            this.analytics = (java.util.List<imports.aws.k8s.services.s3.BucketSpecAnalytics>)builder.analytics;
            this.cors = builder.cors;
            this.createBucketConfiguration = builder.createBucketConfiguration;
            this.encryption = builder.encryption;
            this.grantFullControl = builder.grantFullControl;
            this.grantRead = builder.grantRead;
            this.grantReadAcp = builder.grantReadAcp;
            this.grantWrite = builder.grantWrite;
            this.grantWriteAcp = builder.grantWriteAcp;
            this.intelligentTiering = (java.util.List<imports.aws.k8s.services.s3.BucketSpecIntelligentTiering>)builder.intelligentTiering;
            this.inventory = (java.util.List<imports.aws.k8s.services.s3.BucketSpecInventory>)builder.inventory;
            this.lifecycle = builder.lifecycle;
            this.logging = builder.logging;
            this.metrics = (java.util.List<imports.aws.k8s.services.s3.BucketSpecMetrics>)builder.metrics;
            this.notification = builder.notification;
            this.objectLockEnabledForBucket = builder.objectLockEnabledForBucket;
            this.ownershipControls = builder.ownershipControls;
            this.policy = builder.policy;
            this.publicAccessBlock = builder.publicAccessBlock;
            this.replication = builder.replication;
            this.requestPayment = builder.requestPayment;
            this.tagging = builder.tagging;
            this.versioning = builder.versioning;
            this.website = builder.website;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecAccelerate getAccelerate() {
            return this.accelerate;
        }

        @Override
        public final java.lang.String getAcl() {
            return this.acl;
        }

        @Override
        public final java.util.List<imports.aws.k8s.services.s3.BucketSpecAnalytics> getAnalytics() {
            return this.analytics;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecCors getCors() {
            return this.cors;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecCreateBucketConfiguration getCreateBucketConfiguration() {
            return this.createBucketConfiguration;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecEncryption getEncryption() {
            return this.encryption;
        }

        @Override
        public final java.lang.String getGrantFullControl() {
            return this.grantFullControl;
        }

        @Override
        public final java.lang.String getGrantRead() {
            return this.grantRead;
        }

        @Override
        public final java.lang.String getGrantReadAcp() {
            return this.grantReadAcp;
        }

        @Override
        public final java.lang.String getGrantWrite() {
            return this.grantWrite;
        }

        @Override
        public final java.lang.String getGrantWriteAcp() {
            return this.grantWriteAcp;
        }

        @Override
        public final java.util.List<imports.aws.k8s.services.s3.BucketSpecIntelligentTiering> getIntelligentTiering() {
            return this.intelligentTiering;
        }

        @Override
        public final java.util.List<imports.aws.k8s.services.s3.BucketSpecInventory> getInventory() {
            return this.inventory;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecLifecycle getLifecycle() {
            return this.lifecycle;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecLogging getLogging() {
            return this.logging;
        }

        @Override
        public final java.util.List<imports.aws.k8s.services.s3.BucketSpecMetrics> getMetrics() {
            return this.metrics;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecNotification getNotification() {
            return this.notification;
        }

        @Override
        public final java.lang.Boolean getObjectLockEnabledForBucket() {
            return this.objectLockEnabledForBucket;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecOwnershipControls getOwnershipControls() {
            return this.ownershipControls;
        }

        @Override
        public final java.lang.String getPolicy() {
            return this.policy;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecPublicAccessBlock getPublicAccessBlock() {
            return this.publicAccessBlock;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecReplication getReplication() {
            return this.replication;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecRequestPayment getRequestPayment() {
            return this.requestPayment;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecTagging getTagging() {
            return this.tagging;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecVersioning getVersioning() {
            return this.versioning;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecWebsite getWebsite() {
            return this.website;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            if (this.getAccelerate() != null) {
                data.set("accelerate", om.valueToTree(this.getAccelerate()));
            }
            if (this.getAcl() != null) {
                data.set("acl", om.valueToTree(this.getAcl()));
            }
            if (this.getAnalytics() != null) {
                data.set("analytics", om.valueToTree(this.getAnalytics()));
            }
            if (this.getCors() != null) {
                data.set("cors", om.valueToTree(this.getCors()));
            }
            if (this.getCreateBucketConfiguration() != null) {
                data.set("createBucketConfiguration", om.valueToTree(this.getCreateBucketConfiguration()));
            }
            if (this.getEncryption() != null) {
                data.set("encryption", om.valueToTree(this.getEncryption()));
            }
            if (this.getGrantFullControl() != null) {
                data.set("grantFullControl", om.valueToTree(this.getGrantFullControl()));
            }
            if (this.getGrantRead() != null) {
                data.set("grantRead", om.valueToTree(this.getGrantRead()));
            }
            if (this.getGrantReadAcp() != null) {
                data.set("grantReadAcp", om.valueToTree(this.getGrantReadAcp()));
            }
            if (this.getGrantWrite() != null) {
                data.set("grantWrite", om.valueToTree(this.getGrantWrite()));
            }
            if (this.getGrantWriteAcp() != null) {
                data.set("grantWriteAcp", om.valueToTree(this.getGrantWriteAcp()));
            }
            if (this.getIntelligentTiering() != null) {
                data.set("intelligentTiering", om.valueToTree(this.getIntelligentTiering()));
            }
            if (this.getInventory() != null) {
                data.set("inventory", om.valueToTree(this.getInventory()));
            }
            if (this.getLifecycle() != null) {
                data.set("lifecycle", om.valueToTree(this.getLifecycle()));
            }
            if (this.getLogging() != null) {
                data.set("logging", om.valueToTree(this.getLogging()));
            }
            if (this.getMetrics() != null) {
                data.set("metrics", om.valueToTree(this.getMetrics()));
            }
            if (this.getNotification() != null) {
                data.set("notification", om.valueToTree(this.getNotification()));
            }
            if (this.getObjectLockEnabledForBucket() != null) {
                data.set("objectLockEnabledForBucket", om.valueToTree(this.getObjectLockEnabledForBucket()));
            }
            if (this.getOwnershipControls() != null) {
                data.set("ownershipControls", om.valueToTree(this.getOwnershipControls()));
            }
            if (this.getPolicy() != null) {
                data.set("policy", om.valueToTree(this.getPolicy()));
            }
            if (this.getPublicAccessBlock() != null) {
                data.set("publicAccessBlock", om.valueToTree(this.getPublicAccessBlock()));
            }
            if (this.getReplication() != null) {
                data.set("replication", om.valueToTree(this.getReplication()));
            }
            if (this.getRequestPayment() != null) {
                data.set("requestPayment", om.valueToTree(this.getRequestPayment()));
            }
            if (this.getTagging() != null) {
                data.set("tagging", om.valueToTree(this.getTagging()));
            }
            if (this.getVersioning() != null) {
                data.set("versioning", om.valueToTree(this.getVersioning()));
            }
            if (this.getWebsite() != null) {
                data.set("website", om.valueToTree(this.getWebsite()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpec.Jsii$Proxy that = (BucketSpec.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (this.accelerate != null ? !this.accelerate.equals(that.accelerate) : that.accelerate != null) return false;
            if (this.acl != null ? !this.acl.equals(that.acl) : that.acl != null) return false;
            if (this.analytics != null ? !this.analytics.equals(that.analytics) : that.analytics != null) return false;
            if (this.cors != null ? !this.cors.equals(that.cors) : that.cors != null) return false;
            if (this.createBucketConfiguration != null ? !this.createBucketConfiguration.equals(that.createBucketConfiguration) : that.createBucketConfiguration != null) return false;
            if (this.encryption != null ? !this.encryption.equals(that.encryption) : that.encryption != null) return false;
            if (this.grantFullControl != null ? !this.grantFullControl.equals(that.grantFullControl) : that.grantFullControl != null) return false;
            if (this.grantRead != null ? !this.grantRead.equals(that.grantRead) : that.grantRead != null) return false;
            if (this.grantReadAcp != null ? !this.grantReadAcp.equals(that.grantReadAcp) : that.grantReadAcp != null) return false;
            if (this.grantWrite != null ? !this.grantWrite.equals(that.grantWrite) : that.grantWrite != null) return false;
            if (this.grantWriteAcp != null ? !this.grantWriteAcp.equals(that.grantWriteAcp) : that.grantWriteAcp != null) return false;
            if (this.intelligentTiering != null ? !this.intelligentTiering.equals(that.intelligentTiering) : that.intelligentTiering != null) return false;
            if (this.inventory != null ? !this.inventory.equals(that.inventory) : that.inventory != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            if (this.logging != null ? !this.logging.equals(that.logging) : that.logging != null) return false;
            if (this.metrics != null ? !this.metrics.equals(that.metrics) : that.metrics != null) return false;
            if (this.notification != null ? !this.notification.equals(that.notification) : that.notification != null) return false;
            if (this.objectLockEnabledForBucket != null ? !this.objectLockEnabledForBucket.equals(that.objectLockEnabledForBucket) : that.objectLockEnabledForBucket != null) return false;
            if (this.ownershipControls != null ? !this.ownershipControls.equals(that.ownershipControls) : that.ownershipControls != null) return false;
            if (this.policy != null ? !this.policy.equals(that.policy) : that.policy != null) return false;
            if (this.publicAccessBlock != null ? !this.publicAccessBlock.equals(that.publicAccessBlock) : that.publicAccessBlock != null) return false;
            if (this.replication != null ? !this.replication.equals(that.replication) : that.replication != null) return false;
            if (this.requestPayment != null ? !this.requestPayment.equals(that.requestPayment) : that.requestPayment != null) return false;
            if (this.tagging != null ? !this.tagging.equals(that.tagging) : that.tagging != null) return false;
            if (this.versioning != null ? !this.versioning.equals(that.versioning) : that.versioning != null) return false;
            return this.website != null ? this.website.equals(that.website) : that.website == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.accelerate != null ? this.accelerate.hashCode() : 0);
            result = 31 * result + (this.acl != null ? this.acl.hashCode() : 0);
            result = 31 * result + (this.analytics != null ? this.analytics.hashCode() : 0);
            result = 31 * result + (this.cors != null ? this.cors.hashCode() : 0);
            result = 31 * result + (this.createBucketConfiguration != null ? this.createBucketConfiguration.hashCode() : 0);
            result = 31 * result + (this.encryption != null ? this.encryption.hashCode() : 0);
            result = 31 * result + (this.grantFullControl != null ? this.grantFullControl.hashCode() : 0);
            result = 31 * result + (this.grantRead != null ? this.grantRead.hashCode() : 0);
            result = 31 * result + (this.grantReadAcp != null ? this.grantReadAcp.hashCode() : 0);
            result = 31 * result + (this.grantWrite != null ? this.grantWrite.hashCode() : 0);
            result = 31 * result + (this.grantWriteAcp != null ? this.grantWriteAcp.hashCode() : 0);
            result = 31 * result + (this.intelligentTiering != null ? this.intelligentTiering.hashCode() : 0);
            result = 31 * result + (this.inventory != null ? this.inventory.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.logging != null ? this.logging.hashCode() : 0);
            result = 31 * result + (this.metrics != null ? this.metrics.hashCode() : 0);
            result = 31 * result + (this.notification != null ? this.notification.hashCode() : 0);
            result = 31 * result + (this.objectLockEnabledForBucket != null ? this.objectLockEnabledForBucket.hashCode() : 0);
            result = 31 * result + (this.ownershipControls != null ? this.ownershipControls.hashCode() : 0);
            result = 31 * result + (this.policy != null ? this.policy.hashCode() : 0);
            result = 31 * result + (this.publicAccessBlock != null ? this.publicAccessBlock.hashCode() : 0);
            result = 31 * result + (this.replication != null ? this.replication.hashCode() : 0);
            result = 31 * result + (this.requestPayment != null ? this.requestPayment.hashCode() : 0);
            result = 31 * result + (this.tagging != null ? this.tagging.hashCode() : 0);
            result = 31 * result + (this.versioning != null ? this.versioning.hashCode() : 0);
            result = 31 * result + (this.website != null ? this.website.hashCode() : 0);
            return result;
        }
    }
}
