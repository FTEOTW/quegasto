package com.ps.quegasto.model;

import java.io.Serializable;

public class UsuarioPresupuestoId implements Serializable {

	private static final long serialVersionUID = 1L;

	private Usuario usuario;
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

	public UsuarioPresupuestoId(Usuario usuario, Presupuesto presupuesto) {
		super();
		this.usuario = usuario;
		this.presupuesto = presupuesto;
	}

	public UsuarioPresupuestoId() {
		super();
	}
}
