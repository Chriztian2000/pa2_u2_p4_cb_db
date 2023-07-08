package com.example.demo.repository.modelo.dto;

public class MatriculaDTO {
	
	private String materia;
	private String nombre;
	
	public MatriculaDTO() {
		
	}
	
	
	public MatriculaDTO(String materia, String nombre) {
		super();
		this.materia = materia;
		this.nombre = nombre;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "MatriculaDTO [materia=" + materia + ", nombre=" + nombre + "]";
	}
	
	

}
