package mx.edu.utng.asociaciones3;

import java.util.List;

public class archivoDeTarjeta {
	private String nombre;
	private List<tarjetaAnimada> asociadas;
	tarjeta [] tarjetas = new tarjeta[1];
	
	public archivoDeTarjeta(List<tarjetaAnimada> asociadas) {
		this.asociadas = asociadas;
		// TODO Auto-generated constructor stub
	}
	public void adicionar(tarjeta tarjeta){
		
	}
public void modificar(tarjeta tarjeta){
		
	}
public void eliminar(tarjeta codigo){
	
}
public void getDatos(){
	
}
public void nroRegistros(){
	
}
/**
 * @return the nombre
 */
public String getNombre() {
	return nombre;
}
/**
 * @param nombre the nombre to set
 */
public void setNombre(String nombre) {
	this.nombre = nombre;
}
/**
 * @return the asociadas
 */
public List<tarjetaAnimada> getAsociadas() {
	return asociadas;
}
/**
 * @param asociadas the asociadas to set
 */
public void setAsociadas(List<tarjetaAnimada> asociadas) {
	this.asociadas = asociadas;
}


}
