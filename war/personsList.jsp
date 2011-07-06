<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.affiliate.entities.Person" %>
<%@ page import="com.affiliate.persistence.PMF" %>
<%@ page import="javax.jdo.PersistenceManager" %>
<%@ page import="javax.jdo.Query" %>

<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Persons Page</title>
</head>
<body>
	<h1>Persons List</h1>
	<% 
		PersistenceManager pm = PMF.get().getPersistenceManager();
		List<Person> persons;
    	Query q = pm.newQuery(Person.class);
	
	    try {
			persons = (List<Person>) q.execute();
	    } finally {
	        pm.close();
	        q.closeAll();
	    }
	    
	    for (Person p : persons) {
	%>
		<p>Person: <%= p.getFirstName() %> <%= p.getLastName() %></p>
	<% } %>
</body>
</html>