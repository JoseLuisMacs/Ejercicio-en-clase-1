/**
 * 
 */
package JoseLuis.GITI7083_S.Proyecto;

import java.util.Date;
import java.util.List;

/**
 * @author Jose
 *
 */
public class Proyecto {
	Maquina maquina;
	public Proyecto() {
		System.out.println("Nuevo proyecto");
		maquina= new Maquina();
	}
	/**
	 * Atributos propios de la clase
	 */
	private String nombre;
	private String planificacion;
	private Date fechaInicio;
	private Date fechaFin;
	private String descripcion;
	private String estado;
	
	/**
	 * relacion * Presupuestos
	 */
	private List<Presupuestos> presupuestos;
	
	/**
	 * relacion 1 con Maquina
	 */
	private Maquina maquinas;

	/**
	 * constructor del la clase
	 */
	public Proyecto(Presupuestos presupuestos,Maquina maquina) {
		// TODO Auto-generated constructor stub
	}

}
