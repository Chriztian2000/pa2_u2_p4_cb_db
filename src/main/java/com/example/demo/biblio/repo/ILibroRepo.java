package com.example.demo.biblio.repo;

import com.example.demo.biblio.repo.modelo.Libro;

public interface ILibroRepo {
	
	
	public void insertar(Libro libro);
	public void actualizar(Libro libro);
	public Libro buscar(Integer id);
	public void eliminar(Integer id);

}
