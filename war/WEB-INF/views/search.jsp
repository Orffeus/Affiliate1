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
<%@ page import="java.util.Enumeration" %>
<%@ page import="com.interhome.webservice.Facilities" %>
<%@ page import="com.interhome.webservice.ArrayOfFacilities" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-2"
    pageEncoding="ISO-8859-2"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-2">
<title>Search</title>
<link rel="stylesheet" href="../../css/styles.css" type="text/css" />
</head>
<% session.setAttribute("site", "search"); %>
<%
	int pageSize = 5;

	//get all parametres in URL in one String (except page)
    Enumeration en = request.getParameterNames();
    String paramName;  
    String allParameters = "";
    while (en.hasMoreElements()) {    
    	paramName = (String) en.nextElement();
    	if (!paramName.equals("page")) {
    		allParameters = allParameters + "&" + paramName + "=" + request.getParameter(paramName);
    	}
    }

%>
<body>
<div id="siteBody">

<div id="header">
	<jsp:include page="/WEB-INF/common/header.jsp"/>
</div>

<div id="searchBody" style="background-color:#DDDDDD; ">
	<div id="searchTool" style="float:right; background-color:red; width:200px; height:400px;">
		<jsp:include page="/WEB-INF/common/searchTool.jsp"/>
	</div>
	<div id="results" style="background-color:#BDEDFF; width:710px;">
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

	int currentPage;
	if (request.getParameter("page")==null) {
		currentPage = 1;
	} else {
		currentPage = Integer.parseInt(request.getParameter("page"));
	}

	siv.setPage(currentPage);
	siv.setPageSize(pageSize);
	//search.setCountryCode("SP");
	siv.setLanguageCode("CS");
	siv.setCurrencyCode("CHF");
	siv.setSalesOfficeCode("2020");

	if (request.getParameter("country")!=null) {
		siv.setCountryCode(request.getParameter("country"));
	}
	if (request.getParameter("region")!=null) {
		siv.setRegionCode(request.getParameter("region"));
	}
	if (request.getParameter("place")!=null) {
		siv.setPlaceCode(request.getParameter("place"));
	}	
	if (request.getParameter("bedrooms")!=null) {
		siv.setBedroomsMin(Integer.parseInt(request.getParameter("bedrooms")));
	}
	if (request.getParameter("barthrooms")!=null) {
		siv.setBathroomsMin(Integer.parseInt(request.getParameter("bedrooms")));
	}

	//Facilities
	ArrayOfFacilities aof = new ArrayOfFacilities();
	if (request.getParameter("aircondition")!=null) {
		aof.getFacilities().add( Facilities.AIRCONDITION );
	}
	if (request.getParameter("dishwasher")!=null) {
		aof.getFacilities().add( Facilities.DISHWASHER );
	}
	if (request.getParameter("washingmachine")!=null) {
		aof.getFacilities().add( Facilities.WASHING_MACHINE );
	}
	if (request.getParameter("parking")!=null) {
		aof.getFacilities().add( Facilities.PARKING );
	}
	if (request.getParameter("pool")!=null) {
		aof.getFacilities().add( Facilities.SWIMMINGPOOL );
	}
	if (request.getParameter("sauna")!=null) {
		aof.getFacilities().add( Facilities.SAUNA );
	}
	if (request.getParameter("tv")!=null) {
		aof.getFacilities().add( Facilities.TV );
	}
	siv.setFacilities(aof);


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
		<div id="oneResult" style="background-image:URL('../../images/oneResult.png'); background-repeat:no-repeat; margin-left: 10px; margin-bottom:5px; width:690px; height:190px;" >

			<div id="oneImage" style="float:left; margin-left: 20px; margin-top: 10px; ">
				<img src="<%= r.getPicture() %>" alt="Picture" style="width:175px; height:141px;"><br>
				<span style="position: absolute; margin-left: 50px; font-family: Arial; font-size: 10px"><%= r.getAccommodationCode() %></span>
				<span style="position: relative; left:520px; bottom: 20px; z-index:2"><a href="../views/result?ac=<%= r.getAccommodationCode()%>" ><img src="../../images/viewDetailsButton.png" alt="View Details" style="width:99px; height:25px; border:0px;"></a></span>
			</div>
			<div id="oneInfo" style="position: relative; top:10px; left:10px; height:141px; font-family: Arial; font-size: 14px">
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
				<b style="color: #1589FF;" ><%= typeOfBuilding %></b>
				<%
				int quality = r.getQuality();
				for (int i=1; i<=quality; i++){
				%>
					<img src="../../images/qualityStar.png" style="width:10px; height:10px;">
				<%
				}
				%><br>
				<%= r.getBedRooms() %> Bed rooms / <%= r.getRooms() %> Rooms <br>
				<br>
				<%
					if (r.isAircondition()){ 
						out.print("<img id=\"miniImage\" src=\"../../images/miniAirCondition.png\" title=\"Aircondition\" style=\"width:20px; height:20px;\">"); 
					} else {
						//out.print("<img id=\"miniImage\" src=\"../../images/miniAirConditionNo.png\" title=\"Aircondition\" style=\"position: relative; top: 10px; width:20px; height:20px;\">"); 
					}

					if (r.isWashingmachine()){ 
						out.print("<img src=\"../../images/miniWashingMachine.png\" title=\"Washingmachine\" style=\"width:20px; height:20px;\">"); 
					} else {
						//out.print("<img src=\"../../images/miniWashingMachineNo.png\" title=\"Washingmachine\" style=\"position: relative; top: 10px; width:20px; height:20px;\">"); 
					}

					if (r.isDishwasher() ){ 
						out.print("<img src=\"../../images/miniDishWasher.png\" title=\"Dishwasher\" style=\"width:20px; height:20px;\">"); 
					} else {
						//out.print("<img src=\"../../images/miniDishWasherNo.png\" title=\"Dishwasher\" style=\"position: relative; top: 10px; width:20px; height:20px;\">"); 
					}

					if (r.isParking() ){ 
						out.print("<img src=\"../../images/miniParking.png\" title=\"Parking\" style=\"width:20px; height:20px;\">");
					} else {
						//out.print("<img src=\"../../images/miniParkingNo.png\" title=\"Parking\" style=\"position: relative; top: 10px; width:20px; height:20px;\">");
					}

					if (r.isPool() ){ 
						out.print("<img src=\"../../images/miniPool.png\" title=\"Swimming pool\" style=\"width:20px; height:20px;\">");
					} else {
						//out.print("<img src=\"../../images/miniPoolNo.png\" title=\"Swimming pool\" style=\"position: relative; top: 10px; width:20px; height:20px;\">");
					}

					if (r.isSauna() ){ 
						out.print("<img src=\"../../images/miniSauna.png\" title=\"Sauna\" style=\"width:20px; height:20px;\">");
					} else {
						//out.print("<img src=\"../../images/miniSaunaNo.png\" title=\"Sauna\" style=\"position: relative; top: 10px; width:20px; height:20px;\">");
					}

					if (r.isTV() ){ 
						out.print("<img src=\"../../images/miniTv.png\" title=\"TV\" style=\"width:20px; height:20px;\">");
					} else {
						//out.print("<img src=\"../../images/miniTvNo.png\" title=\"TV\" style=\"position: relative; top: 10px; width:20px; height:20px;\">");
					}
				%><br></span>
			</div>
		</div>
	<% 
	}

%>
		<div style="text-align:center;">
		<% if (currentPage<=1){ %>
			-back-
		<%}else{ %>
			<a href="../views/search?page=<%= currentPage-1 %><%= allParameters %>" ><b>back</b></a>
		<%}%>
		<% if (currentPage*pageSize>=srv.getResultCount()){ %>
			-forward-
		<%}else{ %>
			<a href="../views/search?page=<%= currentPage+1 %><%= allParameters %>" ><b>forward</b></a>
		<%}%>
		</div>

	</div>

</div>


<div id="bottom" style="text-align:center; color: white; background-color:#41A317;width:950px;height:100px;">
	<span style="position: relative; top: 20px"><b>&copy; Modrany super soft</b></span>
</div>

</div>
</body>
</html>