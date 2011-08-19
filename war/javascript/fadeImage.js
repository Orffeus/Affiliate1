var c=0
var s
var v
var q=0
var timeVisible=8000;
function photoGallery(targetObject)
{
	if (!q && targetObject!=null && targetObject!=''){
		fade(targetObject);
		c=c+1
		//s=setTimeout("photoGallery()",1000)
	} else {
		s=setTimeout("photoGallery('photo-gallery')",timeVisible)
	}

}

function changeImage(){
	if (c%3==0){
		document.getElementById('photo-gallery').src = "images/img4s.png";
		document.getElementById('textOne').style.display = "block";
		document.getElementById('textTwo').style.display = "none";
		document.getElementById('textThree').style.display = "none";
		//document.getElementById('imageText').innerHTML = "ahoj";
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
    element.FadeState = element.FadeState == 1 ? -1 : 1;
    element.FadeTimeLeft = TimeToFade - element.FadeTimeLeft;
  }
  else
  {
    element.FadeState = element.FadeState == 2 ? -1 : 1;
    element.FadeTimeLeft = TimeToFade;
    v=setTimeout("animateFade(" + new Date().getTime() + ",'" + eid + "')", 33);
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
 
  v=setTimeout("animateFade(" + curTick + ",'" + eid + "')", 33);
}

function changeIt(cValue){
	c = cValue;
	fade('photo-gallery');
}
