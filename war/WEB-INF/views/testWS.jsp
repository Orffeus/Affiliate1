<%@page import="com.affiliate.common.WebServiceFactory"%>



<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="../../css/styles.css" type="text/css" />
</head>
<body>

<div id="header">
	<jsp:include page="/WEB-INF/common/header.jsp"/>
</div>

<% /*
	String namespace = "";
	
	SOAPHeaderElement authHeader = new SOAPHEaderElement(new QName("ServiceAuthHeader"));
	authHeader.setAttribute("xmlns", namespace);*/
%>

<%/*
	WebServiceSoap ws = (new WebServiceFactory()).createWebService("http://www.interhome.com/webservice", "CZ 481786", "110002");
	AccommodationDetailInputValue inputValue = new AccommodationDetailInputValue();
	inputValue.setLanguageCode("DE");
	inputValue.setAccommodationCode("CH0000.10.1");
	
	AccommodationDetailReturnValue returnValue = ws.accommodationDetail(inputValue);*/
%>

<p>Prvni</p>
<p>
<%= 2 %>
</p>

<p>Druhy</p>
<p>
<%
	WebServiceFactory wsf = new WebServiceFactory();
	String s = wsf.createWebServiceSoap();

	/*WebService w = new WebService();
	WebServiceSoap ws = w.getWebServiceSoap();
	

	AccommodationDetailInputValue adiv = new AccommodationDetailInputValue();
	adiv.setAccommodationCode("CH0001.100.1");
	adiv.setLanguageCode("DE");
	
	String s = (new WebService()).getWebServiceSoap().accommodationDetail(adiv).getHouseName();*/
	
	//AccommodationDetailReturnValue adrv = ws.accommodationDetail(adiv);
	//adrv.getRooms();
%>
<%= s %>
</p>
<p>

</p>



</body>
</html>