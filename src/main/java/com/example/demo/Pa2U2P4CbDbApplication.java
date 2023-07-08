package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.biblio.service.IAutorService;
import com.example.demo.biblio.service.ILibroService;
import com.example.demo.repository.modelo.Habitacion;
import com.example.demo.repository.modelo.Hotel;
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
	
	/*
		Estudiante estu = new Estudiante();
		estu.setApellido("Boada");
		estu.setNombre("David");
		estu.setCedula("123456789");
		estu.setPeso(70.0);
		
		Estudiante estu1 = new Estudiante();
		estu1.setApellido("Betancourt");
		estu1.setNombre("Christian");
		estu1.setCedula("1722781000");
		estu1.setPeso(65.0);
		
		//this.estudianteService.insertar(estu);
		//this.estudianteService.insertar(estu1);
			
		
		System.out.println(this.estudianteService.buscarTodosDTO());
		*/
		
		/*
		Alumno alu = new Alumno();
		alu.setNombre("David");
		
		Materia mate = new Materia();
		
		mate.setNombre("programacion");

		
		Matricula matri = new Matricula();
		matri.setAlumno(alu);
		matri.setMateria(mate);
		
		
		//this.matriculaService.crear(matri);
		
		System.out.println(this.matriculaService.selecionarTodosDTO());
		
		*/
		
		
		Hotel hotel = new Hotel();
		hotel.setNombre("Mariot");
		hotel.setDireccion("Eloy Alfaro");
		
		Habitacion habi = new Habitacion();
		habi.setNumero("A1");
		habi.setValor(new BigDecimal(200));
		habi.setHotel(hotel);
		
		
		Habitacion habi1 = new Habitacion();
		habi1.setNumero("A2");
		habi1.setValor(new BigDecimal(300));
		habi1.setHotel(hotel);
		
		Habitacion habi2 = new Habitacion();
		habi2.setNumero("A3");
		habi2.setValor(new BigDecimal(400));
		habi2.setHotel(hotel);
		
		
		hotel.setHabitaciones(habi);
		hotel.setHabitaciones(habi1);
		hotel.setHabitaciones(habi2);
		
		this.hotelService.crear(hotel);
		
		
		//System.out.println(hotel.getNombre());
		//System.out.println(this.hotelService.crear(hotel));
		
		
		
		
		
	}
}
