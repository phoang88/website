<!DOCTYPE HTML>
<html>
	<head>
		<link type="text/css" rel="stylesheet" href="../../css/main.css" />
		<link type="text/css" rel="stylesheet" href="../../css/admin.css" />
		<script type="text/javascript" src="../../jss/jquery.js"></script>
		<script type="text/javascript" src="../../jss/admin.js"></script>
	</head>
	<body>
		<div id="logout">Log out</div>
		<div id="adminContainer">
			<h1>Administration Panel</h1>
			<div id="list">
				<ul>
					<li>
						<label class="mainList">Music Page</label>
						<ul>
							<li id="html/admin/addSong.html" class="subList" >Add Song</li>
							<li id="html/admin/deleteSong.html" class="subList" >Delete Song</li>
							<li id="html/admin/editSong.html" class="subList" >Edit Song</li>
						</ul>
					</li>
				</ul>
			</div>
			
			<div id="rightDiv">
				<input type="hidden" id="${adminBean.rightDivSource}" />
			</div>			
	</div>
	
	</body>
</html>