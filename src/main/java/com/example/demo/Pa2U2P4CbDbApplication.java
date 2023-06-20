package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Ciudadano;
import com.example.demo.repository.modelo.Empleado;
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

		Ciudadano ciu1 = new Ciudadano();

		ciu1.setApellido("Boada");
		ciu1.setCedula("1720030723");
		ciu1.setNombre("David");

		Empleado empl1 = new Empleado();

		empl1.setCargo("Secretario");
		empl1.setCiudadano(ciu1);
		empl1.setSueldo(new BigDecimal(500));

		ciu1.setEmpleado(empl1);

		this.ciudadanoService.insertar(ciu1);

	}
}
