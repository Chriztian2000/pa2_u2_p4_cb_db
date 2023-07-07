package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;

public interface EstudianteService {
	public void insertar(Estudiante estudiante);

	public Estudiante seleccionar(String cedula);

	public void eliminar(String cedula);

	public void modificar(Estudiante estudiante);

	public Estudiante buscarporApellido(String apellido, String nombre);

	public List<Estudiante> reportePorApellido(String apellido);

	public Estudiante buscarporApellidoType(String apellido);

	public Estudiante buscarporApellidoNamedQuery(String apellido);

	public Estudiante buscarPorApellidoNativeQuery(String apellido);

	public Estudiante buscarPorApellidoNativeQueryNamed(String apellido);

	public Estudiante buscarporNombreNamedQuery(String nombre);

	public Estudiante buscarPorNombreNativeQueryNamed(String nombre);

	public Estudiante seleccionarporApellidoCriteriaApiQuery(String apellido);

	public Estudiante buscarEstudianteDinamico(String nombre, String apellido, Double peso);

	public int borrarPorNombre(String nombre);

	public int modificarPorApellido(String nombre, String apellido);

	// deber
	public int borrarPorEdad(Integer edad);

	// desde una edad se cambia el establecimiento
	public int amodificarPorEdad(String establecimiento, Integer edad);

	public Estudiante buscarEstudianteEdadDinamico(String nombre, String apellido, Integer edad);

}
