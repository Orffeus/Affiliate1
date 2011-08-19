<%@ page import="com.affiliate.common.HeaderHandlerResolver" %>
<%@ page import="com.interhome.webservice.WebService" %>
<%@ page import="com.interhome.webservice.WebServiceSoap" %>
<%@ page import="com.interhome.webservice.SearchInputValue" %>
<%@ page import="com.interhome.webservice.SearchReturnValue" %>
<%@ page import="com.interhome.webservice.SearchResultItem" %>
<%@ page import="com.interhome.webservice.ArrayOfSearchResultItem" %>
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
<%
	int pageSize = 5;
%>
<body>
<div id ="siteBody">

<div id="header">
	<jsp:include page="/WEB-INF/common/header.jsp"/>
</div>

<div id="searchBody" style="background-color:#DDDDDD; height:<%= pageSize*(180+17)+17 %>px;">
<div id="results" style="float:left; background-color:#444444; width:550px; height:<%= pageSize*(180+17)+17 %>px;">
<%
	WebService service;
	
	//Just for simple switch between PRODUCTIVE and TEST server
	//HINT: Seach does not get full information on TEST server
	if (true) {
		URL baseUrl;
		baseUrl = com.interhome.webservice.WebService.class.getResource(".");
		URL url = new URL(baseUrl, "https://webservices.interhome.com:1084/partnerV3/WebService.asmx?WSDL");
		service = new WebService(url, new QName("http://www.interhome.com/webservice", "WebService"));
	} else {
		service = new WebService();
	}
	
	HeaderHandlerResolver handlerResolver = new HeaderHandlerResolver();
	service.setHandlerResolver(handlerResolver);
	
	SearchInputValue siv = new SearchInputValue();
	siv.setPage(1);
	siv.setPageSize(pageSize);
	//search.setCountryCode("SP");
	siv.setLanguageCode("DE");
	siv.setCurrencyCode("CHF");
	siv.setSalesOfficeCode("2020");
	

	
	
	SearchReturnValue srv = service.getWebServiceSoap().search(siv);
	ArrayOfSearchResultItem aosri = srv.getItems();
	List<SearchResultItem> sri = aosri.getSearchResultItem();
	
	
	if (sri.isEmpty() && srv.getResultCount()>0){
		%>
		<p>Please, try it later. Database is not working.</p>	
		<%
	}
	if (srv.getResultCount()==0){
		%>
		<p>No results found.</p>	
		<%
	}
	
	for (SearchResultItem r : sri) {
	%>
		<div id="oneResult" style="background-color:green; width:500px; height:180px;">
		
			<div id="oneImage" style="float:left;">
				<img src="<%= r.getPicture() %>" alt="Picture" style="width:175px; height:141px;">
				<p style="position: relative; top: -12px"><%= r.getAccommodationCode() %><p>
			</div>
			<div id="oneInfo" style="position: relative; left:10px; height:141px;">
				<p><%= r.getPlace() %> / <%= r.getRegion() %> / <%= r.getCountry() %><br>
				<% 
				
				String typeOfBuilding = r.getType();
				if (typeOfBuilding.equals("h")){
					typeOfBuilding="House";
				}
				if (typeOfBuilding.equals("a")){
					typeOfBuilding="Apartment";
				}
				if (typeOfBuilding.equals("t")){
					typeOfBuilding="detached house";
				}
				%> 
				<%= typeOfBuilding %>
				<%
				int quality = r.getQuality();
				for (int i=1; i<=quality; i++){
				%>
					<img src="../../images/qualityStar.png" style="width:10px; height:10px;">
				<%
				}
				%><br>
				Bed rooms: <%= r.getBedRooms() %> /	rooms: <%= r.getRooms() %> <br>
				<a href="../views/result?ac=<%= r.getAccommodationCode()%>" >More details</a></p>
			</div>
		</div>
	<% 
	}
	
%>
</div>

<div id="searchTool" style="float:right; background-color:red; width:200px; height:400px; left:600px;">
	<p>Search Tool</p>
</div>
</div>


<div id="bottom" style="background-color:#888888;width:950px;height:100px;">
<p>bottom text</p>
</div>

</div>
</body>
</html>