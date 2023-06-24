package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;

public interface EstudianteService {
	public void insertar(Estudiante estudiante);
	public Estudiante seleccionar (String cedula);
	public void eliminar(String cedula);
	public void modificar(Estudiante estudiante);
	

	public Estudiante buscarporApellido (String apellido, String nombre);
	public List<Estudiante> reportePorApellido(String apellido);
	public Estudiante buscarporApellidoType (String apellido);
}
