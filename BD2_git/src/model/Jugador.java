package model;
import javax.persistence.Column; 
import javax.persistence.Entity; 
//import javax.persistence.Id; 
import javax.persistence.ManyToOne;

@Entity public class Jugador extends Participante {
	
	@ManyToOne
	private Seleccion jugadores_seleccion;
	
	@Column private int numero;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}
