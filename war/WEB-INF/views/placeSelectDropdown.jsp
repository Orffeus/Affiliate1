<%@ page import="java.util.List" %>
<%@ page import="com.affiliate.entities.LanguageCode" %>
<%@ page import="com.affiliate.entities.Region" %>
<%@ page import="com.affiliate.entities.Place" %>

<% List<Place> places = (List<Place>) request.getAttribute("places"); %>		
	
<%@ page language="java" contentType="text/html; charset=ISO-8859-2"
    pageEncoding="ISO-8859-2"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-2">
<title>Places</title>
</head>
		
		<select name="place">
			<option value="">--Vyber místo--</option>
		<% 
			for (Place p : places) {
		%>
					<option value="<%= p.getPlaceCode() %>">
						<%=p.getPlaceName() %>
					</option>			
		<% 
			}
		%>
		</select>