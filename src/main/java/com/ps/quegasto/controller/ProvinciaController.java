package com.ps.quegasto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ps.quegasto.model.Provincia;
import com.ps.quegasto.service.ProvinciaService;

@Controller
@RequestMapping
public class ProvinciaController {

	@Autowired
	private ProvinciaService provinciaService;

	@GetMapping("/prov")
	public String getAllProvincias(Model model) {
		List<Provincia> provinces = provinciaService.getAllProvincias();
		model.addAttribute("provinces", provinces);
		return "provincias";
	}

	@GetMapping("/{id}")
	public Provincia getProvinciaById(@PathVariable int id) {
		return provinciaService.getProvinciaById(id);
	}

	@PostMapping
	public void saveProvincia(@RequestBody Provincia provincia) {
		provinciaService.saveProvincia(provincia);
	}
}