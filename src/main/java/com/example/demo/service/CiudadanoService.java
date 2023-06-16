package com.example.demo.service;

import com.example.demo.repository.modelo.Ciudadano;


public interface CiudadanoService {
	
	public void insertar(Ciudadano ciudadano);
	//public void apertura(String cedula, String tipo, BigDecimal saldo, LocalDate fecha);
	
	//cedula tipo saldo
	public void actualizar(Ciudadano ciudadano);
	public Ciudadano consultar(Integer id);
	public void eliminar(Integer id);
	



}
