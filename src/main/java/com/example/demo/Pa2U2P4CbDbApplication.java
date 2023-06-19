package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Ciudadano;
import com.example.demo.repository.modelo.Empleado;
import com.example.demo.service.CiudadanoService;
import com.example.demo.service.EmpleadoService;

@SpringBootApplication
public class Pa2U2P4CbDbApplication implements CommandLineRunner {

	@Autowired

	private CiudadanoService ciudadanoService;

	@Autowired
	private EmpleadoService empleadoService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4CbDbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Ciudadano ciudadano = new Ciudadano();
		ciudadano.setNombre("Christian");
		ciudadano.setApellido("Betancourt");
		ciudadano.setCedula("1722781000");
		
		Ciudadano ciudadano1 = new Ciudadano();
		ciudadano1.setNombre("David");
		ciudadano1.setApellido("Boada");
		ciudadano1.setCedula("123456789");
		
		Empleado empleado = new Empleado();
		empleado.setCiudadano(ciudadano1);
		empleado.setCargo("Gerente");
		empleado.setSueldo(new BigDecimal(2000));
		//ciudadano.setEmpleado(empleado);
		/*this.ciudadanoService.agregar(ciudadano);
		this.ciudadanoService.encontrar(1);
		this.ciudadanoService.borrar(2);
		this.ciudadanoService.modificar(ciudadano);*/
		this.empleadoService.ingresar(empleado);
        this.ciudadanoService.insertar(ciudadano);

	}
}
