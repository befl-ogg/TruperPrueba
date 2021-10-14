package com.truper.truper.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.truper.truper.po.ProductosPO;

public interface ProductosRepository extends JpaRepository<ProductosPO, Integer>{
	
	@Query(value = "SELECT * FROM PRODUCTOS p WHERE p.orden_id = :ordenId ", nativeQuery = true)
	public List<ProductosPO> getProductosByIdOrden(@Param("ordenId") Integer ordenId);
	

}
