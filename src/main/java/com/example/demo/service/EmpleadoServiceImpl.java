package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.EmpleadoRepo;
import com.example.demo.repository.modelo.Empleado;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{
	
	@Autowired
	private EmpleadoRepo empleadoRepo;

	@Override
	public void ingresar(Empleado empleado) {
		this.empleadoRepo.insertar(empleado);
		
	}

	@Override
	public void modificar(Empleado empleado) {
		this.empleadoRepo.actualizar(empleado);
		
	}

	@Override
	public Empleado encontrar(Integer id) {
		// TODO Auto-generated method stub
		return this.empleadoRepo.buscar(id);
	}

	@Override
	public void quitar(Integer id) {
		this.empleadoRepo.eliminar(id);
		
	}
	
	
	

}
