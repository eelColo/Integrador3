package com.integrador3.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


//Entidad de usuario
@Entity
@Table(name = "consultaUsuario")
public class Usuarios {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	@Column(name="nombre")
	private String nombre;
	@Column(name="nombreAlumno")
	private String nombreAlumno;
	@Column(name= "mail")
	private String mail;
	@Column(name="telefono")
	private Integer telefono;
	@Column(name="turno")
	private String turno;
	@Column(name="mensaje")
	private String mensaje;
	
	
	
	
	
	public Usuarios() {
		
	}
	
	
	

	public Usuarios(Integer id, String nombre, String nombreAlumno, String mail, Integer telefono, String turno,
			String mensaje) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.nombreAlumno = nombreAlumno;
		this.mail = mail;
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
		return nombreAlumno;
	}

	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
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
		return "Usuarios [id=" + id + ", nombre=" + nombre + ", nombreAlumno=" + nombreAlumno + ", mail=" + mail
				+ ", telefono=" + telefono + ", turno=" + turno + ", mensaje=" + mensaje + "]";
	}
	
	
	
	
	
	
	
}
