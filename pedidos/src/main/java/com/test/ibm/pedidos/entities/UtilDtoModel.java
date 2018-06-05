package com.test.ibm.pedidos.entities;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.test.ibm.pedidos.dtos.PedidoDto;

@Component
public class UtilDtoModel {

    @Autowired
    private ModelMapper modelMapper;
	

    /**
     * @see Convierte el dto a objeto de modelo
     * @param dto
     * @return
     */
	public Pedido convertToPedido(PedidoDto dto) {
		Pedido model = modelMapper.map(dto, Pedido.class);
        return model;
	}

}
