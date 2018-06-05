package com.test.ibm.productos.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.ibm.productos.entities.Producto;
import com.test.ibm.productos.exception.ProductoException;
import com.test.ibm.productos.repositories.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService{

	@Autowired
	private ProductoRepository productoRepository;

	/**
	 * @see Carga la lista de productos
	 * @throws ProductoException
	 */
	public List<Producto> consultarProductos() throws ProductoException {
		List<Producto> productos = new ArrayList<>();
		Iterable<Producto> productosIterable = productoRepository.findAll();
		if(Objects.isNull(productosIterable)) {
			return null;
		}
		productosIterable.forEach(productos::add);
		return productos;
	}

	/**
	 * @see busca productos por nombre
	 * @param nombre
	 * @throws ProductoException
	 */
	@Override
	public List<Producto> conulstarProductoPorNombre(String nombre) throws ProductoException {
		List<Producto> productos = new ArrayList<>();
		Iterable<Producto> productosIterable = productoRepository.findByNombre(nombre);
		
		if(Objects.isNull(productosIterable)) {
			return null;
		}		
		productosIterable.forEach(productos::add);
		return productos;
		
	}

}
