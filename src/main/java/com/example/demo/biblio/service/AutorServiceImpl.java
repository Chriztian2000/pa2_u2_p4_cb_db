package com.example.demo.biblio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.stereotype.Service;

import com.example.demo.biblio.repo.IAutorRepo;
import com.example.demo.biblio.repo.modelo.Autor;

@Service
public class AutorServiceImpl implements IAutorService {
	
	@Autowired
	private IAutorRepo autorRepo;

	@Override
	public void insertar(Autor autor) {
		this.autorRepo.insertar(autor);
		
	}

	@Override
	public void actualizar(Autor autor) {
		this.autorRepo.actualizar(autor);
	}

	@Override
	public Autor consultar(Integer id) {
		
		return this.autorRepo.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		this.autorRepo.eliminar(id);
		
	}
	
	

}
