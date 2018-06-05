"use strict";

function alertMessage(title,content,tabelbutton,component,ev){
    component.show(
      component.alert()
        .parent(angular.element(document.querySelector('#popupContainer')))
        .clickOutsideToClose(true)
        .title(title)
        .textContent(content)
        .ariaLabel('Alert Dialog Demo')
        .ok(tabelbutton)
        .targetEvent(ev)
    );
}