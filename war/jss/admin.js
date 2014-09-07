$(document).ready(function(){
	
	$(".mainList").first().parent().siblings().each(function(){
		$(this).children().first().nextAll().hide();
	});
	
	$(".mainList").first().css("font-style", "italic");
	
	$(".mainList").first().siblings().children().first().css("color", "red");
	
	$("#rightDiv").load($("#rightDiv input").attr("id"));
	
	$(".subList").click(function(){
		setCSS(this);
		$("#rightDiv").load($(this).attr("id"));
	});
	
	$(".mainList").click(function(){
		$(this).siblings().slideToggle("fast");		
	});
});

function setCSS(object)
{
	$(object).parent().siblings().css("font-style", "italic");
	$(object).parents("li").siblings().each(function(){
		$(object).children().first().css("font-style", "normal");
	});
	$(".subList").css("color", "white");
	$(object).css("color", "red");
}
