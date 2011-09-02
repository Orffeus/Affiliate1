<%@ page import="com.google.appengine.api.users.User" %>
<%@ page import="com.google.appengine.api.users.UserService" %>
<%@ page import="com.google.appengine.api.users.UserServiceFactory" %>

<%@ page import="java.util.List" %>
<%@ page import="com.affiliate.entities.Person" %>
<%@ page import="com.affiliate.entities.Realty" %>
<%@ page import="com.affiliate.entities.Comment" %>
<%@ page import="com.affiliate.persistence.PMF" %>
<%@ page import="javax.jdo.PersistenceManager" %>
<%@ page import="javax.jdo.Query" %>


<%  
	UserService userService = UserServiceFactory.getUserService();
	User user = userService.getCurrentUser();
%>

<% 
	if (user==null) { 
%>
		<p>Only logged users can post comments. You can sign in 
		<a href="">here</a>(not working)
		.</p>
<%
	}
	else {
%>


<h2>Here you can add comment </h2>
  <form action="" method="post">
  	<input type="hidden" name="ac" value="<%= request.getParameter("ac") %>" />
    <div><textarea name="content" rows="3" cols="60"></textarea></div>
    <div><input type="button" value="Send comment" onClick="sendComment(this.form)" /></div>
  </form>
<%
	}
%>


<% 
	PersistenceManager pm = PMF.get().getPersistenceManager();

	List<Realty> realtys = null;
	List<Comment> comments = null;
	
    Query q = pm.newQuery(Realty.class);
	q.setFilter("accommodationCode == :accommodationCodeParam");
	//q.setOrdering("date desc");	
	
	Query q2 = pm.newQuery(Comment.class);
	q2.setFilter("realty == :realtyParam");
	q2.setOrdering("date desc");
	
	Query q3 = pm.newQuery(Person.class);
	
	String ac = request.getParameter("ac");
	Person p;
	
	try {
		realtys = (List<Realty>) q.execute(ac);
		
		for (Realty r : realtys) {
			comments = (List<Comment>) q2.execute(r.getKey());
			
			for (Comment c : comments) {
			%>
				<p>
					<% p = pm.getObjectById(Person.class, c.getPerson()); %>
					<%= p.getFirstName() %>
					<%= p.getLastName() %>
					time: <%= c.getDate() %>
					<br />
					<%= c.getContent() %>
				</p>
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












