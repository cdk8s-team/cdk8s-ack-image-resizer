package imports.aws.k8s.services.s3;

/**
 * A container specifying S3 Replication Time Control (S3 RTC) related information, including whether S3 RTC is enabled and the time when all objects and operations on objects must be replicated.
 * <p>
 * Must be specified together with a Metrics block.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.410Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecReplicationRulesDestinationReplicationTime")
@software.amazon.jsii.Jsii.Proxy(BucketSpecReplicationRulesDestinationReplicationTime.Jsii$Proxy.class)
public interface BucketSpecReplicationRulesDestinationReplicationTime extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getStatus() {
        return null;
    }

    /**
     * A container specifying the time value for S3 Replication Time Control (S3 RTC) and replication metrics EventThreshold.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecReplicationRulesDestinationReplicationTimeTime getTime() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecReplicationRulesDestinationReplicationTime}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecReplicationRulesDestinationReplicationTime}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecReplicationRulesDestinationReplicationTime> {
        java.lang.String status;
        imports.aws.k8s.services.s3.BucketSpecReplicationRulesDestinationReplicationTimeTime time;

        /**
         * Sets the value of {@link BucketSpecReplicationRulesDestinationReplicationTime#getStatus}
         * @param status the value to be set.
         * @return {@code this}
         */
        public Builder status(java.lang.String status) {
            this.status = status;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecReplicationRulesDestinationReplicationTime#getTime}
         * @param time A container specifying the time value for S3 Replication Time Control (S3 RTC) and replication metrics EventThreshold.
         * @return {@code this}
         */
        public Builder time(imports.aws.k8s.services.s3.BucketSpecReplicationRulesDestinationReplicationTimeTime time) {
            this.time = time;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecReplicationRulesDestinationReplicationTime}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecReplicationRulesDestinationReplicationTime build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecReplicationRulesDestinationReplicationTime}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecReplicationRulesDestinationReplicationTime {
        private final java.lang.String status;
        private final imports.aws.k8s.services.s3.BucketSpecReplicationRulesDestinationReplicationTimeTime time;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.status = software.amazon.jsii.Kernel.get(this, "status", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.time = software.amazon.jsii.Kernel.get(this, "time", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecReplicationRulesDestinationReplicationTimeTime.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.status = builder.status;
            this.time = builder.time;
        }

        @Override
        public final java.lang.String getStatus() {
            return this.status;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecReplicationRulesDestinationReplicationTimeTime getTime() {
            return this.time;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getStatus() != null) {
                data.set("status", om.valueToTree(this.getStatus()));
            }
            if (this.getTime() != null) {
                data.set("time", om.valueToTree(this.getTime()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecReplicationRulesDestinationReplicationTime"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecReplicationRulesDestinationReplicationTime.Jsii$Proxy that = (BucketSpecReplicationRulesDestinationReplicationTime.Jsii$Proxy) o;

            if (this.status != null ? !this.status.equals(that.status) : that.status != null) return false;
            return this.time != null ? this.time.equals(that.time) : that.time == null;
        }

        @Override
        public final int hashCode() {
            int result = this.status != null ? this.status.hashCode() : 0;
            result = 31 * result + (this.time != null ? this.time.hashCode() : 0);
            return result;
        }
    }
}
