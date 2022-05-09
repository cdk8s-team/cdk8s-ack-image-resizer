package imports.aws.k8s.services.s3;

/**
 * Specifies the inventory configuration for an Amazon S3 bucket.
 * <p>
 * For more information, see GET Bucket inventory (https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketGETInventoryConfig.html) in the Amazon S3 API Reference.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.398Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecInventory")
@software.amazon.jsii.Jsii.Proxy(BucketSpecInventory.Jsii$Proxy.class)
public interface BucketSpecInventory extends software.amazon.jsii.JsiiSerializable {

    /**
     * Specifies the inventory configuration for an Amazon S3 bucket.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecInventoryDestination getDestination() {
        return null;
    }

    /**
     * Specifies an inventory filter.
     * <p>
     * The inventory only includes objects that meet the filter's criteria.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecInventoryFilter getFilter() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getIncludedObjectVersions() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getIsEnabled() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getOptionalFields() {
        return null;
    }

    /**
     * Specifies the schedule for generating inventory results.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecInventorySchedule getSchedule() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecInventory}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecInventory}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecInventory> {
        imports.aws.k8s.services.s3.BucketSpecInventoryDestination destination;
        imports.aws.k8s.services.s3.BucketSpecInventoryFilter filter;
        java.lang.String id;
        java.lang.String includedObjectVersions;
        java.lang.Boolean isEnabled;
        java.util.List<java.lang.String> optionalFields;
        imports.aws.k8s.services.s3.BucketSpecInventorySchedule schedule;

        /**
         * Sets the value of {@link BucketSpecInventory#getDestination}
         * @param destination Specifies the inventory configuration for an Amazon S3 bucket.
         * @return {@code this}
         */
        public Builder destination(imports.aws.k8s.services.s3.BucketSpecInventoryDestination destination) {
            this.destination = destination;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecInventory#getFilter}
         * @param filter Specifies an inventory filter.
         *               The inventory only includes objects that meet the filter's criteria.
         * @return {@code this}
         */
        public Builder filter(imports.aws.k8s.services.s3.BucketSpecInventoryFilter filter) {
            this.filter = filter;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecInventory#getId}
         * @param id the value to be set.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecInventory#getIncludedObjectVersions}
         * @param includedObjectVersions the value to be set.
         * @return {@code this}
         */
        public Builder includedObjectVersions(java.lang.String includedObjectVersions) {
            this.includedObjectVersions = includedObjectVersions;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecInventory#getIsEnabled}
         * @param isEnabled the value to be set.
         * @return {@code this}
         */
        public Builder isEnabled(java.lang.Boolean isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecInventory#getOptionalFields}
         * @param optionalFields the value to be set.
         * @return {@code this}
         */
        public Builder optionalFields(java.util.List<java.lang.String> optionalFields) {
            this.optionalFields = optionalFields;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecInventory#getSchedule}
         * @param schedule Specifies the schedule for generating inventory results.
         * @return {@code this}
         */
        public Builder schedule(imports.aws.k8s.services.s3.BucketSpecInventorySchedule schedule) {
            this.schedule = schedule;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecInventory}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecInventory build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecInventory}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecInventory {
        private final imports.aws.k8s.services.s3.BucketSpecInventoryDestination destination;
        private final imports.aws.k8s.services.s3.BucketSpecInventoryFilter filter;
        private final java.lang.String id;
        private final java.lang.String includedObjectVersions;
        private final java.lang.Boolean isEnabled;
        private final java.util.List<java.lang.String> optionalFields;
        private final imports.aws.k8s.services.s3.BucketSpecInventorySchedule schedule;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.destination = software.amazon.jsii.Kernel.get(this, "destination", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecInventoryDestination.class));
            this.filter = software.amazon.jsii.Kernel.get(this, "filter", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecInventoryFilter.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.includedObjectVersions = software.amazon.jsii.Kernel.get(this, "includedObjectVersions", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.isEnabled = software.amazon.jsii.Kernel.get(this, "isEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.optionalFields = software.amazon.jsii.Kernel.get(this, "optionalFields", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.schedule = software.amazon.jsii.Kernel.get(this, "schedule", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecInventorySchedule.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.destination = builder.destination;
            this.filter = builder.filter;
            this.id = builder.id;
            this.includedObjectVersions = builder.includedObjectVersions;
            this.isEnabled = builder.isEnabled;
            this.optionalFields = builder.optionalFields;
            this.schedule = builder.schedule;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecInventoryDestination getDestination() {
            return this.destination;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecInventoryFilter getFilter() {
            return this.filter;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final java.lang.String getIncludedObjectVersions() {
            return this.includedObjectVersions;
        }

        @Override
        public final java.lang.Boolean getIsEnabled() {
            return this.isEnabled;
        }

        @Override
        public final java.util.List<java.lang.String> getOptionalFields() {
            return this.optionalFields;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecInventorySchedule getSchedule() {
            return this.schedule;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getDestination() != null) {
                data.set("destination", om.valueToTree(this.getDestination()));
            }
            if (this.getFilter() != null) {
                data.set("filter", om.valueToTree(this.getFilter()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getIncludedObjectVersions() != null) {
                data.set("includedObjectVersions", om.valueToTree(this.getIncludedObjectVersions()));
            }
            if (this.getIsEnabled() != null) {
                data.set("isEnabled", om.valueToTree(this.getIsEnabled()));
            }
            if (this.getOptionalFields() != null) {
                data.set("optionalFields", om.valueToTree(this.getOptionalFields()));
            }
            if (this.getSchedule() != null) {
                data.set("schedule", om.valueToTree(this.getSchedule()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecInventory"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecInventory.Jsii$Proxy that = (BucketSpecInventory.Jsii$Proxy) o;

            if (this.destination != null ? !this.destination.equals(that.destination) : that.destination != null) return false;
            if (this.filter != null ? !this.filter.equals(that.filter) : that.filter != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.includedObjectVersions != null ? !this.includedObjectVersions.equals(that.includedObjectVersions) : that.includedObjectVersions != null) return false;
            if (this.isEnabled != null ? !this.isEnabled.equals(that.isEnabled) : that.isEnabled != null) return false;
            if (this.optionalFields != null ? !this.optionalFields.equals(that.optionalFields) : that.optionalFields != null) return false;
            return this.schedule != null ? this.schedule.equals(that.schedule) : that.schedule == null;
        }

        @Override
        public final int hashCode() {
            int result = this.destination != null ? this.destination.hashCode() : 0;
            result = 31 * result + (this.filter != null ? this.filter.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.includedObjectVersions != null ? this.includedObjectVersions.hashCode() : 0);
            result = 31 * result + (this.isEnabled != null ? this.isEnabled.hashCode() : 0);
            result = 31 * result + (this.optionalFields != null ? this.optionalFields.hashCode() : 0);
            result = 31 * result + (this.schedule != null ? this.schedule.hashCode() : 0);
            return result;
        }
    }
}
