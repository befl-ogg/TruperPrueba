package com.truper.truper.service;

import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.truper.truper.po.OrdenesPO;
import com.truper.truper.repository.OrdenesRepository;

@Service
public class OrdenesService {
	
	@Resource
	private OrdenesRepository repOrdenes;
	
	public OrdenesPO guardarOrdenCompra(OrdenesPO orden) {
		return repOrdenes.save(orden);
	}
	
	public OrdenesPO getOrdenById(Integer id) {
		Optional<OrdenesPO> optOrdenes = repOrdenes.findById(id);
		if(optOrdenes.isPresent()){
			return optOrdenes.get();
		} else {
			return null;
		}
	}
	
	public List<OrdenesPO> obtenerOrdenes() {
		return repOrdenes.findAll();
	}

}
