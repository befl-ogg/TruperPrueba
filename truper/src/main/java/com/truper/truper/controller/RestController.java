package com.truper.truper.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.truper.truper.po.OrdenesPO;
import com.truper.truper.po.ProductosPO;
import com.truper.truper.service.OrdenesService;
import com.truper.truper.service.ProductosService;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/truper")
public class RestController {
//
//	@Autowired
//	OrdenesService srvOrdenes;
//
//	@Autowired
//	ProductosService srvProductos;
//
//	@RequestMapping(path = "/ordenes/{id}", method = RequestMethod.GET)
//	@ResponseBody
//	public ResponseEntity<?> getOrden(@PathVariable Integer ordenId) {
//		OrdenesPO orden = srvOrdenes.getOrdenById(ordenId);
//		List<ProductosPO> lstProductos = srvProductos.getProductosByIdOrden(orden.getOrden_id());
//		if (Objects.nonNull(lstProductos) && !lstProductos.isEmpty()) {
//			return new ResponseEntity<>(lstProductos, HttpStatus.OK);
//		} else {
//			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//		}
//	}
//
//	@RequestMapping(path = "/save", consumes = "application/json", produces = "application/json", method = RequestMethod.POST)
//	@ResponseBody
//	public ResponseEntity<?> saveOrden(@RequestBody OrdenesPO orden, @RequestBody List<ProductosPO> productos) {
//		orden = srvOrdenes.guardarOrdenCompra(orden);
//		boolean isPersist = true;
//		for (ProductosPO p : productos) {
//			p.setOrden(orden);
//			isPersist = srvProductos.guardarProducto(p);
//		}
//		if (isPersist) {
//			return new ResponseEntity<>(HttpStatus.OK);
//		} else {
//			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//		}
//	}
//
//	@RequestMapping(path = "/test", consumes = "application/json", produces = "application/json", method = RequestMethod.POST)
//	@ResponseBody
//	public ResponseEntity<?> test(@RequestBody List<ProductosPO> productos) {
//		if (Objects.nonNull(productos)) {
//			productos.stream().forEach(p -> {
//				System.out.println(p.getCodigo());
//				System.out.println(p.getDescripcion());
//				System.out.println(p.getOrden());
//				System.out.println(p.getPrecio());
//			});
//		}
//		boolean isPersist = true;
//		if (isPersist) {
//			return new ResponseEntity<>(HttpStatus.OK);
//		} else {
//			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//		}
//	}
//
//	@RequestMapping(path = "/savetest", consumes = "application/json", produces = "application/json", method = RequestMethod.POST)
//	@ResponseBody
//	public ResponseEntity<?> saveOrden(@RequestBody OrdenesPO orden) {
//		orden = srvOrdenes.guardarOrdenCompra(orden);
//		boolean isPersist = true;
//		if (isPersist) {
//			return new ResponseEntity<>(HttpStatus.OK);
//		} else {
//			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//		}
//	}
}
