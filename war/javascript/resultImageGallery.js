

$(document).ready(function(){
	
	$(".imageView").not(':first').css({opacity:0.3});

	$(".imageView").click(function() {
		var image = $(this).attr("src");
		//$('#mainImage').hide();
		//$('#mainImage').fadeIn('slow');
		//$('#mainImage').html('<img src="' + image + '"/>');
		$("#mainImage").children().attr("src", image);
		
		$(".imageView").not(this).css({opacity:0.3});
		$(this).css({opacity:1});
	} );
	
	$(".next").click(function() {
		//var currentPosition = $(".imageGalleryTable").css("left");
		//$("p:first").html("vyslo " + currentPosition );
		$(".imageGalleryTable").css( "left", "-=100" );
	});
	
	$(".prev").click(function() {
		$(".imageGalleryTable").css( "left", "+=100" );
	});
    
});
