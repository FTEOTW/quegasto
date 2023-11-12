package com.ps.quegasto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ps.quegasto.model.Gasto;
import com.ps.quegasto.model.Presupuesto;
import com.ps.quegasto.service.GastoService;
import com.ps.quegasto.service.PresupuestoService;


@Controller
@RequestMapping("/gastos")
public class GastosController {
	
	@Autowired
	private GastoService service;
	
	@Autowired
	private PresupuestoService serviceP;
	
	
	
	@GetMapping("/add")
	public String addGasto(Model model) {
		return "cargagastos";
	}
	

	@GetMapping("/list")
	public String listByPresupuestoId(@RequestParam(name = "id") String parametro, Model model) {
		
		List<Gasto> g = service.getGastoByPresupuesto(Integer.valueOf(parametro));
		Presupuesto p = serviceP.getById(Integer.valueOf(parametro));
		
		model.addAttribute("presupuesto", p);
		model.addAttribute("gastos", g);
		
		return "listagastos";
	}
	
	@GetMapping("/")
	public String list(Model model) {
		
		
		
		return "cargagastos";
	}

}
