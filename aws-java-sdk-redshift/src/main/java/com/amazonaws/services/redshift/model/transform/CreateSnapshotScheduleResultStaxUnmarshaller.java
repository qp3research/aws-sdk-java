/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshift.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * CreateSnapshotScheduleResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSnapshotScheduleResultStaxUnmarshaller implements Unmarshaller<CreateSnapshotScheduleResult, StaxUnmarshallerContext> {

    public CreateSnapshotScheduleResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        CreateSnapshotScheduleResult createSnapshotScheduleResult = new CreateSnapshotScheduleResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return createSnapshotScheduleResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ScheduleDefinitions", targetDepth)) {
                    createSnapshotScheduleResult.withScheduleDefinitions(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("ScheduleDefinitions/ScheduleDefinition", targetDepth)) {
                    createSnapshotScheduleResult.withScheduleDefinitions(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ScheduleIdentifier", targetDepth)) {
                    createSnapshotScheduleResult.setScheduleIdentifier(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ScheduleDescription", targetDepth)) {
                    createSnapshotScheduleResult.setScheduleDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Tags", targetDepth)) {
                    createSnapshotScheduleResult.withTags(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("Tags/Tag", targetDepth)) {
                    createSnapshotScheduleResult.withTags(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NextInvocations", targetDepth)) {
                    createSnapshotScheduleResult.withNextInvocations(new ArrayList<java.util.Date>());
                    continue;
                }

                if (context.testExpression("NextInvocations/SnapshotTime", targetDepth)) {
                    createSnapshotScheduleResult.withNextInvocations(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return createSnapshotScheduleResult;
                }
            }
        }
    }

    private static CreateSnapshotScheduleResultStaxUnmarshaller instance;

    public static CreateSnapshotScheduleResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateSnapshotScheduleResultStaxUnmarshaller();
        return instance;
    }
}
