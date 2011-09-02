
function sendComment(form) {
	var acParam = form.ac.value;
	var contentParam = form.content.value;
	var params = "ac=" + acParam + "&content=" + contentParam;
	
	if (window.XMLHttpRequest) {
   		// code for IE7+, Firefox, Chrome, Opera, Safari
   		xmlhttp=new XMLHttpRequest();
  	}else {
   		// code for IE6, IE5
   		xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
  	}
	
 	xmlhttp.onreadystatechange=function() {
		if (xmlhttp.readyState==4 && xmlhttp.status==200) {
			setCommentDiv(xmlhttp.responseText);
   		}
  	}
 	
 	//xmlhttp.open("POST","/send",true);
 	//xmlHTTP.setRequestHeader("Content-Type","application/x-www-form-urlencoded; charset=UTF-8");
  	//xmlhttp.send(params);
 	xmlhttp.open("GET","/send?"+params,true);
  	xmlhttp.send();
}
 
function setCommentDiv(data) {
	document.getElementById("comment").innerHTML=data;
} 