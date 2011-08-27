<%@ page import="java.util.List" %>
<%@ page import="com.affiliate.entities.LanguageCode" %>
<%@ page import="com.affiliate.entities.Country" %>
<%@ page import="com.affiliate.entities.Region" %>
<%@ page import="com.affiliate.entities.Place" %>
<%@ page import="com.affiliate.persistence.PMF" %>
<%@ page import="javax.jdo.PersistenceManager" %>
<%@ page import="javax.jdo.Query" %>
<%@ page import="com.google.appengine.api.datastore.Key" %>

<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Select Page</title>
<link rel="stylesheet" href="../../css/styles.css" type="text/css" />
</head>
<% 
	session.setAttribute("site", "select");
	session.setAttribute("language", "CS"); 
%>
<body>
	<div id="siteBody">
	
	<div id="header">
		<jsp:include page="/WEB-INF/common/header.jsp"/>
	</div>
	
	<% 
		PersistenceManager pm = PMF.get().getPersistenceManager();
	
		// find language
		Query qlc = pm.newQuery(LanguageCode.class, "this.languageCode == languageCodeParam");
		qlc.declareParameters("String languageCodeParam");
		List<LanguageCode> languageCodes = (List<LanguageCode> ) qlc.execute(session.getAttribute("language"));
		
		// find countries
		Query qc = pm.newQuery(Country.class, "this.languageCode == languageCodeParam");
		qc.declareParameters("com.google.appengine.api.datastore.Key languageCodeParam");
		List<Country> countries = (List<Country>) qc.execute(languageCodes.get(0).getKey());
	%>
	<select name="country">
		<option selected="selected">--Vyber zemi--</option>
	<% 
		for (Country c : countries) {
	%>
		<option value="<%= c.getKey()%>"><%= c.getCountryName() %></option>
	<% 
		}
	%>
	</select>
	<% 
		// find countries
		Query qr = pm.newQuery(Region.class, "this.country == countryParam");
		qr.declareParameters("com.google.appengine.api.datastore.Key countryParam");
		List<Region> regions = (List<Region>) qr.execute(request.getParameter("country"));
	%>
	<select name="region">
		<option selected="selected">--Vyber region--</option>
	</select>
	<%
	    pm.close();
	    qlc.closeAll();
	    qc.closeAll();
	%>
	
	<div id="bottom" style="background-color:#888888;width:950px;height:100px;">
	<span>bottom text</span>
</div>
</body>
</html>