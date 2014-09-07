var camera, scene, renderer;
var width = 400;
var height = 400;
var axiom, rules, angleAmount, iteration, distance;
var angle = 90;
var terminals = "Ff+-[]";
var posX, posY;
var stack = [];
var index = 0;
var sample = 0;
var totalNumOfSamples = 3;

$(document).ready(function(){
	init();
	proceed();
	$("#submitBtn").click(proceed);	
	$("#nextBtn").click(getSample);
});

function setValues()
{
	iteration = parseInt($("#input").find('input[name="iteration"]').val());
	angleAmount = parseFloat($("#input").find('input[name="angle"]').val());
	distance = parseInt($("#input").find('input[name="distance"]').val());
	axiom = $("#input").find('input[name="axiom"]').val();
	buildRulesHashTable(document.getElementsByName("rule"));
}

function buildRulesHashTable(r)
{
	rules = {};
	for(var i=0; i < r.length; i++)
	{
		var s = r[i].value.replace(/ /g, '');
		if(s != '')
		{			
			rules[s.substring(0, s.indexOf(":"))] = s.substring(s.indexOf(":") +1);
		}	
	}
}

function replaceAxiom()
{
	for(var j = 0; j < iteration; j++)
	{
		var temp = "";
		for(var i = 0; i < axiom.length; i++)
		{
			var c = axiom.charAt(i);
			if(rules[c])
			{
				temp += rules[c];	
			} 
			else if (terminals.indexOf(c) != -1)
			{
				temp += c;
			}
		}
		axiom = temp;		
	}	
}

function proceed()
{
	reset();
	setValues();	
	replaceAxiom();
	animate();
}

function reset()
{
	scene = new THREE.Scene();
	posX = 0;
	posY = -700;
	angle = 90;
	index = 0;
}

function init() {

	camera = new THREE.PerspectiveCamera( 75, width/ height, 1, 10000 );
	camera.position.z = 1000;

	scene = new THREE.Scene();
    
	renderer = new THREE.CanvasRenderer();
	renderer.setSize( width, height );

	$("#canvasContainer").append( renderer.domElement );
}

function draw(index)
{
	if(index < axiom.length)
	{
		switch(axiom[index])
		{
			case 'F':				
				moveAndDraw();
				break;
			case 'f':
				move();
				break;
			case '+':
				turnRight();
				break;
			case '-':
				turnLeft();
				break;
			case '[':
				pushToStack();
				break;
			case ']':
				popFromStack();
				break;
			default:
				break;
		}
	}
}

function move()
{
	posX += distance * Math.cos(angle * Math.PI / 180);
	posY += distance * Math.sin(angle * Math.PI / 180);
	
}

function turnLeft()
{
	angle += angleAmount;
}

function turnRight()
{
	angle -= angleAmount;
}

function pushToStack()
{
	stack.push({x: posX, y: posY, angle: angle});
}

function popFromStack()
{
	var state = stack.pop();
	posX = state.x;
	posY = state.y;
	angle = state.angle;
}

function moveAndDraw()
{	
    var geometry = new THREE.Geometry();
    geometry.vertices.push(new THREE.Vector3(posX, posY, 0));
    move();
    geometry.vertices.push(new THREE.Vector3(posX, posY, 0));
    
    var material = new THREE.LineBasicMaterial({color: 0xff0000});
	var line = new THREE.Line(geometry, material);
	scene.add(line);	
}


function animate() {

	// note: three.js includes requestAnimationFrame shim
	requestAnimationFrame( animate );
	draw(index++);
	renderer.render( scene, camera );

}

function getSample()
{
	sample = (sample + 1)%totalNumOfSamples;
	switch(sample)
	{
		case 0:
			setFormValues(5, 20, 30, "X", "X: F-[[X]+X]+F[+FX]-X", "F: FF", "", "", "");
			break;
		case 1:
			setFormValues(7, 35, 30, "CAB", "A: FFA", "B: [F[+FFB-F][-FFB-F]]", "C: fC", "", "");
			break;
		case 2:
			setFormValues(3, 50, 30, "AF", "F: FF-[-F+F+F]+[+F-F-F]", "A: fA", "", "", "");
			break;
		default:
			break;
	}
}
	
function setFormValues(iteration, distance, angle, axiom, rule1, rule2, rule3, rule4, rule5)
{
	$("#input").find('input[name="iteration"]').val(iteration);
	$("#input").find('input[name="angle"]').val(angle);
	$("#input").find('input[name="distance"]').val(distance);
	$("#input").find('input[name="axiom"]').val(axiom);
	
	var rules = document.getElementsByName("rule");
	rules[0].value = rule1;	
	rules[1].value = rule2;	
	rules[2].value = rule3;	
	rules[3].value = rule4;	
	rules[4].value = rule5;	
}