
package com.bnb.ws.cpf.consume;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.bnb.ws.cpf.ArrayOfBNBPessoaPerfil1;
import com.bnb.ws.cpf.ArrayOfBNBPessoaPerfil2;
import com.bnb.ws.cpf.ArrayOfBNBPessoaPerfil3;
import com.bnb.ws.cpf.ConsultarCPF;
import com.bnb.ws.cpf.ConsultarCPFSoap;

/**
 * This class was generated by Apache CXF 2.7.1
 * 2013-01-04T01:17:02.035-02:00
 * Generated source version: 2.7.1
 * 
 */
public final class ConsultarCPFSoap_ConsultarCPF_Client {

    private static final QName SERVICE_NAME = new QName("http://cpf.infoconv.s255.bnb.gov.br/", "ConsultarCPF");

    private ConsultarCPFSoap_ConsultarCPF_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = ConsultarCPF.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        ConsultarCPF ss = new ConsultarCPF(wsdlURL, SERVICE_NAME);
        ConsultarCPFSoap port = ss.getConsultarCPF();  
        
        {

        System.out.println("Invoking consultarCPFP2...");
        java.lang.String _consultarCPFP2_listaDeCPF = args[1];
        java.lang.String _consultarCPFP2_cpfUsuario = args[2];
        com.bnb.ws.cpf.ArrayOfBNBPessoaPerfil2 _consultarCPFP2__return = port.consultarCPFP2(_consultarCPFP2_listaDeCPF, _consultarCPFP2_cpfUsuario);
        System.out.println("consultarCPFP2.result=" + _consultarCPFP2__return);


        }

        System.exit(0);
    }

}