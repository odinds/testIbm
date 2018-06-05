package com.test.ibm.pedidos.services;

import com.test.ibm.pedidos.dtos.PedidoDto;
import com.test.ibm.pedidos.exception.PedidoException;

public interface ValidacionService {

	void validacionPedido(PedidoDto pedido) throws PedidoException;

}
