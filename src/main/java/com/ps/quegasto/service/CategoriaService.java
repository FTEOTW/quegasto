package com.ps.quegasto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ps.quegasto.model.Categoria;
import com.ps.quegasto.repository.ICategoria;

@Service
public class CategoriaService {

	@Autowired
	private ICategoria categoriaRepository;

	public List<Categoria> getAllCategorias() {
		return (List<Categoria>) categoriaRepository.findAll();
	}

	public Categoria getCategoriaById(int id) {
		return categoriaRepository.findById(id).orElse(null);
	}

	public int saveCategoria(Categoria categoria) {
		int res = 0;
		Categoria c = categoriaRepository.save(categoria);
		if (!c.equals(null)) {
			res = 1;
		}
		return res;
	}
}
