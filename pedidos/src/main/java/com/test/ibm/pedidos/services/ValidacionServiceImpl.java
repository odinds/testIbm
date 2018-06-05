package com.test.ibm.pedidos.services;

import java.util.Objects;

import org.springframework.stereotype.Service;

import com.test.ibm.pedidos.dtos.PedidoDto;
import com.test.ibm.pedidos.exception.PedidoException;

/**
 * @see Clase que se encarga de implementar las validaciones
 * @author Daniel Arbey Sarmiento
 *
 */
@Service
public class ValidacionServiceImpl implements ValidacionService{

	/**
	 * @see Valida los datos de entrada del pedido
	 * @param pedido
	 * @throws
	 */
	@Override
	public void validacionPedido(PedidoDto pedido) throws PedidoException {
		if(Objects.isNull(pedido.getTipoIdPersona())) {
			throw new PedidoException("Por favor ingrese el tipo de persona");
		}
		if(Objects.isNull(pedido.getNombrePersona())) {
			throw new PedidoException("Por favor ingrese el nombre de persona");
		}
		if(Objects.isNull(pedido.getCantidadProductos())) {
			throw new PedidoException("Por favor ingrese la cantidad de productos");
		}
	}

}
