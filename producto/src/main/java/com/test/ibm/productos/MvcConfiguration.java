package com.test.ibm.productos;

import java.math.BigDecimal;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.test.ibm.productos.entities.Producto;
import com.test.ibm.productos.repositories.ProductoRepository;

@Configuration
@EnableWebMvc
public class MvcConfiguration extends WebMvcConfigurerAdapter {
	private Logger logger = Logger.getLogger(this.getClass());

	@Autowired
	private ProductoRepository productoRepository;
	
	@EventListener(ApplicationReadyEvent.class)
	public void doSomethingAfterStartup() {
		BigDecimal precio = new BigDecimal(120);
		logger.info("hello world, I have just started up");
		Producto p1 = new Producto();
		p1.setNombre(ConstantesProductos.CAMISAS.nombre());
		p1.setInventario(10L);
		p1.setPrecio(precio);
		productoRepository.save(p1);
		Producto p2 = new Producto();
		p2.setNombre(ConstantesProductos.PANTALONES.nombre());
		p2.setInventario(20L);
		p2.setPrecio(precio.add(new BigDecimal(70)));
		productoRepository.save(p2);
		Producto p3 = new Producto();
		p3.setNombre(ConstantesProductos.CAHQUETAS.nombre());
		p3.setInventario(20L);
		p3.setPrecio(precio.add(new BigDecimal(180)));
		productoRepository.save(p3);
	}
}
