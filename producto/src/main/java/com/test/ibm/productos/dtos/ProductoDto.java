package com.test.ibm.productos.dtos;

import java.math.BigDecimal;

/**
 * @see Dto que representa el producto
 * @author Daniel Arbey Sarmiento Amaya
 *
 */
public class ProductoDto {
	private Long id;
	private String nombre;
	private Long inventario;
	private BigDecimal precio;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Long getInventario() {
		return inventario;
	}
	public void setInventario(Long inventario) {
		this.inventario = inventario;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	
}
