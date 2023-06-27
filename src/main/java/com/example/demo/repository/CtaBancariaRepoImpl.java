package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.CtaBancaria;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CtaBancariaRepoImpl implements CtaBancariaRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(CtaBancaria ctaBancaria) {
		this.entityManager.persist(ctaBancaria);
		
	}

	@Override
	public void actualizar(CtaBancaria ctaBancaria) {
		this.entityManager.merge(ctaBancaria);
		
	}

	@Override
	public CtaBancaria buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(CtaBancaria.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		this.entityManager.remove(this.buscar(id));
		
	}

	

}
