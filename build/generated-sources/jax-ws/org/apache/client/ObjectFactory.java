
package org.apache.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.apache.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetDomainResponse_QNAME = new QName("http://www.opengis.net/cat/csw/2.0.2", "GetDomainResponse");
    private final static QName _GetCapabilitiesResponse_QNAME = new QName("http://www.opengis.net/cat/csw/2.0.2", "GetCapabilitiesResponse");
    private final static QName _DescribeRecord_QNAME = new QName("http://www.opengis.net/cat/csw/2.0.2", "DescribeRecord");
    private final static QName _Exception_QNAME = new QName("http://www.opengis.net/cat/csw/2.0.2", "Exception");
    private final static QName _DescribeRecordResponse_QNAME = new QName("http://www.opengis.net/cat/csw/2.0.2", "DescribeRecordResponse");
    private final static QName _GetDomain_QNAME = new QName("http://www.opengis.net/cat/csw/2.0.2", "GetDomain");
    private final static QName _GetCapabilities_QNAME = new QName("http://www.opengis.net/cat/csw/2.0.2", "GetCapabilities");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.apache.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DescribeRecordResponse }
     * 
     */
    public DescribeRecordResponse createDescribeRecordResponse() {
        return new DescribeRecordResponse();
    }

    /**
     * Create an instance of {@link GetCapabilities }
     * 
     */
    public GetCapabilities createGetCapabilities() {
        return new GetCapabilities();
    }

    /**
     * Create an instance of {@link GetDomain }
     * 
     */
    public GetDomain createGetDomain() {
        return new GetDomain();
    }

    /**
     * Create an instance of {@link GetDomainResponse }
     * 
     */
    public GetDomainResponse createGetDomainResponse() {
        return new GetDomainResponse();
    }

    /**
     * Create an instance of {@link GetCapabilitiesResponse }
     * 
     */
    public GetCapabilitiesResponse createGetCapabilitiesResponse() {
        return new GetCapabilitiesResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link DescribeRecord }
     * 
     */
    public DescribeRecord createDescribeRecord() {
        return new DescribeRecord();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDomainResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/cat/csw/2.0.2", name = "GetDomainResponse")
    public JAXBElement<GetDomainResponse> createGetDomainResponse(GetDomainResponse value) {
        return new JAXBElement<GetDomainResponse>(_GetDomainResponse_QNAME, GetDomainResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCapabilitiesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/cat/csw/2.0.2", name = "GetCapabilitiesResponse")
    public JAXBElement<GetCapabilitiesResponse> createGetCapabilitiesResponse(GetCapabilitiesResponse value) {
        return new JAXBElement<GetCapabilitiesResponse>(_GetCapabilitiesResponse_QNAME, GetCapabilitiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DescribeRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/cat/csw/2.0.2", name = "DescribeRecord")
    public JAXBElement<DescribeRecord> createDescribeRecord(DescribeRecord value) {
        return new JAXBElement<DescribeRecord>(_DescribeRecord_QNAME, DescribeRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/cat/csw/2.0.2", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DescribeRecordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/cat/csw/2.0.2", name = "DescribeRecordResponse")
    public JAXBElement<DescribeRecordResponse> createDescribeRecordResponse(DescribeRecordResponse value) {
        return new JAXBElement<DescribeRecordResponse>(_DescribeRecordResponse_QNAME, DescribeRecordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDomain }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/cat/csw/2.0.2", name = "GetDomain")
    public JAXBElement<GetDomain> createGetDomain(GetDomain value) {
        return new JAXBElement<GetDomain>(_GetDomain_QNAME, GetDomain.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCapabilities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/cat/csw/2.0.2", name = "GetCapabilities")
    public JAXBElement<GetCapabilities> createGetCapabilities(GetCapabilities value) {
        return new JAXBElement<GetCapabilities>(_GetCapabilities_QNAME, GetCapabilities.class, null, value);
    }

}
