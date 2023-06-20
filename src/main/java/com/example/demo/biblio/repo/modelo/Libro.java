package com.example.demo.biblio.repo.modelo;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "libro")
@Entity
public class Libro {
	@GeneratedValue(generator = "seq_libro", strategy = GenerationType.SEQUENCE)
	// nombre generador secuencia nombre incremento
	@SequenceGenerator(name = "seq_libro", sequenceName = "seq_libro", allocationSize = 1)

	@Column(name = "lib_titulo")
	private String titulo;
	
	@Column(name = "lib_edito")
	private String editorial;
	
	@Id
	@Column(name = "lib_id")
	private Integer id;

	@ManyToMany
	// se empieza siempre con la relacion
	@JoinTable(name = "autor_libro", 
		joinColumns = @JoinColumn(name = "auli_id_libro"),
			inverseJoinColumns = @JoinColumn(name = "auli_id_autor"))
	private Set<Autor> autores;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Set<Autor> getAutores() {
		return autores;
	}

	public void setAutores(Set<Autor> autores) {
		this.autores = autores;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", editorial=" + editorial + ", id=" + id + ", autores=" + autores + "]";
	}

}
