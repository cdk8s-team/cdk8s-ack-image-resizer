package imports.aws.k8s.services.s3;

/**
 * Specifies which Amazon S3 objects to replicate and where to store the replicas.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.408Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecReplicationRules")
@software.amazon.jsii.Jsii.Proxy(BucketSpecReplicationRules.Jsii$Proxy.class)
public interface BucketSpecReplicationRules extends software.amazon.jsii.JsiiSerializable {

    /**
     * Specifies whether Amazon S3 replicates delete markers.
     * <p>
     * If you specify a Filter in your replication configuration, you must also include a DeleteMarkerReplication element. If your Filter includes a Tag element, the DeleteMarkerReplication Status must be set to Disabled, because Amazon S3 does not support replicating delete markers for tag-based rules. For an example configuration, see Basic Rule Configuration (https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-add-config.html#replication-config-min-rule-config).
     * For more information about delete marker replication, see Basic Rule Configuration (https://docs.aws.amazon.com/AmazonS3/latest/dev/delete-marker-replication.html).
     * If you are using an earlier version of the replication configuration, Amazon S3 handles replication of delete markers differently. For more information, see Backward Compatibility (https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-add-config.html#replication-backward-compat-considerations).
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecReplicationRulesDeleteMarkerReplication getDeleteMarkerReplication() {
        return null;
    }

    /**
     * Specifies information about where to publish analysis or configuration results for an Amazon S3 bucket and S3 Replication Time Control (S3 RTC).
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecReplicationRulesDestination getDestination() {
        return null;
    }

    /**
     * Optional configuration to replicate existing source bucket objects.
     * <p>
     * For more information, see Replicating Existing Objects (https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-what-is-isnot-replicated.html#existing-object-replication) in the Amazon S3 User Guide.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecReplicationRulesExistingObjectReplication getExistingObjectReplication() {
        return null;
    }

    /**
     * A filter that identifies the subset of objects to which the replication rule applies.
     * <p>
     * A Filter must specify exactly one Prefix, Tag, or an And child element.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecReplicationRulesFilter getFilter() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPrefix() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getPriority() {
        return null;
    }

    /**
     * A container that describes additional filters for identifying the source objects that you want to replicate.
     * <p>
     * You can choose to enable or disable the replication of these objects. Currently, Amazon S3 supports only the filter that you can specify for objects created with server-side encryption using a customer managed key stored in Amazon Web Services Key Management Service (SSE-KMS).
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecReplicationRulesSourceSelectionCriteria getSourceSelectionCriteria() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getStatus() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecReplicationRules}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecReplicationRules}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecReplicationRules> {
        imports.aws.k8s.services.s3.BucketSpecReplicationRulesDeleteMarkerReplication deleteMarkerReplication;
        imports.aws.k8s.services.s3.BucketSpecReplicationRulesDestination destination;
        imports.aws.k8s.services.s3.BucketSpecReplicationRulesExistingObjectReplication existingObjectReplication;
        imports.aws.k8s.services.s3.BucketSpecReplicationRulesFilter filter;
        java.lang.String id;
        java.lang.String prefix;
        java.lang.Number priority;
        imports.aws.k8s.services.s3.BucketSpecReplicationRulesSourceSelectionCriteria sourceSelectionCriteria;
        java.lang.String status;

        /**
         * Sets the value of {@link BucketSpecReplicationRules#getDeleteMarkerReplication}
         * @param deleteMarkerReplication Specifies whether Amazon S3 replicates delete markers.
         *                                If you specify a Filter in your replication configuration, you must also include a DeleteMarkerReplication element. If your Filter includes a Tag element, the DeleteMarkerReplication Status must be set to Disabled, because Amazon S3 does not support replicating delete markers for tag-based rules. For an example configuration, see Basic Rule Configuration (https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-add-config.html#replication-config-min-rule-config).
         *                                For more information about delete marker replication, see Basic Rule Configuration (https://docs.aws.amazon.com/AmazonS3/latest/dev/delete-marker-replication.html).
         *                                If you are using an earlier version of the replication configuration, Amazon S3 handles replication of delete markers differently. For more information, see Backward Compatibility (https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-add-config.html#replication-backward-compat-considerations).
         * @return {@code this}
         */
        public Builder deleteMarkerReplication(imports.aws.k8s.services.s3.BucketSpecReplicationRulesDeleteMarkerReplication deleteMarkerReplication) {
            this.deleteMarkerReplication = deleteMarkerReplication;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecReplicationRules#getDestination}
         * @param destination Specifies information about where to publish analysis or configuration results for an Amazon S3 bucket and S3 Replication Time Control (S3 RTC).
         * @return {@code this}
         */
        public Builder destination(imports.aws.k8s.services.s3.BucketSpecReplicationRulesDestination destination) {
            this.destination = destination;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecReplicationRules#getExistingObjectReplication}
         * @param existingObjectReplication Optional configuration to replicate existing source bucket objects.
         *                                  For more information, see Replicating Existing Objects (https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-what-is-isnot-replicated.html#existing-object-replication) in the Amazon S3 User Guide.
         * @return {@code this}
         */
        public Builder existingObjectReplication(imports.aws.k8s.services.s3.BucketSpecReplicationRulesExistingObjectReplication existingObjectReplication) {
            this.existingObjectReplication = existingObjectReplication;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecReplicationRules#getFilter}
         * @param filter A filter that identifies the subset of objects to which the replication rule applies.
         *               A Filter must specify exactly one Prefix, Tag, or an And child element.
         * @return {@code this}
         */
        public Builder filter(imports.aws.k8s.services.s3.BucketSpecReplicationRulesFilter filter) {
            this.filter = filter;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecReplicationRules#getId}
         * @param id the value to be set.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecReplicationRules#getPrefix}
         * @param prefix the value to be set.
         * @return {@code this}
         */
        public Builder prefix(java.lang.String prefix) {
            this.prefix = prefix;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecReplicationRules#getPriority}
         * @param priority the value to be set.
         * @return {@code this}
         */
        public Builder priority(java.lang.Number priority) {
            this.priority = priority;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecReplicationRules#getSourceSelectionCriteria}
         * @param sourceSelectionCriteria A container that describes additional filters for identifying the source objects that you want to replicate.
         *                                You can choose to enable or disable the replication of these objects. Currently, Amazon S3 supports only the filter that you can specify for objects created with server-side encryption using a customer managed key stored in Amazon Web Services Key Management Service (SSE-KMS).
         * @return {@code this}
         */
        public Builder sourceSelectionCriteria(imports.aws.k8s.services.s3.BucketSpecReplicationRulesSourceSelectionCriteria sourceSelectionCriteria) {
            this.sourceSelectionCriteria = sourceSelectionCriteria;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecReplicationRules#getStatus}
         * @param status the value to be set.
         * @return {@code this}
         */
        public Builder status(java.lang.String status) {
            this.status = status;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecReplicationRules}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecReplicationRules build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecReplicationRules}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecReplicationRules {
        private final imports.aws.k8s.services.s3.BucketSpecReplicationRulesDeleteMarkerReplication deleteMarkerReplication;
        private final imports.aws.k8s.services.s3.BucketSpecReplicationRulesDestination destination;
        private final imports.aws.k8s.services.s3.BucketSpecReplicationRulesExistingObjectReplication existingObjectReplication;
        private final imports.aws.k8s.services.s3.BucketSpecReplicationRulesFilter filter;
        private final java.lang.String id;
        private final java.lang.String prefix;
        private final java.lang.Number priority;
        private final imports.aws.k8s.services.s3.BucketSpecReplicationRulesSourceSelectionCriteria sourceSelectionCriteria;
        private final java.lang.String status;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.deleteMarkerReplication = software.amazon.jsii.Kernel.get(this, "deleteMarkerReplication", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecReplicationRulesDeleteMarkerReplication.class));
            this.destination = software.amazon.jsii.Kernel.get(this, "destination", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecReplicationRulesDestination.class));
            this.existingObjectReplication = software.amazon.jsii.Kernel.get(this, "existingObjectReplication", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecReplicationRulesExistingObjectReplication.class));
            this.filter = software.amazon.jsii.Kernel.get(this, "filter", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecReplicationRulesFilter.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.prefix = software.amazon.jsii.Kernel.get(this, "prefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.priority = software.amazon.jsii.Kernel.get(this, "priority", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.sourceSelectionCriteria = software.amazon.jsii.Kernel.get(this, "sourceSelectionCriteria", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecReplicationRulesSourceSelectionCriteria.class));
            this.status = software.amazon.jsii.Kernel.get(this, "status", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.deleteMarkerReplication = builder.deleteMarkerReplication;
            this.destination = builder.destination;
            this.existingObjectReplication = builder.existingObjectReplication;
            this.filter = builder.filter;
            this.id = builder.id;
            this.prefix = builder.prefix;
            this.priority = builder.priority;
            this.sourceSelectionCriteria = builder.sourceSelectionCriteria;
            this.status = builder.status;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecReplicationRulesDeleteMarkerReplication getDeleteMarkerReplication() {
            return this.deleteMarkerReplication;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecReplicationRulesDestination getDestination() {
            return this.destination;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecReplicationRulesExistingObjectReplication getExistingObjectReplication() {
            return this.existingObjectReplication;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecReplicationRulesFilter getFilter() {
            return this.filter;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final java.lang.String getPrefix() {
            return this.prefix;
        }

        @Override
        public final java.lang.Number getPriority() {
            return this.priority;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecReplicationRulesSourceSelectionCriteria getSourceSelectionCriteria() {
            return this.sourceSelectionCriteria;
        }

        @Override
        public final java.lang.String getStatus() {
            return this.status;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getDeleteMarkerReplication() != null) {
                data.set("deleteMarkerReplication", om.valueToTree(this.getDeleteMarkerReplication()));
            }
            if (this.getDestination() != null) {
                data.set("destination", om.valueToTree(this.getDestination()));
            }
            if (this.getExistingObjectReplication() != null) {
                data.set("existingObjectReplication", om.valueToTree(this.getExistingObjectReplication()));
            }
            if (this.getFilter() != null) {
                data.set("filter", om.valueToTree(this.getFilter()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getPrefix() != null) {
                data.set("prefix", om.valueToTree(this.getPrefix()));
            }
            if (this.getPriority() != null) {
                data.set("priority", om.valueToTree(this.getPriority()));
            }
            if (this.getSourceSelectionCriteria() != null) {
                data.set("sourceSelectionCriteria", om.valueToTree(this.getSourceSelectionCriteria()));
            }
            if (this.getStatus() != null) {
                data.set("status", om.valueToTree(this.getStatus()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecReplicationRules"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecReplicationRules.Jsii$Proxy that = (BucketSpecReplicationRules.Jsii$Proxy) o;

            if (this.deleteMarkerReplication != null ? !this.deleteMarkerReplication.equals(that.deleteMarkerReplication) : that.deleteMarkerReplication != null) return false;
            if (this.destination != null ? !this.destination.equals(that.destination) : that.destination != null) return false;
            if (this.existingObjectReplication != null ? !this.existingObjectReplication.equals(that.existingObjectReplication) : that.existingObjectReplication != null) return false;
            if (this.filter != null ? !this.filter.equals(that.filter) : that.filter != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.prefix != null ? !this.prefix.equals(that.prefix) : that.prefix != null) return false;
            if (this.priority != null ? !this.priority.equals(that.priority) : that.priority != null) return false;
            if (this.sourceSelectionCriteria != null ? !this.sourceSelectionCriteria.equals(that.sourceSelectionCriteria) : that.sourceSelectionCriteria != null) return false;
            return this.status != null ? this.status.equals(that.status) : that.status == null;
        }

        @Override
        public final int hashCode() {
            int result = this.deleteMarkerReplication != null ? this.deleteMarkerReplication.hashCode() : 0;
            result = 31 * result + (this.destination != null ? this.destination.hashCode() : 0);
            result = 31 * result + (this.existingObjectReplication != null ? this.existingObjectReplication.hashCode() : 0);
            result = 31 * result + (this.filter != null ? this.filter.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.prefix != null ? this.prefix.hashCode() : 0);
            result = 31 * result + (this.priority != null ? this.priority.hashCode() : 0);
            result = 31 * result + (this.sourceSelectionCriteria != null ? this.sourceSelectionCriteria.hashCode() : 0);
            result = 31 * result + (this.status != null ? this.status.hashCode() : 0);
            return result;
        }
    }
}
