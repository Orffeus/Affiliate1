package com.affiliate.common;

import com.interhome.webservice.WebService;
import com.interhome.webservice.WebServiceSoap;

public class WebServiceFactory {
	
	public WebServiceSoap createWebService(String namespace, String username, String password){
		
		WebServiceSoap ws = new WebService().getWebServiceSoap();
		
		return ws;
	}

}
