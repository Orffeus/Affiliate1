<%@page import="com.affiliate.common.WebServiceFactory"%>
<%@page import="com.interhome.webservice.WebServiceSoap"%>
<%@page import="com.interhome.webservice.WebService"%>
<%@page import="com.interhome.webservice.AccommodationDetailInputValue"%>
<%@page import="com.interhome.webservice.AccommodationDetailReturnValue"%>
<%@page import="com.interhome.webservice.WebServiceSoap"%>


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

<%
	String namespace = "";
	
	SOAPHeaderElement authHeader = new SOAPHEaderElement(new QName("ServiceAuthHeader"));
	authHeader.setAttribute("xmlns", namespace);
%>

<%
	WebServiceSoap ws = (new WebServiceFactory()).createWebService("http://www.interhome.cz/cesk%C3%BD/pro+partnery/p%C5%99ihl%C3%A1sit", "CZ 481786", "110002");
	AccommodationDetailInputValue inputValue = new AccommodationDetailInputValue();
	inputValue.setLanguageCode("DE");
	inputValue.setAccommodationCode("CH0000.10.1");
	
	AccommodationDetailReturnValue returnValue = ws.accommodationDetail(inputValue);
%>

<% if (returnValue==null) {%>
<p> nasel null</p>
<%}else{ %>
<p>neco nasel</p>
bedRooms: <%= returnValue.getBedRooms() %>
country: <%= returnValue.getCountry() %>
<%} %>



</body>
</html>