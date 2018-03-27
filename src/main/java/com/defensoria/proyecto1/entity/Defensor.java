package com.defensoria.proyecto1.entity;
// Generated Mar 13, 2018 1:33:41 AM by Hibernate Tools 5.2.8.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Defensor generated by hbm2java
 */
@Entity
@Table(name = "defensor", catalog = "bddefensoriapublica")
public class Defensor implements java.io.Serializable {

	private int idDefensor;
	private int idUsuarioSistema;
	private String lugarAdscripcion;
	private int noCedulaProfesional;
	private String regionAdscripcion;

	public Defensor() {
	}

	public Defensor(int idDefensor, int idUsuarioSistema, String lugarAdscripcion, int noCedulaProfesional,
			String regionAdscripcion) {
		this.idDefensor = idDefensor;
		this.idUsuarioSistema = idUsuarioSistema;
		this.lugarAdscripcion = lugarAdscripcion;
		this.noCedulaProfesional = noCedulaProfesional;
		this.regionAdscripcion = regionAdscripcion;
	}

	@Id

	@Column(name = "idDefensor", unique = true, nullable = false)
	public int getIdDefensor() {
		return this.idDefensor;
	}

	public void setIdDefensor(int idDefensor) {
		this.idDefensor = idDefensor;
	}

	@Column(name = "idUsuario_Sistema", nullable = false)
	public int getIdUsuarioSistema() {
		return this.idUsuarioSistema;
	}

	public void setIdUsuarioSistema(int idUsuarioSistema) {
		this.idUsuarioSistema = idUsuarioSistema;
	}

	@Column(name = "lugar_adscripcion", nullable = false, length = 45)
	public String getLugarAdscripcion() {
		return this.lugarAdscripcion;
	}

	public void setLugarAdscripcion(String lugarAdscripcion) {
		this.lugarAdscripcion = lugarAdscripcion;
	}

	@Column(name = "no_cedula_profesional", nullable = false)
	public int getNoCedulaProfesional() {
		return this.noCedulaProfesional;
	}

	public void setNoCedulaProfesional(int noCedulaProfesional) {
		this.noCedulaProfesional = noCedulaProfesional;
	}

	@Column(name = "region_adscripcion", nullable = false, length = 45)
	public String getRegionAdscripcion() {
		return this.regionAdscripcion;
	}

	public void setRegionAdscripcion(String regionAdscripcion) {
		this.regionAdscripcion = regionAdscripcion;
	}

}