<%@ page import="java.util.List" %>
<%@ page import="com.affiliate.entities.LanguageCode" %>
<%@ page import="com.affiliate.entities.Country" %>
<%@ page import="com.affiliate.entities.Region" %>
<%@ page import="com.affiliate.entities.Place" %>
<%@ page import="com.affiliate.persistence.PMF" %>
<%@ page import="javax.jdo.PersistenceManager" %>
<%@ page import="javax.jdo.Query" %>
<%@ page import="com.google.appengine.api.datastore.KeyFactory" %>
<%@ page import="com.google.appengine.api.datastore.Key" %>

<?xml version="1.0" encoding="ISO-8859-2" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-2"
    pageEncoding="ISO-8859-2"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<SCRIPT LANGUAGE="JavaScript">
//....sub category..start.......
function changeCountryValue(){
 var seletedCountry=document.form1.country.value;
 getRegion(seletedCountry);
}

function getRegion(seletedCountry)
 {
 if (window.XMLHttpRequest)
  {
   // code for IE7+, Firefox, Chrome, Opera, Safari
   xmlhttp=new XMLHttpRequest();
  }else{
   // code for IE6, IE5
   xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
  }
 xmlhttp.onreadystatechange=function()
  {
  if (xmlhttp.readyState==4 && xmlhttp.status==200)
   {
	setRegion(xmlhttp.responseText);
   }
  }
  xmlhttp.open("GET","getRegion?languageCode=CS&countryCode="+selectedCountry,true);
  xmlhttp.send();
 }
 
 function setRegion(data) {
	 document.getElementById("region").innerHTML = data;
  } 
//..........sub category..end......

</SCRIPT>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-2" />
<title>Select Page</title>
<link rel="stylesheet" href="../../css/styles.css" type="text/css" />
</head>
<% 
	session.setAttribute("site", "select");
	session.setAttribute("languageCode", "CS"); 
%>
<body>
	<div id="siteBody">
	
	<div id="header">
		<jsp:include page="/WEB-INF/common/header.jsp"/>
	</div>
	
	<% 
		String languageCode = session.getAttribute("languageCode").toString();
		String countryCode = request.getParameter("countryCode");
		String regionCode = request.getParameter("regionCode");
		String placeCode = request.getParameter("placeCode");
	
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		// find countries
		Query qc = pm.newQuery(Country.class, "this.languageCode == languageCodeParam");
		qc.declareParameters("String languageCodeParam");
		List<Country> countries = (List<Country>) qc.execute(languageCode);
	%>
	<form name=form1>
		<select name="country" onChange="location.href='select?countryCode='+this.value;">
			<option>--Vyber zemi--</option>
		<% 
			for (Country c : countries) {
		%>
					<option value="<%= c.getCountryCode() %>">
						<%= c.getCountryName() %>
					</option>			
		<% 
			}
		%>
		</select>
		<div id="region" ></div>
		<div id="place" ></div>
	</form>
	<%
	    pm.close();
	    qc.closeAll();
	%>
	
	<div id="bottom" style="background-color:#888888;width:950px;height:100px;">
	<span>bottom text</span>
</div>
</body>
</html>