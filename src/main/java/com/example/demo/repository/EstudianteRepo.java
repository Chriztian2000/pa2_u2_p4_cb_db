package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.repository.modelo.dto.EstudianteDTO;

public interface EstudianteRepo {
	public void insertar(Estudiante estudiante);
	public Estudiante buscar (String cedula);
	public void eliminar(String cedula);
	public void actualizar(Estudiante estudiante);
	
	public Estudiante seleccionarporApellido (String apellido,String nombre);
	public Estudiante seleccionarporApellidoType (String apellido);

	public List<Estudiante> seleccionarListaPorApellido(String apellido);
	
	public Estudiante seleccionarporApellidoNamed (String apellido);
	
	public Estudiante seleccionarporApellidoNamedQuery (String apellido);

	public Estudiante seleccionarPorApellidoNativeQuery(String apellido);
	
	public Estudiante seleccionarPorApellidoNativeQueryNamed(String apellido);
	
	
	public Estudiante seleccionarporNombreNamedQuery (String nombre);
	public Estudiante seleccionarPorNombreNativeQueryNamed(String nombre);
	
	
	
	public Estudiante seleccionarporApellidoCriteriaApiQuery (String apellido);
	
	public Estudiante seleccionarEstudianteDinamico(String nombre, String apellido, Double peso);
	
	public int eliminarPorNombre(String nombre);
	public int actualizarPorApellido(String nombre,String apellido);
	
	public List<EstudianteDTO>  selecionarTodosDTO();
	
	
	
}
