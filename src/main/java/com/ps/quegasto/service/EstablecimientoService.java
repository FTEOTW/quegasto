package com.ps.quegasto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ps.quegasto.model.Establecimiento;
import com.ps.quegasto.repository.IEstablecimiento;

@Service
public class EstablecimientoService {

	@Autowired
	private IEstablecimiento repository;
	
	
	public List<Establecimiento> getAll() {
		return (List<Establecimiento>) repository.findAll();
	}
	
}
