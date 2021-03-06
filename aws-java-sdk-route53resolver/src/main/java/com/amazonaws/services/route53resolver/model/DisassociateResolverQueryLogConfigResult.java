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
package com.amazonaws.services.route53resolver.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/DisassociateResolverQueryLogConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateResolverQueryLogConfigResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A complex type that contains settings for the association that you deleted between an Amazon VPC and a query
     * logging configuration.
     * </p>
     */
    private ResolverQueryLogConfigAssociation resolverQueryLogConfigAssociation;

    /**
     * <p>
     * A complex type that contains settings for the association that you deleted between an Amazon VPC and a query
     * logging configuration.
     * </p>
     * 
     * @param resolverQueryLogConfigAssociation
     *        A complex type that contains settings for the association that you deleted between an Amazon VPC and a
     *        query logging configuration.
     */

    public void setResolverQueryLogConfigAssociation(ResolverQueryLogConfigAssociation resolverQueryLogConfigAssociation) {
        this.resolverQueryLogConfigAssociation = resolverQueryLogConfigAssociation;
    }

    /**
     * <p>
     * A complex type that contains settings for the association that you deleted between an Amazon VPC and a query
     * logging configuration.
     * </p>
     * 
     * @return A complex type that contains settings for the association that you deleted between an Amazon VPC and a
     *         query logging configuration.
     */

    public ResolverQueryLogConfigAssociation getResolverQueryLogConfigAssociation() {
        return this.resolverQueryLogConfigAssociation;
    }

    /**
     * <p>
     * A complex type that contains settings for the association that you deleted between an Amazon VPC and a query
     * logging configuration.
     * </p>
     * 
     * @param resolverQueryLogConfigAssociation
     *        A complex type that contains settings for the association that you deleted between an Amazon VPC and a
     *        query logging configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateResolverQueryLogConfigResult withResolverQueryLogConfigAssociation(ResolverQueryLogConfigAssociation resolverQueryLogConfigAssociation) {
        setResolverQueryLogConfigAssociation(resolverQueryLogConfigAssociation);
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
        if (getResolverQueryLogConfigAssociation() != null)
            sb.append("ResolverQueryLogConfigAssociation: ").append(getResolverQueryLogConfigAssociation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateResolverQueryLogConfigResult == false)
            return false;
        DisassociateResolverQueryLogConfigResult other = (DisassociateResolverQueryLogConfigResult) obj;
        if (other.getResolverQueryLogConfigAssociation() == null ^ this.getResolverQueryLogConfigAssociation() == null)
            return false;
        if (other.getResolverQueryLogConfigAssociation() != null
                && other.getResolverQueryLogConfigAssociation().equals(this.getResolverQueryLogConfigAssociation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResolverQueryLogConfigAssociation() == null) ? 0 : getResolverQueryLogConfigAssociation().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateResolverQueryLogConfigResult clone() {
        try {
            return (DisassociateResolverQueryLogConfigResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
