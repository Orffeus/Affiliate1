<%@ page import="java.util.List" %>
<%@ page import="com.affiliate.entities.LanguageCode" %>
<%@ page import="com.affiliate.entities.Region" %>

<% List<Region> regions = (List<Region>) request.getAttribute("regions"); %>		
	
<%@ page language="java" contentType="text/html; charset=ISO-8859-2"
    pageEncoding="ISO-8859-2"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-2">
<title>Regions</title>
</head>
		
		<select name="region" onChange="changeRegionValue()">
			<option value="">--Vyber region--</option>
		<% 
			for (Region r : regions) {
		%>
					<option value="<%= r.getRegionCode() %>">
						<%=r.getRegionName() %>
					</option>			
		<% 
			}
		%>
		</select>