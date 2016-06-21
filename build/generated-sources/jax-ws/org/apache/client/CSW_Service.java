
package org.apache.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CSW", targetNamespace = "http://VNSCweb.apache.org/", wsdlLocation = "http://localhost:8080/MavenWebProject/CSW?wsdl")
public class CSW_Service
    extends Service
{

    private final static URL CSW_WSDL_LOCATION;
    private final static WebServiceException CSW_EXCEPTION;
    private final static QName CSW_QNAME = new QName("http://VNSCweb.apache.org/", "CSW");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/MavenWebProject/CSW?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CSW_WSDL_LOCATION = url;
        CSW_EXCEPTION = e;
    }

    public CSW_Service() {
        super(__getWsdlLocation(), CSW_QNAME);
    }

    public CSW_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CSW_QNAME, features);
    }

    public CSW_Service(URL wsdlLocation) {
        super(wsdlLocation, CSW_QNAME);
    }

    public CSW_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CSW_QNAME, features);
    }

    public CSW_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CSW_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CSW
     */
    @WebEndpoint(name = "CSWPort")
    public CSW getCSWPort() {
        return super.getPort(new QName("http://VNSCweb.apache.org/", "CSWPort"), CSW.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CSW
     */
    @WebEndpoint(name = "CSWPort")
    public CSW getCSWPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://VNSCweb.apache.org/", "CSWPort"), CSW.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CSW_EXCEPTION!= null) {
            throw CSW_EXCEPTION;
        }
        return CSW_WSDL_LOCATION;
    }

}
