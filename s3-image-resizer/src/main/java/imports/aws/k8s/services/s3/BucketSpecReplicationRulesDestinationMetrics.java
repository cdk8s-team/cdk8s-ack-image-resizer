package imports.aws.k8s.services.s3;

/**
 * A container specifying replication metrics-related settings enabling replication metrics and events.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.410Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecReplicationRulesDestinationMetrics")
@software.amazon.jsii.Jsii.Proxy(BucketSpecReplicationRulesDestinationMetrics.Jsii$Proxy.class)
public interface BucketSpecReplicationRulesDestinationMetrics extends software.amazon.jsii.JsiiSerializable {

    /**
     * A container specifying the time value for S3 Replication Time Control (S3 RTC) and replication metrics EventThreshold.
     */
    default @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketSpecReplicationRulesDestinationMetricsEventThreshold getEventThreshold() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getStatus() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecReplicationRulesDestinationMetrics}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecReplicationRulesDestinationMetrics}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecReplicationRulesDestinationMetrics> {
        imports.aws.k8s.services.s3.BucketSpecReplicationRulesDestinationMetricsEventThreshold eventThreshold;
        java.lang.String status;

        /**
         * Sets the value of {@link BucketSpecReplicationRulesDestinationMetrics#getEventThreshold}
         * @param eventThreshold A container specifying the time value for S3 Replication Time Control (S3 RTC) and replication metrics EventThreshold.
         * @return {@code this}
         */
        public Builder eventThreshold(imports.aws.k8s.services.s3.BucketSpecReplicationRulesDestinationMetricsEventThreshold eventThreshold) {
            this.eventThreshold = eventThreshold;
            return this;
        }

        /**
         * Sets the value of {@link BucketSpecReplicationRulesDestinationMetrics#getStatus}
         * @param status the value to be set.
         * @return {@code this}
         */
        public Builder status(java.lang.String status) {
            this.status = status;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecReplicationRulesDestinationMetrics}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecReplicationRulesDestinationMetrics build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecReplicationRulesDestinationMetrics}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecReplicationRulesDestinationMetrics {
        private final imports.aws.k8s.services.s3.BucketSpecReplicationRulesDestinationMetricsEventThreshold eventThreshold;
        private final java.lang.String status;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.eventThreshold = software.amazon.jsii.Kernel.get(this, "eventThreshold", software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.s3.BucketSpecReplicationRulesDestinationMetricsEventThreshold.class));
            this.status = software.amazon.jsii.Kernel.get(this, "status", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.eventThreshold = builder.eventThreshold;
            this.status = builder.status;
        }

        @Override
        public final imports.aws.k8s.services.s3.BucketSpecReplicationRulesDestinationMetricsEventThreshold getEventThreshold() {
            return this.eventThreshold;
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

            if (this.getEventThreshold() != null) {
                data.set("eventThreshold", om.valueToTree(this.getEventThreshold()));
            }
            if (this.getStatus() != null) {
                data.set("status", om.valueToTree(this.getStatus()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecReplicationRulesDestinationMetrics"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecReplicationRulesDestinationMetrics.Jsii$Proxy that = (BucketSpecReplicationRulesDestinationMetrics.Jsii$Proxy) o;

            if (this.eventThreshold != null ? !this.eventThreshold.equals(that.eventThreshold) : that.eventThreshold != null) return false;
            return this.status != null ? this.status.equals(that.status) : that.status == null;
        }

        @Override
        public final int hashCode() {
            int result = this.eventThreshold != null ? this.eventThreshold.hashCode() : 0;
            result = 31 * result + (this.status != null ? this.status.hashCode() : 0);
            return result;
        }
    }
}
