package imports.aws.k8s.services.s3;

/**
 * Bucket is the Schema for the Buckets API.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T22:42:39.379Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.s3.$Module.class, fqn = "awsk8sservicess3.Bucket")
public class Bucket extends org.cdk8s.ApiObject {

    protected Bucket(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Bucket(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        GVK = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.k8s.services.s3.Bucket.class, "GVK", software.amazon.jsii.NativeType.forClass(org.cdk8s.GroupVersionKind.class));
    }

    /**
     * Defines a "Bucket" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param id a scope-local name for the object. This parameter is required.
     * @param props initialization props.
     */
    public Bucket(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketProps props) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), props });
    }

    /**
     * Defines a "Bucket" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param id a scope-local name for the object. This parameter is required.
     */
    public Bucket(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required") });
    }

    /**
     * Renders a Kubernetes manifest for "Bucket".
     * <p>
     * This can be used to inline resource manifests inside other objects (e.g. as templates).
     * <p>
     * @param props initialization props.
     */
    public static @org.jetbrains.annotations.NotNull java.lang.Object manifest(final @org.jetbrains.annotations.Nullable imports.aws.k8s.services.s3.BucketProps props) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(imports.aws.k8s.services.s3.Bucket.class, "manifest", software.amazon.jsii.NativeType.forClass(java.lang.Object.class), new Object[] { props });
    }

    /**
     * Renders a Kubernetes manifest for "Bucket".
     * <p>
     * This can be used to inline resource manifests inside other objects (e.g. as templates).
     */
    public static @org.jetbrains.annotations.NotNull java.lang.Object manifest() {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(imports.aws.k8s.services.s3.Bucket.class, "manifest", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    /**
     * Renders the object to Kubernetes JSON.
     */
    @Override
    public @org.jetbrains.annotations.NotNull java.lang.Object toJson() {
        return software.amazon.jsii.Kernel.call(this, "toJson", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    /**
     * Returns the apiVersion and kind for "Bucket".
     */
    public final static org.cdk8s.GroupVersionKind GVK;

    /**
     * A fluent builder for {@link imports.aws.k8s.services.s3.Bucket}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.k8s.services.s3.Bucket> {
        /**
         * @return a new instance of {@link Builder}.
         * @param scope the scope in which to define this object. This parameter is required.
         * @param id a scope-local name for the object. This parameter is required.
         */
        public static Builder create(final software.constructs.Construct scope, final java.lang.String id) {
            return new Builder(scope, id);
        }

        private final software.constructs.Construct scope;
        private final java.lang.String id;
        private imports.aws.k8s.services.s3.BucketProps.Builder props;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
        }

        /**
         * @return {@code this}
         * @param metadata This parameter is required.
         */
        public Builder metadata(final org.cdk8s.ApiObjectMetadata metadata) {
            this.props().metadata(metadata);
            return this;
        }

        /**
         * BucketSpec defines the desired state of Bucket.
         * <p>
         * In terms of implementation, a Bucket is a resource. An Amazon S3 bucket name is globally unique, and the namespace is shared by all Amazon Web Services accounts.
         * <p>
         * @return {@code this}
         * @param spec BucketSpec defines the desired state of Bucket. This parameter is required.
         */
        public Builder spec(final imports.aws.k8s.services.s3.BucketSpec spec) {
            this.props().spec(spec);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.k8s.services.s3.Bucket}.
         */
        @Override
        public imports.aws.k8s.services.s3.Bucket build() {
            return new imports.aws.k8s.services.s3.Bucket(
                this.scope,
                this.id,
                this.props != null ? this.props.build() : null
            );
        }

        private imports.aws.k8s.services.s3.BucketProps.Builder props() {
            if (this.props == null) {
                this.props = new imports.aws.k8s.services.s3.BucketProps.Builder();
            }
            return this.props;
        }
    }
}
