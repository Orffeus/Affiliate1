<%@page import="org.datanucleus.jdo.exceptions.TransactionCommitingException"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.affiliate.entities.Person" %>
<%@ page import="com.affiliate.entities.Comment" %>
<%@ page import="com.affiliate.persistence.PMF" %>
<%@ page import="javax.jdo.PersistenceManager" %>
<%@ page import="javax.jdo.Query" %>
<%@ page import="javax.jdo.Transaction" %>

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
		Query qp = pm.newQuery(Person.class);
		Query qc = pm.newQuery(Comment.class);
	
	    try {
	    	// clean datastore
	    	qc.deletePersistentAll();
	    	qp.deletePersistentAll();
	    	
	    	Person p;
	    	Comment c;
	    	List<Person> persons = new ArrayList<Person>();
	    	List<Comment> comments;
	    	
	    	p = new Person("Albert", "Einstein");
	    	comments = new ArrayList<Comment>();
	    	c = new Comment("A person who never made a mistake never tried anything new.");
	    	comments.add(c);
	    	c = new Comment("Imagination is more important than knowledge.");
	    	comments.add(c);
	    	c = new Comment("A person starts to live when he can live outside himself.");
	    	comments.add(c);
	    	pm.makePersistentAll(comments);
	    	p.setComments(comments);
			persons.add(p);
			
	    	p = new Person("Bruce", "Lee");
	    	comments = new ArrayList<Comment>();
	    	c = new Comment("If you spend too much time thinking about a thing, you'll never get it done.");
	    	comments.add(c);
	    	c = new Comment("Obey the principles without being bound by them.");
	    	comments.add(c);
	    	c = new Comment("Real living is living for others.");
	    	comments.add(c);
	    	pm.makePersistentAll(comments);
	    	p.setComments(comments);
			persons.add(p);			
			
			// store persons into the datastore
			pm.makePersistentAll(persons);
			//pm.makePersistentAll(comments);
	    } catch (Throwable t) {
	    	t.printStackTrace();
	    } finally {
	        pm.close();
	        qp.closeAll();
	        qc.closeAll();
	        
	    }
	%>
	<h1>Welcome!</h1>
	You can see the persons list <a href="/views/personsList" >here</a>
	or you can use this <a href="/views/hello" >link</a>
</body>
</html>