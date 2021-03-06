/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.datapipeline.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.datapipeline.DataPipeline#reportTaskProgress(ReportTaskProgressRequest) ReportTaskProgress operation}.
 * <p>
 * Task runners call <code>ReportTaskProgress</code> when assigned a task
 * to acknowledge that it has the task. If the web service does not
 * receive this acknowledgement within 2 minutes, it assigns the task in
 * a subsequent PollForTask call. After this initial acknowledgement, the
 * task runner only needs to report progress every 15 minutes to maintain
 * its ownership of the task. You can change this reporting time from 15
 * minutes by specifying a <code>reportProgressTimeout</code> field in
 * your pipeline.
 * </p>
 * <p>
 * If a task runner does not report its status after 5 minutes, AWS Data
 * Pipeline assumes that the task runner is unable to process the task
 * and reassigns the task in a subsequent response to PollForTask. Task
 * runners should call <code>ReportTaskProgress</code> every 60 seconds.
 * </p>
 *
 * @see com.amazonaws.services.datapipeline.DataPipeline#reportTaskProgress(ReportTaskProgressRequest)
 */
public class ReportTaskProgressRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The ID of the task assigned to the task runner. This value is provided
     * in the response for <a>PollForTask</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String taskId;

    /**
     * Key-value pairs that define the properties of the
     * ReportTaskProgressInput object.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Field> fields;

    /**
     * The ID of the task assigned to the task runner. This value is provided
     * in the response for <a>PollForTask</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The ID of the task assigned to the task runner. This value is provided
     *         in the response for <a>PollForTask</a>.
     */
    public String getTaskId() {
        return taskId;
    }
    
    /**
     * The ID of the task assigned to the task runner. This value is provided
     * in the response for <a>PollForTask</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param taskId The ID of the task assigned to the task runner. This value is provided
     *         in the response for <a>PollForTask</a>.
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }
    
    /**
     * The ID of the task assigned to the task runner. This value is provided
     * in the response for <a>PollForTask</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param taskId The ID of the task assigned to the task runner. This value is provided
     *         in the response for <a>PollForTask</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReportTaskProgressRequest withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * Key-value pairs that define the properties of the
     * ReportTaskProgressInput object.
     *
     * @return Key-value pairs that define the properties of the
     *         ReportTaskProgressInput object.
     */
    public java.util.List<Field> getFields() {
        if (fields == null) {
              fields = new com.amazonaws.internal.ListWithAutoConstructFlag<Field>();
              fields.setAutoConstruct(true);
        }
        return fields;
    }
    
    /**
     * Key-value pairs that define the properties of the
     * ReportTaskProgressInput object.
     *
     * @param fields Key-value pairs that define the properties of the
     *         ReportTaskProgressInput object.
     */
    public void setFields(java.util.Collection<Field> fields) {
        if (fields == null) {
            this.fields = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Field> fieldsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Field>(fields.size());
        fieldsCopy.addAll(fields);
        this.fields = fieldsCopy;
    }
    
    /**
     * Key-value pairs that define the properties of the
     * ReportTaskProgressInput object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param fields Key-value pairs that define the properties of the
     *         ReportTaskProgressInput object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReportTaskProgressRequest withFields(Field... fields) {
        if (getFields() == null) setFields(new java.util.ArrayList<Field>(fields.length));
        for (Field value : fields) {
            getFields().add(value);
        }
        return this;
    }
    
    /**
     * Key-value pairs that define the properties of the
     * ReportTaskProgressInput object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param fields Key-value pairs that define the properties of the
     *         ReportTaskProgressInput object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReportTaskProgressRequest withFields(java.util.Collection<Field> fields) {
        if (fields == null) {
            this.fields = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Field> fieldsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Field>(fields.size());
            fieldsCopy.addAll(fields);
            this.fields = fieldsCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTaskId() != null) sb.append("TaskId: " + getTaskId() + ",");
        if (getFields() != null) sb.append("Fields: " + getFields() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTaskId() == null) ? 0 : getTaskId().hashCode()); 
        hashCode = prime * hashCode + ((getFields() == null) ? 0 : getFields().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ReportTaskProgressRequest == false) return false;
        ReportTaskProgressRequest other = (ReportTaskProgressRequest)obj;
        
        if (other.getTaskId() == null ^ this.getTaskId() == null) return false;
        if (other.getTaskId() != null && other.getTaskId().equals(this.getTaskId()) == false) return false; 
        if (other.getFields() == null ^ this.getFields() == null) return false;
        if (other.getFields() != null && other.getFields().equals(this.getFields()) == false) return false; 
        return true;
    }
    
    @Override
    public ReportTaskProgressRequest clone() {
        
            return (ReportTaskProgressRequest) super.clone();
    }

}
    