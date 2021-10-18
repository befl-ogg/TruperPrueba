package com.truper.truper.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.truper.truper.po.ProductosPO;
import com.truper.truper.service.ProductosService;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/productos")
public class ProductosController {
	
	@Autowired
	ProductosService srvProductos;
	
	@RequestMapping(path = "/save", consumes = "application/json", produces = "application/json", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<?> guardarProducto(@RequestBody ProductosPO producto) {
		producto = srvProductos.guardarProducto(producto);
		if (Objects.nonNull(producto)) {
			return new ResponseEntity<>(Boolean.TRUE, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(Boolean.FALSE, HttpStatus.CONFLICT);
		}
	}
	
	@RequestMapping(path = "/orden/{ordenId}", consumes = "application/json", produces = "application/json", method = RequestMethod.GET)
	public ResponseEntity<?> obtenerProductosPorIdOrden (@PathVariable("ordenId") Integer ordenId){
		List<ProductosPO>  lstProductos = srvProductos.obtenerProductosPorIdOrden(ordenId);
		if (Objects.nonNull(lstProductos) && !lstProductos.isEmpty()) {
			return new ResponseEntity<>(lstProductos, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		}
	}
}
