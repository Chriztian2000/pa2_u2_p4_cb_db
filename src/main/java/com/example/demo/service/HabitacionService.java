package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Habitacion;

public interface HabitacionService {
	
	public void ingresar(Habitacion habitacion);
	public void actualizar(Habitacion habitacion);
	public Habitacion consultar (Integer id);
	public void eliminar(Integer id);

	
	public Habitacion seleccionarTodos(String numero);

}
