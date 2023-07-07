package com.example.demo.biblio.service;

import com.example.demo.biblio.repo.modelo.Autor;

public interface IAutorService {
	
	
	public void insertar(Autor autor);
	public void actualizar(Autor autor);
	public Autor consultar(Integer id);
	public void eliminar(Integer id);
	


}
