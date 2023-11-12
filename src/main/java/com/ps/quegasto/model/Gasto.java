package com.ps.quegasto.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "gastos")
public class Gasto 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "descripcion")
	private String descripcion;

	@Column(name = "monto")
	private double monto;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name = "fecha")
	public Date fecha;

	@ManyToOne
	@JoinColumn(name = "id", nullable = false, insertable = false, updatable = false)
	private Categoria categoria;
	
	@ManyToOne
	@JoinColumn(name = "id", nullable = false, insertable = false, updatable = false)
	private Establecimiento establecimiento;
	
	@ManyToOne
	@JoinColumn(name = "id", nullable = false, insertable = false, updatable = false)
	private Presupuesto presupuesto;
	
	@Column(name = "foto")
	private String foto;

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Establecimiento getEstablecimiento() {
		return establecimiento;
	}

	public void setEstablecimiento(Establecimiento establecimiento) {
		this.establecimiento = establecimiento;
	}

	public Presupuesto getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(Presupuesto presupuesto) {
		this.presupuesto = presupuesto;
	}

	public Gasto(int id, String descripcion, double monto, Date fecha, Categoria categoria,
			Establecimiento establecimiento, Presupuesto presupuesto, String foto) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.monto = monto;
		this.fecha = fecha;
		this.categoria = categoria;
		this.establecimiento = establecimiento;
		this.presupuesto = presupuesto;
		this.foto = foto;
	}

	public Gasto() {
		super();
	}

}
