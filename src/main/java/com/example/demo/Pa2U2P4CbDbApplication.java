package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.CtaBancaria;
import com.example.demo.service.CtaBancariaService;

@SpringBootApplication
public class Pa2U2P4CbDbApplication implements CommandLineRunner {

	@Autowired
	private CtaBancariaService ctabancariaService;
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4CbDbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		
		CtaBancaria cta1 = new CtaBancaria();
		cta1.setCedulaPropietario("1720030723");
		cta1.setEapertura(LocalDate.now());
		cta1.setEapertura(LocalDate.of(2023,6,16));
		cta1.setNumero("2205487897");
		cta1.setSaldo(new BigDecimal(500));
		cta1.setTipo("A");
		
		//this.ctabancariaService.apertura(cta1);
		this.ctabancariaService.calculo(5, cta1.getSaldo());
		
			
	}
}
