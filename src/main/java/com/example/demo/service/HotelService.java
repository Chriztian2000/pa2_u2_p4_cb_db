package com.example.demo.service;

import com.example.demo.repository.modelo.Hotel;

public interface HotelService {

	public void crear(Hotel hotel);
	public void actualizar(Hotel hotel);
	public Hotel consultar(Integer id);
	public void quitar(Integer id);
	
}
