package com.example.demo.repository;

import com.example.demo.repository.modelo.CtaBancaria;

public interface CtaBancariaRepo  {
	
	
	public void insertar(CtaBancaria ctaBancaria);
	public void actualizar(CtaBancaria ctaBancaria);
	public CtaBancaria buscar(Integer id);
	public void eliminar(Integer id);

}
