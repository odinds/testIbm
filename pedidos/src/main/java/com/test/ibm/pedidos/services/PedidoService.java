package com.test.ibm.pedidos.services;

import com.test.ibm.pedidos.entities.Pedido;

public interface PedidoService {
	/**
	 * @see se enarga de gestionar el nuevo pedido
	 * @param convertToUser
	 */
	void guadarPedido(Pedido convertToUser);

}
