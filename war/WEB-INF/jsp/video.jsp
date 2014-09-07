<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
	<head>
	<title>Video</title>
	<link type="text/css" rel="stylesheet" href="/css/video.css" />
	<script type="text/javascript" src="../../jss/jquery.js"></script>
	<script type="text/javascript" src="../../jss/video.js"></script>

	<jsp:include page="header.jsp"/>
	
	<div id="videoContainer">
		<div id="playlists">
			<ul>
				<li>
					<label class="mainList">Animation Projects</label>
					<ul>
						<li class="subList" id="http://www.youtube.com/embed/9koqpv-refE">Key Frame Animation</li>
						<li class="subList" id="http://www.youtube.com/embed/dnF8pM-6gf4">Articulated Figure</li>
						<li class="subList" id="http://www.youtube.com/embed/Fsm1tnEYfAU">Phyics-based Motion Control</li>
						<li class="subList" id="http://www.youtube.com/embed/Zc5XjH3dRd4">Behavioral Animation</li>
						<li class="subList" id="http://www.youtube.com/embed/RYm7dWaeh6U">Particle System</li>
					</ul>
				</li>
				<li>
					<label class="mainList">UCM Culture Nights</label>
					<ul>
						<li class="subList" id="http://www.youtube.com/embed/ZbsPOkUyJ0M">Bolywood Dance</li>
						<li class="subList" id="http://www.youtube.com/embed/1G5QVnxQh1k">Chong Xa</li>
						<li class="subList" id="http://www.youtube.com/embed/jKGCVqAYzHY">Thuong Qua Vietnam</li>
						<li class="subList" id="http://www.youtube.com/embed/7vjyj_q9cV8">Salsa Dance</li>
					</ul>
				</li>
			</ul>
		</div>
		
		<div id="videoPlayer">
			<iframe width="400" height="300" src="http://www.youtube.com/embed/9koqpv-refE" frameborder="0" allowfullscreen></iframe>
		</div>
	</div>
	<jsp:include page="footer.jsp"/>
	
	<script type="text/javascript">
		$(function() { $("ul.lavaLamp").lavaLamp({ fx: "easeOutBack", speed: 700, startItem:2})});
	</script>
	</body>
</html>