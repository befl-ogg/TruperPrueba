package com.truper.truper.service;

import java.util.List;
import java.util.Objects;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.truper.truper.po.ProductosPO;
import com.truper.truper.repository.ProductosRepository;

@Service
public class ProductosService {

	@Resource
	public ProductosRepository repProductos;
	
	public ProductosPO guardarProducto(ProductosPO producto) {
		producto = repProductos.save(producto);
		if(Objects.nonNull(producto)) {
			return producto;
		} else {
			return null;
		}
	}
	
	public List<ProductosPO> obtenerProductosPorIdOrden (Integer ordenId) {
		return repProductos.obtenerProductosPorIdOrden(ordenId);
	}
}
