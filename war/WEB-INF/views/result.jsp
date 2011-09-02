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
<script language="javascript" type="text/javascript" src="../../javascript/jquery-1.6.2.js"></script>
<script language="javascript" type="text/javascript" src="../../javascript/resultImageGallery.js"></script>
<script language="javascript" type="text/javascript" src="../../javascript/postComment.js" ></script>
</head>
<% session.setAttribute("site", "search"); %>
<body>

<div id="siteBody">

	<div id="header">
		<jsp:include page="/WEB-INF/common/header.jsp"/>
	</div>

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
	
	AccommodationDetailInputValue adiv = new AccommodationDetailInputValue();
	adiv.setAccommodationCode(request.getParameter("ac"));
	adiv.setLanguageCode("DE");
	
	AccommodationDetailReturnValue adrv = service.getWebServiceSoap().accommodationDetail(adiv);
	
	List<String> pictures = adrv.getPictures().getString();
%>
	<div class="imageGallery">
		<div id="mainImage">
				<img src="<%= pictures.isEmpty() ? "#" : pictures.get(0) %>" style="width:280px; height:226px;" />
		</div>
		<table>
		<tr>
		<td>
			<img class="prev" src="../../images/prev.png" style="width:25px; height:50px;" />
		</td>
		<td>
			<div class="imageGalleryList" style="width:300px; height:100px; overflow:hidden; " >
				<table class="imageGalleryTable" style="position:relative; left:0px;" >
					<tr>
					<%
					for(String p : pictures){
					%>
					<td>
						<img class="imageView" src="<%= p %>" style="width:120px; height=100px;" />	
					</td>
					<%
					}
					%>
					</tr>
				</table>
			</div>
		</td>
		<td>
			<img class="next" src="../../images/next.png" style="width:25px; height:50px;" />
		</td>
		</tr>
		</table>
	</div>



<p>AccommodationCode: <%= adrv.getAccommodationCode() %></p>
<p>HouseName: <%= adrv.getHouseName() %></p>
<p>Place: <%= adrv.getPlace() %></p>

	<div id="comment">
		<jsp:include page="/WEB-INF/views/addComment.jsp"/>
	</div>

</div>
</body>
</html>