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
package com.amazonaws.services.personalize.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.personalize.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DefaultHyperParameterRangesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DefaultHyperParameterRangesMarshaller {

    private static final MarshallingInfo<List> INTEGERHYPERPARAMETERRANGES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("integerHyperParameterRanges").build();
    private static final MarshallingInfo<List> CONTINUOUSHYPERPARAMETERRANGES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("continuousHyperParameterRanges").build();
    private static final MarshallingInfo<List> CATEGORICALHYPERPARAMETERRANGES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("categoricalHyperParameterRanges").build();

    private static final DefaultHyperParameterRangesMarshaller instance = new DefaultHyperParameterRangesMarshaller();

    public static DefaultHyperParameterRangesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DefaultHyperParameterRanges defaultHyperParameterRanges, ProtocolMarshaller protocolMarshaller) {

        if (defaultHyperParameterRanges == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(defaultHyperParameterRanges.getIntegerHyperParameterRanges(), INTEGERHYPERPARAMETERRANGES_BINDING);
            protocolMarshaller.marshall(defaultHyperParameterRanges.getContinuousHyperParameterRanges(), CONTINUOUSHYPERPARAMETERRANGES_BINDING);
            protocolMarshaller.marshall(defaultHyperParameterRanges.getCategoricalHyperParameterRanges(), CATEGORICALHYPERPARAMETERRANGES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
