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
@Table(name = "usuarios")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "nombre", nullable = false)
	private String nombre;

	@Column(name = "apellido", nullable = false)
	private String apellido;

	@Column(name = "correo", nullable = false, unique = true)
	private String email;

	@Column(name = "password")
	private String password;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "fechanac")
	@Temporal(TemporalType.DATE)
	private Date fechaNac;

	@Column(name = "ban")
	private boolean ban;

	@OneToMany(mappedBy = "usuario")
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String correo) {
		this.email = correo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	public boolean isBan() {
		return ban;
	}

	public void setBan(boolean ban) {
		this.ban = ban;
	}

	public Usuario() {
	}

	public Usuario(int id, String nombre, String apellido, String correo, String password, Date fechaNac, boolean ban) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = correo;
		this.password = password;
		this.fechaNac = fechaNac;
		this.ban = ban;
	}

}
