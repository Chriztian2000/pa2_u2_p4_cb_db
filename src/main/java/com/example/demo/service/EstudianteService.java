package com.example.demo.service;

import com.example.demo.repository.modelo.Estudiante;

public interface EstudianteService {
	public void insertar(Estudiante estudiante);
	public Estudiante seleccionar (String cedula);
	public void eliminar(String cedula);
	public void modificar(Estudiante estudiante);

	
	
}
