<%@ page import="com.google.appengine.api.users.User" %>
<%@ page import="com.google.appengine.api.users.UserService" %>
<%@ page import="com.google.appengine.api.users.UserServiceFactory" %>


<%  
	UserService userService = UserServiceFactory.getUserService();
	User user = userService.getCurrentUser();
%>

<% 
	if (user==null) 
	{
		//todo request url
%>
		<p>Only logged users can post comments. You can sign in 
		<a href="<%= userService.createLoginURL(request.getRequestURI()) %>">here</a>
		.</p>
<%
	}
	else
	{
%>


<h2>Here you can add comment </h2>
	<%String s = "../send?id=" + request.getParameter("id");  %>
  <form action="<%= s%>" method="post">
    <div><textarea name="content" rows="3" cols="60"></textarea></div>
    <div><input type="submit" value="Send comment" /></div>
  </form>

<%
	}
%>

</body>
</html>
