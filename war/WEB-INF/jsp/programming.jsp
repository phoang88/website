<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
	<head>
	<title>Programming</title>
	<link type="text/css" rel="stylesheet" href="/css/programming.css" />
	<script type="text/javascript" src="../../jss/jquery.js"></script>
	<script type="text/javascript" src="../../jss/Three.js"></script>
	<script type="text/javascript" src="../../jss/programming.js"></script>

	<jsp:include page="header.jsp"/>
	
	<div id="programmingContainer">
		<div id="titles">
			<ul>
				<li class="listItem" id="jsp/programming/L-System.jsp">L-System</li>
			</ul>
		</div>
		
		<div id="content">

		</div>
	</div>
	
	<jsp:include page="footer.jsp"/>
	
	<script type="text/javascript">
		$(function() { $("ul.lavaLamp").lavaLamp({ fx: "easeOutBack", speed: 700, startItem:4})});
	</script>
	
	
	</body>
