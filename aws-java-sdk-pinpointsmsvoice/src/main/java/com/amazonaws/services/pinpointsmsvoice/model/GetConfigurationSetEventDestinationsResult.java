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
package com.amazonaws.services.pinpointsmsvoice.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * An object that contains information about an event destination.
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-2018-09-05/GetConfigurationSetEventDestinations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetConfigurationSetEventDestinationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    private java.util.List<EventDestination> eventDestinations;

    /**
     * @return
     */

    public java.util.List<EventDestination> getEventDestinations() {
        return eventDestinations;
    }

    /**
     * @param eventDestinations
     */

    public void setEventDestinations(java.util.Collection<EventDestination> eventDestinations) {
        if (eventDestinations == null) {
            this.eventDestinations = null;
            return;
        }

        this.eventDestinations = new java.util.ArrayList<EventDestination>(eventDestinations);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventDestinations(java.util.Collection)} or {@link #withEventDestinations(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param eventDestinations
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConfigurationSetEventDestinationsResult withEventDestinations(EventDestination... eventDestinations) {
        if (this.eventDestinations == null) {
            setEventDestinations(new java.util.ArrayList<EventDestination>(eventDestinations.length));
        }
        for (EventDestination ele : eventDestinations) {
            this.eventDestinations.add(ele);
        }
        return this;
    }

    /**
     * @param eventDestinations
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConfigurationSetEventDestinationsResult withEventDestinations(java.util.Collection<EventDestination> eventDestinations) {
        setEventDestinations(eventDestinations);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEventDestinations() != null)
            sb.append("EventDestinations: ").append(getEventDestinations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetConfigurationSetEventDestinationsResult == false)
            return false;
        GetConfigurationSetEventDestinationsResult other = (GetConfigurationSetEventDestinationsResult) obj;
        if (other.getEventDestinations() == null ^ this.getEventDestinations() == null)
            return false;
        if (other.getEventDestinations() != null && other.getEventDestinations().equals(this.getEventDestinations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventDestinations() == null) ? 0 : getEventDestinations().hashCode());
        return hashCode;
    }

    @Override
    public GetConfigurationSetEventDestinationsResult clone() {
        try {
            return (GetConfigurationSetEventDestinationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
