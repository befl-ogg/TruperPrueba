package com.truper.truper.service;

import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.truper.truper.po.SucursalesPO;
import com.truper.truper.repository.SucursalesRepository;

@Service
public class SucursalesService {

	@Resource
	private SucursalesRepository repoSucursales;

	public SucursalesPO guardarSucursal(SucursalesPO sucursal) {
		return repoSucursales.save(sucursal);
	}

	public SucursalesPO obtenerSucursalPorId(SucursalesPO sucursal) {
		Optional<SucursalesPO> optSucursal = repoSucursales.findById(sucursal.getSucursal_id());
		if (optSucursal.isPresent()) {
			return optSucursal.get();
		} else {
			return null;
		}
	}
	
	public List<SucursalesPO> obtenerSucursales(){
		return repoSucursales.findAll();
	}

}
