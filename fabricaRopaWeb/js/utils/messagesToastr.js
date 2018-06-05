function messageINFO(message){
	toastr.info(message,"INFO",{"closeButton": true});
}

function messageWARN(message){
	toastr.warning(message,"PRECAUCIÓN",{"closeButton": true,"positionClass": "toast-top-full-width"});
}

function messageERR(message){
	toastr.error(message,"ERROR",{"closeButton": true});
}

function messageOK(message){
	toastr.success(message,"ERROR",{"closeButton": true,"positionClass": "toast-top-center"});
}