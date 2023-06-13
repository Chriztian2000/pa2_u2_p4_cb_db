package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.CtaBancariaRepo;
import com.example.demo.repository.modelo.CtaBancaria;


@Service
public class CtaBancariaServiceImpl implements CtaBancariaService {
	
	@Autowired
	private CtaBancariaRepo ctabancariaRepo;

	@Override
	public void apertura(CtaBancaria ctaBancaria) {
		this.ctabancariaRepo.insertar(ctaBancaria);
		
	}

	@Override
	public CtaBancaria consultar(Integer id) {
		
		return this.ctabancariaRepo.buscar(id);
	}

	@Override
	public void actualizar(Integer id) {
		this.ctabancariaRepo.modificar(id);
		
	}



	@Override
	public void calculo(CtaBancaria ctabancaria, LocalDate fecha, BigDecimal saldo) {
		
	}

}
