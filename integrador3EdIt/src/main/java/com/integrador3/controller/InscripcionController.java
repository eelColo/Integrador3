package com.integrador3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import com.integrador3.entity.Usuarios;

import com.integrador3.repository.UsuarioRepository;

//Controlador para CRUD de inscripciones/consultas
@Controller
//@RestController
public class InscripcionController {
	

	public static final String VISTA_INSCRIPCIONES = "inscripciones";
	
	@Autowired
	UsuarioRepository urp;
	
	
	
	
	/*Al llamar incripciones se le da el nuevo 
	objeto de usuarios
	Y ademas se le envia como otra variable usuario 
	para listar los ya existentes
	*/
	@GetMapping("inscripciones")
	public String vistaInscripciones(Model mo) {
		Usuarios us= new Usuarios();
		
		
		mo.addAttribute("usuarios", us);
		mo.addAttribute("usuario", urp.findAll());	
		
		return VISTA_INSCRIPCIONES;
	}

	/*Usando el objeto usuario que cree previamente 
	una vez guardado por el form lo envia  a la base
	y devuelve a inscripciones y suma un mensaje 
	que recibe un div (prueba)*/
	
	@PostMapping("agregar")
	public String agregarp(@ModelAttribute("usuarios" ) Usuarios usuario, RedirectAttributes redi) {
		try {
			urp.save(usuario);
		}catch(Exception e){
			System.out.println(e.getMessage());
		} 
		redi.addFlashAttribute("mensaje", "Consulta recibida!");
		return "redirect:" +VISTA_INSCRIPCIONES;
		
	}
	
	

	//Metodos para testear desde PostMan
	//Cambiar a RestController
	
		@PostMapping("agregarimp")
		public Usuarios agregarImp(@RequestBody Usuarios us) {
			System.out.println(us);
		return urp.save(us);	
		}
		
		//listado de usuarios 
		@GetMapping("users")
		public List<Usuarios> listaUsers(){
			
			return urp.findAll();
		}
		
	
		//borrar
		@DeleteMapping("eliminar/{id}")
		public void eliminar(@PathVariable(value = "id") Integer id) {
			urp.deleteById(id);
		}
		
		//editar
		@GetMapping("editar/{id}")
		public void editarApi(@PathVariable Integer id, @RequestBody Usuarios user) {
			Usuarios users = urp.findById(id).orElseThrow();
			users.setNombre(user.getNombre());
			users.setNombreAlumno(user.getNombreAlumno());
			users.setEmail(user.getEmail());
			users.setTelefono(user.getTelefono());
			users.setTurno(user.getTurno());
			users.setMensaje(user.getTurno());
			urp.save(users);
		}
	
	


	
	
}
