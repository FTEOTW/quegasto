package com.ps.quegasto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ps.quegasto.model.Presupuesto;

@Repository
public interface IPresupuesto extends CrudRepository<Presupuesto, Integer> {

}
