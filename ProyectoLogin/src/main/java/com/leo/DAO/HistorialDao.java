package com.leo.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.leo.model.TbHistorial;


public class HistorialDao {

public void agregarDatosHistorial(TbHistorial his) {
		
		EntityManager em;
		EntityManagerFactory emf;
		emf = Persistence.createEntityManagerFactory("ProyectoLogin");
		em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(his);
		em.flush();
		em.getTransaction().commit();
				
	}

public List<Object> hitorial() {
	List<Object> HISTO= new ArrayList();
	
	EntityManager em;
	EntityManagerFactory emf;
	emf = Persistence.createEntityManagerFactory("ProyectoLogin");
	em = emf.createEntityManager();
	
	try {
		em.getTransaction().begin();
		HISTO = em.createQuery("SELECT his.idHistorial, his.tbUsuariop.idUsuarios, his.fecha,"
				+ "usu.nombre_usuario, usu.apellido_usuario"
				+ " FROM TbHistorial AS his"
				+ " INNER JOIN TbUsuariop AS usu ON usu.idUsuarios =  his.tbUsuariop.idUsuarios ").getResultList();
		em.getTransaction().commit();
		
	} catch (Exception e) {
		// TODO: handle exception
System.out.println(e+"Error");
	}
	
	return HISTO;
	
}

}
