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
function photoGallery()
{
	if (!q){
		fade('photo-gallery');
		c=c+1
		//s=setTimeout("photoGallery()",1000)
	} else {
		s=setTimeout("photoGallery()",5000)
	}
}

function changeImage(){
	if (c%3==0){
		document.getElementById('photo-gallery').src = "images/img4s.png";
	}
	if (c%3==1){
		document.getElementById('photo-gallery').src = "images/img5s.png";
	}
	if (c%3==2){
		document.getElementById('photo-gallery').src = "images/img6s.png";
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
    element.FadeState = element.FadeState == 1 ? -1 : 1;
    element.FadeTimeLeft = TimeToFade - element.FadeTimeLeft;
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
    	s=setTimeout("photoGallery()",5000)
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
</script>
<title>Insert title here</title>
</head>
<body onLoad="photoGallery()">

<div style="background-color:Black;width:950px;height:400px;">
<img src="images/img4s.png" id="photo-gallery" width="950" height="400" onMouseOver="q=true;" onMouseOut="q=false;" >
</div>

<div id="fadeBlock" style="background-color:Lime;width:950px;
      height:400px;text-align:center;">
  <br />
  <img src="images/img4s.png">
  I'm Some Text
</div>
<br />
<br />
<input type="button" onclick="fade('fadeBlock');" value="Go" />

</body>
</html>