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
	
	public boolean guardarProducto(ProductosPO producto) {
		ProductosPO prodPersist = repProductos.save(producto);
		if(Objects.nonNull(prodPersist)) {
			return true;
		} else {
			return false;
		}
	}
	
	public List<ProductosPO> getProductosByIdOrden (Integer ordenId) {
		return repProductos.getProductosByIdOrden(ordenId);
	}
}
