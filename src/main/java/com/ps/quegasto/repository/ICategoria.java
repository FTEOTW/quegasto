package com.ps.quegasto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ps.quegasto.model.Categoria;

@Repository
public interface ICategoria extends CrudRepository<Categoria, Integer> {

}
