package com.curso.springboot.web.app.controllers;

import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.curso.springboot.web.app.models.dao.IUsuarioDao;

@Controller
@Table(name = "usuarios")
public class UsuarioController {
	
	@Autowired
	private IUsuarioDao usuarioDao;
	
	@RequestMapping(value="/listar")
	public String listar(Model model) {
		model.addAttribute("titulo", "Listado de usuarios");
		model.addAttribute("usuarios", usuarioDao.findAll());
		return "listar";
	}
	

}
