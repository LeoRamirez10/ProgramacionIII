package com.Leo.DAO;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.leonardo.model.Productoss;

public class ProductoDao {

	public List<Productoss> productoLista() {
		
		List<Productoss> Listapr = new ArrayList<>();
		
		
		EntityManager em;
		EntityManagerFactory emf;
		emf = Persistence.createEntityManagerFactory("INICIANDO-HIBERNATE-JPA");
		em = emf.createEntityManager();
		
		try {
			
			em.getTransaction().begin();
	
			Listapr = em.createQuery("from Productoss").getResultList();
			em.getTransaction().commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);					
		}		
		return Listapr;
	}
	
	public void agregarDatos(Productoss pr) {
		
		EntityManager em;
		EntityManagerFactory emf;
		emf = Persistence.createEntityManagerFactory("INICIANDO-HIBERNATE-JPA");
		em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(pr);
		em.flush();
		em.getTransaction().commit();
				
	}
	
	public void actualizarDatos(Productoss pr) {
		EntityManager em;
		EntityManagerFactory emf;
		emf = Persistence.createEntityManagerFactory("INICIANDO-HIBERNATE-JPA");
		em = emf.createEntityManager();
		
		pr.getId();
		pr.getNombreProducto();
		pr.getPrecioProducto();
		pr.getCantidadProducto();
		pr.getTotalProducto();
		
		em.getTransaction().begin();
		em.merge(pr);
		em.flush();
		em.getTransaction().commit();
		
		
	}
	
	public void eliminarDatos(Productoss pr) {
		EntityManager em;
		EntityManagerFactory emf;
		emf = Persistence.createEntityManagerFactory("INICIANDO-HIBERNATE-JPA");
		em = emf.createEntityManager();

		em.getTransaction().begin();		
		pr=em.getReference(Productoss.class, pr.getId());
		em.remove(pr);
		em.flush();
		em.getTransaction().commit();
		
		
	}
	
}
