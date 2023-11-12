package com.ps.quegasto.model;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "presupuestos")
public class Presupuesto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;

	public Presupuesto() {
	}

	String nombre;
	String descripcion;
	double monto;

	public Presupuesto(int id, String nombre, String descripcion, double monto, Date fecha_comienzo, Date fecha_fin) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.monto = monto;
		this.fecha_comienzo = fecha_comienzo;
		this.fecha_fin = fecha_fin;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_comienzo")
	public Date fecha_comienzo;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_fin")
	public Date fecha_fin;

	@OneToMany(mappedBy = "presupuesto")
    private List<UsuarioPresupuesto> usuarioPresupuestos;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFecha_comienzo() {
		return fecha_comienzo;
	}

	public void setFecha_comienzo(Date fecha_comienzo) {
		this.fecha_comienzo = fecha_comienzo;
	}

	public Date getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	public Presupuesto(int id, String nombre, Date fecha_comienzo, Date fecha_fin, String descripcion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fecha_comienzo = fecha_comienzo;
		this.fecha_fin = fecha_fin;
		this.descripcion = descripcion;
	}

}
