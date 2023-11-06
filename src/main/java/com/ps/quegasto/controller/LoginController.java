package com.ps.quegasto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ps.quegasto.model.Usuario;
import com.ps.quegasto.service.UsuarioService;

@Controller
@RequestMapping("/")
public class LoginController {

	@Autowired
	private UsuarioService service;

	@GetMapping("")
	public String getAllCategorias(Model model) {
		return "login";
	}

	@GetMapping("newuser")
	public String createUser(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "registrarusuario";
	}

	@PostMapping("/guardar")
	public String getAllProvincias(@Validated Usuario user, Model model) {

		Usuario u = service.getUserByEmail(user.getEmail());
		if (u != null) {
			model.addAttribute("infoMessage", "El usuario ya está registrado.");
		} else {
			service.save(user);
		}

		return "redirect:/";
	}

	@GetMapping("/cancelar")
	public String cancel(Model model) {
		return "login";
	}

	@PostMapping("/validaruser")
	public String validarUser(Usuario user, Model model) {
		Usuario u = service.getUserByEmail(user.getEmail());
		if (u != null) {
			model.addAttribute("usuario", u);
		}
		return "redirect:/presupuestos/";
	}
}
