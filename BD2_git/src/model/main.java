package model;
import java.util.List;
import java.util.ArrayList;

import javax.persistence.EntityManager; 
import javax.persistence.EntityManagerFactory; 
import javax.persistence.Persistence; 
import javax.persistence.Query;
public class main {

	public static void crearDatos(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("BD2_git"); 
		EntityManager em = emf.createEntityManager();
		
		List<Seleccion> selecciones = new ArrayList<Seleccion>();
		em.getTransaction().begin();
	
		// Creo los grupos
		Grupo grupoA = new Grupo();
		grupoA.setNombreGrupo("Grupo A");
		List<Seleccion> seleccionesA = new ArrayList<Seleccion>();
		
		Grupo grupoB = new Grupo();
		grupoB.setNombreGrupo("Grupo B");
		List<Seleccion> seleccionesB = new ArrayList<Seleccion>();
		
		Grupo grupoC = new Grupo();
		grupoC.setNombreGrupo("Grupo C");
		List<Seleccion> seleccionesC = new ArrayList<Seleccion>();
		
		// Creo las selecciones
		Seleccion seleccion1 = new Seleccion();
		seleccion1.setNombre("Uruguay");
		seleccion1.setColorCamiseta("Celeste");
		
		Seleccion seleccion2 = new Seleccion();
		seleccion2.setNombre("Argentina");
		seleccion2.setColorCamiseta("Blanca y Celeste");
		
		Seleccion seleccion3 = new Seleccion();
		seleccion3.setNombre("Brasil");
		seleccion3.setColorCamiseta("Verdeamarello");
		
		Seleccion seleccion4 = new Seleccion();
		seleccion4.setNombre("Chile");
		seleccion4.setColorCamiseta("Roja");
		
		Seleccion seleccion5 = new Seleccion();
		seleccion5.setNombre("Mexico");
		seleccion5.setColorCamiseta("Verde");
		
		Seleccion seleccion6 = new Seleccion();
		seleccion6.setNombre("Ecuador");
		seleccion6.setColorCamiseta("Amarilla");
		
		Seleccion seleccion7 = new Seleccion();
		seleccion7.setNombre("Bolivia");
		seleccion7.setColorCamiseta("Verde");
		
		Seleccion seleccion8 = new Seleccion();
		seleccion8.setNombre("Paraguay");
		seleccion8.setColorCamiseta("Rojo y Blanco");
		
		Seleccion seleccion9 = new Seleccion();
		seleccion9.setNombre("Jamaica");
		seleccion9.setColorCamiseta("Amarilla");
		
		Seleccion seleccion10 = new Seleccion();
		seleccion10.setNombre("Colombia");
		seleccion10.setColorCamiseta("Amarilla");
		
		Seleccion seleccion11 = new Seleccion();
		seleccion11.setNombre("Peru");
		seleccion11.setColorCamiseta("Blanco con Rojo");
		
		Seleccion seleccion12 = new Seleccion();
		seleccion12.setNombre("Venezuela");
		seleccion12.setColorCamiseta("Vinotinto");
		
		// Asigno las selecciones a los grupos
		seleccionesA.add(seleccion4); // Chile
		seleccionesA.add(seleccion5); // Mexico
		seleccionesA.add(seleccion6); // Ecuador
		seleccionesA.add(seleccion7); // Bolivia
		grupoA.setSelecciones(seleccionesA);
		seleccion4.setGrupo_seleccion(grupoA);
		seleccion5.setGrupo_seleccion(grupoA);
		seleccion6.setGrupo_seleccion(grupoA);
		seleccion7.setGrupo_seleccion(grupoA);
		
		seleccionesB.add(seleccion2); // Argentina
		seleccionesB.add(seleccion1); // Uruguay
		seleccionesB.add(seleccion8); // Paraguay
		seleccionesB.add(seleccion9); // Jamaica
		grupoB.setSelecciones(seleccionesB);
		seleccion2.setGrupo_seleccion(grupoB);
		seleccion1.setGrupo_seleccion(grupoB);
		seleccion8.setGrupo_seleccion(grupoB);
		seleccion9.setGrupo_seleccion(grupoB);
		
		seleccionesC.add(seleccion3); // Brasil
		seleccionesC.add(seleccion10); // Colombia
		seleccionesC.add(seleccion11); // Peru
		seleccionesC.add(seleccion12); // Venezuela
		grupoC.setSelecciones(seleccionesC);
		seleccion3.setGrupo_seleccion(grupoC);
		seleccion10.setGrupo_seleccion(grupoC);
		seleccion11.setGrupo_seleccion(grupoC);
		seleccion12.setGrupo_seleccion(grupoC);
		
		// Creo Jugadores
		Jugador jugadorUru01 = new Jugador();
		jugadorUru01.setNumero(1);
		jugadorUru01.setNombre("Fernando");
		jugadorUru01.setApellido("Muslera");
		jugadorUru01.setFechaNacimiento("01011980");
		jugadorUru01.setPasaporte("111111111");
	

		Pais pais01 = new Pais();
		pais01.setNombre("Uruguay");
		Pais pais02 = new Pais();
		pais02.setNombre("Argentina");
		Pais pais03 = new Pais();
		pais03.setNombre("Brasil");
		Pais pais04 = new Pais();
		pais04.setNombre("Chile");
		Pais pais05 = new Pais();
		pais05.setNombre("Mexico");
		Pais pais06 = new Pais();
		pais06.setNombre("Ecuador");
		Pais pais07 = new Pais();
		pais07.setNombre("Bolivia");
		Pais pais08 = new Pais();
		pais08.setNombre("Paraguay");
		Pais pais09 = new Pais();
		pais09.setNombre("Jamaica");
		Pais pais10 = new Pais();
		pais10.setNombre("Colombia");
		Pais pais11 = new Pais();
		pais11.setNombre("Peru");
		Pais pais12 = new Pais();
		pais12.setNombre("Venezuela");
		
		seleccion1.setNombrePais(pais01.getNombre());
		seleccion1.setPais(pais01);
		
		seleccion2.setNombrePais(pais02.getNombre());
		seleccion2.setPais(pais02);
		
		seleccion3.setNombrePais(pais03.getNombre());
		seleccion3.setPais(pais03);
		
		seleccion4.setNombrePais(pais04.getNombre());
		seleccion4.setPais(pais04);
		
		seleccion5.setNombrePais(pais05.getNombre());
		seleccion5.setPais(pais05);
		
		seleccion6.setNombrePais(pais06.getNombre());
		seleccion6.setPais(pais06);
		
		seleccion7.setNombrePais(pais07.getNombre());
		seleccion7.setPais(pais07);
		
		seleccion8.setNombrePais(pais08.getNombre());
		seleccion8.setPais(pais08);
		
		seleccion9.setNombrePais(pais09.getNombre());
		seleccion9.setPais(pais09);
		
		seleccion10.setNombrePais(pais10.getNombre());
		seleccion10.setPais(pais10);
		
		seleccion11.setNombrePais(pais11.getNombre());
		seleccion11.setPais(pais11);
		
		seleccion12.setNombrePais(pais12.getNombre());
		seleccion12.setPais(pais12);
		
		Encuentro encuentro1 = new Encuentro();
		encuentro1.setFecha("110615"); // Chile vs Ecuador 		
		encuentro1.setGolesLocatario(2);
		seleccion4.setGolesConvertidos(encuentro1.getGolesLocatario());
		
		encuentro1.setGolesVisitante(1);
		seleccion6.setGolesConvertidos(encuentro1.getGolesVisitante());
		
		Encuentro encuentro2 = new Encuentro();
		encuentro2.setFecha("120615"); // Mexico vs Bolivia
		encuentro2.setGolesLocatario(2);
		seleccion5.setGolesConvertidos(encuentro2.getGolesLocatario());
		encuentro2.setGolesVisitante(0);
		seleccion7.setGolesConvertidos(encuentro2.getGolesVisitante());
		
		
		Encuentro encuentro3 = new Encuentro();
		encuentro3.setFecha("130615"); // Uruguay vs Jamaica
		encuentro3.setGolesLocatario(4);
		encuentro3.setGolesVisitante(0);
		
		
	
		Encuentro encuentro4 = new Encuentro();
		encuentro4.setFecha("130615-2"); // Argentina vs Paraguay
		encuentro4.setGolesLocatario(3);
		encuentro4.setGolesVisitante(1);
		
		Encuentro encuentro5 = new Encuentro();
		encuentro5.setFecha("140615"); // Colombia vs Venezuela
		encuentro5.setGolesLocatario(3);
		encuentro5.setGolesVisitante(1);
		
		Encuentro encuentro6 = new Encuentro();
		encuentro6.setFecha("140615-2"); // Brasil vs Peru
		encuentro6.setGolesLocatario(2);
		encuentro6.setGolesVisitante(0);
		
		em.persist(grupoA);
		em.persist(grupoB);
		em.persist(grupoC);
		em.persist(seleccion1);
		em.persist(seleccion2);
		em.persist(seleccion3);
		em.persist(seleccion4);
		em.persist(seleccion5);
		em.persist(seleccion6);
		em.persist(seleccion7);
		em.persist(seleccion8);
		em.persist(seleccion9);
		em.persist(seleccion10);
		em.persist(seleccion11);
		em.persist(seleccion12);

		em.persist(jugadorUru01);
	
		em.persist(pais01);
		em.persist(pais02);
		em.persist(pais03);
		em.persist(pais04);
		em.persist(pais05);
		em.persist(pais06);
		em.persist(pais07);
		em.persist(pais08);
		em.persist(pais09);
		em.persist(pais10);
		em.persist(pais11);
		em.persist(pais12);
		
		//
		em.getTransaction().commit();
		em.close();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		crearDatos();

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