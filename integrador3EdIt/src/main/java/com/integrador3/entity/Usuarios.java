package com.integrador3.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


//Entidad de usuario
@Entity

@Table(name = "consultausuario")
public class Usuarios {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	@Column(name="nombre")
	private String nombre;
	@Column(name="nombre_alumno")
	private String nombre_alumno;
	@Column(name= "email")
	private String email;
	@Column(name="telefono")
	private Integer telefono;
	@Column(name="turno")
	private String turno;
	@Column(name="mensaje")
	private String mensaje;
	
	
	
	
	
	public Usuarios() {
		
	}
	
	
	

	public Usuarios(Integer id, String nombre, String nombre_alumno, String email, Integer telefono, String turno,
			String mensaje) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.nombre_alumno = nombre_alumno;
		this.email = email;
		this.telefono = telefono;
		this.turno = turno;
		this.mensaje = mensaje;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombreAlumno() {
		return nombre_alumno;
	}

	public void setNombreAlumno(String nombre_alumno) {
		this.nombre_alumno = nombre_alumno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	@Override
	public String toString() {
		return "Usuarios [id=" + id + ", nombre=" + nombre + ", nombreAlumno=" + nombre_alumno + ", email=" + email
				+ ", telefono=" + telefono + ", turno=" + turno + ", mensaje=" + mensaje + "]";
	}
	
	
	
	
	
	
	
}
