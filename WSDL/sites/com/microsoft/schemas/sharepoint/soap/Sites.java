/**
 * Sites.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap;

public interface Sites extends javax.xml.rpc.Service {
    public java.lang.String getSitesSoap12Address();

    public com.microsoft.schemas.sharepoint.soap.SitesSoap getSitesSoap12() throws javax.xml.rpc.ServiceException;

    public com.microsoft.schemas.sharepoint.soap.SitesSoap getSitesSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getSitesSoapAddress();

    public com.microsoft.schemas.sharepoint.soap.SitesSoap getSitesSoap() throws javax.xml.rpc.ServiceException;

    public com.microsoft.schemas.sharepoint.soap.SitesSoap getSitesSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
