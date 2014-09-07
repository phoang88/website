	<br/>
	<jsp:useBean id="myDate" class="website.bean.MyDate" scope="session">
		<div id="footer">
			Phat Hoang<br/>
			<%= myDate.getCurrentDate() %> PST
		</div>
	</jsp:useBean>

</div>