package com.truper.truper.po;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ORDENES")
public class OrdenesPO implements Serializable{
	private static final long serialVersionUID = -1689493662774461108L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "orden_id", unique = true, nullable = false)
	private Integer orden_id;
	
	@JoinColumn(name = "sucursal_id")
	@ManyToOne(fetch = FetchType.EAGER)
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

	public SucursalesPO getSucursal() {
		return sucursal;
	}

	public void setSucursal(SucursalesPO sucursal) {
		this.sucursal = sucursal;
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

	
}
