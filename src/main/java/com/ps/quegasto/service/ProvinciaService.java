package com.ps.quegasto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ps.quegasto.model.Provincia;
import com.ps.quegasto.repository.IProvincia;

@Service
public class ProvinciaService {

	@Autowired
	private IProvincia provinciaRepository;

	public List<Provincia> getAllProvincias() {
		return (List<Provincia>) provinciaRepository.findAll();
	}

	public Provincia getProvinciaById(int id) {
		return provinciaRepository.findById(id).orElse(null);
	}

	public void saveProvincia(Provincia provincia) {
		provinciaRepository.save(provincia);
	}
}