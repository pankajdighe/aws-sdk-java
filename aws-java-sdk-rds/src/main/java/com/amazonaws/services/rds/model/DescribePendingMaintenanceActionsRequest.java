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
package com.amazonaws.services.rds.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#describePendingMaintenanceActions(DescribePendingMaintenanceActionsRequest) DescribePendingMaintenanceActions operation}.
 * <p>
 * Returns a list of resources (for example, DB instances) that have at
 * least one pending maintenance action.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#describePendingMaintenanceActions(DescribePendingMaintenanceActionsRequest)
 */
public class DescribePendingMaintenanceActionsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The ARN of a resource to return pending maintenance actions for.
     */
    private String resourceIdentifier;

    /**
     * A filter that specifies one or more resources to return pending
     * maintenance actions for. <p>Supported filters: <ul> <li>
     * <code>db-instance-id</code> - Accepts DB instance identifiers and DB
     * instance Amazon Resource Names (ARNs). The results list will only
     * include pending maintenance actions for the DB instances identified by
     * these ARNs.</li> </ul>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * An optional pagination token provided by a previous
     * <code>DescribePendingMaintenanceActions</code> request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to a number of records specified by
     * <code>MaxRecords</code>.
     */
    private String marker;

    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * pagination token called a marker is included in the response so that
     * the remaining results can be retrieved. <p>Default: 100
     * <p>Constraints: minimum 20, maximum 100
     */
    private Integer maxRecords;

    /**
     * The ARN of a resource to return pending maintenance actions for.
     *
     * @return The ARN of a resource to return pending maintenance actions for.
     */
    public String getResourceIdentifier() {
        return resourceIdentifier;
    }
    
    /**
     * The ARN of a resource to return pending maintenance actions for.
     *
     * @param resourceIdentifier The ARN of a resource to return pending maintenance actions for.
     */
    public void setResourceIdentifier(String resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
    }
    
    /**
     * The ARN of a resource to return pending maintenance actions for.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceIdentifier The ARN of a resource to return pending maintenance actions for.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribePendingMaintenanceActionsRequest withResourceIdentifier(String resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
        return this;
    }

    /**
     * A filter that specifies one or more resources to return pending
     * maintenance actions for. <p>Supported filters: <ul> <li>
     * <code>db-instance-id</code> - Accepts DB instance identifiers and DB
     * instance Amazon Resource Names (ARNs). The results list will only
     * include pending maintenance actions for the DB instances identified by
     * these ARNs.</li> </ul>
     *
     * @return A filter that specifies one or more resources to return pending
     *         maintenance actions for. <p>Supported filters: <ul> <li>
     *         <code>db-instance-id</code> - Accepts DB instance identifiers and DB
     *         instance Amazon Resource Names (ARNs). The results list will only
     *         include pending maintenance actions for the DB instances identified by
     *         these ARNs.</li> </ul>
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
              filters = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>();
              filters.setAutoConstruct(true);
        }
        return filters;
    }
    
    /**
     * A filter that specifies one or more resources to return pending
     * maintenance actions for. <p>Supported filters: <ul> <li>
     * <code>db-instance-id</code> - Accepts DB instance identifiers and DB
     * instance Amazon Resource Names (ARNs). The results list will only
     * include pending maintenance actions for the DB instances identified by
     * these ARNs.</li> </ul>
     *
     * @param filters A filter that specifies one or more resources to return pending
     *         maintenance actions for. <p>Supported filters: <ul> <li>
     *         <code>db-instance-id</code> - Accepts DB instance identifiers and DB
     *         instance Amazon Resource Names (ARNs). The results list will only
     *         include pending maintenance actions for the DB instances identified by
     *         these ARNs.</li> </ul>
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filtersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filters.size());
        filtersCopy.addAll(filters);
        this.filters = filtersCopy;
    }
    
    /**
     * A filter that specifies one or more resources to return pending
     * maintenance actions for. <p>Supported filters: <ul> <li>
     * <code>db-instance-id</code> - Accepts DB instance identifiers and DB
     * instance Amazon Resource Names (ARNs). The results list will only
     * include pending maintenance actions for the DB instances identified by
     * these ARNs.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A filter that specifies one or more resources to return pending
     *         maintenance actions for. <p>Supported filters: <ul> <li>
     *         <code>db-instance-id</code> - Accepts DB instance identifiers and DB
     *         instance Amazon Resource Names (ARNs). The results list will only
     *         include pending maintenance actions for the DB instances identified by
     *         these ARNs.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribePendingMaintenanceActionsRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * A filter that specifies one or more resources to return pending
     * maintenance actions for. <p>Supported filters: <ul> <li>
     * <code>db-instance-id</code> - Accepts DB instance identifiers and DB
     * instance Amazon Resource Names (ARNs). The results list will only
     * include pending maintenance actions for the DB instances identified by
     * these ARNs.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A filter that specifies one or more resources to return pending
     *         maintenance actions for. <p>Supported filters: <ul> <li>
     *         <code>db-instance-id</code> - Accepts DB instance identifiers and DB
     *         instance Amazon Resource Names (ARNs). The results list will only
     *         include pending maintenance actions for the DB instances identified by
     *         these ARNs.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribePendingMaintenanceActionsRequest withFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filtersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filters.size());
            filtersCopy.addAll(filters);
            this.filters = filtersCopy;
        }

        return this;
    }

    /**
     * An optional pagination token provided by a previous
     * <code>DescribePendingMaintenanceActions</code> request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to a number of records specified by
     * <code>MaxRecords</code>.
     *
     * @return An optional pagination token provided by a previous
     *         <code>DescribePendingMaintenanceActions</code> request. If this
     *         parameter is specified, the response includes only records beyond the
     *         marker, up to a number of records specified by
     *         <code>MaxRecords</code>.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * An optional pagination token provided by a previous
     * <code>DescribePendingMaintenanceActions</code> request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to a number of records specified by
     * <code>MaxRecords</code>.
     *
     * @param marker An optional pagination token provided by a previous
     *         <code>DescribePendingMaintenanceActions</code> request. If this
     *         parameter is specified, the response includes only records beyond the
     *         marker, up to a number of records specified by
     *         <code>MaxRecords</code>.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * An optional pagination token provided by a previous
     * <code>DescribePendingMaintenanceActions</code> request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to a number of records specified by
     * <code>MaxRecords</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker An optional pagination token provided by a previous
     *         <code>DescribePendingMaintenanceActions</code> request. If this
     *         parameter is specified, the response includes only records beyond the
     *         marker, up to a number of records specified by
     *         <code>MaxRecords</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribePendingMaintenanceActionsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * pagination token called a marker is included in the response so that
     * the remaining results can be retrieved. <p>Default: 100
     * <p>Constraints: minimum 20, maximum 100
     *
     * @return The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         pagination token called a marker is included in the response so that
     *         the remaining results can be retrieved. <p>Default: 100
     *         <p>Constraints: minimum 20, maximum 100
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }
    
    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * pagination token called a marker is included in the response so that
     * the remaining results can be retrieved. <p>Default: 100
     * <p>Constraints: minimum 20, maximum 100
     *
     * @param maxRecords The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         pagination token called a marker is included in the response so that
     *         the remaining results can be retrieved. <p>Default: 100
     *         <p>Constraints: minimum 20, maximum 100
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }
    
    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * pagination token called a marker is included in the response so that
     * the remaining results can be retrieved. <p>Default: 100
     * <p>Constraints: minimum 20, maximum 100
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxRecords The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         pagination token called a marker is included in the response so that
     *         the remaining results can be retrieved. <p>Default: 100
     *         <p>Constraints: minimum 20, maximum 100
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribePendingMaintenanceActionsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
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
        if (getResourceIdentifier() != null) sb.append("ResourceIdentifier: " + getResourceIdentifier() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() + ",");
        if (getMaxRecords() != null) sb.append("MaxRecords: " + getMaxRecords() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getResourceIdentifier() == null) ? 0 : getResourceIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribePendingMaintenanceActionsRequest == false) return false;
        DescribePendingMaintenanceActionsRequest other = (DescribePendingMaintenanceActionsRequest)obj;
        
        if (other.getResourceIdentifier() == null ^ this.getResourceIdentifier() == null) return false;
        if (other.getResourceIdentifier() != null && other.getResourceIdentifier().equals(this.getResourceIdentifier()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null) return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribePendingMaintenanceActionsRequest clone() {
        
            return (DescribePendingMaintenanceActionsRequest) super.clone();
    }

}
    