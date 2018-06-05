package com.test.ibm.productos.restControllers;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.ibm.productos.dtos.ProductoDto;
import com.test.ibm.productos.dtos.UtilModelDto;
import com.test.ibm.productos.entities.Producto;
import com.test.ibm.productos.exception.ProductoException;
import com.test.ibm.productos.services.ProductoService;

@RestController
public class ProductoRestController {
	
	private Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired
	private ProductoService productoService;
	
	@Autowired
	private UtilModelDto utilModelDto;
	
	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public List<ProductoDto> getProducts() {
		logger.info("products");
		List<Producto> productosResponse;
		List<ProductoDto> productos= new ArrayList<>();
		try {
			productosResponse = productoService.consultarProductos();
			productosResponse.forEach(p ->{
				productos.add(utilModelDto.convertToDto(p));
			});
		} catch (ProductoException e) {
			e.printStackTrace();
			return null;
		}
		
		return  productos;
	}
}
