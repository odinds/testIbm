package com.test.ibm.productos.entities;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * 
 * @author Daniel Arbey Sarmiento
 * @see Entidad representa el pedido
 *
 */
@Entity
public class Producto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@NotNull
	@Column
	private String nombre;
	
	@NotNull
	@Column
	private Long inventario;
	
	@NotNull
	@Column
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
