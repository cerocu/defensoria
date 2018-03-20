package com.defensoria.proyecto1.entity;
// Generated Mar 13, 2018 1:33:41 AM by Hibernate Tools 5.2.8.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Bitacora generated by hbm2java
 */
@Entity
@Table(name = "bitacora", catalog = "bddefensoriapublica")
public class Bitacora implements java.io.Serializable {

	private int idBitacora;
	private int idUsuarioServicio;
	private Date fechaReporte;

	public Bitacora() {
	}

	public Bitacora(int idBitacora, int idUsuarioServicio, Date fechaReporte) {
		this.idBitacora = idBitacora;
		this.idUsuarioServicio = idUsuarioServicio;
		this.fechaReporte = fechaReporte;
	}

	@Id

	@Column(name = "idBitacora", unique = true, nullable = false)
	public int getIdBitacora() {
		return this.idBitacora;
	}

	public void setIdBitacora(int idBitacora) {
		this.idBitacora = idBitacora;
	}

	@Column(name = "idUsuario_Servicio", nullable = false)
	public int getIdUsuarioServicio() {
		return this.idUsuarioServicio;
	}

	public void setIdUsuarioServicio(int idUsuarioServicio) {
		this.idUsuarioServicio = idUsuarioServicio;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_reporte", nullable = false, length = 10)
	public Date getFechaReporte() {
		return this.fechaReporte;
	}

	public void setFechaReporte(Date fechaReporte) {
		this.fechaReporte = fechaReporte;
	}

}