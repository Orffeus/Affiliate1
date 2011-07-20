<%@page import="org.datanucleus.jdo.exceptions.TransactionCommitingException"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.affiliate.entities.Person" %>
<%@ page import="com.affiliate.entities.Realty" %>
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
		Query qr = pm.newQuery(Realty.class);
	
	    try {
	    	// clean datastore
	    	qc.deletePersistentAll();
	    	qp.deletePersistentAll();
	    	qr.deletePersistentAll();
	    	
	    	Person p;
	    	Comment c;
	    	Realty r;
	    	List<Person> persons = new ArrayList<Person>();
	    	List<Comment> comments = new ArrayList<Comment>();
	    	List<Realty> realtys = new ArrayList<Realty>();
	    	
	    	p = new Person("Albert", "Einstein");
	    	persons.add(p);
	    	p = new Person("Bruce", "Lee");
	    	persons.add(p);
	    	pm.makePersistentAll(persons);
	    	
	    	r = new Realty("Hajovna", "Vsude klid");
	    	realtys.add(r);
	    	r = new Realty("Ulice", "Zcela zdarma");
	    	realtys.add(r);
	    	pm.makePersistentAll(realtys);
	    	
	    	//comments Einstein
	    	c = new Comment(persons.get(0).getKey(), realtys.get(1).getKey(), "A person who never made a mistake never tried anything new.");
	    	comments.add(c);
	    	c = new Comment(persons.get(0).getKey(), realtys.get(1).getKey(),"Imagination is more important than knowledge.");
	    	comments.add(c);
	    	c = new Comment(persons.get(0).getKey(), realtys.get(0).getKey(),"A person starts to live when he can live outside himself.");
	    	comments.add(c);
	    	pm.makePersistentAll(comments);

	    	//comments Lee
	    	comments = new ArrayList<Comment>();
	    	c = new Comment(persons.get(1).getKey(), realtys.get(0).getKey(),"If you spend too much time thinking about a thing, you'll never get it done.");
	    	comments.add(c);
	    	c = new Comment(persons.get(1).getKey(), realtys.get(1).getKey(),"Obey the principles without being bound by them.");
	    	comments.add(c);
	    	c = new Comment(persons.get(1).getKey(), realtys.get(1).getKey(),"Real living is living for others.");
	    	comments.add(c);
	    	pm.makePersistentAll(comments);			
			
	    } catch (Throwable t) {
	    	t.printStackTrace();
	    } finally {
	        pm.close();
	        qp.closeAll();
	        qc.closeAll();
	        qr.closeAll();
	    }
	%>
	<h1>Welcome!</h1>
	You can see the persons list <a href="/views/personsList" >here</a>
	or you can use this <a href="/views/hello" >link</a>
</body>
</html>