/**
 * GetWebPartPageConnectionInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.sharepoint.webpartpages;

public class GetWebPartPageConnectionInfo  implements java.io.Serializable {
    private java.lang.String sourcePageUrl;

    private java.lang.String sourcePageContents;

    private java.lang.String providerPartID;

    private java.lang.String lcid;

    public GetWebPartPageConnectionInfo() {
    }

    public GetWebPartPageConnectionInfo(
           java.lang.String sourcePageUrl,
           java.lang.String sourcePageContents,
           java.lang.String providerPartID,
           java.lang.String lcid) {
           this.sourcePageUrl = sourcePageUrl;
           this.sourcePageContents = sourcePageContents;
           this.providerPartID = providerPartID;
           this.lcid = lcid;
    }


    /**
     * Gets the sourcePageUrl value for this GetWebPartPageConnectionInfo.
     * 
     * @return sourcePageUrl
     */
    public java.lang.String getSourcePageUrl() {
        return sourcePageUrl;
    }


    /**
     * Sets the sourcePageUrl value for this GetWebPartPageConnectionInfo.
     * 
     * @param sourcePageUrl
     */
    public void setSourcePageUrl(java.lang.String sourcePageUrl) {
        this.sourcePageUrl = sourcePageUrl;
    }


    /**
     * Gets the sourcePageContents value for this GetWebPartPageConnectionInfo.
     * 
     * @return sourcePageContents
     */
    public java.lang.String getSourcePageContents() {
        return sourcePageContents;
    }


    /**
     * Sets the sourcePageContents value for this GetWebPartPageConnectionInfo.
     * 
     * @param sourcePageContents
     */
    public void setSourcePageContents(java.lang.String sourcePageContents) {
        this.sourcePageContents = sourcePageContents;
    }


    /**
     * Gets the providerPartID value for this GetWebPartPageConnectionInfo.
     * 
     * @return providerPartID
     */
    public java.lang.String getProviderPartID() {
        return providerPartID;
    }


    /**
     * Sets the providerPartID value for this GetWebPartPageConnectionInfo.
     * 
     * @param providerPartID
     */
    public void setProviderPartID(java.lang.String providerPartID) {
        this.providerPartID = providerPartID;
    }


    /**
     * Gets the lcid value for this GetWebPartPageConnectionInfo.
     * 
     * @return lcid
     */
    public java.lang.String getLcid() {
        return lcid;
    }


    /**
     * Sets the lcid value for this GetWebPartPageConnectionInfo.
     * 
     * @param lcid
     */
    public void setLcid(java.lang.String lcid) {
        this.lcid = lcid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetWebPartPageConnectionInfo)) return false;
        GetWebPartPageConnectionInfo other = (GetWebPartPageConnectionInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sourcePageUrl==null && other.getSourcePageUrl()==null) || 
             (this.sourcePageUrl!=null &&
              this.sourcePageUrl.equals(other.getSourcePageUrl()))) &&
            ((this.sourcePageContents==null && other.getSourcePageContents()==null) || 
             (this.sourcePageContents!=null &&
              this.sourcePageContents.equals(other.getSourcePageContents()))) &&
            ((this.providerPartID==null && other.getProviderPartID()==null) || 
             (this.providerPartID!=null &&
              this.providerPartID.equals(other.getProviderPartID()))) &&
            ((this.lcid==null && other.getLcid()==null) || 
             (this.lcid!=null &&
              this.lcid.equals(other.getLcid())));
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
        if (getSourcePageUrl() != null) {
            _hashCode += getSourcePageUrl().hashCode();
        }
        if (getSourcePageContents() != null) {
            _hashCode += getSourcePageContents().hashCode();
        }
        if (getProviderPartID() != null) {
            _hashCode += getProviderPartID().hashCode();
        }
        if (getLcid() != null) {
            _hashCode += getLcid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetWebPartPageConnectionInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://microsoft.com/sharepoint/webpartpages", ">GetWebPartPageConnectionInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourcePageUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://microsoft.com/sharepoint/webpartpages", "sourcePageUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourcePageContents");
        elemField.setXmlName(new javax.xml.namespace.QName("http://microsoft.com/sharepoint/webpartpages", "sourcePageContents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("providerPartID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://microsoft.com/sharepoint/webpartpages", "providerPartID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lcid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://microsoft.com/sharepoint/webpartpages", "lcid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
