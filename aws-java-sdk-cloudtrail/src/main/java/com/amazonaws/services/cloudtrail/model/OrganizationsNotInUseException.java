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
package com.amazonaws.services.cloudtrail.model;

import javax.annotation.Generated;

/**
 * <p>
 * This exception is thrown when the request is made from an AWS account that is not a member of an organization. To
 * make this request, sign in using the credentials of an account that belongs to an organization.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrganizationsNotInUseException extends com.amazonaws.services.cloudtrail.model.AWSCloudTrailException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new OrganizationsNotInUseException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public OrganizationsNotInUseException(String message) {
        super(message);
    }

}
