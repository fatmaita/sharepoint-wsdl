/**
 * GetItemsByIdsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap.ois;

public class GetItemsByIdsResponse  implements java.io.Serializable {
    private com.microsoft.schemas.sharepoint.soap.ois.GetItemsByIdsResponseGetItemsByIdsResult getItemsByIdsResult;

    public GetItemsByIdsResponse() {
    }

    public GetItemsByIdsResponse(
           com.microsoft.schemas.sharepoint.soap.ois.GetItemsByIdsResponseGetItemsByIdsResult getItemsByIdsResult) {
           this.getItemsByIdsResult = getItemsByIdsResult;
    }


    /**
     * Gets the getItemsByIdsResult value for this GetItemsByIdsResponse.
     * 
     * @return getItemsByIdsResult
     */
    public com.microsoft.schemas.sharepoint.soap.ois.GetItemsByIdsResponseGetItemsByIdsResult getGetItemsByIdsResult() {
        return getItemsByIdsResult;
    }


    /**
     * Sets the getItemsByIdsResult value for this GetItemsByIdsResponse.
     * 
     * @param getItemsByIdsResult
     */
    public void setGetItemsByIdsResult(com.microsoft.schemas.sharepoint.soap.ois.GetItemsByIdsResponseGetItemsByIdsResult getItemsByIdsResult) {
        this.getItemsByIdsResult = getItemsByIdsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetItemsByIdsResponse)) return false;
        GetItemsByIdsResponse other = (GetItemsByIdsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getItemsByIdsResult==null && other.getGetItemsByIdsResult()==null) || 
             (this.getItemsByIdsResult!=null &&
              this.getItemsByIdsResult.equals(other.getGetItemsByIdsResult())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getGetItemsByIdsResult() != null) {
            _hashCode += getGetItemsByIdsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetItemsByIdsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/ois/", ">GetItemsByIdsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getItemsByIdsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/ois/", "GetItemsByIdsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/ois/", ">>GetItemsByIdsResponse>GetItemsByIdsResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
