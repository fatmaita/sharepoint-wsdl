/**
 * GetViewCollectionResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap;

public class GetViewCollectionResponse  implements java.io.Serializable {
    private com.microsoft.schemas.sharepoint.soap.GetViewCollectionResponseGetViewCollectionResult getViewCollectionResult;

    public GetViewCollectionResponse() {
    }

    public GetViewCollectionResponse(
           com.microsoft.schemas.sharepoint.soap.GetViewCollectionResponseGetViewCollectionResult getViewCollectionResult) {
           this.getViewCollectionResult = getViewCollectionResult;
    }


    /**
     * Gets the getViewCollectionResult value for this GetViewCollectionResponse.
     * 
     * @return getViewCollectionResult
     */
    public com.microsoft.schemas.sharepoint.soap.GetViewCollectionResponseGetViewCollectionResult getGetViewCollectionResult() {
        return getViewCollectionResult;
    }


    /**
     * Sets the getViewCollectionResult value for this GetViewCollectionResponse.
     * 
     * @param getViewCollectionResult
     */
    public void setGetViewCollectionResult(com.microsoft.schemas.sharepoint.soap.GetViewCollectionResponseGetViewCollectionResult getViewCollectionResult) {
        this.getViewCollectionResult = getViewCollectionResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetViewCollectionResponse)) return false;
        GetViewCollectionResponse other = (GetViewCollectionResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getViewCollectionResult==null && other.getGetViewCollectionResult()==null) || 
             (this.getViewCollectionResult!=null &&
              this.getViewCollectionResult.equals(other.getGetViewCollectionResult())));
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
        if (getGetViewCollectionResult() != null) {
            _hashCode += getGetViewCollectionResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetViewCollectionResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", ">GetViewCollectionResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getViewCollectionResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "GetViewCollectionResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", ">>GetViewCollectionResponse>GetViewCollectionResult"));
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