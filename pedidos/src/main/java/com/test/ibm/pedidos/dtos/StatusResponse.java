package com.test.ibm.pedidos.dtos;

import java.io.Serializable;

/**
 * 
 * @author Daniel Arbey Sarmiento Amaya
 *
 */
public class StatusResponse implements Serializable{

	private static final long serialVersionUID = -7307041781159293259L;
	private Integer status;
	private String message;
	
	public StatusResponse(Integer status,String message) {
		this.status = status;
		this.message = message;
	}
	
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
