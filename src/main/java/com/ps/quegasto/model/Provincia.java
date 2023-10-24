package com.ps.quegasto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "provincia")
public class Provincia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	public Provincia() {
	}

	private String provincia;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public Provincia(int id, String provincia) {
		super();
		this.id = id;
		this.provincia = provincia;
	}
}