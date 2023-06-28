package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import jakarta.transaction.Transactional;

@Repository

//necesita la siguiente anotacion para la conexion con la baseDatos
@Transactional
public class EstudianteRepoImpl implements EstudianteRepo {
	// public static List<Estudiante> baseDatos = new ArrayList<>();

	// permite la interaccion con la base de datos
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Estudiante estudiante) {
		this.entityManager.persist(estudiante);

	}

	@Override
	public void actualizar(Estudiante estudiante) {
		this.entityManager.merge(estudiante);

	}

	@Override
	public void eliminar(String cedula) {
		Estudiante estu = this.buscar(cedula);
		this.entityManager.remove(estu);

	}

	@Override
	public Estudiante buscar(String cedula) {

		return this.entityManager.find(Estudiante.class, cedula);
	}

	@Override
	public Estudiante seleccionarporApellido(String apellido, String nombre) {
		// SQL
		// SELECT * FROM estudiante e WHERE e.estu_apellido =
		// JPQL
		// (nombre de la clase)
		// SELECT e FROM Estudiante e WHERE e.apellido =
		Query myQuery = this.entityManager.createQuery("SELECT e FROM Estudiante  e WHERE e.apellido = :datoApellido ");
		myQuery.setParameter("datoApellido", apellido);
		myQuery.setParameter("datoNombre", nombre);
		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public List<Estudiante> seleccionarListaPorApellido(String apellido) {
		// TODO Auto-generated method stub

		Query myQuery = this.entityManager
				.createQuery("SELECT e FROM Estudiante  e WHERE e.apellido = :datoApellido AND e.nombre=:datoNombre ");

		myQuery.setParameter("datoApellido", apellido);
		return myQuery.getResultList();

	}

	@Override
	public Estudiante seleccionarporApellidoType(String apellido) {

		TypedQuery<Estudiante> myQuery = this.entityManager
				.createQuery("SELECT e FROM Estudiante  e WHERE e.apellido = :datoApellido", Estudiante.class);
		myQuery.setParameter("datoApellido", apellido);
		return myQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarporApellidoNamed(String apellido) {
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscaPorApellido",
				Estudiante.class);
		myQuery.setParameter("datoApellido", apellido);
		return myQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarporApellidoNamedQuery(String apellido) {
		Query myQuery = this.entityManager.createNamedQuery("Estudiante.buscaPorApellido");
		myQuery.setParameter("datoApellido", apellido);
		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorApellidoNativeQuery(String apellido) {

		Query myQuery = this.entityManager
				.createNativeQuery("SELECT * FROM estudiante WHERE estu_apellido = :datoApellido", Estudiante.class);
		myQuery.setParameter("datoApellido", apellido);

		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorApellidoNativeQueryNamed(String apellido) {
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorApellidoNative",
				Estudiante.class);

		myQuery.setParameter("datoApellido", apellido);
		return myQuery.getSingleResult();

	}

	@Override
	public Estudiante seleccionarporNombreNamedQuery(String nombre) {
		Query myQuery = this.entityManager.createNamedQuery("Estudiante.buscaPorNombre");
		myQuery.setParameter("datoNombre", nombre);
		return (Estudiante) myQuery.getSingleResult();
	
	}

	@Override
	public Estudiante seleccionarPorNombreNativeQueryNamed(String nombre) {
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNombreNative",
				Estudiante.class);

		myQuery.setParameter("datoNombre", nombre);
		return myQuery.getSingleResult();

	}


	
	@Override
	public Estudiante seleccionarporApellidoCriteriaApiQuery(String apellido) {
		CriteriaBuilder myBuilder = this.entityManager.getCriteriaBuilder();
		
		//1.Especificar el tipo que tiene mi query
		CriteriaQuery<Estudiante> myCriteriaQuery=myBuilder.createQuery(Estudiante.class);
		//0 Empezamos oa crear el SQL
		//2.3 Definimos el FROM (root)
		Root<Estudiante> miTablaFrom=myCriteriaQuery.from(Estudiante.class);
		//3. construir la condiciones de mi sql 
		//	las condiciones se les conoce como predicados
		//	cada condicion es un predicado
		// 	para constrir esa condicion 
		
		Predicate condicionApellido = myBuilder.equal(miTablaFrom.get("apellido"), apellido);
		
		// 4. armar todo el sql final
		myCriteriaQuery.select(miTablaFrom).where(condicionApellido);
		
		TypedQuery<Estudiante>myQueryfinal = this.entityManager.createQuery(myCriteriaQuery);
		
		
		//5. ejecucion de query lo realizamos con typedquery
		return myQueryfinal.getSingleResult();
	}

}
