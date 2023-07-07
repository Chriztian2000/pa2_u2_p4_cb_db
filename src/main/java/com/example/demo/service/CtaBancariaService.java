package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.cglib.core.Local;

import com.example.demo.repository.modelo.CtaBancaria;

public interface CtaBancariaService {
	
	

	public void apertura(CtaBancaria ctaBancaria);
	//public void apertura(String cedula, String tipo, BigDecimal saldo, LocalDate fecha);
	
	//cedula tipo saldo
	public void actualizar(CtaBancaria ctaBancaria);
	public CtaBancaria consultar(Integer id);
	public void eliminar(Integer id);
	
	public void calculo(Integer id,  BigDecimal saldo);



}
