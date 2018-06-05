"use strict";

app.controller('PedidosController', pedidosController);


function pedidosController($scope, $state, PedidosFactory){
	var self = this;

	$scope.validationOptions = validationPedidosForm;

	self.tiposIdentificacion = [{id:1,name:'Cédula'}];
	self.productos = [];

	self.nuevoPedido = {
						nombrePersona: null,
						tipoIdPersona:1,
						numeroIdPersona:null,
						tipoRopa:null,
						cantidadProductos: 0,
						direccion: null
	}

	self.goToNew = function(){
		$state.go('newEmployee');
	};

	self.goToDelete = function(){
		$state.go('deleteEmployee');
	};

	init();					

	//Load necesary data
 	function init(){
		PedidosFactory
		.getProductos()
		.then(
				function(d) {
					self.productos = d;
				},
				function(errResponse) {

				}
			);	 			
 		
 	}

 	function erraseData(){
		self.nuevoPedido = {
					nombrePersona: null,
					tipoIdPersona:1,
					numeroIdPersona:null,
					tipoRopa:null,
					cantidadProductos: 0,
					direccion: null
		};
 	}

 	//Call service 
 	self.nuevoPedidoSubmit = function(form){
 		console.log("ok");
		//if(form.validate()) {
			PedidosFactory
				.createPedido(self.nuevoPedido)
				.then(
						function(d) {
							console.log(d);
							messageINFO("Pedido Generado Correctamente");
							erraseData();

						},
						function(errResponse) {
							console.error('Error while save info');
							console.log(errResponse);
							messageERR(errResponse.data.message);
						}
					);	
		//}
        		 		
 	}; 	
	
};