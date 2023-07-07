package com.example.demo.biblio.repo.modelo;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "autor")
@Entity
public class Autor {

	

	@Column(name = "auto_nom")
	private String nombre;

	@Column(name = "auto_ape")
	private String apellid;

	@Id
	@GeneratedValue(generator = "seq_autor", strategy = GenerationType.SEQUENCE)
	// nombre generador secuencia nombre incremento
	@SequenceGenerator(name = "seq_autor", sequenceName = "seq_autor", allocationSize = 1)
	@Column(name = "auto_id")
	private Integer id;

	// SET represeantacion de un conjunto

	@ManyToMany(mappedBy = "autores", cascade = CascadeType.ALL)
	private Set<Libro> Libros;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellid() {
		return apellid;
	}

	public void setApellid(String apellid) {
		this.apellid = apellid;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Set<Libro> getLibros() {
		return Libros;
	}

	public void setLibros(Set<Libro> libros) {
		Libros = libros;
	}

	@Override
	public String toString() {
		return "Autor [nombre=" + nombre + ", apellid=" + apellid + ", id=" + id + ", Libros=" + Libros + "]";
	}

}
