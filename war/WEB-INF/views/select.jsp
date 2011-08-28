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
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		// find countries
		Query qc = pm.newQuery(Country.class, "this.languageCode == languageCodeParam");
		qc.declareParameters("String languageCodeParam");
		List<Country> countries = (List<Country>) qc.execute(session.getAttribute("languageCode"));
	%>
	<form>
		<select name="country" onChange="location.href='select?countryCode='+this.value;">
			<option selected="selected">--Vyber zemi--</option>
		<% 
			for (Country c : countries) {
		%>
			<option value="<%= c.getCountryCode() %>"><%= c.getCountryName() %></option>
		<% 
			}
		%>
		</select>
		<% 
			// find regions
			String countryCode = request.getParameter("countryCode");
			List<Region> regions = null;
			Query qr = pm.newQuery(Region.class, "this.countryCode == countryCodeParam");
			qr.declareParameters("String countryCodeParam");
			if (countryCode != null) {
				regions = (List<Region>) qr.execute(request.getParameter("countryCode"));
			}
		%>
		<select name="region">
			<option selected="selected">--Vyber region--</option>
		<% 
			if (regions != null) {
				for (Region r : regions) {
		%>
					<option value="<%= r.getRegionCode() %>"><%= r.getRegionName() %></option>
		<% 
				}
			}
		%>			
		</select>
	</form>
	<%
	    pm.close();
	    qc.closeAll();
		qr.closeAll();
	%>
	
	<div id="bottom" style="background-color:#888888;width:950px;height:100px;">
	<span>bottom text</span>
</div>
</body>
</html>