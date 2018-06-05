"use strict";

app.controller('NavBarController', navBarController);


function navBarController($scope, $state){
	var initTab = $state.current.name;

	$scope.selectedItem = initTab;

	$state.go("" + initTab);
	/*
 	//Go to new Employee state
 	$scope.goToNewEmployee = function(){
 		$scope.currentNavItem = 'employeePage';
 		$state.go('employee');
 		
 	};

 	//Go to assistance state
 	$scope.goToAssitance = function(){
 		$scope.currentNavItem = 'assistancePage';
 		$state.go('assistance');
 		
 	};

 	//Go to report state
 	$scope.goToReport = function(){
 		$scope.currentNavItem = 'reportPage';
 		$state.go('report');

 	} 	
	*/

	
};
