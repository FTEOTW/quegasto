package com.ps.quegasto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ps.quegasto.model.Gasto;
import com.ps.quegasto.repository.IGasto;

@Service
public class GastoService {

	@Autowired
	private IGasto repository;

	public List<Gasto> getGastoByPresupuesto(int id) {
		return repository.getGastoByPresupuestoId(id);
	}

	public int save(Gasto gasto) {
		int res = 0;
		Gasto c = repository.save(gasto);
		if (!c.equals(null)) {
			res = 1;
		}
		return res;
	}
}
