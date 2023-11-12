package com.ps.quegasto.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios_presupuestos")
@IdClass(UsuarioPresupuestoId.class)
public class UsuarioPresupuesto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@ManyToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;

	@Id
	@ManyToOne
	@JoinColumn(name = "presupuesto_id")
	private Presupuesto presupuesto;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Presupuesto getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(Presupuesto presupuesto) {
		this.presupuesto = presupuesto;
	}

	public UsuarioPresupuesto(Usuario usuario, Presupuesto presupuesto) {
		super();
		this.usuario = usuario;
		this.presupuesto = presupuesto;
	}

	public UsuarioPresupuesto() {
		super();
	}

}