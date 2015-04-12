package model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity public class Encuentro {
	@Id private String fecha;
	@Column private int golesLocatario;
	@Column private int golesVisitante;
	@Column private int timepoJuego;
	@Column private String locatario;
	@Column private Seleccion local;
	@Column private String visitante;
	private Seleccion visita;
	
	public Seleccion getLocal() {
		return local;
	}
	public void setLocal(Seleccion local) {
		this.local = local;
	}
	public Seleccion getVisita() {
		return visita;
	}
	public void setVisita(Seleccion visita) {
		this.visita = visita;
	}
	public String getLocatario() {
		return locatario;
	}
	public void setLocatario(String locatario) {
		this.locatario = locatario;
	}
	public String getVisitante() {
		return visitante;
	}
	public void setVisitante(String visitante) {
		this.visitante = visitante;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public int getGolesLocatario() {
		return golesLocatario;
	}
	public void setGolesLocatario(int golesLocatario) {
		this.golesLocatario = golesLocatario;
	}
	public int getGolesVisitante() {
		return golesVisitante;
	}
	public void setGolesVisitante(int golesVisitante) {
		this.golesVisitante = golesVisitante;
	}
	public int getTimepoJuego() {
		return timepoJuego;
	}
	public void setTimepoJuego(int timepoJuego) {
		this.timepoJuego = timepoJuego;
	}
}
