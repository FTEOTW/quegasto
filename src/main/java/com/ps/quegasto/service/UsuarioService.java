package com.ps.quegasto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ps.quegasto.model.Usuario;
import com.ps.quegasto.repository.IUsuario;

@Service
public class UsuarioService {
	
	@Autowired
	private IUsuario repository;

	public List<Usuario> getAll() {
		return (List<Usuario>) repository.findAll();
	}

	public Usuario getUserByEmail(String email) {
		return repository.findByEmail(email);
	}
	
	public void save(Usuario user)
	{
		Usuario u = repository.save(user);
	}
}
