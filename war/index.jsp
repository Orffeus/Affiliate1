<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.affiliate.entities.Person" %>
<%@ page import="com.affiliate.persistence.PMF" %>
<%@ page import="javax.jdo.PersistenceManager" %>

<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Welcome Page</title>
</head>
<body>
	<% 
		PersistenceManager pm = PMF.get().getPersistenceManager();
	
	    try {
			Person p;
			for (int i = 0; i < 5; i++) {
				p = new Person("" + i, "" + i+1);
				pm.makePersistent(p);
			}
	    } finally {
	        pm.close();
	    }
	%>
	<h1>Welcome!</h1>
</body>
</html>