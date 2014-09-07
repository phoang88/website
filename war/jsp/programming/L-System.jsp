<link type="text/css" rel="stylesheet" href="../../css/programming/L-System.css" />
<script type="text/javascript" src="../../jss/programming/L-System.js"></script>

<div>
	<div id="input">
		<table>
			<tr>
				<td>Iteration: <td>
				<td><input type="number" name="iteration" value="5"></td>
			</tr>
			<tr>
				<td>Distance: <td>
				<td><input type="number" name="distance" value="20"></td>
			</tr>
			<tr>
				<td>Angle: <td>
				<td><input type="number" name="angle" value="30"><br></td>
			</tr>
			<tr>
				<td>Axiom: <td>
				<td><input type="text" name="axiom" value="X"><br></td>
			</tr>
			<tr>
				<td>Rule 1: <td>
				<td><input type="text" name="rule" value="X: F-[[X]+X]+F[+FX]-X"><br></td>
			</tr>
			<tr>
				<td>Rule 2: <td>
				<td><input type="text" name="rule" value="F: FF"><br></td>
			</tr>
			<tr>
				<td>Rule 3: <td>
				<td><input type="text" name="rule"><br></td>
			</tr>
			<tr>
				<td>Rule 4: <td>
				<td><input type="text" name="rule"><br></td>
			</tr>
			<tr>
				<td>Rule 5: <td>
				<td><input type="text" name="rule"><br></td>
			</tr>
		</table><br/>
		
		<div id="buttons">
			<input id="submitBtn" type="button" value="Submit">
			<input id="nextBtn" type="button" value="Next Sample">
		</div>	
	</div>
	
	<div id="canvasContainer">
	</div>
</div>

<div id="description">
	<table border="1">
		<tr>
			<th>Symbol</th>
			<th>Description</th>
		</r>
		<tr>
			<td>Iteration</td>
			<td>How many times the rules should applied recursively.</td>
		</tr>
		<tr>
			<td>Distance</td>
			<td>The length of the drawn lines.</td>
		</tr>
		<tr>
			<td>Angle</td>
			<td>The angle degree applied when changing direction.</td>
		</tr>
		<tr>
			<td>Axiom</td>
			<td>The initial string that will get applied by the rules.</td>
		</tr>
		<tr>
			<td>Rule</td>
			<td>Rule contains two parts (before and after the colon). The letter before the colon is either from the axiom or from the other rules. The letter will be replaced by the string after the colon.</td>
		</tr>
		<tr>
			<td>F</td>
			<td>Move forward a distance while drawing a line.</td>
		</tr>
		<tr>
			<td>f</td>
			<td>Move forward a distance without drawing a line.</td>
		</tr>
		<tr>
			<td>+</td>
			<td>Turn right by an angle.</td>
		</tr>
		<tr>
			<td>-</td>
			<td>Turn left by an angle.</td>
		</tr>
		<tr>
			<td>[</td>
			<td>Push the current state to the stack.</td>
		</tr>
		<tr>
			<td>]</td>
			<td>Pop the top of the stack and make it current state.</td>
		</tr>
	</table>
	
	<p><strong class="redText">*Credit: </strong> Some of the sample rules are gotten from <a href="http://www.kevs3d.co.uk/dev/lsystems/">http://www.kevs3d.co.uk/dev/lsystems/</a></p>
</div>