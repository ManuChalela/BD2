package model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity public class Pais {
	@Id private String nombre;
	@OneToOne
	private Seleccion nombreSeleccion;

	public Seleccion getNombreSeleccion() {
		return nombreSeleccion;
	}

	public void setNombreSeleccion(Seleccion nombreSeleccion) {
		this.nombreSeleccion = nombreSeleccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
