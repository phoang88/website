<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML>
<html>
	<head>
	<title>Music</title>
	<link type="text/css" rel="stylesheet" href="/css/music.css" />
	<script type="text/javascript" src="../../jss/jquery.js"></script>
	<script type="text/javascript" src="../../jss/music.js"></script>

	<jsp:include page="header.jsp"/>
	
	<div id="musicContainer">
		<div id="playlists">
			<h1>Playlists</h1>
			<ul>
				<c:forEach var="playlist" items="${musicBean.playlists}" >
					<li >
						<label class="mainList">${playlist.key}</label>
						<ul>
							<c:forEach var="song" items="${playlist.value }" >
									<li id="${song.url}" class="subList">${song.title}</li>
							</c:forEach>
						</ul>
					</li>
				</c:forEach>
			</ul>
		</div>
		
		<div id="musicPlayer">
			<audio id="audioComponent" controls autoplay>
  				<source id="musicSource" src="" type="audio/mpeg" />
				Your browser does not support the audio element.
			</audio>
			<div id="lyrics">
				<h1>Lyrics</h1>
				<c:forEach var="playlist" items="${musicBean.playlists}" >
					<c:forEach var="song" items="${playlist.value }" >
						<div id="${song.url}Lyrics" class="lyrics">${song.lyrics}</div>
					</c:forEach>
				</c:forEach>
			</div>
		</div>
	</div>
	<jsp:include page="footer.jsp"/>
	
	<script type="text/javascript">
		$(function() { $("ul.lavaLamp").lavaLamp({ fx: "easeOutBack", speed: 700, startItem:1})});
	</script>
	
	</body>
</html>