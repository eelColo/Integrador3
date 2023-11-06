package com.integrador3.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@Controller

public class InicioController {
	
	public static final String VISTA_INDEX = "index";
	public static final String VISTA_ACTIVIDADES = "actividades";
	public static final String VISTA_COLABORAR = "colaborar";
	public static final String VISTA_PROYECTO = "proyecto";
	
	
	
	
	@GetMapping("/index")
	public String mostrarIndex() {
		return VISTA_INDEX;
	}
	@GetMapping("actividades")
	public String mostrarActividades() {
		return VISTA_ACTIVIDADES;
	}
	@GetMapping("colaborar")
	public String vistaColaborar() {
		return VISTA_COLABORAR;
	}	
	@GetMapping("proyecto")
	public String vistaProyecto() {
		return VISTA_PROYECTO;
	}
	
}
