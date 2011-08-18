<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<script type="text/javascript">
/***********************************************
* Ultimate Fade-In Slideshow (v1.5): © Dynamic Drive (http://www.dynamicdrive.com)
* This notice MUST stay intact for legal use
* Visit http://www.dynamicdrive.com/ for this script and 100s more.
***********************************************/

var fadeimages=new Array()
//SET IMAGE PATHS. Extend or contract array as needed
fadeimages[0]=["images/img4s.png", "", ""] //plain image syntax
fadeimages[1]=["images/img5s.png", "", ""] //image with link syntax
fadeimages[2]=["images/img6s.png", "", ""] //image with link and target syntax
fadeimages[3]=["photo4.jpg", "", ""] //plain image syntax
fadeimages[4]=["photo5.jpg", "", ""] //plain image syntax

var fadeimages2=new Array()
//SET IMAGE PATHS. Extend or contract array as needed
fadeimages2[0]=["photo6.jpg", "", ""] //plain image syntax
fadeimages2[1]=["photo7.jpg", "", ""] //image with link syntax
fadeimages2[2]=["photo8.jpg", "", ""] //image with link and target syntax
fadeimages2[3]=["photo9.jpg", "", ""] //plain image syntax
fadeimages2[4]=["photo1.jpg", "", ""] //plain image syntax

var fadebgcolor="white"

////NO need to edit beyond here/////////////
var fadearray=new Array() //array to cache fadeshow instances
var fadeclear=new Array() //array to cache corresponding clearinterval pointers

var dom=(document.getElementById) //modern dom browsers
var iebrowser=document.all

function fadeshow(theimages, fadewidth, fadeheight, borderwidth, delay, pause, displayorder){
	this.flag=1
	this.pausecheck=pause
	this.mouseovercheck=0
	this.delay=delay
	this.degree=10 //initial opacity degree (10%)
	this.curimageindex=0
	this.nextimageindex=1
	fadearray[fadearray.length]=this
	this.slideshowid=fadearray.length-1
	this.canvasbase="canvas"+this.slideshowid
	this.curcanvas=this.canvasbase+"_0"
	if (typeof displayorder!="undefined")
		theimages.sort(function() {return 0.5 - Math.random();}) //thanks to Mike (aka Mwinter) :)
	this.theimages=theimages
	this.imageborder=parseInt(borderwidth)
	this.postimages=new Array() //preload images
	for (p=0;p<theimages.length;p++){
		this.postimages[p]=new Image()
		this.postimages[p].src=theimages[p][0]
	}

	var fadewidth=fadewidth+this.imageborder*2
	var fadeheight=fadeheight+this.imageborder*2
	var oddop=typeof document.body.style.opacity!='undefined'? 'opacity' : typeof document.body.style.MozOpacity!='undefined'? '-moz-opacity' : '-khtml-opacity';

	if (iebrowser&&dom||dom) {//if IE5+ or modern browsers (ie: Firefox)
		document.write('<!--[if gte IE 5.5]>\n\
		<div id="master'+this.slideshowid+'" style="position:relative;width:'+fadewidth+'px;height:'+fadeheight+'px;overflow:hidden;"><div id="'+this.canvasbase+'_0" style="position:absolute;width:'+fadewidth+'px;height:'+fadeheight+'px;top:0;left:0;filter:progid:DXImageTransform.Microsoft.alpha(opacity=10);background-color:'+fadebgcolor+'"></div><div id="'+this.canvasbase+'_1" style="position:absolute;width:'+fadewidth+'px;height:'+fadeheight+'px;top:0;left:0;filter:progid:DXImageTransform.Microsoft.alpha(opacity=10);background-color:'+fadebgcolor+'"></div></div>\n\
		<![endif]-->\n')
		document.write('<![if lt IE 5.5]>\n\
		<div id="master'+this.slideshowid+'" style="position:relative;width:'+fadewidth+'px;height:'+fadeheight+'px;overflow:hidden;"><div id="'+this.canvasbase+'_0" style="position:absolute;width:'+fadewidth+'px;height:'+fadeheight+'px;top:0;left:0;'+oddop+':0.1;background-color:'+fadebgcolor+'"></div><div id="'+this.canvasbase+'_1" style="position:absolute;width:'+fadewidth+'px;height:'+fadeheight+'px;top:0;left:0;'+oddop+':0.1;background-color:'+fadebgcolor+'"></div></div>\n\
		<![endif]>\n')
	}
	else
		document.write('<div><img name="defaultslide'+this.slideshowid+'" src="'+this.postimages[0].src+'"></div>')

	if (iebrowser&&dom||dom) //if IE5+ or modern browsers such as Firefox
		this.startit()
	else{
		this.curimageindex++
		setInterval("fadearray["+this.slideshowid+"].rotateimage()", this.delay)
	}
}

function fadepic(obj){
if (obj.degree<100){
obj.degree+=10
if (obj.tempobj.filters&&obj.tempobj.filters[0]){
if (typeof obj.tempobj.filters[0].opacity=="number") //if IE6+
obj.tempobj.filters[0].opacity=obj.degree
else //else if IE5.5-
obj.tempobj.style.filter="alpha(opacity="+obj.degree+")"
}
else if (obj.tempobj.style.MozOpacity)
obj.tempobj.style.MozOpacity=obj.degree/101
else if (obj.tempobj.style.KhtmlOpacity)
obj.tempobj.style.KhtmlOpacity=obj.degree/100
else if (obj.tempobj.style.opacity&&!obj.tempobj.filters)
obj.tempobj.style.opacity=obj.degree/101
}
else{
clearInterval(fadeclear[obj.slideshowid])
obj.mouseovercheck=obj.flag=1
}
}

fadeshow.prototype.populateslide=function(picobj, picindex){
var slideHTML=""
if (this.theimages[picindex][1]!="") //if associated link exists for image
slideHTML='<a href="'+this.theimages[picindex][1]+'" target="'+this.theimages[picindex][2]+'">'
slideHTML+='<img src="'+this.postimages[picindex].src+'" border="'+this.imageborder+'px">'
if (this.theimages[picindex][1]!="") //if associated link exists for image
slideHTML+='</a>'
picobj.innerHTML=slideHTML
}


fadeshow.prototype.rotateimage=function(){
if (this.pausecheck==1) //if pause onMouseover enabled, cache object
var cacheobj=this
if (this.mouseovercheck==1)
setTimeout(function(){cacheobj.rotateimage()}, 100)
else if (iebrowser&&dom||dom){
this.resetit()
var crossobj=this.tempobj=iebrowser? iebrowser[this.curcanvas] : document.getElementById(this.curcanvas)
crossobj.style.zIndex++
fadeclear[this.slideshowid]=setInterval("fadepic(fadearray["+this.slideshowid+"])",50)
this.curcanvas=(this.curcanvas==this.canvasbase+"_0")? this.canvasbase+"_1" : this.canvasbase+"_0"
}
else{
var ns4imgobj=document.images['defaultslide'+this.slideshowid]
ns4imgobj.src=this.postimages[this.curimageindex].src
}
this.curimageindex=(this.curimageindex<this.postimages.length-1)? this.curimageindex+1 : 0
}

fadeshow.prototype.resetit=function(){
this.degree=10
var crossobj=iebrowser? iebrowser[this.curcanvas] : document.getElementById(this.curcanvas)
if (crossobj.filters&&crossobj.filters[0]){
if (typeof crossobj.filters[0].opacity=="number") //if IE6+
crossobj.filters(0).opacity=this.degree
else //else if IE5.5-
crossobj.style.filter="alpha(opacity="+this.degree+")"
}
else if (crossobj.style.MozOpacity)
crossobj.style.MozOpacity=this.degree/101
else if (crossobj.style.KhtmlOpacity)
crossobj.style.KhtmlOpacity=this.degree/100
else if (crossobj.style.opacity&&!crossobj.filters)
crossobj.style.opacity=this.degree/101
}


fadeshow.prototype.startit=function(){
var crossobj=iebrowser? iebrowser[this.curcanvas] : document.getElementById(this.curcanvas)
this.populateslide(crossobj, this.curimageindex)
if (this.pausecheck==1){ //IF SLIDESHOW SHOULD PAUSE ONMOUSEOVER
var cacheobj=this
/*var crossobjcontainer=iebrowser? iebrowser["master"+this.slideshowid] : document.getElementById("master"+this.slideshowid)
crossobjcontainer.onmouseover=function(){cacheobj.mouseovercheck=1}
crossobjcontainer.onmouseout=function(){cacheobj.mouseovercheck=0}*/
}
this.rotateimage()
}

function switchFade(iNum, instance){
	if (fadearray[instance].flag){
		clearInterval(fadearray[instance].wait)
		fadearray[instance].flag=0
		clearInterval(fadeclear[instance])
		fadearray[instance].mouseovercheck=0
		fadearray[instance].nextimageindex=iNum
		fadearray[instance].nextcanvas=(fadearray[instance].curcanvas==fadearray[instance].canvasbase+"_0")? fadearray[instance].canvasbase+"_0" : fadearray[instance].canvasbase+"_1"
		fadearray[instance].tempobj=iebrowser? iebrowser[fadearray[instance].nextcanvas] : document.getElementById(fadearray[instance].nextcanvas)
		fadearray[instance].populateslide(fadearray[instance].tempobj, fadearray[instance].nextimageindex)
		setTimeout("fadearray["+instance+"].rotateimage()", fadearray[instance].delay)
	}
	else{
		clearInterval(fadearray[instance].wait)
		fadearray[instance].wait=setInterval("switchFade("+iNum+","+instance+");", 100)
	}
}

</script>


<title>Insert title here</title>
</head>
<body>

<table>
<tr>
<td colspan="4" align="center"><script type="text/javascript">
//new fadeshow(IMAGES_ARRAY_NAME, slideshow_width, slideshow_height, borderwidth, delay, pause (0=no, 1=yes), optionalRandomOrder)
new fadeshow(fadeimages, 140, 225, 0, 100, 1)

</script></td>
</tr>
<tr>
<td><div class="control" onmouseover="switchFade(1,0)" onmouseout="switchFade(0,0)">Text #1</div></td>
<td><div class="control" onmouseover="switchFade(2,0)" onmouseout="switchFade(0,0)">Text #2</div></td>
<td><div class="control" onmouseover="switchFade(3,0)" onmouseout="switchFade(0,0)">Text #3</div></td>
<td><div class="control" onmouseover="switchFade(4,0)" onmouseout="switchFade(0,0)">Text #4</div></td>
</tr>
</table>
<table>
<tr>
<td colspan="4" align="center"><script type="text/javascript">
//new fadeshow(IMAGES_ARRAY_NAME, slideshow_width, slideshow_height, borderwidth, delay, pause (0=no, 1=yes), optionalRandomOrder)
new fadeshow(fadeimages2, 140, 225, 0, 100, 1)
</script></td>

</tr>
<tr>
<td><div class="control" onmouseover="switchFade(1,1)" onmouseout="switchFade(0,1)">Text #1</div></td>
<td><div class="control" onmouseover="switchFade(2,1)" onmouseout="switchFade(0,1)">Text #2</div></td>
<td><div class="control" onmouseover="switchFade(3,1)" onmouseout="switchFade(0,1)">Text #3</div></td>
<td><div class="control" onmouseover="switchFade(4,1)" onmouseout="switchFade(0,1)">Text #4</div></td>
</tr>
</table>
<div style="position:relative;z-index:10000;width:140px;" onmouseover="switchFade(3,2)" onmouseout="switchFade(0,2)"><script type="text/javascript">
//new fadeshow(IMAGES_ARRAY_NAME, slideshow_width, slideshow_height, borderwidth, delay, pause (0=no, 1=yes), optionalRandomOrder)
new fadeshow(fadeimages2, 140, 225, 0, 100, 1)
</script></div>



</body>
</html>