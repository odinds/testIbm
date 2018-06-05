package com.test.ibm.productos.dtos;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.test.ibm.productos.entities.Producto;

/**
 * @see convierte model a dto
 * @author Daniel Arbey Sarmiento Amaya
 *
 */
@Component
public class UtilModelDto {

    @Autowired
    private ModelMapper modelMapper;
	
	public ProductoDto convertToDto(Producto model) {
		ProductoDto newDto = modelMapper.map(model, ProductoDto.class);
	    return newDto;
	}
	

}
