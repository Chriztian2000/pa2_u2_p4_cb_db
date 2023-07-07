package com.example.demo.service;

import com.example.demo.repository.modelo.Habitacion;

public interface HabitacionService {
	
	public void ingresar(Habitacion habitacion);
	public void actualizar(Habitacion habitacion);
	public Habitacion consultar (Integer id);
	public void eliminar(Integer id);


}
