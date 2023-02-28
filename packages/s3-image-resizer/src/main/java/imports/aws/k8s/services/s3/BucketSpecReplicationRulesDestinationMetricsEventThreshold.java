package imports.aws.k8s.services.s3;

/**
 * A container specifying the time value for S3 Replication Time Control (S3 RTC) and replication metrics EventThreshold.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.410Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.BucketSpecReplicationRulesDestinationMetricsEventThreshold")
@software.amazon.jsii.Jsii.Proxy(BucketSpecReplicationRulesDestinationMetricsEventThreshold.Jsii$Proxy.class)
public interface BucketSpecReplicationRulesDestinationMetricsEventThreshold extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMinutes() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BucketSpecReplicationRulesDestinationMetricsEventThreshold}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BucketSpecReplicationRulesDestinationMetricsEventThreshold}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BucketSpecReplicationRulesDestinationMetricsEventThreshold> {
        java.lang.Number minutes;

        /**
         * Sets the value of {@link BucketSpecReplicationRulesDestinationMetricsEventThreshold#getMinutes}
         * @param minutes the value to be set.
         * @return {@code this}
         */
        public Builder minutes(java.lang.Number minutes) {
            this.minutes = minutes;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BucketSpecReplicationRulesDestinationMetricsEventThreshold}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BucketSpecReplicationRulesDestinationMetricsEventThreshold build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BucketSpecReplicationRulesDestinationMetricsEventThreshold}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BucketSpecReplicationRulesDestinationMetricsEventThreshold {
        private final java.lang.Number minutes;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.minutes = software.amazon.jsii.Kernel.get(this, "minutes", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.minutes = builder.minutes;
        }

        @Override
        public final java.lang.Number getMinutes() {
            return this.minutes;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMinutes() != null) {
                data.set("minutes", om.valueToTree(this.getMinutes()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicess3.BucketSpecReplicationRulesDestinationMetricsEventThreshold"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BucketSpecReplicationRulesDestinationMetricsEventThreshold.Jsii$Proxy that = (BucketSpecReplicationRulesDestinationMetricsEventThreshold.Jsii$Proxy) o;

            return this.minutes != null ? this.minutes.equals(that.minutes) : that.minutes == null;
        }

        @Override
        public final int hashCode() {
            int result = this.minutes != null ? this.minutes.hashCode() : 0;
            return result;
        }
    }
}
