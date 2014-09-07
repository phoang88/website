
$(document).ready(function(){
	//Since L-System is the first item in the list, call it when the page is loaded
	var id = $(".listItem").first().attr("id");
	$(".listItem").first().css("color", "red")
	$("#content").load(id);
	
	$(".listItem").click(function(){
		id = $(this).attr("id");
		$("#content").load(id);		
		$(this).css("color", "red");
		$(this).siblings().css("color", "white");
	});

});

