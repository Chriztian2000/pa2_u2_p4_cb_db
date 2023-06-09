package com.example.demo.repository.modelo;

import jakarta.persistence.Entity;

@Entity
public class Estudiante {
	private String nombre;
	private String apellido;
	private String jobby;
	
	
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", jobby=" + jobby + "]";
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getJobby() {
		return jobby;
	}
	public void setJobby(String jobby) {
		this.jobby = jobby;
	}
	
	
	
	
}