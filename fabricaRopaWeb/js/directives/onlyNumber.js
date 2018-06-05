"use strict";

app.directive('onlyNumber', function () {
    return {
        restrict: 'A',
        require: 'ngModel',
        link: function (scope, element, attrs, ctrl) {
            var validateNumber = function (inputValue) {
            	var minLength = 0;
                var maxLength = 6;
                if (attrs.maxL) {
                    maxLength = attrs.maxL;
                }
                if (attrs.minL) {
                	minLength = attrs.minL;
                }
                if (inputValue === undefined) {
                    return '';
                }
                var transformedInput = inputValue.replace(/[^0-9]/g, '');
                if (transformedInput !== inputValue) {
                    ctrl.$setViewValue(transformedInput);
                    ctrl.$render();
                }
                if (transformedInput.length > maxLength) {
                    transformedInput = transformedInput.substring(0, maxLength);
                    ctrl.$setViewValue(transformedInput);
                    ctrl.$render();
                }
                var isNotEmpty = (transformedInput.length === 0) ? true : false;
                if(minLength === 0){
                	ctrl.$setValidity('empty', true);
                }else{
                	ctrl.$setValidity('empty', !isNotEmpty);
                }
                return transformedInput;
            };

            ctrl.$parsers.unshift(validateNumber);
            ctrl.$parsers.push(validateNumber);
            attrs.$observe('notEmpty', function () {
                validateNumber(ctrl.$viewValue);
            });
        }
    };
});