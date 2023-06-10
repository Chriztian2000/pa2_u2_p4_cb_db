package com.example.demo.repository;

import com.example.demo.repository.modelo.Estudiante;

public interface EstudianteRepo {
	public void insertar(Estudiante estudiante);
	public Estudiante buscar (String cedula);
	public void eliminar(String cedula);
	public void actualizar(Estudiante estudiante);
}
