package com.example.demo.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.CtaBancariaRepo;
import com.example.demo.repository.modelo.CtaBancaria;

@Service
public class CtaBancariaServiceImpl implements CtaBancariaService {

	@Autowired
	private CtaBancariaRepo ctabancariaRepo;
	

	@Override
	public void actualizar(CtaBancaria ctaBancaria) {
		this.ctabancariaRepo.actualizar(ctaBancaria);

	}

	@Override
	public CtaBancaria consultar(Integer id) {
		// TODO Auto-generated method stub
		return this.ctabancariaRepo.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		this.ctabancariaRepo.eliminar(id);
	}

	@Override
	public void calculo(Integer id, BigDecimal saldo) {

		CtaBancaria ctabancaria = this.consultar(id);

		// LocalDate dia = LocalDate.now();
		Integer dia = ctabancaria.getEapertura().getDayOfMonth();
		// LocalDate dia = LocalDate.of(1991,6,14);

		// if(dia.getDayOfMonth()%2 == 0)
		if (dia % 2 == 0) {
			System.out.println("par");
			ctabancaria.setSaldo(saldo.multiply(new BigDecimal(1.05)).setScale(2, RoundingMode.HALF_UP));
			this.ctabancariaRepo.actualizar(ctabancaria);
			System.out.println("su cuenta " + ctabancaria);
			System.err.println("su saldo alctual es: " + ctabancaria.getSaldo());

		} else {
			System.out.println("impar");
			System.err.println("su saldo alctual es: " + ctabancaria.getSaldo());

		}

	}

	@Override
	public void apertura(CtaBancaria ctaBancaria) {
		this.ctabancariaRepo.insertar(ctaBancaria);
		
	}

}
