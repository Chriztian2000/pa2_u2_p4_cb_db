package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.biblio.service.IAutorService;
import com.example.demo.biblio.service.ILibroService;
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.CiudadanoService;
import com.example.demo.service.EmpleadoService;
import com.example.demo.service.EstudianteService;
import com.example.demo.service.HabitacionService;
import com.example.demo.service.HotelService;
import com.example.demo.service.MatriculaService;

@SpringBootApplication
public class Pa2U2P4CbDbApplication implements CommandLineRunner {

	@Autowired
	private HotelService hotelService;

	@Autowired
	private HabitacionService habitacionService;

	@Autowired
	private CiudadanoService ciudadanoService;

	@Autowired
	private IAutorService autorService;

	@Autowired
	private ILibroService libroService;

	@Autowired
	private MatriculaService matriculaService;

	@Autowired
	private EstudianteService estudianteService;

	@Autowired
	private EmpleadoService empleadoService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4CbDbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Estudiante estu = new Estudiante();
		estu.setApellido("Boada");
		estu.setNombre("David");
		estu.setCedula("123456789");
		estu.setPeso(70.0);
		estu.setEstablecimiento("Escuela");
		estu.setEdad(8);

		Estudiante estu1 = new Estudiante();
		estu1.setApellido("Betancourt");
		estu1.setNombre("Christian");
		estu1.setCedula("1722781000");
		estu1.setPeso(65.0);
		estu1.setEstablecimiento("Colegio");
		estu1.setEdad(25);

		// this.estudianteService.insertar(estu);
		// this.estudianteService.insertar(estu1);

		// this.estudianteService.borrarPorEdad(8);

		this.estudianteService.amodificarPorEdad("Universidad", 25);
	}
}
