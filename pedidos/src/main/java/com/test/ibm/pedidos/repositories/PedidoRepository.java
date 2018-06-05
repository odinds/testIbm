package com.test.ibm.pedidos.repositories;

import org.springframework.data.repository.CrudRepository;

import com.test.ibm.pedidos.entities.Pedido;

public interface PedidoRepository extends CrudRepository<Pedido, Long>{
}
