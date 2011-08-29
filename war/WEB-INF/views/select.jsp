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
	<form>
		<select name="country" onChange="location.href='select?countryCode='+this.value;">
			<option>--Vyber zemi--</option>
		<% 
			for (Country c : countries) {
		%>
		<% 
				if (c.getCountryCode().equals(countryCode)) {
		%>
					<option selected="selected" value="<%= c.getCountryCode() %>">
						<%= c.getCountryName() %>
					</option>
		<% 
				} else {
		%>	
					<option value="<%= c.getCountryCode() %>">
						<%= c.getCountryName() %>
					</option>				
		<% 
				}
			}
		%>
		</select>
		<% 
			// find regions
			List<Region> regions = null;
			Query qr = pm.newQuery(Region.class, "this.languageCode == languageCodeParam && this.countryCode == countryCodeParam");
			qr.declareParameters("String languageCodeParam, String countryCodeParam");
			if (countryCode != null) {
				regions = (List<Region>) qr.execute(languageCode, countryCode);
			}
		%>
		<select name="region" onChange="location.href='select?countryCode=<%= countryCode %>&regionCode='+this.value;">
			<option selected="selected">--Vyber region--</option>
		<% 
			if (regions != null) {
				for (Region r : regions) {		
		%>
		<% 
					if (r.getRegionCode().equals(regionCode)) {
		%>
						<option selected="selected" value="<%= r.getRegionCode() %>">
							<%= r.getRegionName() %>
						</option>
		<% 
					} else {
		%>	
						<option value="<%= r.getRegionCode() %>">
							<%= r.getRegionName() %>
						</option>				
		<% 
					}		
				}
			}
		%>			
		</select>
		<% 
			// find places
			List<Place> places = null;
			Query qp = pm.newQuery(Place.class, "this.languageCode == languageCodeParam" +  
					"&& this.countryCode == countryCodeParam && this.regionCode == regionCodeParam");
			qp.declareParameters("String languageCodeParam, String countryCodeParam" + 
					", String regionCodeParam");
			if (countryCode != null && regionCode != null) {
				places = (List<Place>) qp.execute(languageCode, countryCode, regionCode);
			}
		%>
		<select name="place" onChange="location.href='select?countryCode=
			<%= countryCode %>&regionCode=<%= regionCode %>&placeCode='+this.value;">
			<option selected="selected">--Vyber místo--</option>
		<% 
			if (places != null) {
				for (Place p : places) {		
		%>
		<% 
					if (p.getPlaceCode().equals(placeCode)) {
		%>
						<option selected="selected" value="<%= p.getPlaceCode() %>">
							<%= p.getPlaceName() %>
						</option>
		<% 
					} else {
		%>	
						<option value="<%= p.getPlaceCode() %>">
							<%= p.getPlaceName() %>
						</option>				
		<% 
					}		
				}
			}
		%>			
		</select>		
	</form>
	<%
	    pm.close();
	    qc.closeAll();
		qr.closeAll();
		qp.closeAll();
	%>
	
	<div id="bottom" style="background-color:#888888;width:950px;height:100px;">
	<span>bottom text</span>
</div>
</body>
</html>