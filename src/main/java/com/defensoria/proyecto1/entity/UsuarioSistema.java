package com.defensoria.proyecto1.entity;
// Generated Mar 13, 2018 1:33:41 AM by Hibernate Tools 5.2.8.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * UsuarioSistema generated by hbm2java
 */
@Entity
@Table(name = "usuario_sistema", catalog = "bddefensoriapublica")
public class UsuarioSistema implements java.io.Serializable {

	private int idUsuarioSistema;
	private int idPersonal;
	private int noControl;
	private String password;

	public UsuarioSistema() {
	}

	public UsuarioSistema(int idUsuarioSistema, int idPersonal, int noControl, String password) {
		this.idUsuarioSistema = idUsuarioSistema;
		this.idPersonal = idPersonal;
		this.noControl = noControl;
		this.password = password;
	}

	@Id

	@Column(name = "idUsuario_Sistema", unique = true, nullable = false)
	public int getIdUsuarioSistema() {
		return this.idUsuarioSistema;
	}

	public void setIdUsuarioSistema(int idUsuarioSistema) {
		this.idUsuarioSistema = idUsuarioSistema;
	}

	@Column(name = "idPersonal", nullable = false)
	public int getIdPersonal() {
		return this.idPersonal;
	}

	public void setIdPersonal(int idPersonal) {
		this.idPersonal = idPersonal;
	}

	@Column(name = "no_control", nullable = false)
	public int getNoControl() {
		return this.noControl;
	}

	public void setNoControl(int noControl) {
		this.noControl = noControl;
	}

	@Column(name = "password", nullable = false, length = 20)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}