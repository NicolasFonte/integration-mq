package com.bnb.ws.cnpj.consume;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

import com.bnb.ws.ServiceClient;
import com.bnb.ws.cnpj.ConsultarCNPJ;
import com.bnb.ws.cnpj.ConsultarCNPJSoap;

import static org.mockito.Mockito.*;

public class ServiceClientCNPJ extends ServiceClient {

	public ServiceClientCNPJ() {
	}
	
	
	@Override
	public QName getServiceName() {
		return new QName("http://cnpj.infoconv.s255.bnb.gov.br/", "ConsultarCNPJ");
	}

	@Override
	public Object consume(String parsedListOfCNPJ, String cpfUsuario) {
		ConsultarCNPJ ss = new ConsultarCNPJ(getWSDLLocation(), getServiceName());
        ConsultarCNPJSoap port = ss.getConsultarCNPJ(); 
        return port.consultarCNPJP1(parsedListOfCNPJ, cpfUsuario);
	}

	@Override
	public URL getWSDLLocation() {
		URL wsdlURL = ConsultarCNPJ.WSDL_LOCATION;
            File wsdlFile = new File("resources/S146_XML_ConsultarCNPJ.wsdl");
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } 
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        return wsdlURL;
	}

}
