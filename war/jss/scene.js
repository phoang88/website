



function init() {

	camera = new THREE.PerspectiveCamera( 75, 400/ 300, 1, 10000 );
	camera.position.z = 1000;

	scene = new THREE.Scene();

	geometry = new THREE.CubeGeometry( 200, 200, 200 );
	material = new THREE.MeshBasicMaterial( { color: 0xff0000, wireframe: true } );

	mesh = new THREE.Mesh( geometry, material );
	scene.add( mesh );

	renderer = new THREE.CanvasRenderer();
	renderer.setSize( 400, 300 );

	$("#content").append( '<p>hello</p>' );

}

function animate() {

		// note: three.js includes requestAnimationFrame shim
	requestAnimationFrame( animate );

	mesh.rotation.x += 0.01;
	mesh.rotation.y += 0.02;

	renderer.render( scene, camera );

}

