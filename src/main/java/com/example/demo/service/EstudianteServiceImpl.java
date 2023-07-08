package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.EstudianteRepo;
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.repository.modelo.dto.EstudianteDTO;

@Service
public class EstudianteServiceImpl implements EstudianteService {
	
	@Autowired
	private EstudianteRepo estudianteRepo;

	@Override
	public void insertar(Estudiante estudiante) {
		this.estudianteRepo.insertar(estudiante);
	}

	@Override
	public Estudiante seleccionar(String cedula) {
		
		return this.estudianteRepo.buscar(cedula);
	}

	@Override
	public void eliminar(String cedula) {
		this.estudianteRepo.eliminar(cedula);
		
	}

	@Override
	public void modificar(Estudiante estudiante) {
	this.estudianteRepo.actualizar(estudiante);

	}

	@Override
	public Estudiante buscarporApellido(String apellido,String nombre) {
		
		return this.estudianteRepo.seleccionarporApellido(apellido,nombre);
	}

	@Override
	public List<Estudiante> reportePorApellido(String apellido) {
		
		return this.estudianteRepo.seleccionarListaPorApellido(apellido);
	}

	@Override
	public Estudiante buscarporApellidoType(String apellido) {
		
		return this.estudianteRepo.seleccionarporApellidoType(apellido);
	}

	@Override
	public Estudiante buscarporApellidoNamedQuery(String apellido) {
		
		return this.estudianteRepo.seleccionarporApellidoNamedQuery(apellido);
	}

	@Override
	public Estudiante buscarPorApellidoNativeQuery(String apellido) {
		
		return this.estudianteRepo.seleccionarPorApellidoNativeQuery(apellido);
	}

	@Override
	public Estudiante buscarPorApellidoNativeQueryNamed(String apellido) {
		
		return this.estudianteRepo.seleccionarPorApellidoNativeQueryNamed(apellido);
	}

	@Override
	public Estudiante buscarporNombreNamedQuery(String nombre) {
		
		return this.estudianteRepo.seleccionarporApellidoNamedQuery(nombre);
	}

	@Override
	public Estudiante buscarPorNombreNativeQueryNamed(String nombre) {
		
		return this.estudianteRepo.seleccionarPorApellidoNativeQueryNamed(nombre);
	}

	@Override
	public Estudiante seleccionarporApellidoCriteriaApiQuery(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.seleccionarporApellidoCriteriaApiQuery(apellido);
	}

	@Override
	public Estudiante buscarEstudianteDinamico(String nombre, String apellido, Double peso) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.seleccionarEstudianteDinamico(nombre, apellido, peso);
	}

	@Override
	public int borrarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.eliminarPorNombre(nombre);
	}

	@Override
	public int modificarPorApellido(String nombre, String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.actualizarPorApellido(nombre, apellido);
	}

	@Override
	public List<EstudianteDTO> buscarTodosDTO() {
		// TODO Auto-generated method stub
		return this.estudianteRepo.selecionarTodosDTO();
	}
}
