app.directive('onlyText', function () {
	  return {
		    require: 'ngModel',
		    link: function(scope, element, attr, ngModelCtrl) {
		      function fromUser(text) {
		        var transformedInput = text.replace(/[^a-zA-Z\s\u00F1\u00d1\u00c1\u00c9\u00cd\u00d3\u00d9\u00e1\u00e9\u00ed\u00f3\u00fa]/g, '');
		        if (transformedInput !== text) {
		          ngModelCtrl.$setViewValue(transformedInput);
		          ngModelCtrl.$render();
		        }
		        return transformedInput; // or return Number(transformedInput)
		      }
		      ngModelCtrl.$parsers.push(fromUser);
		    }
		  };
});