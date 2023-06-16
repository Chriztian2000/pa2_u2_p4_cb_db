package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.CiudadanoRepo;
import com.example.demo.repository.modelo.Ciudadano;

@Service
public class CiudadanoServiceImpl implements CiudadanoService{

	@Autowired
	private CiudadanoRepo ciudadanoRepo;
	
	@Override
	public void insertar(Ciudadano ciudadano) {
	
		this.ciudadanoRepo.insertar(ciudadano);
	}

	@Override
	public void actualizar(Ciudadano ciudadano) {
		this.ciudadanoRepo.actualizar(ciudadano);
		
	}

	@Override
	public Ciudadano consultar(Integer id) {
		
		return this.ciudadanoRepo.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		this.ciudadanoRepo.eliminar(id);
		
	}

}
