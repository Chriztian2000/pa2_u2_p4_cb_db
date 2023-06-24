package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.EstudianteRepo;
import com.example.demo.repository.modelo.Estudiante;

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
}
