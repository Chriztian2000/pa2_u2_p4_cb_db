package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.example.demo.repository.modelo.CtaBancaria;

public interface CtaBancariaService {
	
	
	public void apertura(CtaBancaria ctaBancaria);
	public CtaBancaria consultar(Integer id);
	public void actualizar(Integer id);
	
	public void calculo(CtaBancaria ctabancaria, LocalDate fecha, BigDecimal saldo);


}
