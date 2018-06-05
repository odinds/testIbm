package com.test.ibm.productos;

public enum ConstantesProductos {
	CAMISAS("Camisas formales"),
	PANTALONES("Pantalones formales"),
	CAHQUETAS("Chaquetas");
	
    private final String nombre;

	ConstantesProductos(String nombre) {
        this.nombre = nombre;
    }

    public String nombre() {
        return nombre;
    }
}
