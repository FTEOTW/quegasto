package com.ps.quegasto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ps.quegasto.model.Presupuesto;
import com.ps.quegasto.service.PresupuestoService;

@Controller
@RequestMapping("/presupuestos")
public class PresupuestoController {

	@Autowired
	private PresupuestoService service;

	@GetMapping("/add")
	public String addPresupuesto(Model model) {
		model.addAttribute("presupuesto", new Presupuesto());
		return "crearpresupuesto";
	}

	@PostMapping("/guardar")
	public String getAllProvincias(@Validated Presupuesto c, Model model) {
		service.save(c);
		return "redirect:/presupuestos/";
	}
	
	@GetMapping("/")
	public String getAllPresupuestos(Model model) {
		List<Presupuesto> cat = service.getAll();
		model.addAttribute("presupuestos", cat);
		return "listarpresupuestos";
	}
	
	@GetMapping("/cancelar")
	public String cancelar() {
		return "redirect:/presupuestos/";
	}

}
