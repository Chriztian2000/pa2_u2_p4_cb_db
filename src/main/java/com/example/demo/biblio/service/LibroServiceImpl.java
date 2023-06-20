package com.example.demo.biblio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.biblio.repo.ILibroRepo;
import com.example.demo.biblio.repo.modelo.Libro;

@Service
public class LibroServiceImpl implements ILibroService {

	@Autowired
	private ILibroRepo iLibroRepo;

	@Override
	public void insertar(Libro libro) {
		this.iLibroRepo.insertar(libro);

	}

	@Override
	public void actualizar(Libro libro) {
		this.iLibroRepo.actualizar(libro);

	}

	@Override
	public Libro consultar(Integer id) {

		return this.iLibroRepo.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		this.iLibroRepo.eliminar(id);
	}

}
