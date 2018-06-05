package com.test.ibm.pedidos.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 
 * @author Daniel Arbey Sarmiento
 * @see Entidad representa el pedido
 *
 */
@Entity
public class Pedido {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column
	private String nombrePersona;
	
	@Column
	private int tipoIdPersona;
	
	@Column
	private String numeroIdPersona;
	
	@Column
	private int tipoRopa;
	
	@Column
	private int cantidadProductos;
	
	@Column
	private Date fechaPedido;
	
	@Column
	private String direccion;
	
	@Column
	private BigDecimal precioNeto;
	
	@Column
	private BigDecimal precioEntrega;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombrePersona() {
		return nombrePersona;
	}
	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}
	public int getTipoIdPersona() {
		return tipoIdPersona;
	}
	public void setTipoIdPersona(int tipoIdPersona) {
		this.tipoIdPersona = tipoIdPersona;
	}
	public String getNumeroIdPersona() {
		return numeroIdPersona;
	}
	public void setNumeroIdPersona(String numeroIdPersona) {
		this.numeroIdPersona = numeroIdPersona;
	}
	public int getTipoRopa() {
		return tipoRopa;
	}
	public void setTipoRopa(int tipoRopa) {
		this.tipoRopa = tipoRopa;
	}
	public int getCantidadProductos() {
		return cantidadProductos;
	}
	public void setCantidadProductos(int cantidadProductos) {
		this.cantidadProductos = cantidadProductos;
	}
	public Date getFechaPedido() {
		return fechaPedido;
	}
	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public BigDecimal getPrecioNeto() {
		return precioNeto;
	}
	public void setPrecioNeto(BigDecimal precioNeto) {
		this.precioNeto = precioNeto;
	}
	public BigDecimal getPrecioEntrega() {
		return precioEntrega;
	}
	public void setPrecioEntrega(BigDecimal precioEntrega) {
		this.precioEntrega = precioEntrega;
	}
	
}
