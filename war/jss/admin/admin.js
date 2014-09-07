$(document).ready(function(){	
	$("#addSongBtn").click(validateAddForm);	
	$("#deleteSongBtn").click(validateDeleteForm);
});

function validateAddForm(){
	var title = $("#songForm").find('input[name="title"]').val();
	var artist = $("#songForm").find('input[name="artist"]').val();
	var url = $("#songForm").find('input[name="url"]').val();
	var playlist = $("#songForm").find('input[name="playlist"]').val();

	if(validate("title", title) & validate("artist", artist) & validate("url", url) & validate("playlist", playlist))
	{		
		$("#songForm").submit();
	}
}

function validateDeleteForm(){
	var title = $("#songForm").find('input[name="title"]').val();
	var artist = $("#songForm").find('input[name="artist"]').val();
	var playlist = $("#songForm").find('input[name="playlist"]').val();

	if(validate("title", title) & validate("artist", artist) & validate("playlist", playlist))
	{		
		$("#songForm").submit();
	}
}

function validate(name, value)
{
	var id = "#" + name + "Error";

	if (value.trim() == "")
	{
		$(id).show();
		return false;
	}
	else{
		$(id).hide();
		return true;
	}
}