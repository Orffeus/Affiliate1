<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<link rel="stylesheet" href="../../css/styles.css" type="text/css" />
</head>
<% session.setAttribute("site", "login"); %>
<body>

<div id="header">
	<jsp:include page="../common/header.jsp"/>
</div>

<p>For access to this page you have to be logged on.</p>
<p>You can use your own Google account or create it for sign in.</p>
<p>For Google accounts click here.</p>


</body>
</html>