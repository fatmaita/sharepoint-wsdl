/**
 * Webs.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap;

public interface Webs extends javax.xml.rpc.Service {
    public java.lang.String getWebsSoap12Address();

    public com.microsoft.schemas.sharepoint.soap.WebsSoap getWebsSoap12() throws javax.xml.rpc.ServiceException;

    public com.microsoft.schemas.sharepoint.soap.WebsSoap getWebsSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getWebsSoapAddress();

    public com.microsoft.schemas.sharepoint.soap.WebsSoap getWebsSoap() throws javax.xml.rpc.ServiceException;

    public com.microsoft.schemas.sharepoint.soap.WebsSoap getWebsSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
