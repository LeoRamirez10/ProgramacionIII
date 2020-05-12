package com.leo.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.leo.model.TbUsuariop;

public class UsuarioDao {

public List<TbUsuariop> ingresoUsuario(TbUsuariop usu){
	
	List<TbUsuariop> Usuario = new ArrayList();
	EntityManager em;
	EntityManagerFactory emf;
	emf = Persistence.createEntityManagerFactory("ProyectoLogin");
	em = emf.createEntityManager();
	
	try {
		em.getTransaction().begin();
		Usuario = em.createQuery("From TbUsuariop as u where u.usuario = '"+usu.getUsuario()+"' and u.contrasenia = '"+usu.getContrasenia()+"'").getResultList();
		
		
		em.getTransaction().commit();
		
		for (TbUsuariop datosids:Usuario) {
			
			usu.setIdUsuarios(datosids.getIdUsuarios());
			
		}
		
	} catch (Exception e) {
		// TODO: handle exception
		
		System.out.println(e+"Error");
	}

	
	
	return Usuario;
}
	
	
}
