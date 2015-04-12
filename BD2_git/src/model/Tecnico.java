package model;
import javax.persistence.Column; 
import javax.persistence.Entity; 
//import javax.persistence.Id; 

@Entity public class Tecnico extends Participante {
	@Column private String posicion;

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
}
