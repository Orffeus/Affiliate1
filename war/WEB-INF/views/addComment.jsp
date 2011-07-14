<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div id="header">
	<jsp:include page="common/header.jsp"/>
</div>

<h2>Here you can add comment </h2>

  <form action="../send" method="post">
    <div><textarea name="content" rows="3" cols="60"></textarea></div>
    <div><input type="submit" value="Send comment" /></div>
  </form>


</body>
</html>