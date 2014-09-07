$(document).ready(function(){	
	musicPlayer();
});

function musicPlayer(){
	$(".mainList").first().parent().siblings().each(function(){
		$(this).children().first().nextAll().hide();
	});
	
	$(".mainList").first().css("font-style", "italic");
	
	$(".mainList").first().siblings().children().first().css("color", "red");
	
	$("#musicSource").attr("src",$(".subList").first().attr("id"));
    $(".lyrics" ).first().show();
	$(".subList").click(function(){
		$(this).parent().siblings().css("font-style", "italic");
		$(this).parents("li").siblings().each(function(){
			$(this).children().first().css("font-style", "normal");
		});
		$(".subList").css("color", "white");
		$(this).css("color", "red");
		$("#musicSource").attr("src", $(this).attr("id"));
		toggleLyrics($(this).attr("id"));
		
		$("#audioComponent").get(0).pause();
		$("#audioComponent").get(0).load();
		$("#audioComponent").get(0).play();
	});
	
	$(".mainList").click(function(){
		$(this).siblings().slideToggle("fast");		
	});

}

function toggleLyrics( songId )
{	
	$(".lyrics").each( function(){
		
		if(this.attr("id") == songId + "Lyrics"){
			this.show()
		} else {
			this.hide();
		}
	});
}