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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/UpdateWebACL" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateWebACLRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Web ACL. You cannot change the name of a Web ACL after you create it.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Specifies whether this is for an AWS CloudFront distribution or for a regional application. A regional
     * application can be an Application Load Balancer (ALB), an API Gateway REST API, or an AppSync GraphQL API.
     * </p>
     * <p>
     * To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CLI - Specify the Region when you use the CloudFront scope: <code>--scope=CLOUDFRONT --region=us-east-1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * API and SDKs - For all calls, use the Region endpoint us-east-1.
     * </p>
     * </li>
     * </ul>
     */
    private String scope;
    /**
     * <p>
     * The unique identifier for the Web ACL. This ID is returned in the responses to create and list commands. You
     * provide it to operations like update and delete.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The action to perform if none of the <code>Rules</code> contained in the <code>WebACL</code> match.
     * </p>
     */
    private DefaultAction defaultAction;
    /**
     * <p>
     * A description of the Web ACL that helps with identification.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The <a>Rule</a> statements used to identify the web requests that you want to allow, block, or count. Each rule
     * includes one top-level statement that AWS WAF uses to identify matching web requests, and parameters that govern
     * how AWS WAF handles them.
     * </p>
     */
    private java.util.List<Rule> rules;
    /**
     * <p>
     * Defines and enables Amazon CloudWatch metrics and web request sample collection.
     * </p>
     */
    private VisibilityConfig visibilityConfig;
    /**
     * <p>
     * A token used for optimistic locking. AWS WAF returns a token to your get and list requests, to mark the state of
     * the entity at the time of the request. To make changes to the entity associated with the token, you provide the
     * token to operations like update and delete. AWS WAF uses the token to ensure that no changes have been made to
     * the entity since you last retrieved it. If a change has been made, the update fails with a
     * <code>WAFOptimisticLockException</code>. If this happens, perform another get, and use the new token returned by
     * that operation.
     * </p>
     */
    private String lockToken;

    /**
     * <p>
     * The name of the Web ACL. You cannot change the name of a Web ACL after you create it.
     * </p>
     * 
     * @param name
     *        The name of the Web ACL. You cannot change the name of a Web ACL after you create it.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Web ACL. You cannot change the name of a Web ACL after you create it.
     * </p>
     * 
     * @return The name of the Web ACL. You cannot change the name of a Web ACL after you create it.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Web ACL. You cannot change the name of a Web ACL after you create it.
     * </p>
     * 
     * @param name
     *        The name of the Web ACL. You cannot change the name of a Web ACL after you create it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWebACLRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies whether this is for an AWS CloudFront distribution or for a regional application. A regional
     * application can be an Application Load Balancer (ALB), an API Gateway REST API, or an AppSync GraphQL API.
     * </p>
     * <p>
     * To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CLI - Specify the Region when you use the CloudFront scope: <code>--scope=CLOUDFRONT --region=us-east-1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * API and SDKs - For all calls, use the Region endpoint us-east-1.
     * </p>
     * </li>
     * </ul>
     * 
     * @param scope
     *        Specifies whether this is for an AWS CloudFront distribution or for a regional application. A regional
     *        application can be an Application Load Balancer (ALB), an API Gateway REST API, or an AppSync GraphQL API.
     *        </p>
     *        <p>
     *        To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CLI - Specify the Region when you use the CloudFront scope:
     *        <code>--scope=CLOUDFRONT --region=us-east-1</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        API and SDKs - For all calls, use the Region endpoint us-east-1.
     *        </p>
     *        </li>
     * @see Scope
     */

    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * <p>
     * Specifies whether this is for an AWS CloudFront distribution or for a regional application. A regional
     * application can be an Application Load Balancer (ALB), an API Gateway REST API, or an AppSync GraphQL API.
     * </p>
     * <p>
     * To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CLI - Specify the Region when you use the CloudFront scope: <code>--scope=CLOUDFRONT --region=us-east-1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * API and SDKs - For all calls, use the Region endpoint us-east-1.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies whether this is for an AWS CloudFront distribution or for a regional application. A regional
     *         application can be an Application Load Balancer (ALB), an API Gateway REST API, or an AppSync GraphQL
     *         API. </p>
     *         <p>
     *         To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         CLI - Specify the Region when you use the CloudFront scope:
     *         <code>--scope=CLOUDFRONT --region=us-east-1</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         API and SDKs - For all calls, use the Region endpoint us-east-1.
     *         </p>
     *         </li>
     * @see Scope
     */

    public String getScope() {
        return this.scope;
    }

    /**
     * <p>
     * Specifies whether this is for an AWS CloudFront distribution or for a regional application. A regional
     * application can be an Application Load Balancer (ALB), an API Gateway REST API, or an AppSync GraphQL API.
     * </p>
     * <p>
     * To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CLI - Specify the Region when you use the CloudFront scope: <code>--scope=CLOUDFRONT --region=us-east-1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * API and SDKs - For all calls, use the Region endpoint us-east-1.
     * </p>
     * </li>
     * </ul>
     * 
     * @param scope
     *        Specifies whether this is for an AWS CloudFront distribution or for a regional application. A regional
     *        application can be an Application Load Balancer (ALB), an API Gateway REST API, or an AppSync GraphQL API.
     *        </p>
     *        <p>
     *        To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CLI - Specify the Region when you use the CloudFront scope:
     *        <code>--scope=CLOUDFRONT --region=us-east-1</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        API and SDKs - For all calls, use the Region endpoint us-east-1.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Scope
     */

    public UpdateWebACLRequest withScope(String scope) {
        setScope(scope);
        return this;
    }

    /**
     * <p>
     * Specifies whether this is for an AWS CloudFront distribution or for a regional application. A regional
     * application can be an Application Load Balancer (ALB), an API Gateway REST API, or an AppSync GraphQL API.
     * </p>
     * <p>
     * To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CLI - Specify the Region when you use the CloudFront scope: <code>--scope=CLOUDFRONT --region=us-east-1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * API and SDKs - For all calls, use the Region endpoint us-east-1.
     * </p>
     * </li>
     * </ul>
     * 
     * @param scope
     *        Specifies whether this is for an AWS CloudFront distribution or for a regional application. A regional
     *        application can be an Application Load Balancer (ALB), an API Gateway REST API, or an AppSync GraphQL API.
     *        </p>
     *        <p>
     *        To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CLI - Specify the Region when you use the CloudFront scope:
     *        <code>--scope=CLOUDFRONT --region=us-east-1</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        API and SDKs - For all calls, use the Region endpoint us-east-1.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Scope
     */

    public UpdateWebACLRequest withScope(Scope scope) {
        this.scope = scope.toString();
        return this;
    }

    /**
     * <p>
     * The unique identifier for the Web ACL. This ID is returned in the responses to create and list commands. You
     * provide it to operations like update and delete.
     * </p>
     * 
     * @param id
     *        The unique identifier for the Web ACL. This ID is returned in the responses to create and list commands.
     *        You provide it to operations like update and delete.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the Web ACL. This ID is returned in the responses to create and list commands. You
     * provide it to operations like update and delete.
     * </p>
     * 
     * @return The unique identifier for the Web ACL. This ID is returned in the responses to create and list commands.
     *         You provide it to operations like update and delete.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the Web ACL. This ID is returned in the responses to create and list commands. You
     * provide it to operations like update and delete.
     * </p>
     * 
     * @param id
     *        The unique identifier for the Web ACL. This ID is returned in the responses to create and list commands.
     *        You provide it to operations like update and delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWebACLRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The action to perform if none of the <code>Rules</code> contained in the <code>WebACL</code> match.
     * </p>
     * 
     * @param defaultAction
     *        The action to perform if none of the <code>Rules</code> contained in the <code>WebACL</code> match.
     */

    public void setDefaultAction(DefaultAction defaultAction) {
        this.defaultAction = defaultAction;
    }

    /**
     * <p>
     * The action to perform if none of the <code>Rules</code> contained in the <code>WebACL</code> match.
     * </p>
     * 
     * @return The action to perform if none of the <code>Rules</code> contained in the <code>WebACL</code> match.
     */

    public DefaultAction getDefaultAction() {
        return this.defaultAction;
    }

    /**
     * <p>
     * The action to perform if none of the <code>Rules</code> contained in the <code>WebACL</code> match.
     * </p>
     * 
     * @param defaultAction
     *        The action to perform if none of the <code>Rules</code> contained in the <code>WebACL</code> match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWebACLRequest withDefaultAction(DefaultAction defaultAction) {
        setDefaultAction(defaultAction);
        return this;
    }

    /**
     * <p>
     * A description of the Web ACL that helps with identification.
     * </p>
     * 
     * @param description
     *        A description of the Web ACL that helps with identification.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the Web ACL that helps with identification.
     * </p>
     * 
     * @return A description of the Web ACL that helps with identification.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the Web ACL that helps with identification.
     * </p>
     * 
     * @param description
     *        A description of the Web ACL that helps with identification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWebACLRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The <a>Rule</a> statements used to identify the web requests that you want to allow, block, or count. Each rule
     * includes one top-level statement that AWS WAF uses to identify matching web requests, and parameters that govern
     * how AWS WAF handles them.
     * </p>
     * 
     * @return The <a>Rule</a> statements used to identify the web requests that you want to allow, block, or count.
     *         Each rule includes one top-level statement that AWS WAF uses to identify matching web requests, and
     *         parameters that govern how AWS WAF handles them.
     */

    public java.util.List<Rule> getRules() {
        return rules;
    }

    /**
     * <p>
     * The <a>Rule</a> statements used to identify the web requests that you want to allow, block, or count. Each rule
     * includes one top-level statement that AWS WAF uses to identify matching web requests, and parameters that govern
     * how AWS WAF handles them.
     * </p>
     * 
     * @param rules
     *        The <a>Rule</a> statements used to identify the web requests that you want to allow, block, or count. Each
     *        rule includes one top-level statement that AWS WAF uses to identify matching web requests, and parameters
     *        that govern how AWS WAF handles them.
     */

    public void setRules(java.util.Collection<Rule> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }

        this.rules = new java.util.ArrayList<Rule>(rules);
    }

    /**
     * <p>
     * The <a>Rule</a> statements used to identify the web requests that you want to allow, block, or count. Each rule
     * includes one top-level statement that AWS WAF uses to identify matching web requests, and parameters that govern
     * how AWS WAF handles them.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRules(java.util.Collection)} or {@link #withRules(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rules
     *        The <a>Rule</a> statements used to identify the web requests that you want to allow, block, or count. Each
     *        rule includes one top-level statement that AWS WAF uses to identify matching web requests, and parameters
     *        that govern how AWS WAF handles them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWebACLRequest withRules(Rule... rules) {
        if (this.rules == null) {
            setRules(new java.util.ArrayList<Rule>(rules.length));
        }
        for (Rule ele : rules) {
            this.rules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The <a>Rule</a> statements used to identify the web requests that you want to allow, block, or count. Each rule
     * includes one top-level statement that AWS WAF uses to identify matching web requests, and parameters that govern
     * how AWS WAF handles them.
     * </p>
     * 
     * @param rules
     *        The <a>Rule</a> statements used to identify the web requests that you want to allow, block, or count. Each
     *        rule includes one top-level statement that AWS WAF uses to identify matching web requests, and parameters
     *        that govern how AWS WAF handles them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWebACLRequest withRules(java.util.Collection<Rule> rules) {
        setRules(rules);
        return this;
    }

    /**
     * <p>
     * Defines and enables Amazon CloudWatch metrics and web request sample collection.
     * </p>
     * 
     * @param visibilityConfig
     *        Defines and enables Amazon CloudWatch metrics and web request sample collection.
     */

    public void setVisibilityConfig(VisibilityConfig visibilityConfig) {
        this.visibilityConfig = visibilityConfig;
    }

    /**
     * <p>
     * Defines and enables Amazon CloudWatch metrics and web request sample collection.
     * </p>
     * 
     * @return Defines and enables Amazon CloudWatch metrics and web request sample collection.
     */

    public VisibilityConfig getVisibilityConfig() {
        return this.visibilityConfig;
    }

    /**
     * <p>
     * Defines and enables Amazon CloudWatch metrics and web request sample collection.
     * </p>
     * 
     * @param visibilityConfig
     *        Defines and enables Amazon CloudWatch metrics and web request sample collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWebACLRequest withVisibilityConfig(VisibilityConfig visibilityConfig) {
        setVisibilityConfig(visibilityConfig);
        return this;
    }

    /**
     * <p>
     * A token used for optimistic locking. AWS WAF returns a token to your get and list requests, to mark the state of
     * the entity at the time of the request. To make changes to the entity associated with the token, you provide the
     * token to operations like update and delete. AWS WAF uses the token to ensure that no changes have been made to
     * the entity since you last retrieved it. If a change has been made, the update fails with a
     * <code>WAFOptimisticLockException</code>. If this happens, perform another get, and use the new token returned by
     * that operation.
     * </p>
     * 
     * @param lockToken
     *        A token used for optimistic locking. AWS WAF returns a token to your get and list requests, to mark the
     *        state of the entity at the time of the request. To make changes to the entity associated with the token,
     *        you provide the token to operations like update and delete. AWS WAF uses the token to ensure that no
     *        changes have been made to the entity since you last retrieved it. If a change has been made, the update
     *        fails with a <code>WAFOptimisticLockException</code>. If this happens, perform another get, and use the
     *        new token returned by that operation.
     */

    public void setLockToken(String lockToken) {
        this.lockToken = lockToken;
    }

    /**
     * <p>
     * A token used for optimistic locking. AWS WAF returns a token to your get and list requests, to mark the state of
     * the entity at the time of the request. To make changes to the entity associated with the token, you provide the
     * token to operations like update and delete. AWS WAF uses the token to ensure that no changes have been made to
     * the entity since you last retrieved it. If a change has been made, the update fails with a
     * <code>WAFOptimisticLockException</code>. If this happens, perform another get, and use the new token returned by
     * that operation.
     * </p>
     * 
     * @return A token used for optimistic locking. AWS WAF returns a token to your get and list requests, to mark the
     *         state of the entity at the time of the request. To make changes to the entity associated with the token,
     *         you provide the token to operations like update and delete. AWS WAF uses the token to ensure that no
     *         changes have been made to the entity since you last retrieved it. If a change has been made, the update
     *         fails with a <code>WAFOptimisticLockException</code>. If this happens, perform another get, and use the
     *         new token returned by that operation.
     */

    public String getLockToken() {
        return this.lockToken;
    }

    /**
     * <p>
     * A token used for optimistic locking. AWS WAF returns a token to your get and list requests, to mark the state of
     * the entity at the time of the request. To make changes to the entity associated with the token, you provide the
     * token to operations like update and delete. AWS WAF uses the token to ensure that no changes have been made to
     * the entity since you last retrieved it. If a change has been made, the update fails with a
     * <code>WAFOptimisticLockException</code>. If this happens, perform another get, and use the new token returned by
     * that operation.
     * </p>
     * 
     * @param lockToken
     *        A token used for optimistic locking. AWS WAF returns a token to your get and list requests, to mark the
     *        state of the entity at the time of the request. To make changes to the entity associated with the token,
     *        you provide the token to operations like update and delete. AWS WAF uses the token to ensure that no
     *        changes have been made to the entity since you last retrieved it. If a change has been made, the update
     *        fails with a <code>WAFOptimisticLockException</code>. If this happens, perform another get, and use the
     *        new token returned by that operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWebACLRequest withLockToken(String lockToken) {
        setLockToken(lockToken);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getScope() != null)
            sb.append("Scope: ").append(getScope()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getDefaultAction() != null)
            sb.append("DefaultAction: ").append(getDefaultAction()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRules() != null)
            sb.append("Rules: ").append(getRules()).append(",");
        if (getVisibilityConfig() != null)
            sb.append("VisibilityConfig: ").append(getVisibilityConfig()).append(",");
        if (getLockToken() != null)
            sb.append("LockToken: ").append(getLockToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateWebACLRequest == false)
            return false;
        UpdateWebACLRequest other = (UpdateWebACLRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getDefaultAction() == null ^ this.getDefaultAction() == null)
            return false;
        if (other.getDefaultAction() != null && other.getDefaultAction().equals(this.getDefaultAction()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        if (other.getVisibilityConfig() == null ^ this.getVisibilityConfig() == null)
            return false;
        if (other.getVisibilityConfig() != null && other.getVisibilityConfig().equals(this.getVisibilityConfig()) == false)
            return false;
        if (other.getLockToken() == null ^ this.getLockToken() == null)
            return false;
        if (other.getLockToken() != null && other.getLockToken().equals(this.getLockToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getDefaultAction() == null) ? 0 : getDefaultAction().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        hashCode = prime * hashCode + ((getVisibilityConfig() == null) ? 0 : getVisibilityConfig().hashCode());
        hashCode = prime * hashCode + ((getLockToken() == null) ? 0 : getLockToken().hashCode());
        return hashCode;
    }

    @Override
    public UpdateWebACLRequest clone() {
        return (UpdateWebACLRequest) super.clone();
    }

}
