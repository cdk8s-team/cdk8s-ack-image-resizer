package imports.aws.k8s.services.iam;

/**
 * RoleSpec defines the desired state of Role.
 * <p>
 * Contains information about an IAM role. This structure is returned as a response element in several API operations that interact with roles.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.57.0 (build f614666)", date = "2022-05-08T23:07:01.842Z")
@software.amazon.jsii.Jsii(module = imports.aws.k8s.services.iam.$Module.class, fqn = "awsk8sservicesiam.RoleSpec")
@software.amazon.jsii.Jsii.Proxy(RoleSpec.Jsii$Proxy.class)
public interface RoleSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * The trust relationship policy document that grants an entity permission to assume the role.
     * <p>
     * In IAM, you must provide a JSON policy that has been converted to a string. However, for CloudFormation templates formatted in YAML, you can provide the policy in JSON or YAML format. CloudFormation always converts a YAML policy to JSON format before submitting it to IAM.
     * The regex pattern (http://wikipedia.org/wiki/regex) used to validate this parameter is a string of characters consisting of the following:
     * <p>
     * <ul>
     * <li>Any printable ASCII character ranging from the space character (\u0020)    through the end of the ASCII character range</li>
     * <li>The printable characters in the Basic Latin and Latin-1 Supplement character    set (through \u00FF)</li>
     * <li>The special characters tab (\u0009), line feed (\u000A), and carriage    return (\u000D)
     * Upon success, the response includes the same trust policy in JSON format.</li>
     * </ul>
     */
    @org.jetbrains.annotations.NotNull java.lang.String getAssumeRolePolicyDocument();

    /**
     * The name of the role to create.
     * <p>
     * IAM user, group, role, and policy names must be unique within the account. Names are not distinguished by case. For example, you cannot create resources named both "MyResource" and "myresource".
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * A description of the role.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    /**
     * The maximum session duration (in seconds) that you want to set for the specified role.
     * <p>
     * If you do not specify a value for this setting, the default maximum of one hour is applied. This setting can have a value from 1 hour to 12 hours.
     * Anyone who assumes the role from the or API can use the DurationSeconds API parameter or the duration-seconds CLI parameter to request a longer session. The MaxSessionDuration setting determines the maximum duration that can be requested using the DurationSeconds parameter. If users don't specify a value for the DurationSeconds parameter, their security credentials are valid for one hour by default. This applies when you use the AssumeRole* API operations or the assume-role* CLI operations but does not apply when you use those operations to create a console URL. For more information, see Using IAM roles (https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html) in the IAM User Guide.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMaxSessionDuration() {
        return null;
    }

    /**
     * The path to the role.
     * <p>
     * For more information about paths, see IAM Identifiers (https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) in the IAM User Guide.
     * This parameter is optional. If it is not included, it defaults to a slash (/).
     * This parameter allows (through its regex pattern (http://wikipedia.org/wiki/regex)) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (\u0021) through the DEL character (\u007F), including most punctuation characters, digits, and upper and lowercased letters.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPath() {
        return null;
    }

    /**
     * The ARN of the policy that is used to set the permissions boundary for the role.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPermissionsBoundary() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getPolicies() {
        return null;
    }

    /**
     * A list of tags that you want to attach to the new role.
     * <p>
     * Each tag consists of a key name and an associated value. For more information about tagging, see Tagging IAM resources (https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in the IAM User Guide.
     * If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.aws.k8s.services.iam.RoleSpecTags> getTags() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link RoleSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link RoleSpec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<RoleSpec> {
        java.lang.String assumeRolePolicyDocument;
        java.lang.String name;
        java.lang.String description;
        java.lang.Number maxSessionDuration;
        java.lang.String path;
        java.lang.String permissionsBoundary;
        java.util.List<java.lang.String> policies;
        java.util.List<imports.aws.k8s.services.iam.RoleSpecTags> tags;

        /**
         * Sets the value of {@link RoleSpec#getAssumeRolePolicyDocument}
         * @param assumeRolePolicyDocument The trust relationship policy document that grants an entity permission to assume the role. This parameter is required.
         *                                 In IAM, you must provide a JSON policy that has been converted to a string. However, for CloudFormation templates formatted in YAML, you can provide the policy in JSON or YAML format. CloudFormation always converts a YAML policy to JSON format before submitting it to IAM.
         *                                 The regex pattern (http://wikipedia.org/wiki/regex) used to validate this parameter is a string of characters consisting of the following:
         *                                 <p>
         *                                 <ul>
         *                                 <li>Any printable ASCII character ranging from the space character (\u0020)    through the end of the ASCII character range</li>
         *                                 <li>The printable characters in the Basic Latin and Latin-1 Supplement character    set (through \u00FF)</li>
         *                                 <li>The special characters tab (\u0009), line feed (\u000A), and carriage    return (\u000D)
         *                                 Upon success, the response includes the same trust policy in JSON format.</li>
         *                                 </ul>
         * @return {@code this}
         */
        public Builder assumeRolePolicyDocument(java.lang.String assumeRolePolicyDocument) {
            this.assumeRolePolicyDocument = assumeRolePolicyDocument;
            return this;
        }

        /**
         * Sets the value of {@link RoleSpec#getName}
         * @param name The name of the role to create. This parameter is required.
         *             IAM user, group, role, and policy names must be unique within the account. Names are not distinguished by case. For example, you cannot create resources named both "MyResource" and "myresource".
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link RoleSpec#getDescription}
         * @param description A description of the role.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link RoleSpec#getMaxSessionDuration}
         * @param maxSessionDuration The maximum session duration (in seconds) that you want to set for the specified role.
         *                           If you do not specify a value for this setting, the default maximum of one hour is applied. This setting can have a value from 1 hour to 12 hours.
         *                           Anyone who assumes the role from the or API can use the DurationSeconds API parameter or the duration-seconds CLI parameter to request a longer session. The MaxSessionDuration setting determines the maximum duration that can be requested using the DurationSeconds parameter. If users don't specify a value for the DurationSeconds parameter, their security credentials are valid for one hour by default. This applies when you use the AssumeRole* API operations or the assume-role* CLI operations but does not apply when you use those operations to create a console URL. For more information, see Using IAM roles (https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html) in the IAM User Guide.
         * @return {@code this}
         */
        public Builder maxSessionDuration(java.lang.Number maxSessionDuration) {
            this.maxSessionDuration = maxSessionDuration;
            return this;
        }

        /**
         * Sets the value of {@link RoleSpec#getPath}
         * @param path The path to the role.
         *             For more information about paths, see IAM Identifiers (https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) in the IAM User Guide.
         *             This parameter is optional. If it is not included, it defaults to a slash (/).
         *             This parameter allows (through its regex pattern (http://wikipedia.org/wiki/regex)) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (\u0021) through the DEL character (\u007F), including most punctuation characters, digits, and upper and lowercased letters.
         * @return {@code this}
         */
        public Builder path(java.lang.String path) {
            this.path = path;
            return this;
        }

        /**
         * Sets the value of {@link RoleSpec#getPermissionsBoundary}
         * @param permissionsBoundary The ARN of the policy that is used to set the permissions boundary for the role.
         * @return {@code this}
         */
        public Builder permissionsBoundary(java.lang.String permissionsBoundary) {
            this.permissionsBoundary = permissionsBoundary;
            return this;
        }

        /**
         * Sets the value of {@link RoleSpec#getPolicies}
         * @param policies the value to be set.
         * @return {@code this}
         */
        public Builder policies(java.util.List<java.lang.String> policies) {
            this.policies = policies;
            return this;
        }

        /**
         * Sets the value of {@link RoleSpec#getTags}
         * @param tags A list of tags that you want to attach to the new role.
         *             Each tag consists of a key name and an associated value. For more information about tagging, see Tagging IAM resources (https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in the IAM User Guide.
         *             If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder tags(java.util.List<? extends imports.aws.k8s.services.iam.RoleSpecTags> tags) {
            this.tags = (java.util.List<imports.aws.k8s.services.iam.RoleSpecTags>)tags;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link RoleSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public RoleSpec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link RoleSpec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements RoleSpec {
        private final java.lang.String assumeRolePolicyDocument;
        private final java.lang.String name;
        private final java.lang.String description;
        private final java.lang.Number maxSessionDuration;
        private final java.lang.String path;
        private final java.lang.String permissionsBoundary;
        private final java.util.List<java.lang.String> policies;
        private final java.util.List<imports.aws.k8s.services.iam.RoleSpecTags> tags;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.assumeRolePolicyDocument = software.amazon.jsii.Kernel.get(this, "assumeRolePolicyDocument", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.maxSessionDuration = software.amazon.jsii.Kernel.get(this, "maxSessionDuration", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.path = software.amazon.jsii.Kernel.get(this, "path", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.permissionsBoundary = software.amazon.jsii.Kernel.get(this, "permissionsBoundary", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.policies = software.amazon.jsii.Kernel.get(this, "policies", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.aws.k8s.services.iam.RoleSpecTags.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.assumeRolePolicyDocument = java.util.Objects.requireNonNull(builder.assumeRolePolicyDocument, "assumeRolePolicyDocument is required");
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.description = builder.description;
            this.maxSessionDuration = builder.maxSessionDuration;
            this.path = builder.path;
            this.permissionsBoundary = builder.permissionsBoundary;
            this.policies = builder.policies;
            this.tags = (java.util.List<imports.aws.k8s.services.iam.RoleSpecTags>)builder.tags;
        }

        @Override
        public final java.lang.String getAssumeRolePolicyDocument() {
            return this.assumeRolePolicyDocument;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.lang.Number getMaxSessionDuration() {
            return this.maxSessionDuration;
        }

        @Override
        public final java.lang.String getPath() {
            return this.path;
        }

        @Override
        public final java.lang.String getPermissionsBoundary() {
            return this.permissionsBoundary;
        }

        @Override
        public final java.util.List<java.lang.String> getPolicies() {
            return this.policies;
        }

        @Override
        public final java.util.List<imports.aws.k8s.services.iam.RoleSpecTags> getTags() {
            return this.tags;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("assumeRolePolicyDocument", om.valueToTree(this.getAssumeRolePolicyDocument()));
            data.set("name", om.valueToTree(this.getName()));
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getMaxSessionDuration() != null) {
                data.set("maxSessionDuration", om.valueToTree(this.getMaxSessionDuration()));
            }
            if (this.getPath() != null) {
                data.set("path", om.valueToTree(this.getPath()));
            }
            if (this.getPermissionsBoundary() != null) {
                data.set("permissionsBoundary", om.valueToTree(this.getPermissionsBoundary()));
            }
            if (this.getPolicies() != null) {
                data.set("policies", om.valueToTree(this.getPolicies()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("awsk8sservicesiam.RoleSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            RoleSpec.Jsii$Proxy that = (RoleSpec.Jsii$Proxy) o;

            if (!assumeRolePolicyDocument.equals(that.assumeRolePolicyDocument)) return false;
            if (!name.equals(that.name)) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.maxSessionDuration != null ? !this.maxSessionDuration.equals(that.maxSessionDuration) : that.maxSessionDuration != null) return false;
            if (this.path != null ? !this.path.equals(that.path) : that.path != null) return false;
            if (this.permissionsBoundary != null ? !this.permissionsBoundary.equals(that.permissionsBoundary) : that.permissionsBoundary != null) return false;
            if (this.policies != null ? !this.policies.equals(that.policies) : that.policies != null) return false;
            return this.tags != null ? this.tags.equals(that.tags) : that.tags == null;
        }

        @Override
        public final int hashCode() {
            int result = this.assumeRolePolicyDocument.hashCode();
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.maxSessionDuration != null ? this.maxSessionDuration.hashCode() : 0);
            result = 31 * result + (this.path != null ? this.path.hashCode() : 0);
            result = 31 * result + (this.permissionsBoundary != null ? this.permissionsBoundary.hashCode() : 0);
            result = 31 * result + (this.policies != null ? this.policies.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            return result;
        }
    }
}
