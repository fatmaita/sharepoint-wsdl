/**
 * GetWebPartPropertiesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.sharepoint.webpartpages;

public class GetWebPartPropertiesResponse  implements java.io.Serializable {
    private com.microsoft.sharepoint.webpartpages.GetWebPartPropertiesResponseGetWebPartPropertiesResult getWebPartPropertiesResult;

    public GetWebPartPropertiesResponse() {
    }

    public GetWebPartPropertiesResponse(
           com.microsoft.sharepoint.webpartpages.GetWebPartPropertiesResponseGetWebPartPropertiesResult getWebPartPropertiesResult) {
           this.getWebPartPropertiesResult = getWebPartPropertiesResult;
    }


    /**
     * Gets the getWebPartPropertiesResult value for this GetWebPartPropertiesResponse.
     * 
     * @return getWebPartPropertiesResult
     */
    public com.microsoft.sharepoint.webpartpages.GetWebPartPropertiesResponseGetWebPartPropertiesResult getGetWebPartPropertiesResult() {
        return getWebPartPropertiesResult;
    }


    /**
     * Sets the getWebPartPropertiesResult value for this GetWebPartPropertiesResponse.
     * 
     * @param getWebPartPropertiesResult
     */
    public void setGetWebPartPropertiesResult(com.microsoft.sharepoint.webpartpages.GetWebPartPropertiesResponseGetWebPartPropertiesResult getWebPartPropertiesResult) {
        this.getWebPartPropertiesResult = getWebPartPropertiesResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetWebPartPropertiesResponse)) return false;
        GetWebPartPropertiesResponse other = (GetWebPartPropertiesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getWebPartPropertiesResult==null && other.getGetWebPartPropertiesResult()==null) || 
             (this.getWebPartPropertiesResult!=null &&
              this.getWebPartPropertiesResult.equals(other.getGetWebPartPropertiesResult())));
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
        if (getGetWebPartPropertiesResult() != null) {
            _hashCode += getGetWebPartPropertiesResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetWebPartPropertiesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://microsoft.com/sharepoint/webpartpages", ">GetWebPartPropertiesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getWebPartPropertiesResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://microsoft.com/sharepoint/webpartpages", "GetWebPartPropertiesResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://microsoft.com/sharepoint/webpartpages", ">>GetWebPartPropertiesResponse>GetWebPartPropertiesResult"));
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
