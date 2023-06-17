package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Ciudadano;
import com.example.demo.repository.modelo.Empleado;
import com.example.demo.service.CiudadanoService;
import com.example.demo.service.IEmpleadoService;

@SpringBootApplication
public class Pa2U2P4CbDbApplication implements CommandLineRunner {

	@Autowired

	private CiudadanoService ciudadanoService;

	@Autowired
	private IEmpleadoService empleadoService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4CbDbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Ciudadano ciu = new Ciudadano();
		Empleado emple = new Empleado();

		ciu.setNombre("Christian");
		ciu.setApellido("Betancourt");
		ciu.setCedula("1722781000");
		// this.ciudadanoService.insertar(ciu);

		emple.setCargo("cajero");
		emple.setSueldo(new BigDecimal(2000));
		//emple.setCiudadano(ciu);

		this.empleadoService.ingresar(emple);

		Ciudadano ciu2 = new Ciudadano();

		ciu2.setApellido("Boada");
		ciu2.setNombre("David");
		ciu2.setCedula("123456789");

		//this.ciudadanoService.insertar(ciu2);

	}
}
