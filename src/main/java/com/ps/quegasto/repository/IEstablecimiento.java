package com.ps.quegasto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ps.quegasto.model.Establecimiento;

@Repository
public interface IEstablecimiento extends CrudRepository<Establecimiento, Integer> {

}
