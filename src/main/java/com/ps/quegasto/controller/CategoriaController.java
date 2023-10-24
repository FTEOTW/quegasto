package com.ps.quegasto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ps.quegasto.model.Categoria;
import com.ps.quegasto.service.CategoriaService;

@Controller
@RequestMapping("/categorias")
public class CategoriaController {

	@Autowired
	private CategoriaService categoriaService;

	@GetMapping("/add")
	public String addCategoria(Model model) {
		model.addAttribute("categoria", new Categoria());
		return "cargarcategoria";
	}

	@PostMapping("/guardar")
	public String getAllProvincias(@Validated Categoria c, Model model) {
		categoriaService.saveCategoria(c);
		return "redirect:/categorias/";
	}

	@GetMapping("/")
	public String getAllCategorias(Model model) {
		List<Categoria> cat = categoriaService.getAllCategorias();
		model.addAttribute("categorias", cat);
		return "listarcategorias";
	}
}
