//....region..start.......
function changeCountryValue() {
	var selectedCountry=document.form1.country.value;
	getRegion(selectedCountry);
}

function getRegion(selectedCountry) {
	if (window.XMLHttpRequest) {
   		// code for IE7+, Firefox, Chrome, Opera, Safari
   		xmlhttp=new XMLHttpRequest();
  	}else {
   		// code for IE6, IE5
   		xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
  	}
 	xmlhttp.onreadystatechange=function() {
		if (xmlhttp.readyState==4 && xmlhttp.status==200) {
			setRegion(xmlhttp.responseText);
   		}
  	}
  	xmlhttp.open("GET","/getRegion?languageCode=CS&countryCode="+selectedCountry,true);
  	xmlhttp.send();
}
 
function setRegion(data) {
	document.getElementById("region").innerHTML=data;
} 
//..........region..end......

//....place..start.......
function changeRegionValue() {
	var selectedCountry=document.form1.country.value;
	var selectedRegion=document.form1.region.value;
	getPlace(selectedCountry, selectedRegion);
}

function getPlace(selectedCountry, selectedRegion) {
	if (window.XMLHttpRequest) {
   		// code for IE7+, Firefox, Chrome, Opera, Safari
   		xmlhttp=new XMLHttpRequest();
  	}else {
   		// code for IE6, IE5
   		xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
  	}
 	xmlhttp.onreadystatechange=function() {
		if (xmlhttp.readyState==4 && xmlhttp.status==200) {
			setPlace(xmlhttp.responseText);
   		}
  	}
  	xmlhttp.open("GET","/getPlace?languageCode=CS&countryCode="+selectedCountry+
  			"&regionCode="+selectedRegion,true);
  	xmlhttp.send();
}
 
function setPlace(data) {
	document.getElementById("place").innerHTML=data;
}
//..........place..end......