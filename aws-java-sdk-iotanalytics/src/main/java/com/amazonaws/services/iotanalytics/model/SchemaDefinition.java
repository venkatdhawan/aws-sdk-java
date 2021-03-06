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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information needed to define a schema.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/SchemaDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SchemaDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies one or more columns that store your data.
     * </p>
     * <p>
     * Each schema can have up to 100 columns. Each column can have up to 100 nested types
     * </p>
     */
    private java.util.List<Column> columns;

    /**
     * <p>
     * Specifies one or more columns that store your data.
     * </p>
     * <p>
     * Each schema can have up to 100 columns. Each column can have up to 100 nested types
     * </p>
     * 
     * @return Specifies one or more columns that store your data.</p>
     *         <p>
     *         Each schema can have up to 100 columns. Each column can have up to 100 nested types
     */

    public java.util.List<Column> getColumns() {
        return columns;
    }

    /**
     * <p>
     * Specifies one or more columns that store your data.
     * </p>
     * <p>
     * Each schema can have up to 100 columns. Each column can have up to 100 nested types
     * </p>
     * 
     * @param columns
     *        Specifies one or more columns that store your data.</p>
     *        <p>
     *        Each schema can have up to 100 columns. Each column can have up to 100 nested types
     */

    public void setColumns(java.util.Collection<Column> columns) {
        if (columns == null) {
            this.columns = null;
            return;
        }

        this.columns = new java.util.ArrayList<Column>(columns);
    }

    /**
     * <p>
     * Specifies one or more columns that store your data.
     * </p>
     * <p>
     * Each schema can have up to 100 columns. Each column can have up to 100 nested types
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setColumns(java.util.Collection)} or {@link #withColumns(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param columns
     *        Specifies one or more columns that store your data.</p>
     *        <p>
     *        Each schema can have up to 100 columns. Each column can have up to 100 nested types
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaDefinition withColumns(Column... columns) {
        if (this.columns == null) {
            setColumns(new java.util.ArrayList<Column>(columns.length));
        }
        for (Column ele : columns) {
            this.columns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies one or more columns that store your data.
     * </p>
     * <p>
     * Each schema can have up to 100 columns. Each column can have up to 100 nested types
     * </p>
     * 
     * @param columns
     *        Specifies one or more columns that store your data.</p>
     *        <p>
     *        Each schema can have up to 100 columns. Each column can have up to 100 nested types
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaDefinition withColumns(java.util.Collection<Column> columns) {
        setColumns(columns);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getColumns() != null)
            sb.append("Columns: ").append(getColumns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SchemaDefinition == false)
            return false;
        SchemaDefinition other = (SchemaDefinition) obj;
        if (other.getColumns() == null ^ this.getColumns() == null)
            return false;
        if (other.getColumns() != null && other.getColumns().equals(this.getColumns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColumns() == null) ? 0 : getColumns().hashCode());
        return hashCode;
    }

    @Override
    public SchemaDefinition clone() {
        try {
            return (SchemaDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotanalytics.model.transform.SchemaDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
