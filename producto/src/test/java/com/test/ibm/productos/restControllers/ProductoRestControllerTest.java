package com.test.ibm.productos.restControllers;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.test.ibm.productos.ProductoApplication;
import com.test.ibm.productos.dtos.ProductoDto;
import com.test.ibm.productos.dtos.UtilModelDto;
import com.test.ibm.productos.entities.Producto;
import com.test.ibm.productos.repositories.ProductoRepository;
import com.test.ibm.productos.services.ProductoServiceImpl;


@RunWith(SpringRunner.class)
@WebMvcTest(ProductoRestController.class)
@ContextConfiguration(classes = {ProductoApplication.class})
public class ProductoRestControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private UtilModelDto utilModelDto;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@MockBean
	private ProductoServiceImpl productoService;
	
	@InjectMocks
	@Autowired
	private ProductoRepository productoRepository;
	
	@Before
	public void setup() {
		//MockitoAnnotations.initMocks(this);
		ReflectionTestUtils.setField(productoService, "productoRepository", productoRepository);
		ReflectionTestUtils.setField(utilModelDto, "modelMapper", modelMapper);
	}
	
	/**
	 * @see Test para ver resisar el comportamiento del api /products y trae los productos configurados
	 * @throws Exception
	 */
	@Test
	public void getProductosList() throws Exception{
		final String nombreProducto1 = "Jeans";
		final String nombreProducto2 = "Camisas";
		List<Producto> productos = new ArrayList<>();
		Producto p1 = new Producto();
		p1.setNombre(nombreProducto1);
		productos.add(p1);
		Producto p2 = new Producto();
		p2.setNombre(nombreProducto2);
		productos.add(p2);
		
		when(productoService.consultarProductos()).thenReturn(productos);
	
		ResultActions result = mockMvc.perform(MockMvcRequestBuilders.get("/products").accept(MediaType.APPLICATION_JSON));
		
		result
				.andExpect(status().isOk())
				.andExpect(jsonPath("$").isArray())
				.andExpect(jsonPath("$.length()", is(2)));

	}

	/**
	 * @see para ver si el primer producto es el que esperamos 
	 * @throws Exception
	 */
	@Test
	public void getProducto1() throws Exception{
		final String nombreProducto1 = "Jeans";
		List<Producto> productos = new ArrayList<>();
		Producto p1 = new Producto();
		p1.setNombre(nombreProducto1);
		productos.add(p1);
		
		ProductoDto pdto1 = new ProductoDto();
		pdto1.setNombre(nombreProducto1);
		
		when(productoService.consultarProductos()).thenReturn(productos);
		when(utilModelDto.convertToDto(productos.get(0))).thenReturn(pdto1);
		
		ResultActions result = mockMvc.perform(MockMvcRequestBuilders.get("/products").accept(MediaType.APPLICATION_JSON));
		
		result
				.andExpect(status().isOk())
				.andExpect(jsonPath("$").isArray())
				.andExpect(jsonPath("$.[0].nombre").value(nombreProducto1));
			
			
	}	
	
	/**
	 * @see Este servicio no existe
	 * @throws Exception
	 */
	@Test
	public void notFoundURI() throws Exception{
		ResultActions result = mockMvc.perform(MockMvcRequestBuilders.get("/products2").accept(MediaType.APPLICATION_JSON));
		
		result
				.andExpect(status().isNotFound());
			

	}
}
