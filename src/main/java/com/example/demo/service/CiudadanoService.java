package com.example.demo.service;

import com.example.demo.repository.modelo.Ciudadano;


public interface CiudadanoService {
	
	public void insertar(Ciudadano ciudadano);
	public void actualizar(Ciudadano ciudadano);
	public Ciudadano consultar(Integer id);
	public void eliminar(Integer id);
	



}
