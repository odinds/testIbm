package com.test.ibm.pedidos.restControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.ibm.pedidos.dtos.PedidoDto;
import com.test.ibm.pedidos.dtos.StatusResponse;
import com.test.ibm.pedidos.entities.UtilDtoModel;
import com.test.ibm.pedidos.exception.PedidoException;
import com.test.ibm.pedidos.services.PedidoService;
import com.test.ibm.pedidos.services.ValidacionService;

@RestController
public class PedidoRestController {
	
	@Autowired
	private UtilDtoModel utilDtoModel;
	
	@Autowired
	private PedidoService pedidoService;

	@Autowired
	private ValidacionService validacionService;

	@RequestMapping(value = "/pedido/guardar",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<StatusResponse> generarPedido(@RequestBody PedidoDto pedido){
		
		try {
			validacionService.validacionPedido(pedido);
			pedidoService.guadarPedido(utilDtoModel.convertToPedido(pedido));
			return new ResponseEntity<StatusResponse>(new StatusResponse(0,""), HttpStatus.OK);
		} catch (PedidoException e) {
			return new ResponseEntity<StatusResponse>(new StatusResponse(2,e.getMessage()), HttpStatus.CONFLICT);
			
		}
	}
}
