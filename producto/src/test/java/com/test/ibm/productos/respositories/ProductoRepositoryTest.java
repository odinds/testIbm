package com.test.ibm.productos.respositories;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.test.ibm.productos.entities.Producto;
import com.test.ibm.productos.repositories.ProductoRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ProductoRepositoryTest{
    
	@Autowired
    private ProductoRepository productoRepository;

    final String PRODUCTO1 = "Jeans";
    final String PRODUCTO2 = "Camisas";
    
    @Before
    public void setup() {

	}

    @Test
    public void listaProductos() throws Exception{
    	Producto p1 = new Producto();
    	p1.setNombre(PRODUCTO1);
    	p1.setInventario(10L);
    	p1.setPrecio(new BigDecimal(100));
		productoRepository.save(p1);

		List<Producto> productosList = new ArrayList<>();
		Iterable<Producto> productos =  productoRepository.findAll();
		productos.forEach(productosList::add);
        
		assertThat(productosList.size()).isEqualTo(1);	
		
    }
    
    @Test
    public void consultarProducto() {
    	Producto p1 = new Producto();
    	p1.setNombre(PRODUCTO1);
    	p1.setInventario(10L);
    	p1.setPrecio(new BigDecimal(100));
		productoRepository.save(p1);
		
        Iterable<Producto> productosItertor= productoRepository.findByNombre(PRODUCTO1);
        List<Producto> productos = new ArrayList<>();
        productosItertor.forEach(productos::add);
        
        assertThat(productos.get(0).getNombre()).isEqualTo(PRODUCTO1);
        assertThat(productos.get(0).getInventario()).isEqualTo(10L);

	}
}
