<%@ page import="javax.jdo.PersistenceManager" %>
<%@ page import="com.affiliate.persistence.PMF" %>
<%@ page import="com.affiliate.entities.Realty" %>
<%@ page import="java.util.List" %>
<%@ page import="javax.jdo.Query" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Result</title>
<link rel="stylesheet" href="../../css/styles.css" type="text/css" />
</head>
<% session.setAttribute("site", "search"); %>
<body>

<div id="header">
	<jsp:include page="/WEB-INF/common/header.jsp"/>
</div>

	<% 
		PersistenceManager pm = PMF.get().getPersistenceManager();
	    
	 	List<Realty> realtys = null;
    	Query q = pm.newQuery(Realty.class);
    	if (session.getAttribute("resultFilter")!=null) 
    		q.setFilter((String)session.getAttribute("resultFilter"));
    	if (session.getAttribute("resultParam")!=null) 
    		q.setFilter((String)session.getAttribute("resultParam"));

	
    	try {
			realtys = (List<Realty>) q.execute();
		    
		    for (Realty r : realtys) {
	%>
				<h2><%= r.getName() %></h2>
				<p>Info: <%= r.getInfo() %></p>
	<% 
			}
    	} catch (Throwable t) {
    		t.printStackTrace();
    	} finally {
        	pm.close();
        	q.closeAll();
    	}
	%>

</body>
</html>