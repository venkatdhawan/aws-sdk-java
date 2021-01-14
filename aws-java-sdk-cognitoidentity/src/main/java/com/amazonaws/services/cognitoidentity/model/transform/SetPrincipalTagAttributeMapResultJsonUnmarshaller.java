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
package com.amazonaws.services.cognitoidentity.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cognitoidentity.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SetPrincipalTagAttributeMapResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetPrincipalTagAttributeMapResultJsonUnmarshaller implements Unmarshaller<SetPrincipalTagAttributeMapResult, JsonUnmarshallerContext> {

    public SetPrincipalTagAttributeMapResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        SetPrincipalTagAttributeMapResult setPrincipalTagAttributeMapResult = new SetPrincipalTagAttributeMapResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return setPrincipalTagAttributeMapResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("IdentityPoolId", targetDepth)) {
                    context.nextToken();
                    setPrincipalTagAttributeMapResult.setIdentityPoolId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IdentityProviderName", targetDepth)) {
                    context.nextToken();
                    setPrincipalTagAttributeMapResult.setIdentityProviderName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UseDefaults", targetDepth)) {
                    context.nextToken();
                    setPrincipalTagAttributeMapResult.setUseDefaults(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("PrincipalTags", targetDepth)) {
                    context.nextToken();
                    setPrincipalTagAttributeMapResult.setPrincipalTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return setPrincipalTagAttributeMapResult;
    }

    private static SetPrincipalTagAttributeMapResultJsonUnmarshaller instance;

    public static SetPrincipalTagAttributeMapResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SetPrincipalTagAttributeMapResultJsonUnmarshaller();
        return instance;
    }
}
