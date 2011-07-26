
<%@ page import="com.google.appengine.api.users.User" %>
<%@ page import="com.google.appengine.api.users.UserService" %>
<%@ page import="com.google.appengine.api.users.UserServiceFactory" %>


<h1>Horizontal CSS Navigation Menu</h1>

<% 
	String actualPage = "" + request.getAttribute("javax.servlet.forward.request_uri"); 
	UserService userService = UserServiceFactory.getUserService();
	User user = userService.getCurrentUser();
	String site =(String) session.getAttribute("site");
	if (site==null) site = "";
%>

 
<p>request_uri: <% out.print(actualPage); %> </p>

<hr />
<div id="stylefour">
<ul>
	<li><a href="../index.jsp" <% if(site.equals("index")) out.print("class=\"current\""); %>>Home</a></li>
	<li><a href="/views/personsList" <% if(site.equals("personsList")) out.print("class=\"current\""); %> >Persons List</a></li>
	<li><a href="/views/hello" <% if(site.equals("hello")) out.print("class=\"current\""); %> >Hello</a></li>
	<li><a href="/views/search" <% if(site.equals("search")) out.print("class=\"current\""); %> >Search</a></li>
	<%
	if (user != null) {
	%>
	<li><a href="<%= userService.createLogoutURL("../index.jsp") %>"
		<% if(site.equals("login")) out.print("class=\"current\""); %> >Sign out</a></li>

	<% 
	} else {
	%>
	<li><a href="<%= userService.createLoginURL("../index.jsp") %>"
		<% if(site.equals("login")) out.print("class=\"current\""); %> >Sing in</a></li>
	<%
	}
	%>
</ul>
</div>