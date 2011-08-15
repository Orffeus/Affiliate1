package com.affiliate.common;


import com.interhome.webservice.AccommodationDetailInputValue;
import com.interhome.webservice.AccommodationDetailReturnValue;
import com.interhome.webservice.ServiceAuthHeader;
import com.interhome.webservice.WebService;
import com.interhome.webservice.WebServiceSoap;






/*
import org.apache.axis.client.Stub;
import org.apache.axis.message.SOAPEnvelope;
import org.apache.axis.message.SOAPHeader;
import org.apache.axis.message.SOAPHeaderElement;

import com.interhome.webservice.AccommodationDetailInputValue;
import com.interhome.webservice.ServiceAuthHeader;
import com.interhome.webservice.WebService;
import com.interhome.webservice.WebServiceSoap;
*/


/*
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;

import org.apache.axis.message.SOAPHeaderElement;

import com.interhome.webservice.AccommodationDetailInputValue;
import com.interhome.webservice.WebService;
import com.interhome.webservice.WebServiceSoap;

import org.apache.axis.client.Stub;
*/

/*
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;


import org.apache.axis.message.SOAPHeaderElement;
import com.interhome.www.webservice.AccommodationDetailInputValue;
import com.interhome.www.webservice.WebService;
import com.interhome.www.webservice.WebServiceLocator;
import com.interhome.www.webservice.WebServiceSoap;
import com.interhome.www.webservice.WebServiceSoapStub;
*/




/*
import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPHeaderElement;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
//import org.apache.axis.message.SOAPHeaderElement;


import com.google.appengine.repackaged.com.google.protobuf.ServiceException;
import com.interhome.webservice.WebService;
import com.interhome.webservice.WebServiceSoap;

*/



public class WebServiceFactory {
	
	public String createWebServiceSoap() //String namespace, String username, String password)
			throws Exception {
		String s = "ahoj";
		

		WebService service = new WebService();
		HeaderHandlerResolver handlerResolver = new HeaderHandlerResolver();
		service.setHandlerResolver(handlerResolver);

		AccommodationDetailInputValue adiv = new AccommodationDetailInputValue();
		adiv.setAccommodationCode("ES9700.440.1");
		adiv.setLanguageCode("DE");

		AccommodationDetailReturnValue adrv = service.getWebServiceSoap().accommodationDetail(adiv);
		
		s = s + " " + adrv.getCountry() + " " + adrv.getBedRooms();
		
		/*
		WebServiceSoap wss = new WebService().getWebServiceSoap();
		
		SOAPEnvelope se = new SOAPEnvelope();
		javax.xml.soap.SOAPHeader sh = se.getHeader();
		
		SOAPMessage soapMessage = MessageFactory.newInstance().createMessage();
		SOAPPart soapPart = soapMessage.getSOAPPart();
		SOAPEnvelope soapEnvelope = soapPart.getEnvelope();
		SOAPHeader soapHeader = soapEnvelope.getHeader();

	
		
		((Stub) wss).setHeader(sh);*/
		
		
		/*
		WebService ws = new WebService();
		WebServiceSoap wss = ws.getWebServiceSoap();
		
		namespace = "http://www.interhome.com/webservice";
		
		SOAPHeaderElement authHeader = new SOAPHeaderElement(new QName("ServiceAuthHeader"));
		authHeader.setAttribute("xmlns", namespace);

		SOAPElement userIdNode = authHeader.addChildElement("Username");
		userIdNode.addTextNode("CZ 481786");
		
		SOAPElement passwordNode = authHeader.addChildElement("Password");
		passwordNode.addTextNode("110002");
		
		
		((Stub) wss).setHeader(authHeader);
		
		
		AccommodationDetailInputValue adiv = new AccommodationDetailInputValue();
		adiv.setAccommodationCode("ES9700.440.1");
		adiv.setLanguageCode("DE");
		*/
		
		
		//int i = wss.accommodationDetail(adiv).;
		//s = Integer.toString(i);
		
		/*podle tomase
		
		WebServiceLocator wsl = new WebServiceLocator();
		wsl.setWebServiceSoapEndpointAddress("https://webservices.interhome.com:1084/partnerV3/WebService.asmx?WSDL");
		WebServiceSoap wss = wsl.getWebServiceSoap();
		
		namespace = "http://www.interhome.com/webservice";
		
		SOAPHeaderElement authHeader = new SOAPHeaderElement(new QName("ServiceAuthHeader"));
		authHeader.setAttribute("xmlns", namespace);
		
		SOAPElement userIdNode = authHeader.addChildElement("Username");
		userIdNode.addTextNode("CZ 481786");
		
		SOAPElement passwordNode = authHeader.addChildElement("Password");
		passwordNode.addTextNode("110002");

		((WebServiceSoapStub) wss).setHeader(authHeader);
		
		
		
		AccommodationDetailInputValue adiv = new AccommodationDetailInputValue();
		adiv.setAccommodationCode("ES9700.440.1");
		adiv.setLanguageCode("DE");
		
		int i = -1;
		i = wss.accommodationDetail(adiv).getBedRooms();
		s = Integer.toString(i);
		*/
		
		
		/*
		AccommodationDetail ad = new AccommodationDetail();
		AccommodationDetailInputValue adiv = new AccommodationDetailInputValue();
		adiv.setAccommodationCode("ES9700.440.1");
		adiv.setLanguageCode("DE");
		
		AccommodationDetailReturnValue adrv;
		
		ad.setInputValue(adiv);
		
		
		WebService ws = new WebService();
		
		
		WebServiceSoap wss = ws.getWebServiceSoap();
		wss.accommodationDetail(adiv);
		
		
		
		ServiceAuthHeader sah = new ServiceAuthHeader();
		sah.setUsername("username");
		sah.setPassword("password");
		*/
		/*
		WebService service = new WebService();


		AccommodationDetailInputValue inputValue = new AccommodationDetailInputValue();
		inputValue.setAccommodationCode("ES9700.440.1"); 
		inputValue.setLanguageCode("DE");

		
		AccommodationDetailReturnValue accommodationDetail = service.getWebServiceSoap().accommodationDetail(inputValue);
		
		String s = accommodationDetail.getHouseName();
		if (s==null) {
				s = "je null";
		}
		if (s=="") {
			s = "ja prazdny";
		}
		*/
		/*
		WebService ws = new WebService();
		WebServiceSoap wss = ws.getWebServiceSoap();
		

		SOAPMessage soapMessage = MessageFactory.newInstance().createMessage();
			

		SOAPPart soapPart = soapMessage.getSOAPPart();
		SOAPEnvelope soapEnvelope = soapPart.getEnvelope();
		SOAPHeader soapHeader = soapEnvelope.getHeader();
		

		SOAPHeaderElement authHeader = soapHeader.addHeaderElement(new QName("ServiceAuthHeader"));
				
		authHeader.setAttribute("xmlns", namespace);
		
		SOAPElement userIdNode = authHeader.addChildElement("Username");
		userIdNode.addTextNode(username);

		SOAPElement passwordNode = authHeader.addChildElement("Password");
		passwordNode.addTextNode(password);
		*/
		
		
		//WebService locator = new WebService().;
		
		/*
	    WebServiceSoap ws = new WebService().getWebServiceSoap();
		SOAPHeaderElement authHeader = (SOAPHeaderElement) new QName("ServiceAuthHeader");
		authHeader.setAttribute("xmlns", namespace);
		SOAPElement userIdNode = authHeader.addChildElement("Username");
		userIdNode.addTextNode(username);

		SOAPElement passwordNode = authHeader.addChildElement("Password");
		passwordNode.addTextNode(password);
		
		
		((Stub) ws).setHeader(authHeader); */
		
		//((Stub) wss).setHeader(authHeader);
		
		
		return s;
	}

}
