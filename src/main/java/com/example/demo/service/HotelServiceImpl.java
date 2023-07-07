package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.HotelRepo;
import com.example.demo.repository.modelo.Hotel;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	private HotelRepo hotelRepo;

	@Override
	public void crear(Hotel hotel) {
		this.hotelRepo.insertar(hotel);

	}

	@Override
	public void actualizar(Hotel hotel) {
		this.hotelRepo.actualizar(hotel);

	}

	@Override
	public Hotel consultar(Integer id) {

		return this.hotelRepo.buscar(id);
	}

	@Override
	public void quitar(Integer id) {
		this.hotelRepo.eliminar(id);
	}

}
