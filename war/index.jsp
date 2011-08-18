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
var c=0
var s
var q=0
var timeVisible=8000;
function photoGallery()
{
	if (!q){
		fade('photo-gallery');
		c=c+1
		//s=setTimeout("photoGallery()",1000)
	} else {
		s=setTimeout("photoGallery()",timeVisible)
	}

}

function changeImage(){
	if (c%3==0){
		document.getElementById('photo-gallery').src = "images/img4s.png";
		document.getElementById('textOne').style.display = "block";
		document.getElementById('textTwo').style.display = "none";
		document.getElementById('textThree').style.display = "none";
	}
	if (c%3==1){
		document.getElementById('photo-gallery').src = "images/img5s.png";
		document.getElementById('textOne').style.display = "none";
		document.getElementById('textTwo').style.display = "block";
		document.getElementById('textThree').style.display = "none";
	}
	if (c%3==2){
		document.getElementById('photo-gallery').src = "images/img6s.png";
		document.getElementById('textOne').style.display = "none";
		document.getElementById('textTwo').style.display = "none";
		document.getElementById('textThree').style.display = "block";
	}
}

//==================================================================
var TimeToFade = 1000.0;

function fade(eid)
{
  var element = document.getElementById(eid);
  if(element == null)
    return;
   
  if(element.FadeState == null)
  {
    if(element.style.opacity == null
        || element.style.opacity == ''
        || element.style.opacity == '1')
    {
      element.FadeState = 2;
    }
    else
    {
      element.FadeState = -2;
    }
  }
   
  if(element.FadeState == 1 || element.FadeState == -1)
  {
    //element.FadeState = element.FadeState == 1 ? -1 : 1;
    //element.FadeTimeLeft = TimeToFade - element.FadeTimeLeft;
  }
  else
  {
    element.FadeState = element.FadeState == 2 ? -1 : 1;
    element.FadeTimeLeft = TimeToFade;
    setTimeout("animateFade(" + new Date().getTime() + ",'" + eid + "')", 33);
  }  
}

function animateFade(lastTick, eid)
{  
  var curTick = new Date().getTime();
  var elapsedTicks = curTick - lastTick;
 
  var element = document.getElementById(eid);
 
  if(element.FadeTimeLeft <= elapsedTicks)
  {
    element.style.opacity = element.FadeState == 1 ? '1' : '0';
    element.style.filter = 'alpha(opacity = '
        + (element.FadeState == 1 ? '100' : '0') + ')';
    element.FadeState = element.FadeState == 1 ? 2 : -2;
    
    if (element.FadeState == -2){
    	changeImage();
    	fade('photo-gallery') ;
    	s=setTimeout("photoGallery()",timeVisible)
    }
    
    return;
  }
 
  element.FadeTimeLeft -= elapsedTicks;
  var newOpVal = element.FadeTimeLeft/TimeToFade;
  if(element.FadeState == 1)
    newOpVal = 1 - newOpVal;

  element.style.opacity = newOpVal;
  element.style.filter = 'alpha(opacity = ' + (newOpVal*100) + ')';
 
  setTimeout("animateFade(" + curTick + ",'" + eid + "')", 33);
}

function changeIt(cValue){
	c = cValue;
	fade('photo-gallery');
}
</script>
<title>Home Page</title>
<link rel="stylesheet" href="css/styles.css" type="text/css" />
</head>
<% session.setAttribute("site", "index"); %>
<body onLoad="photoGallery()">
<div id ="siteBody">

<div id="header">
	<jsp:include page="/WEB-INF/common/header.jsp"/>
</div>


<div class ="content">
	<div id="imageWindow" style="position: relative;background-color:Black;width:950px;height:400px;" onMouseOver="q=true;" onMouseOut="q=false;">
		<img src="images/rect3632.png" id="fog" border="0" style="position: absolute; z-index:1; width:950px; height:400px;"/>
		
		<img src="images/img4s.png" id="photo-gallery" style="position: absolute;" width="950" height="400" >
		<div id="imageText" style="z-index:2">
			<div id="textOne">
				<h2>Praha</h2>
				<p>Prague is the capital and largest city of the Czech Republic. Situated in the north-west of the country on the Vltava river, the city is home to about 1.3 million people, while its metropolitan area is estimated to have a population of over 2.3 million. The city has a temperate oceanic climate with warm summers and chilly winters.</p>
			</div>
			<div id="textTwo" style="display:none;">
				<h2>Nabrezi</h2>
				<p>A zrovna po nem jede tramvaj.</p>
			</div>
			<div id="textThree" style="display:none;">
				<h2>Tramvaj</h2>
				<p>Pres prazdniny nam tramvaj nejezdi</p>
			</div>
		</div>
		
		<div id="imageButton" style="position: absolute; z-index:2">
			<a id="one" href="#" onclick="changeIt(0);" style="position: absolute; left: 680px; top: 370px;"><img src="images/imageButton.png" border="0"/></a>
			<a id="two" href="#" onclick="changeIt(1);" style=" position: absolute; left: 710px; top: 370px;"><img src="images/imageButton.png" border="0"/></a>
			<a id="three" href="#" onclick="changeIt(2);" style="position: absolute; left: 740px; top: 370px;"><img src="images/imageButton.png" border="0"/></a>
		</div>
	</div>
</div>


<h1>Favorite Destinations</h1>

<img src="images/moravia.png" border="0"/>


<div class = "content2">
		<div class = "colum_left float_l">
		
		</div>
		<div class = "colum_right float_l">
			<p>TEST page <a href="../test.jsp">test</a></p>
			<p>TEST2 page <a href="../test2.jsp">test2</a></p>
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