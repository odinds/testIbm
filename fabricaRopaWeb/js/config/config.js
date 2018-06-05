/**
 * 
 */
app.config(configurationApp)


function configurationApp($locationProvider, $stateProvider, $urlRouterProvider, $urlMatcherFactoryProvider) {

    $urlMatcherFactoryProvider.strictMode(false);
    $urlRouterProvider.otherwise('/start');	
	
     
    $stateProvider
    	//States managment
    .state('start',{
        			url: '/start',
    	        views:{
                    "navBar":{
                         templateUrl: "modules/navBar/navBar.html",
                         controller : 'NavBarController as ctrl'
                    },
                    "content": {
                        templateUrl: 'modules/start/start.html' ,
                        controller : 'StartController as ctrl'
                    },
                    "footer": {
                        templateUrl: 'modules/footer/footer.html' ,
                        controller : 'FooterController as ctrl'
                    }
    	        } 
    	
    })
    .state('pedidos',{
                url: '/pedidos',
                views:{
                    "navBar":{
                         templateUrl: "modules/navBar/navBar.html",
                         controller : 'NavBarController as ctrl'
                    },                    
                    "content": {
                        templateUrl: 'modules/pedidos/pedidos.html' ,
                        controller : 'PedidosController as ctrl'
                    },
                    "footer": {
                        templateUrl: 'modules/footer/footer.html' ,
                        controller : 'FooterController as ctrl'
                    }                    
                } 
        
    })
    ;
 
    //$locationProvider.html5Mode(true).hashPrefix('!')
};