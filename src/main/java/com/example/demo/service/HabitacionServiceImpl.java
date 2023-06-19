package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.HabitacionRepo;
import com.example.demo.repository.modelo.Habitacion;

@Service
public class HabitacionServiceImpl implements HabitacionService {

	@Autowired
	private HabitacionRepo habitacionRepo;
	
	@Override
	public void ingresar(Habitacion habitacion) {
		
		this.habitacionRepo.insertar(habitacion);
	
	}

	@Override
	public void actualizar(Habitacion habitacion) {
		this.habitacionRepo.actualizar(habitacion);
		
	}

	@Override
	public Habitacion consultar(Integer id) {
		
		return this.habitacionRepo.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		
		this.habitacionRepo.eliminar(id);
	}

}
