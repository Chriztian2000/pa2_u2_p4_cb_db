package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Matricula;
import com.example.demo.repository.modelo.dto.EstudianteDTO;
import com.example.demo.repository.modelo.dto.MatriculaDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;


@Repository
@Transactional
public class MatriculaRepoImpl implements MatriculaRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public void insertar(Matricula matricula) {
		
		this.entityManager.persist(matricula);
	}


	@Override
	public List<MatriculaDTO> buscarTodosDTO() {
		//

		TypedQuery<MatriculaDTO> myqQuery = this.entityManager.createQuery(
				"SELECT NEW com.example.demo.repository.modelo.dto.MatriculaDTO(m.alumno.nombre,m.materia.nombre) FROM Matricula m",
				MatriculaDTO.class);
		// TODO Auto-generated method stub
		return myqQuery.getResultList();
	}

}
