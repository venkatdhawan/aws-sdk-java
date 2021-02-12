/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/UpdateSAMLProvider" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSAMLProviderRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An XML document generated by an identity provider (IdP) that supports SAML 2.0. The document includes the
     * issuer's name, expiration information, and keys that can be used to validate the SAML authentication response
     * (assertions) that are received from the IdP. You must generate the metadata document using the identity
     * management software that is used as your organization's IdP.
     * </p>
     */
    private String sAMLMetadataDocument;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SAML provider to update.
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     */
    private String sAMLProviderArn;

    /**
     * <p>
     * An XML document generated by an identity provider (IdP) that supports SAML 2.0. The document includes the
     * issuer's name, expiration information, and keys that can be used to validate the SAML authentication response
     * (assertions) that are received from the IdP. You must generate the metadata document using the identity
     * management software that is used as your organization's IdP.
     * </p>
     * 
     * @param sAMLMetadataDocument
     *        An XML document generated by an identity provider (IdP) that supports SAML 2.0. The document includes the
     *        issuer's name, expiration information, and keys that can be used to validate the SAML authentication
     *        response (assertions) that are received from the IdP. You must generate the metadata document using the
     *        identity management software that is used as your organization's IdP.
     */

    public void setSAMLMetadataDocument(String sAMLMetadataDocument) {
        this.sAMLMetadataDocument = sAMLMetadataDocument;
    }

    /**
     * <p>
     * An XML document generated by an identity provider (IdP) that supports SAML 2.0. The document includes the
     * issuer's name, expiration information, and keys that can be used to validate the SAML authentication response
     * (assertions) that are received from the IdP. You must generate the metadata document using the identity
     * management software that is used as your organization's IdP.
     * </p>
     * 
     * @return An XML document generated by an identity provider (IdP) that supports SAML 2.0. The document includes the
     *         issuer's name, expiration information, and keys that can be used to validate the SAML authentication
     *         response (assertions) that are received from the IdP. You must generate the metadata document using the
     *         identity management software that is used as your organization's IdP.
     */

    public String getSAMLMetadataDocument() {
        return this.sAMLMetadataDocument;
    }

    /**
     * <p>
     * An XML document generated by an identity provider (IdP) that supports SAML 2.0. The document includes the
     * issuer's name, expiration information, and keys that can be used to validate the SAML authentication response
     * (assertions) that are received from the IdP. You must generate the metadata document using the identity
     * management software that is used as your organization's IdP.
     * </p>
     * 
     * @param sAMLMetadataDocument
     *        An XML document generated by an identity provider (IdP) that supports SAML 2.0. The document includes the
     *        issuer's name, expiration information, and keys that can be used to validate the SAML authentication
     *        response (assertions) that are received from the IdP. You must generate the metadata document using the
     *        identity management software that is used as your organization's IdP.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSAMLProviderRequest withSAMLMetadataDocument(String sAMLMetadataDocument) {
        setSAMLMetadataDocument(sAMLMetadataDocument);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SAML provider to update.
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param sAMLProviderArn
     *        The Amazon Resource Name (ARN) of the SAML provider to update.</p>
     *        <p>
     *        For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs)</a> in the <i>AWS General Reference</i>.
     */

    public void setSAMLProviderArn(String sAMLProviderArn) {
        this.sAMLProviderArn = sAMLProviderArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SAML provider to update.
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the SAML provider to update.</p>
     *         <p>
     *         For more information about ARNs, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *         (ARNs)</a> in the <i>AWS General Reference</i>.
     */

    public String getSAMLProviderArn() {
        return this.sAMLProviderArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SAML provider to update.
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param sAMLProviderArn
     *        The Amazon Resource Name (ARN) of the SAML provider to update.</p>
     *        <p>
     *        For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs)</a> in the <i>AWS General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSAMLProviderRequest withSAMLProviderArn(String sAMLProviderArn) {
        setSAMLProviderArn(sAMLProviderArn);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSAMLMetadataDocument() != null)
            sb.append("SAMLMetadataDocument: ").append(getSAMLMetadataDocument()).append(",");
        if (getSAMLProviderArn() != null)
            sb.append("SAMLProviderArn: ").append(getSAMLProviderArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSAMLProviderRequest == false)
            return false;
        UpdateSAMLProviderRequest other = (UpdateSAMLProviderRequest) obj;
        if (other.getSAMLMetadataDocument() == null ^ this.getSAMLMetadataDocument() == null)
            return false;
        if (other.getSAMLMetadataDocument() != null && other.getSAMLMetadataDocument().equals(this.getSAMLMetadataDocument()) == false)
            return false;
        if (other.getSAMLProviderArn() == null ^ this.getSAMLProviderArn() == null)
            return false;
        if (other.getSAMLProviderArn() != null && other.getSAMLProviderArn().equals(this.getSAMLProviderArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSAMLMetadataDocument() == null) ? 0 : getSAMLMetadataDocument().hashCode());
        hashCode = prime * hashCode + ((getSAMLProviderArn() == null) ? 0 : getSAMLProviderArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSAMLProviderRequest clone() {
        return (UpdateSAMLProviderRequest) super.clone();
    }

}
