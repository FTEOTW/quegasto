package com.ps.quegasto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ps.quegasto.model.Establecimiento;
import com.ps.quegasto.service.EstablecimientoService;

@Controller
@RequestMapping("/establecimientos")
public class EstablecimientoController {

	@Autowired
	private EstablecimientoService service;
	
	@GetMapping("/")
	public String getAllPresupuestos(Model model) {
		List<Establecimiento> est = service.getAll();
		model.addAttribute("establecimientos", est);
		return "listarest";
	}
	
	@GetMapping("/cancelar")
	public String cancelar() {
		return "redirect:/establecimientos/";
	}
}
