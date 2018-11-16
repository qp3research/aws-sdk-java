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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/ListTagsForResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTagsForResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the resource for which to list the tags. Currently, the supported
     * resources are Amazon ECS tasks, services, task definitions, clusters, and container instances.
     * </p>
     */
    private String resourceArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the resource for which to list the tags. Currently, the supported
     * resources are Amazon ECS tasks, services, task definitions, clusters, and container instances.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) that identifies the resource for which to list the tags. Currently, the
     *        supported resources are Amazon ECS tasks, services, task definitions, clusters, and container instances.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the resource for which to list the tags. Currently, the supported
     * resources are Amazon ECS tasks, services, task definitions, clusters, and container instances.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that identifies the resource for which to list the tags. Currently, the
     *         supported resources are Amazon ECS tasks, services, task definitions, clusters, and container instances.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the resource for which to list the tags. Currently, the supported
     * resources are Amazon ECS tasks, services, task definitions, clusters, and container instances.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) that identifies the resource for which to list the tags. Currently, the
     *        supported resources are Amazon ECS tasks, services, task definitions, clusters, and container instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourceRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTagsForResourceRequest == false)
            return false;
        ListTagsForResourceRequest other = (ListTagsForResourceRequest) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        return hashCode;
    }

    @Override
    public ListTagsForResourceRequest clone() {
        return (ListTagsForResourceRequest) super.clone();
    }

}
