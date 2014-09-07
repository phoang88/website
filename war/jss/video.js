$(document).ready(function(){
	
	$(".mainList").first().parent().siblings().each(function(){
		$(this).children().first().nextAll().hide();
	});
	
	$(".mainList").first().css("font-style", "italic");
	
	$(".mainList").first().siblings().children().first().css("color", "red");
	
	$(".subList").click(function(){
		$(this).parent().siblings().css("font-style", "italic");
		$(this).parents("li").siblings().each(function(){
			$(this).children().first().css("font-style", "normal");
		});
		$(".subList").css("color", "white");
		$(this).css("color", "red");
		
		
		$("#videoPlayer iframe").attr("src", $(this).attr("id"));
		
	});
	
	$(".mainList").click(function(){
		$(this).siblings().slideToggle("fast");		
	});

});