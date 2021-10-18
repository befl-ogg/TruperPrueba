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

import com.truper.truper.po.OrdenesPO;
import com.truper.truper.service.OrdenesService;
import com.truper.truper.service.ProductosService;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/ordenes")
public class OrdenesController {
	
	@Autowired
	OrdenesService srvOrdenes;
	
	@RequestMapping(path = "/save", consumes = "application/json", produces = "application/json", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<?> guardarOrden(@RequestBody OrdenesPO orden){
		orden = srvOrdenes.guardarOrdenCompra(orden);
		if (Objects.nonNull(orden)) {
			return new ResponseEntity<>(orden, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(Boolean.FALSE, HttpStatus.CONFLICT);
		}
	}
	
	@RequestMapping(path = "/all", consumes = "application/json", produces = "application/json", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> obtenerOrdenes() {
		List<OrdenesPO> lstOrdenes = srvOrdenes.obtenerOrdenes();
		if (Objects.nonNull(lstOrdenes) && !lstOrdenes.isEmpty()) {
			return new ResponseEntity<>(lstOrdenes, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		}
	}
	

}
