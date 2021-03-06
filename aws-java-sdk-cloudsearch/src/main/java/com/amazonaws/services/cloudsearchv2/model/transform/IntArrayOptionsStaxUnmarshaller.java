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
package com.amazonaws.services.cloudsearchv2.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.cloudsearchv2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * IntArrayOptions StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IntArrayOptionsStaxUnmarshaller implements Unmarshaller<IntArrayOptions, StaxUnmarshallerContext> {

    public IntArrayOptions unmarshall(StaxUnmarshallerContext context) throws Exception {
        IntArrayOptions intArrayOptions = new IntArrayOptions();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return intArrayOptions;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("DefaultValue", targetDepth)) {
                    intArrayOptions.setDefaultValue(LongStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SourceFields", targetDepth)) {
                    intArrayOptions.setSourceFields(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("FacetEnabled", targetDepth)) {
                    intArrayOptions.setFacetEnabled(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SearchEnabled", targetDepth)) {
                    intArrayOptions.setSearchEnabled(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ReturnEnabled", targetDepth)) {
                    intArrayOptions.setReturnEnabled(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return intArrayOptions;
                }
            }
        }
    }

    private static IntArrayOptionsStaxUnmarshaller instance;

    public static IntArrayOptionsStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new IntArrayOptionsStaxUnmarshaller();
        return instance;
    }
}
