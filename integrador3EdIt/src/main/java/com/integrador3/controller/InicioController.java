package com.integrador3.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;





@Controller

public class InicioController {
	
	public static final String VISTA_INDEX = "index";
	public static final String VISTA_ACTIVIDADES = "actividades";
	public static final String VISTA_COLABORAR = "colaborar";
	public static final String VISTA_PROYECTO = "proyecto";
	
	
	
	
	
	@GetMapping("/index")
	public String mostrarIndex(Model mo) {
		
		
		return VISTA_INDEX;
	}
	@GetMapping("actividades")
	public String mostrarActividades(Model mo) {
		
		
		
		return VISTA_ACTIVIDADES;
	}
	@GetMapping("colaborar")
	public String vistaColaborar(Model mo) {
		
		
		
		return VISTA_COLABORAR;
	}	
	@GetMapping("proyecto")
	public String vistaProyecto(Model mo) {
		
		
		
		return VISTA_PROYECTO;
	}
	
	
	
	
}
