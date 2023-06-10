package com.example.demo.repository.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Table(name = "estudiante")
@Entity
public class Estudiante {
	
	@Column(name= "estu_nombre")
	private String nombre;
	@Column(name= "estu_apellido")
	private String apellido;
	@Column(name= "estu_jobby")
	private String jobby;
	
	
	//PRIMARY KEY ID(hace relacion con la base de datos )
	@Id
	@Column(name= "estu_cedula")
	private String cedula;
	
	//get y set

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
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

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", jobby=" + jobby + ", cedula=" + cedula
				+ "]";
	}

}