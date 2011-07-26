<%@ page import="java.util.List" %>
<%@ page import="com.affiliate.entities.Person" %>
<%@ page import="com.affiliate.entities.Realty" %>
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
<% session.setAttribute("site", "personsList"); %>
<body>

<div id="header">
	<jsp:include page="../common/header.jsp"/>
</div>

<%--
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
--%>

	<h1>Persons List</h1>
	<p>All persons with their comments</p>
	<% 
		PersistenceManager pm = PMF.get().getPersistenceManager();
	    
	 	List<Person> persons = null;
    	Query q = pm.newQuery(Person.class);
		Query q2 = pm.newQuery(Comment.class);
		q2.setFilter("person == :personParam");
	
	    try {
			persons = (List<Person>) q.execute();
		    
		    for (Person p : persons) {
	%>
			<h2><%= p.getFirstName() %> <%= p.getLastName() %> said: </h2>
	<% 

				//q2.declareParameters("Key personParam");
				
				List<Comment> comments = (List<Comment>) q2.execute(p.getKey());
				
				for (Comment c : comments) {
	%>		
					<p><%= c.getContent() %></p>
	<%
				}
			}
	    } catch (Throwable t) {
	    	t.printStackTrace();
	    } finally {
	        pm.close();
	        q.closeAll();
	        q2.closeAll();
	    }
	%>
	<h2>Tomas Zajicek said: </h2>
	You can return to the welcome page <a href="../index.jsp" >here</a>! 
	<h2>Winzo said: </h2>
	You can post comment <a href="/views/addComment" >here</a>!
	
	<h1>Comments List</h1>
	<p>All comments once and again</p>
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
	
	
	<h1>Realty List</h1>
	<p>All realty with their comments</p>
	<% 
		PersistenceManager pmr = PMF.get().getPersistenceManager();
	    
		List<Realty> realtys = null;
		Query qr = pmr.newQuery(Realty.class);
		Query qr2 = pmr.newQuery(Comment.class);
		qr2.setFilter("realty == :realtyParam");

    	try {
			realtys = (List<Realty>) qr.execute();
	    
	    	for (Realty r : realtys) {
%>
				<h2><%= r.getName() %></h2>
				<p>Info: <%= r.getInfo() %></p>
				<p>Comments: </p>
<% 
				//qr2.declareParameters("Key realtyParam");
			
				comments = (List<Comment>) qr2.execute(r.getKey());
			
				for (Comment c : comments) {
%>		
					<p><%= c.getContent() %></p>
<%
				}
			}
    	} catch (Throwable t) {
    		t.printStackTrace();
    	} finally {
        	pmr.close();
        	qr.closeAll();
        	qr2.closeAll();
    	}
%>
</body>
</html>