/**
 * 
 */
package JoseLuis.GITI7083_S.Proyecto;

import java.util.List;

/**
 *@author Jose
 *
 */
public class Maquina {
	public Maquina() {
		System.out.println("Maquina empleado: xxxx");
	}
	/**
	 * atributos propios de la clase
	 */
	private String nombre;
	private Double importe;
	
	/**
	 * relacion * con Proyecto
	 */
	private List<Proyecto> tieneAsignadas;

	/**
	 * contructor de la clase
	 */
	public Maquina(Proyecto proyecto) {
		// TODO Auto-generated constructor stub
	}

}
