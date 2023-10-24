package com.ps.quegasto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/gastos")
public class GastosController {
	
	@GetMapping("/add")
	public String addGasto(Model model) {
		return "cargagastos";
	}

}
