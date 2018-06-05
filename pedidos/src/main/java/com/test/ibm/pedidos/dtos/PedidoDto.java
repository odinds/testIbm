package com.test.ibm.pedidos.dtos;

import java.io.Serializable;
import java.util.Date;

public class PedidoDto implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String nombrePersona;
	
	private int tipoIdPersona;
	
	private String numeroIdPersona;
	
	private int tipoRopa;
	
	private int cantidadProductos;
	
	private Date fechaPedido;
	
	private String direccion;

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
	
	
	
	
}
