package com.ps.quegasto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ps.quegasto.model.Provincia;

@Repository
public interface IProvincia extends CrudRepository<Provincia, Integer> {

}
