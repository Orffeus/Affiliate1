<%@ page import="com.affiliate.common.HeaderHandlerResolver" %>
<%@ page import="com.interhome.webservice.WebService" %>
<%@ page import="com.interhome.webservice.SearchInputValue" %>
<%@ page import="com.interhome.webservice.SearchReturnValue" %>
<%@ page import="com.interhome.webservice.SearchResultItem" %>
<%@ page import="com.interhome.webservice.ArrayOfSearchResultItem" %>
<%@ page import="com.interhome.webservice.AccommodationDetailInputValue" %>
<%@ page import="com.interhome.webservice.AccommodationDetailReturnValue" %>
<%@ page import="java.util.List" %>
<%@ page import="java.net.URL" %>
<%@ page import="javax.xml.namespace.QName" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="../../css/styles.css" type="text/css" />
</head>
<% session.setAttribute("site", "search"); %>
<body>

<div id="header">
	<jsp:include page="/WEB-INF/common/header.jsp"/>
</div>

<%

	WebService service;
	
	//Just for simple switch between PRODUCTIVE and TEST server
	//HINT: Seach does not get full information on TEST server
	if (false) {
		URL baseUrl;
		baseUrl = com.interhome.webservice.WebService.class.getResource(".");
		URL url = new URL(baseUrl, "https://webservices.interhome.com:1084/partnerV3/WebService.asmx?WSDL");
		service = new WebService(url, new QName("http://www.interhome.com/webservice", "WebService"));
	} else {
		service = new WebService();
	}

	HeaderHandlerResolver handlerResolver = new HeaderHandlerResolver();
	service.setHandlerResolver(handlerResolver);
	
	AccommodationDetailInputValue adiv = new AccommodationDetailInputValue();
	adiv.setAccommodationCode(request.getParameter("ac"));
	adiv.setLanguageCode("DE");
	
	AccommodationDetailReturnValue adrv = service.getWebServiceSoap().accommodationDetail(adiv);
%>
<p>AccommodationCode: <%= adrv.getAccommodationCode() %></p>
<p>HouseName: <%= adrv.getHouseName() %></p>
<p>Place: <%= adrv.getPlace() %></p>
<img src="<%= adrv.getPictures().getString().get(0) %>" alt="Picture">

</body>
</html>