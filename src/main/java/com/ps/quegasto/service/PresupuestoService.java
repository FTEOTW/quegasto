package com.ps.quegasto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ps.quegasto.model.Presupuesto;
import com.ps.quegasto.repository.IPresupuesto;

@Service
public class PresupuestoService {

	@Autowired
	private IPresupuesto repository;

	public List<Presupuesto> getAll() {
		return (List<Presupuesto>) repository.findAll();
	}

	public Presupuesto getById(int id) {
		return repository.findById(id).orElse(null);
	}

	public int save(Presupuesto presupuesto) {
		int res = 0;
		Presupuesto c = repository.save(presupuesto);
		if (!c.equals(null)) {
			res = 1;
		}
		return res;
	}
}
