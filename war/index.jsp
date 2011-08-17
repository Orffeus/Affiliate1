<%@page import="com.interhome.webservice.WebServiceSoap"%>
<%@page import="com.interhome.webservice.WebService"%>
<%@page import="com.interhome.webservice.CheckServerHealthResult"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript">
function changeIt(objName)
{
	//The image object accessed through its id we mentioned in the DIV block which is going to be visible currently
	var obj = document.getElementById(objName);
	
	//An array that hold the IDs of images that we mentioned in their DIV blocks
	var objId = new Array();
	
	//Storing the image IDs into the array starts here
	objId[0] = "image1";
	objId[1] = "image2";
	objId[2] = "image3";
	//Storing the image IDs into the array ends here
	
	//A counter variable going to use for iteration
	var i;
	
	//A variable that can hold all the other object references other than the object which is going to be visible
	var tempObj;
	
	//The following loop does the display of a single image based on its ID. The image whose ID we passed into this function will be the
	//only image that is displayed rest of the images will be hidden based on their IDs and that part has been handled by the else part
	//of the if statement within this loop.
	for(i=0;i<objId.length;i++)
	{
		if(objName == objId[i])
		{
			obj.style.display = "block";
		}
		else
		{
			tempObj = document.getElementById(objId[i]);
			tempObj.style.display = "none";	
		}
	}
	return;	
}
</script>
<title>Home Page</title>
<link rel="stylesheet" href="css/styles.css" type="text/css" />
</head>
<% session.setAttribute("site", "index"); %>
<body>
<div id ="siteBody">

<div id="header">
	<jsp:include page="/WEB-INF/common/header.jsp"/>
</div>


<div class ="content">
	<div id="imageWindow">
		<div id="image1" style="position: relative;">
		<img src="images/rect3630.png" border="0" style="position: absolute;"/>
		<img src="images/img4s.png" border="0" alt="one" />
		<div id="imageText">
			<h2>Praha</h2>
			<p>Prague is the capital and largest city of the Czech Republic. Situated in the north-west of the country on the Vltava river, the city is home to about 1.3 million people, while its metropolitan area is estimated to have a population of over 2.3 million. The city has a temperate oceanic climate with warm summers and chilly winters.</p>
		</div>
		</div>
	
		<div id="image2" style="display:none; position: relative;">
		<img src="images/rect3630.png" border="0" style="position: absolute;"/>
		<img src="images/img5s.png" border="0" alt="two" />
		<div id="imageText">
			<h2>Praha</h2>
			<p>Prague is the capital and largest city of the Czech Republic. Situated in the north-west of the country on the Vltava river, the city is home to about 1.3 million people, while its metropolitan area is estimated to have a population of over 2.3 million. The city has a temperate oceanic climate with warm summers and chilly winters.</p>
		</div>
		</div>
		
		<div id="image3" style="display:none; position: relative;">
		<img src="images/rect3630.png" border="0" style="position: absolute;"/>
		<img src="images/img6s.png" border="0" alt="three" />
		<div id="imageText">
			<h2>Praha</h2>
			<p>Prague is the capital and largest city of the Czech Republic. Situated in the north-west of the country on the Vltava river, the city is home to about 1.3 million people, while its metropolitan area is estimated to have a population of over 2.3 million. The city has a temperate oceanic climate with warm summers and chilly winters.</p>
		</div>
		</div>
		
		
		<a id="one" href="#" onclick="changeIt('image1');" style="position: absolute; left: 680px; top: 370px;"><img src="images/imageButton.png" border="0"/></a>
		<a id="two" href="#" onclick="changeIt('image2');" style=" position: absolute; left: 710px; top: 370px;"><img src="images/imageButton.png" border="0"/></a>
		<a id="three" href="#" onclick="changeIt('image3');" style="position: absolute; left: 740px; top: 370px;"><img src="images/imageButton.png" border="0"/></a>
	</div>
</div>


<h1>Favorite Destinations</h1>

<img src="images/moravia.png" border="0"/>


<div class = "content2">
		<div class = "colum_left float_l">
		
		</div>
		<div class = "colum_right float_l">
			<p>Here you can put datastore to initial state: <a href="../index2.jsp">index2</a></p>
<%
			WebServiceSoap wss = new WebService().getWebServiceSoap();
			CheckServerHealthResult cshr = wss.checkServerHealth();
			String s = cshr.getAvailability();
			String s2 = cshr.getMessages().getServerName();
			
			//String s = "testujeme";
%>
			<p>Web service is <%= s %></p>
			<p>Server name is <%= s2 %></p>
			<p>Go to <a href="/views/testWS">testWS.jsp</a></p>
			<p>Go to old Search site<a href="/views/search_old">search_old.jsp</a></p>
		</div>
</div>

</div>
</body>
</html>