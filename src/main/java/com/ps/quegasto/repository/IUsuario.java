package com.ps.quegasto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ps.quegasto.model.Usuario;

@Repository
public interface IUsuario extends CrudRepository<Usuario, Integer>{

	Usuario findByEmail(String email);
	
	int findIdByEmail(String email);
}