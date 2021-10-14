package com.truper.truper.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SUCURSALES")
public class SucursalesPO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sucursal_id;
	
	@Column(name = "nombre")
	private String nombre;

	public Integer getSucursal_id() {
		return sucursal_id;
	}

	public void setSucursal_id(Integer sucursal_id) {
		this.sucursal_id = sucursal_id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
