package model;
import javax.persistence.Column; 
import javax.persistence.Entity; 
//import javax.persistence.Id; 
@Entity public class Arbitro extends Participante {
	@Column private int puntaje;
	//@Column private Pais pais;
	
	public int getPuntaje() {
		return puntaje;
	}
/*
	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
*/
	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
}
