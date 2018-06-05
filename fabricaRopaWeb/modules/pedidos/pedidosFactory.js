/**
*
*/

app.factory('PedidosFactory', pedidosFactory);

	   //urlRestProductos
	   //urlRestPedidos	
function pedidosFactory($http, $q){
   
	var factory = {
			getProductos    :getProductos,
    		createPedido    :createPedido,
    };	
	
    /**
     * 
     */
	return factory;
	
	function getProductos(){
		console.log("prodcutos");
		var deferred = $q.defer();
		var uri = urlRestProductos;
		
		$http.get(uri+"/products")
		.then(
				function (response) {
					deferred.resolve(response.data);
				},
				function(errResponse){
					console.error('Error while fetching result');
					deferred.reject(errResponse);
				}
		);
		return deferred.promise;
	}  

	function createPedido(pedido){
		console.log("pedido nuevo");
		var deferred = $q.defer();
		var uri = urlRestPedidos;
		
		$http.post(uri+"/pedido/guardar",pedido)
		.then(
				function (response) {
					deferred.resolve(response.data);
				},
				function(errResponse){
					console.error('Error while fetching result');
					deferred.reject(errResponse);
				}
		);
		return deferred.promise;
	}   
	
}       