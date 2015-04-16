package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("BD2_git"); 
		EntityManager em = emf.createEntityManager();
		
		List<Seleccion> selecciones = new ArrayList<Seleccion>();
		em.getTransaction().begin();
		
		Grupo grupo1 = new Grupo();
		grupo1.setNombreGrupo("Grupo 1");
		
		Seleccion uruguay = new Seleccion();
		uruguay.setNombre("Uruguay");
		uruguay.setGrupo_seleccion(grupo1);
		
		
		Seleccion argentina = new Seleccion();
		argentina.setNombre("Argentina");
		argentina.setGrupo_seleccion(grupo1);
		
		Seleccion paraguay = new Seleccion();
		paraguay.setNombre("Paraguay");
		paraguay.setGrupo_seleccion(grupo1);
		
		em.persist(grupo1);
		em.flush();
		
		em.persist(uruguay);
		em.persist(argentina);
		em.persist(paraguay);
		em.getTransaction().commit();
		em.close();
		emf.close();
		
		
//		Query q = em.createQuery("Select s from Seleccion s"); 
//		List<Equipo> lista_equipos = q.getResultList(); 
//		 for(Equipo e: lista_equipos){ System.out.println(e.getNombre()); 
//		System.out.println(e.getCod()); }
	//em.getTransaction().begin(); 
//		Cliente c = new Cliente(); 
//		c.setDocumento(12); 
//		c.setApellido("Rocco"); 
//		c.setNombre("Silvia"); 
//		em.persist(c); 
//		em.getTransaction().commit(); 
//		em.close(); 	
		
		
	}

}
