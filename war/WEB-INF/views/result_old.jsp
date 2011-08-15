<%@ page import="javax.jdo.PersistenceManager" %>
<%@ page import="com.affiliate.persistence.PMF" %>
<%@ page import="com.affiliate.entities.Realty" %>
<%@ page import="com.affiliate.entities.Comment" %>
<%@ page import="com.affiliate.entities.Person" %>
<%@ page import="java.util.List" %>
<%@ page import="javax.jdo.Query" %>
<%@ page import="com.google.appengine.api.datastore.Key" %>
<%@ page import="com.google.appengine.api.datastore.KeyFactory" %>


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
	 	List<Comment> comments = null;
	 	List<Person> persons = null;
    	Query q = pm.newQuery(Realty.class);
    	q.setFilter("key == realtyParam");
    	q.declareParameters(Key.class.getName() + " realtyParam");
    	Query q2 = pm.newQuery(Comment.class);
		q2.setFilter("realty == :realtyKey");
		Query q3 = pm.newQuery(Person.class);
		q3.setFilter("key == :personKey");
		Key keyFromId = KeyFactory.stringToKey(request.getParameter("id"));
	
    	try {
    		realtys = (List<Realty>) q.execute(keyFromId); 
    		
		    for (Realty r : realtys) {
	%>
				<h2><%= r.getName() %></h2>
				<p>Info: <%= r.getInfo() %></p>
				
				<div id="comment">
					<jsp:include page="/WEB-INF/views/addComment.jsp"/>
				</div>
	<% 
				comments = (List<Comment>) q2.execute(keyFromId);
				for (Comment c : comments) {
					persons = (List<Person>) q3.execute(c.getPerson());
	%>		
					<h4><%= persons.get(0).getFirstName() %> <%= persons.get(0).getLastName() %></h4>
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
        	q3.closeAll();
    	}
	%>

</body>
</html>