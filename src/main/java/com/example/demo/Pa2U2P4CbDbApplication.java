package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.biblio.repo.modelo.Autor;
import com.example.demo.biblio.repo.modelo.Libro;
import com.example.demo.biblio.service.IAutorService;
import com.example.demo.biblio.service.ILibroService;
import com.example.demo.service.CiudadanoService;
import com.example.demo.service.HabitacionService;
import com.example.demo.service.HotelService;

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
	private ILibroService iLibroService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4CbDbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		 * Hotel hote1 = new Hotel(); hote1.setNombre("Necochea");
		 * hote1.setDireccion("Los Dos Puentes");
		 * 
		 * List<Habitacion> habitaciones = new ArrayList<>();
		 * 
		 * 
		 * 
		 * Habitacion habi1 = new Habitacion(); habi1.setNumero("1A");
		 * habi1.setValor(new BigDecimal(100)); habi1.setHotel(hote1);
		 * habitaciones.add(habi1);
		 * 
		 * Habitacion habi2 = new Habitacion(); habi2.setNumero("2A");
		 * habi2.setValor(new BigDecimal(90)); habi2.setHotel(hote1);
		 * habitaciones.add(habi2);
		 * 
		 * //agregar a la lista de habitaciones en en hotel
		 * hote1.setHabitaciones(habitaciones);
		 * 
		 * this.hotelService.actualizar(hote1);
		 */

		Set<Autor> autorSetList = new HashSet<>();

		Set<Libro> libroSetList = new HashSet<>();

		Autor autor = new Autor();

		autor.setNombre("Charles");

		autor.setApellid("Bukowsky");

		autorSetList.add(autor);

		autor.setLibros(libroSetList);

		Libro libro = new Libro();

		libro.setTitulo("historias agonicas");

		libro.setEditorial("Bermeu");

		libroSetList.add(libro);

		libro.setAutores(autorSetList);

		this.autorService.insertar(autor);

	}
}
