package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.biblio.service.IAutorService;
import com.example.demo.biblio.service.ILibroService;
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.CiudadanoService;
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


	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4CbDbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		
		/*
		
		Matricula mtcl = new Matricula();
		Alumno alm = new Alumno();
		Materia mate = new Materia();
		
		alm.setNombre("Christian");
		mate.setNombre("ProgramacionAvanzadaII");
		
		mtcl.setAlumno(alm);
		mtcl.setMateria(mate);
		mtcl.setNumero("1");;
		
		this.matriculaService.crear(mtcl);

	
	
		
		Estudiante estu = new Estudiante();
		estu.setNombre("Valencia");
		estu.setApellido("Ruiz");
		estu.setCedula("123456789");
		
		//this.estudianteService.insertar(estu);
		
		//this.estudianteService.buscarporApellido("Ruiz");
		List <Estudiante> estu3 = this.estudianteService.reportePorApellido("Betancourt");
		for (Estudiante estudiante : estu3) {
			System.out.println(estudiante);
		}		
		this.estudianteService.reportePorApellido("Betancourt");
		
	*/
		Estudiante estu = new Estudiante();
		estu.setApellido("Sanchez");
		estu.setNombre("Pepito");
		estu.setCedula("987654321");
		estu.setJobby("beber");
		
		//this.estudianteService.insertar(estu);
		
		this.estudianteService.buscarporApellidoType("Sanchez");
		
		
		

	}
}
