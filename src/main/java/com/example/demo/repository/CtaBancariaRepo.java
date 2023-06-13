package com.example.demo.repository;

import com.example.demo.repository.modelo.CtaBancaria;

public interface CtaBancariaRepo  {
	
	public void insertar(CtaBancaria ctaBancaria);
	public CtaBancaria buscar(Integer id);
	public void modificar(Integer id);

}
