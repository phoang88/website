<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
	<head>
	<title>Phat Hoang Homepage</title>
	<link type="text/css" rel="stylesheet" href="/css/home.css" />
	<script type="text/javascript" src="../../jss/jquery.js"></script>
	<script type="text/javascript" src="../../jss/jqFancyTransitions.js"></script>
	<script>
		$(document).ready( function(){
    		$("#slideshowHolderDiv").jqFancyTransitions({ width: 310, height: 210, delay: 2500});
		});
	</script>
	

	<jsp:include page="WEB-INF/jsp/header.jsp"/>
	<table id="twoColumns">
		<tr>
			<td id="slideshowHolder">
				<div id="slideshowHolderDiv">
 					<img src="/images/slideshow1.png" alt="DST Systems Inc" />
					<img src="/images/slideshow2.png" alt="GW" />
 					<img src="/images/slideshow3.png" alt="UCM" />
 					<img src="/images/slideshow4.png" alt="Vietnam" />
				</div>
			</td>
			<td>
				<div id="info">
					<p id="myName">Phat Le Thanh Hoang</p>
					<ul>
						<li>Software Developer</li>
						<li class="subText">DST Systems Inc</li>
						<li>MS in Computer Science</li>
						<li class="subText">George Washington University</li>
						<li>BS in Computer Science and Mathematics</li>
						<li class="subText">University of Central Missouri</li>
						<li>Hometown: Ho Chi Minh City, Vietnam</li>
						<li>Email: <a href="mailto:plh66350@gmail.com">plh66350@gmail.com</a></li>
						<li>Phone: <a href="callto:5714238847">571-423-8847</a></li>
					</ul>
				</div>
			</td>
		</tr>
	</table>
		
	<jsp:include page="WEB-INF/jsp/footer.jsp"/>
	<script type="text/javascript">
   		$(function() { $("ul.lavaLamp").lavaLamp({ fx: "easeOutBack", speed: 700, startItem:0})});
	</script>
	</body>
</html>