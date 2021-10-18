package com.truper.truper.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.truper.truper.po.SucursalesPO;
import com.truper.truper.service.SucursalesService;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/sucursales")
public class SucursalesController {
	
	@Autowired
	SucursalesService srvSucursales;
	
	@RequestMapping(path = "/save", consumes = "application/json", produces = "application/json", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<?> guardarSucursal(@RequestBody SucursalesPO sucursal){
		sucursal = srvSucursales.guardarSucursal(sucursal);
		if (Objects.nonNull(sucursal)) {
			return new ResponseEntity<>(sucursal, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		}
	}
	
	@RequestMapping(path = "/get", consumes = "application/json", produces = "application/json", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> obtenerSucursalPorId(@RequestBody SucursalesPO sucursal) {
		sucursal = srvSucursales.obtenerSucursalPorId(sucursal);
		if(Objects.nonNull(sucursal)) {
			return new ResponseEntity<>(sucursal, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(Boolean.FALSE, HttpStatus.CONFLICT);
		}
	}
	
	@RequestMapping(path = "/all", consumes = "application/json", produces = "application/json", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> obtenerSucursales() {
		List<SucursalesPO> lstSucursal = srvSucursales.obtenerSucursales();
		if(Objects.nonNull(lstSucursal) && !lstSucursal.isEmpty()) {
			return new ResponseEntity<>(lstSucursal, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(Boolean.FALSE, HttpStatus.CONFLICT);
		}
	}

}
