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
package com.amazonaws.services.codebuild.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codebuild.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DescribeCodeCoveragesRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DescribeCodeCoveragesRequestMarshaller {

    private static final MarshallingInfo<String> REPORTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("reportArn").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("nextToken").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxResults").build();
    private static final MarshallingInfo<String> SORTORDER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("sortOrder").build();
    private static final MarshallingInfo<String> SORTBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("sortBy").build();
    private static final MarshallingInfo<Double> MINLINECOVERAGEPERCENTAGE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("minLineCoveragePercentage").build();
    private static final MarshallingInfo<Double> MAXLINECOVERAGEPERCENTAGE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxLineCoveragePercentage").build();

    private static final DescribeCodeCoveragesRequestMarshaller instance = new DescribeCodeCoveragesRequestMarshaller();

    public static DescribeCodeCoveragesRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DescribeCodeCoveragesRequest describeCodeCoveragesRequest, ProtocolMarshaller protocolMarshaller) {

        if (describeCodeCoveragesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(describeCodeCoveragesRequest.getReportArn(), REPORTARN_BINDING);
            protocolMarshaller.marshall(describeCodeCoveragesRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(describeCodeCoveragesRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(describeCodeCoveragesRequest.getSortOrder(), SORTORDER_BINDING);
            protocolMarshaller.marshall(describeCodeCoveragesRequest.getSortBy(), SORTBY_BINDING);
            protocolMarshaller.marshall(describeCodeCoveragesRequest.getMinLineCoveragePercentage(), MINLINECOVERAGEPERCENTAGE_BINDING);
            protocolMarshaller.marshall(describeCodeCoveragesRequest.getMaxLineCoveragePercentage(), MAXLINECOVERAGEPERCENTAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
