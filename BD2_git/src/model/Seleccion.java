package model;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity public class Seleccion {
	@Id 
	private String nombreSeleccion;
	
	@Column
	private String colorCamiseta;
		
	//@OneToOne
	private String nombrePais;
	
	private Pais pais;
	
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	@Column
	private int golesConvertidos;
	
	@Column
	private int golesRecibidos;
		
	@ManyToOne
	private Grupo grupo;
	
	/*
	public String getNombrePais() {
		return nombrePais;
	}
	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}
	*/
	public int getGolesConvertidos() {
		return golesConvertidos;
	}
	public void setGolesConvertidos(int golesConvertidos) {
		this.golesConvertidos = golesConvertidos;
	}
	public int getGolesRecibidos() {
		return golesRecibidos;
	}
	public void setGolesRecibidos(int golesRecibidos) {
		this.golesRecibidos = golesRecibidos;
	}
	public String getNombreSeleccion() {
		return nombreSeleccion;
	}
	public void setNombreSeleccion(String nombreSeleccion) {
		this.nombreSeleccion = nombreSeleccion;
	}
	
	
	/*public List<Jugador> getJugadores() {
		return jugadores;
	}
	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
		*/
	public String getNombrePais() {
		return nombrePais;
	}
	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}
	public Grupo getGrupo() {
		return grupo;
	}
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	@ManyToOne
	private Grupo grupo_seleccion;
	
	//
	/*@OneToMany
	 List<Jugador> jugadores = new ArrayList<Jugador>();
	*/

	public Grupo getGrupo_seleccion() {
		return grupo_seleccion;
	}
	public void setGrupo_seleccion(Grupo grupo_seleccion) {
		this.grupo_seleccion = grupo_seleccion;
	}
	public String getNombre() {
		return nombreSeleccion;
	}
	public void setNombre(String nombre) {
		this.nombreSeleccion = nombre;
	}
	public String getColorCamiseta() {
		return colorCamiseta;
	}
	public void setColorCamiseta(String colorCamiseta) {
		this.colorCamiseta = colorCamiseta;
	}
	
}
