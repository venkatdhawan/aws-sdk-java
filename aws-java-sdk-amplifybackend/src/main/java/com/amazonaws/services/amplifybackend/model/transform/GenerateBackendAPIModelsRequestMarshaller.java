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
package com.amazonaws.services.amplifybackend.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.amplifybackend.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GenerateBackendAPIModelsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GenerateBackendAPIModelsRequestMarshaller {

    private static final MarshallingInfo<String> APPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("appId").build();
    private static final MarshallingInfo<String> BACKENDENVIRONMENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("backendEnvironmentName").build();
    private static final MarshallingInfo<String> RESOURCENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceName").build();

    private static final GenerateBackendAPIModelsRequestMarshaller instance = new GenerateBackendAPIModelsRequestMarshaller();

    public static GenerateBackendAPIModelsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GenerateBackendAPIModelsRequest generateBackendAPIModelsRequest, ProtocolMarshaller protocolMarshaller) {

        if (generateBackendAPIModelsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(generateBackendAPIModelsRequest.getAppId(), APPID_BINDING);
            protocolMarshaller.marshall(generateBackendAPIModelsRequest.getBackendEnvironmentName(), BACKENDENVIRONMENTNAME_BINDING);
            protocolMarshaller.marshall(generateBackendAPIModelsRequest.getResourceName(), RESOURCENAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
