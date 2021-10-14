package com.truper.truper.po;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ORDENES")
public class OrdenesPO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer orden_id;
	
	@JoinColumn(name = "sucursal_id")
	@ManyToOne
	private SucursalesPO sucursal;
	
	@Column(name = "fecha")
	private Date fecha;
	
	@Column(name = "total")
	private Double total;

	public Integer getOrden_id() {
		return orden_id;
	}

	public void setOrden_id(Integer orden_id) {
		this.orden_id = orden_id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
	
	public SucursalesPO getSucurlal() {
		return sucursal;
	}

	public void setSucurlal(SucursalesPO sucurlal) {
		this.sucursal = sucurlal;
	}

}
