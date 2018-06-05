package com.test.ibm.pedidos.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.ibm.pedidos.entities.Pedido;
import com.test.ibm.pedidos.repositories.PedidoRepository;

@Service
public class PedidoServiceImpl implements PedidoService{

	@Autowired
	private PedidoRepository pedidoRepository;

	@Override
	/**
	 * @see Gestiona el nuevo pedido
	 */
	public void guadarPedido(Pedido pedido) {
		pedido.setFechaPedido(new Date());
		pedidoRepository.save(pedido);
		
	}

}
