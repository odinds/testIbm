var validationPedidosForm = {
    rules: {
    		nombrePersona: {
                required: true
            },
            tipoIdPersona: {
                required: true
            },
            numeroIdPersona: {
                required: true
            },
            tipoRopa: {
                required: true
            },
            cantidadProductos: {
                required: true
            },
            direccion: {
                required: true
            }
    },
    messages: {
    		nombrePersona: {
                required: "Es requerido"
            },
            tipoIdPersona: {
                required: "Es requerido"
            },
            numeroIdPersona: {
               required: "Es requerido"
            },
            tipoRopa: {
                required: "Es requerido"
            },
            cantidadProductos: {
                required: "Es requerido"
            },
            direccion: {
                required: "Es requerido"
            }
    }
}