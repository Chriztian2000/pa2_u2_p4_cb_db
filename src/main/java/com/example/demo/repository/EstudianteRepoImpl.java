package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository

//necesita la siguiente anotacion para la conexion con la baseDatos
@Transactional
public class EstudianteRepoImpl implements EstudianteRepo {
	// public static List<Estudiante> baseDatos = new ArrayList<>();

	// permite la interaccion con la base de datos
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Estudiante estudiante) {
		this.entityManager.persist(estudiante);

	}

	@Override
	public void actualizar(Estudiante estudiante) {
		this.entityManager.merge(estudiante);

	}

	@Override
	public void eliminar(String cedula) {
		Estudiante estu= this.buscar(cedula);
		this.entityManager.remove(estu);

	}

	@Override
	public Estudiante buscar(String cedula) {
				
		return this.entityManager.find(Estudiante.class, cedula);
	}

}
