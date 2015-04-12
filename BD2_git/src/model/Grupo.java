package model;
// javax.persistence.Column; 
import java.util.List;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity public class Grupo {
 @Id 
 private String nombreGrupo;
 //@Column private int num_grupo;
 @OneToMany
 List<Seleccion> selecciones = new ArrayList<Seleccion>();


public List<Seleccion> getSelecciones() {
	return selecciones;
}

public void setSelecciones(List<Seleccion> selecciones) {
	this.selecciones = selecciones;
}

public void addSelecciones(Seleccion seleccion){
	this.selecciones.add(seleccion);
}

public String getNombreGrupo() {
	return nombreGrupo;
}

public void setNombreGrupo(String nombreGrupo) {
	this.nombreGrupo = nombreGrupo;
}
}
