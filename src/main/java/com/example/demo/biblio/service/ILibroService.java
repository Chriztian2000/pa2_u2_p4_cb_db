package com.example.demo.biblio.service;

import com.example.demo.biblio.repo.modelo.Libro;

public interface ILibroService {
	
	public void insertar(Libro libro);
	public void actualizar(Libro libro);
	public Libro consultar(Integer id);
	public void eliminar(Integer id);

}
