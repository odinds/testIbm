package com.test.ibm.productos.services;

import java.util.List;

import com.test.ibm.productos.entities.Producto;
import com.test.ibm.productos.exception.ProductoException;

public interface ProductoService {

	/**
	 * @see Muestra la lista de productos
	 * @return
	 */
	List<Producto> consultarProductos() throws ProductoException;

	/**
	 * @see Busca las conicidencias por un nombre de producto
	 * @param nombre
	 * @return
	 * @throws ProductoException
	 */
	List<Producto> conulstarProductoPorNombre(String nombre) throws ProductoException;
}
