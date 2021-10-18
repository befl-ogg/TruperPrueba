package com.truper.truper.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.truper.truper.po.ProductosPO;

public interface ProductosRepository extends JpaRepository<ProductosPO, Integer>{
	
	@Query(value = "SELECT p FROM ProductosPO as p WHERE p.orden.id = :ordenId ")
	public List<ProductosPO> obtenerProductosPorIdOrden(@Param("ordenId") Integer ordenId);
	
}
	