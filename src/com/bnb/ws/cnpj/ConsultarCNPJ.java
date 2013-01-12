package com.bnb.ws.cnpj;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.1
 * 2013-01-04T00:42:49.633-02:00
 * Generated source version: 2.7.1
 * 
 */
@WebServiceClient(name = "ConsultarCNPJ", 
                  wsdlLocation = "file:resources/S146_XML_ConsultarCNPJ.wsdl",
                  targetNamespace = "http://cnpj.infoconv.s255.bnb.gov.br/") 
public class ConsultarCNPJ extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://cnpj.infoconv.s255.bnb.gov.br/", "ConsultarCNPJ");
    public final static QName ConsultarCNPJ = new QName("http://cnpj.infoconv.s255.bnb.gov.br/", "ConsultarCNPJ");
    static {
        URL url = null;
        try {
            url = new URL("file:resources/S146_XML_ConsultarCNPJ.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ConsultarCNPJ.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:resources/S146_XML_ConsultarCNPJ.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ConsultarCNPJ(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ConsultarCNPJ(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConsultarCNPJ() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns ConsultarCNPJSoap
     */
    @WebEndpoint(name = "ConsultarCNPJ")
    public ConsultarCNPJSoap getConsultarCNPJ() {
        return super.getPort(ConsultarCNPJ, ConsultarCNPJSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConsultarCNPJSoap
     */
    @WebEndpoint(name = "ConsultarCNPJ")
    public ConsultarCNPJSoap getConsultarCNPJ(WebServiceFeature... features) {
        return super.getPort(ConsultarCNPJ, ConsultarCNPJSoap.class, features);
    }

}
