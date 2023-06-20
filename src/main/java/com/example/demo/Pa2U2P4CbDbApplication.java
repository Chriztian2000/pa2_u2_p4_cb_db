package com.example.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Habitacion;
import com.example.demo.repository.modelo.Hotel;
import com.example.demo.service.HabitacionService;
import com.example.demo.service.HotelService;

@SpringBootApplication
public class Pa2U2P4CbDbApplication implements CommandLineRunner {

	@Autowired
	private HotelService hotelService;
	
	@Autowired
	private HabitacionService habitacionService;
	

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4CbDbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Hotel hote1 = new Hotel();
		hote1.setNombre("Necochea");
		hote1.setDireccion("Los Dos Puentes");
		
		List<Habitacion> habitaciones = new ArrayList<>();
		Habitacion habi1 = new Habitacion();
		habi1.setNumero("1A");
		habi1.setValor(new BigDecimal(100));
		habi1.setHotel(hote1);
		habitaciones.add(habi1);
		
		Habitacion habi2 = new Habitacion();
		
		habi2.setNumero("2A");
		habi2.setValor(new BigDecimal(90));
		habi2.setHotel(hote1);
		hote1.setHabitaciones(habitaciones);
		habitaciones.add(habi2);
		
		this.hotelService.actualizar(hote1);
		
		
		
		
		
		
		
	}
}
