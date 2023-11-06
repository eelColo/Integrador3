package com.integrador3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.integrador3.entity.Usuarios;
import com.integrador3.repository.UsuarioRepository;

//Controlador para CRUD de inscripciones/consultas
@Controller

public class InscripcionController {
	

	public static final String VISTA_INSCRIPCIONES = "inscripciones";
	
	
	
	@Autowired
	UsuarioRepository urp;
	
	@GetMapping("inscripciones")
	public String vistaInscripciones(Model mo) {
		Usuarios us= new Usuarios();
		mo.addAttribute("usuarios", us);
		return VISTA_INSCRIPCIONES;
	}
	
	
	@PostMapping("agregar")
	public String agregarp(@ModelAttribute("usuarios") Usuarios usuario, RedirectAttributes redi) {
		try {
			urp.save(usuario);
		}catch(Exception e){
			System.out.println(e.getMessage());
		} 
		redi.addFlashAttribute("mensaje", "Producto agregado vuelvo");
		return "redirect:" +VISTA_INSCRIPCIONES;
		
	}
}
