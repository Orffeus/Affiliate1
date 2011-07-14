<%@ page import="java.util.List" %>
<%@ page import="com.affiliate.entities.Person" %>
<%@ page import="com.affiliate.entities.Comment" %>
<%@ page import="com.affiliate.persistence.PMF" %>
<%@ page import="javax.jdo.PersistenceManager" %>
<%@ page import="javax.jdo.Query" %>
<%@ page import="javax.jdo.Transaction" %>
<%@ page import="com.google.appengine.api.users.UserService" %>
<%@ page import="com.google.appengine.api.users.UserServiceFactory" %>
<%@ page import="com.google.appengine.api.datastore.Key" %>


<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Persons Page</title>
<link rel="stylesheet" href="../../css/styles.css" type="text/css" />
</head>
<body>

<div id="header">
	<jsp:include page="../common/header.jsp"/>
</div>

   <%
     UserService userService = UserServiceFactory.getUserService();
     if (!userService.isUserLoggedIn()) {
   %>
      Please <a href="<%=userService.createLoginURL("/views/login.jsp")%>">log in</a>
   <% } else { %>
      Welcome, <%= userService.getCurrentUser().getNickname() %>!
        <a href="<%=userService.createLogoutURL("/")%>" >log out</a>
   <%
     }
   %>


	<h1>Persons List</h1>
	<% 
		PersistenceManager pm = PMF.get().getPersistenceManager();
	    
	 	List<Person> persons = null;
    	Query q = pm.newQuery(Person.class);
	
	    try {
			persons = (List<Person>) q.execute();
		    
		    for (Person p : persons) {
	%>
			<h2><%= p.getFirstName() %> <%= p.getLastName() %> said: </h2>
	<% 
				for (Key c : p.getComments()) {
	%>		
					<p><%= pm.getObjectById(Comment.class,c).getContent() %></p>
	<%
				}
			}
	    } catch (Throwable t) {
	    	t.printStackTrace();
	    } finally {
	        pm.close();
	        q.closeAll();
	    }
	%>
	<h2>Tomas Zajicek said: </h2>
	You can return to the welcome page <a href="../index.jsp" >here</a>! 
	<h2>Winzo said: </h2>
	You can post comment <a href="/views/addComment" >here</a>!
	
	<h1>Comments List</h1>
	<% 
		PersistenceManager pmc = PMF.get().getPersistenceManager();
	    
	 	List<Comment> comments = null;
    	Query qc = pmc.newQuery(Comment.class);
	
	    try {
			comments = (List<Comment>) qc.execute();
		    
		    for (Comment c : comments) {
	%>
			<h2>comment: <%= c.getContent() %></h2>
	<% 
			}
	    } catch (Throwable t) {
	    	t.printStackTrace();
	    } finally {
	        pmc.close();
	        qc.closeAll();
	    }
	%>
</body>
</html>