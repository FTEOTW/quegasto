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
import com.ps.quegasto.model.Usuario;
import com.ps.quegasto.service.PresupuestoService;
import com.ps.quegasto.service.UsuarioPresupuestoService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/presupuestos")
public class PresupuestoController {

	@Autowired
	private PresupuestoService service;
	
	@Autowired
	private UsuarioPresupuestoService upService;

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
	public String getAllPresupuestos(HttpSession session, Model model) {
		Usuario user = (Usuario) session.getAttribute("usuario"); // Retrieve the username from the session
        model.addAttribute("usuario", user);
//		List<Presupuesto> cat = service.getAll(); this get all the presupuestos
        
		List<Presupuesto> cat = upService.obtenerPresupuestosPorUsuario(user.getId());
		
		model.addAttribute("presupuestos", cat);
		return "listarpresupuestos";
	}
	
	@GetMapping("/cancelar")
	public String cancelar() {
		return "redirect:/presupuestos/";
	}

}
