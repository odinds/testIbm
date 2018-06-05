package com.test.ibm.productos.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.ibm.productos.entities.Producto;

@Repository
public interface ProductoRepository extends CrudRepository<Producto, Long>{
	/**
	 * @see buscar Producto por nombre
	 * @param string
	 * @return
	 */
	Iterable<Producto> findByNombre(String nombre);
	
}
