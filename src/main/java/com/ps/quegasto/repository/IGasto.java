package com.ps.quegasto.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ps.quegasto.model.Gasto;

@Repository
public interface IGasto extends CrudRepository<Gasto, Integer> {
	
	List<Gasto> getGastoByPresupuestoId(int id);
	
}
