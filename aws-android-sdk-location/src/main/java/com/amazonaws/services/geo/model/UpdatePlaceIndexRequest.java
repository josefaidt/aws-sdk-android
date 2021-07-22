/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.geo.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the specified properties of a given place index resource.
 * </p>
 */
public class UpdatePlaceIndexRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Updates the data storage option for the place index resource.
     * </p>
     */
    private DataSourceConfiguration dataSourceConfiguration;

    /**
     * <p>
     * Updates the description for the place index resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     */
    private String description;

    /**
     * <p>
     * The name of the place index resource to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     */
    private String indexName;

    /**
     * <p>
     * Updates the pricing plan for the place index resource.
     * </p>
     * <p>
     * For more information about each pricing plan option restrictions, see <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service
     * pricing</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RequestBasedUsage, MobileAssetTracking,
     * MobileAssetManagement
     */
    private String pricingPlan;

    /**
     * <p>
     * Updates the data storage option for the place index resource.
     * </p>
     *
     * @return <p>
     *         Updates the data storage option for the place index resource.
     *         </p>
     */
    public DataSourceConfiguration getDataSourceConfiguration() {
        return dataSourceConfiguration;
    }

    /**
     * <p>
     * Updates the data storage option for the place index resource.
     * </p>
     *
     * @param dataSourceConfiguration <p>
     *            Updates the data storage option for the place index resource.
     *            </p>
     */
    public void setDataSourceConfiguration(DataSourceConfiguration dataSourceConfiguration) {
        this.dataSourceConfiguration = dataSourceConfiguration;
    }

    /**
     * <p>
     * Updates the data storage option for the place index resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataSourceConfiguration <p>
     *            Updates the data storage option for the place index resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePlaceIndexRequest withDataSourceConfiguration(
            DataSourceConfiguration dataSourceConfiguration) {
        this.dataSourceConfiguration = dataSourceConfiguration;
        return this;
    }

    /**
     * <p>
     * Updates the description for the place index resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @return <p>
     *         Updates the description for the place index resource.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * Updates the description for the place index resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @param description <p>
     *            Updates the description for the place index resource.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Updates the description for the place index resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @param description <p>
     *            Updates the description for the place index resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePlaceIndexRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The name of the place index resource to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @return <p>
     *         The name of the place index resource to update.
     *         </p>
     */
    public String getIndexName() {
        return indexName;
    }

    /**
     * <p>
     * The name of the place index resource to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @param indexName <p>
     *            The name of the place index resource to update.
     *            </p>
     */
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * <p>
     * The name of the place index resource to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @param indexName <p>
     *            The name of the place index resource to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePlaceIndexRequest withIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }

    /**
     * <p>
     * Updates the pricing plan for the place index resource.
     * </p>
     * <p>
     * For more information about each pricing plan option restrictions, see <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service
     * pricing</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RequestBasedUsage, MobileAssetTracking,
     * MobileAssetManagement
     *
     * @return <p>
     *         Updates the pricing plan for the place index resource.
     *         </p>
     *         <p>
     *         For more information about each pricing plan option restrictions,
     *         see <a href="https://aws.amazon.com/location/pricing/">Amazon
     *         Location Service pricing</a>.
     *         </p>
     * @see PricingPlan
     */
    public String getPricingPlan() {
        return pricingPlan;
    }

    /**
     * <p>
     * Updates the pricing plan for the place index resource.
     * </p>
     * <p>
     * For more information about each pricing plan option restrictions, see <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service
     * pricing</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RequestBasedUsage, MobileAssetTracking,
     * MobileAssetManagement
     *
     * @param pricingPlan <p>
     *            Updates the pricing plan for the place index resource.
     *            </p>
     *            <p>
     *            For more information about each pricing plan option
     *            restrictions, see <a
     *            href="https://aws.amazon.com/location/pricing/">Amazon
     *            Location Service pricing</a>.
     *            </p>
     * @see PricingPlan
     */
    public void setPricingPlan(String pricingPlan) {
        this.pricingPlan = pricingPlan;
    }

    /**
     * <p>
     * Updates the pricing plan for the place index resource.
     * </p>
     * <p>
     * For more information about each pricing plan option restrictions, see <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service
     * pricing</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RequestBasedUsage, MobileAssetTracking,
     * MobileAssetManagement
     *
     * @param pricingPlan <p>
     *            Updates the pricing plan for the place index resource.
     *            </p>
     *            <p>
     *            For more information about each pricing plan option
     *            restrictions, see <a
     *            href="https://aws.amazon.com/location/pricing/">Amazon
     *            Location Service pricing</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PricingPlan
     */
    public UpdatePlaceIndexRequest withPricingPlan(String pricingPlan) {
        this.pricingPlan = pricingPlan;
        return this;
    }

    /**
     * <p>
     * Updates the pricing plan for the place index resource.
     * </p>
     * <p>
     * For more information about each pricing plan option restrictions, see <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service
     * pricing</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RequestBasedUsage, MobileAssetTracking,
     * MobileAssetManagement
     *
     * @param pricingPlan <p>
     *            Updates the pricing plan for the place index resource.
     *            </p>
     *            <p>
     *            For more information about each pricing plan option
     *            restrictions, see <a
     *            href="https://aws.amazon.com/location/pricing/">Amazon
     *            Location Service pricing</a>.
     *            </p>
     * @see PricingPlan
     */
    public void setPricingPlan(PricingPlan pricingPlan) {
        this.pricingPlan = pricingPlan.toString();
    }

    /**
     * <p>
     * Updates the pricing plan for the place index resource.
     * </p>
     * <p>
     * For more information about each pricing plan option restrictions, see <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service
     * pricing</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RequestBasedUsage, MobileAssetTracking,
     * MobileAssetManagement
     *
     * @param pricingPlan <p>
     *            Updates the pricing plan for the place index resource.
     *            </p>
     *            <p>
     *            For more information about each pricing plan option
     *            restrictions, see <a
     *            href="https://aws.amazon.com/location/pricing/">Amazon
     *            Location Service pricing</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PricingPlan
     */
    public UpdatePlaceIndexRequest withPricingPlan(PricingPlan pricingPlan) {
        this.pricingPlan = pricingPlan.toString();
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDataSourceConfiguration() != null)
            sb.append("DataSourceConfiguration: " + getDataSourceConfiguration() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getIndexName() != null)
            sb.append("IndexName: " + getIndexName() + ",");
        if (getPricingPlan() != null)
            sb.append("PricingPlan: " + getPricingPlan());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDataSourceConfiguration() == null) ? 0 : getDataSourceConfiguration()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        hashCode = prime * hashCode
                + ((getPricingPlan() == null) ? 0 : getPricingPlan().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePlaceIndexRequest == false)
            return false;
        UpdatePlaceIndexRequest other = (UpdatePlaceIndexRequest) obj;

        if (other.getDataSourceConfiguration() == null ^ this.getDataSourceConfiguration() == null)
            return false;
        if (other.getDataSourceConfiguration() != null
                && other.getDataSourceConfiguration().equals(this.getDataSourceConfiguration()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getIndexName() == null ^ this.getIndexName() == null)
            return false;
        if (other.getIndexName() != null
                && other.getIndexName().equals(this.getIndexName()) == false)
            return false;
        if (other.getPricingPlan() == null ^ this.getPricingPlan() == null)
            return false;
        if (other.getPricingPlan() != null
                && other.getPricingPlan().equals(this.getPricingPlan()) == false)
            return false;
        return true;
    }
}
