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
<div id="siteBody">

<div id="header">
	<jsp:include page="/WEB-INF/common/header.jsp"/>
</div>

<div id="searchBody" style="background-color:#DDDDDD; ">
	<div id="searchTool" style="float:right; background-color:red; width:200px; height:400px;">
		<span>Search Tool</span>
	</div>
	<div id="results" style="background-color:#444444; width:670px;">
		<br>
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
		<span>Please, try it later. Database is not working.</span><br>	
		<%
	}
	if (srv.getResultCount()==0){
		%>
		<span>No results found.</span><br>	
		<%
	}
	
	for (SearchResultItem r : sri) {
	%>
		<div id="oneResult" style="margin-left: 10px; margin-bottom:10px; background-color:green; width:650px; height:170px;" onmouseover="style.backgroundColor='#84DFC1';" onmouseout="style.backgroundColor='green'">
		
			<div id="oneImage" style="float:left;">
				<img src="<%= r.getPicture() %>" alt="Picture" style="width:175px; height:141px;"><br>
				<span style="position: relative;"><%= r.getAccommodationCode() %></span>
				<span style="position: relative; left:450px;"><a href="../views/result?ac=<%= r.getAccommodationCode()%>" >More details</a></span>
			</div>
			<div id="oneInfo" style="position: relative; left:10px; height:141px;">
				<span><%= r.getPlace() %> / <%= r.getRegion() %> / <%= r.getCountry() %><br>
				<% 
				
				String typeOfBuilding = r.getType();
				if (typeOfBuilding.equals("h")){
					typeOfBuilding="House";
				}
				if (typeOfBuilding.equals("a")){
					typeOfBuilding="Apartment";
				}
				if (typeOfBuilding.equals("t")){
					typeOfBuilding="Detached house";
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
				<%= r.getBedRooms() %> Bed rooms  /	<%= r.getRooms() %> Rooms <br>
				More information: <br>
				<%
					if (r.isAircondition()){ 
						out.print("<img src=\"../../images/miniAirCondition.png\" title=\"Aircondition\" style=\"width:20px; height:20px;\">"); 
					}
					if (r.isWashingmachine()){ 
						out.print("<img src=\"../../images/miniWashingMachine.png\" title=\"Washingmachine\" style=\"width:20px; height:20px;\">"); 
					}
					if (r.isDishwasher() ){ 
						out.print("<img src=\"../../images/miniDishWasher.png\" title=\"Dishwasher\" style=\"width:20px; height:20px;\">"); 
					}
				%><br></span>
			</div>
		</div>
	<% 
	}
	
%>
		<br style="margin-bottom:-10px">
	</div>

</div>


<div id="bottom" style="background-color:#888888;width:950px;height:100px;">
	<span>bottom text</span>
</div>

</div>
</body>
</html>