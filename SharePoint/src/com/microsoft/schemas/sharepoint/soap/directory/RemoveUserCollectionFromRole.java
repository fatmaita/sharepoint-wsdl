/**
 * RemoveUserCollectionFromRole.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap.directory;

public class RemoveUserCollectionFromRole  implements java.io.Serializable {
    private java.lang.String roleName;

    private com.microsoft.schemas.sharepoint.soap.directory.RemoveUserCollectionFromRoleUserLoginNamesXml userLoginNamesXml;

    public RemoveUserCollectionFromRole() {
    }

    public RemoveUserCollectionFromRole(
           java.lang.String roleName,
           com.microsoft.schemas.sharepoint.soap.directory.RemoveUserCollectionFromRoleUserLoginNamesXml userLoginNamesXml) {
           this.roleName = roleName;
           this.userLoginNamesXml = userLoginNamesXml;
    }


    /**
     * Gets the roleName value for this RemoveUserCollectionFromRole.
     * 
     * @return roleName
     */
    public java.lang.String getRoleName() {
        return roleName;
    }


    /**
     * Sets the roleName value for this RemoveUserCollectionFromRole.
     * 
     * @param roleName
     */
    public void setRoleName(java.lang.String roleName) {
        this.roleName = roleName;
    }


    /**
     * Gets the userLoginNamesXml value for this RemoveUserCollectionFromRole.
     * 
     * @return userLoginNamesXml
     */
    public com.microsoft.schemas.sharepoint.soap.directory.RemoveUserCollectionFromRoleUserLoginNamesXml getUserLoginNamesXml() {
        return userLoginNamesXml;
    }


    /**
     * Sets the userLoginNamesXml value for this RemoveUserCollectionFromRole.
     * 
     * @param userLoginNamesXml
     */
    public void setUserLoginNamesXml(com.microsoft.schemas.sharepoint.soap.directory.RemoveUserCollectionFromRoleUserLoginNamesXml userLoginNamesXml) {
        this.userLoginNamesXml = userLoginNamesXml;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoveUserCollectionFromRole)) return false;
        RemoveUserCollectionFromRole other = (RemoveUserCollectionFromRole) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.roleName==null && other.getRoleName()==null) || 
             (this.roleName!=null &&
              this.roleName.equals(other.getRoleName()))) &&
            ((this.userLoginNamesXml==null && other.getUserLoginNamesXml()==null) || 
             (this.userLoginNamesXml!=null &&
              this.userLoginNamesXml.equals(other.getUserLoginNamesXml())));
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
        if (getRoleName() != null) {
            _hashCode += getRoleName().hashCode();
        }
        if (getUserLoginNamesXml() != null) {
            _hashCode += getUserLoginNamesXml().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoveUserCollectionFromRole.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", ">RemoveUserCollectionFromRole"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roleName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", "roleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userLoginNamesXml");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", "userLoginNamesXml"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", ">>RemoveUserCollectionFromRole>userLoginNamesXml"));
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
