/**
 * 
 */
package JoseLuis.GITI7083_S.Factory;

import java.util.List;

/**
 * @author Jose
 *
 */

	/**
	 * 
	 * implementa de  AbstractFactory
	 *
	 */
public class FactoriaConcreta1 implements AbstractFactory{
	
	ProductoA1 productoA1;
	ProductoB1 productoB1;
	
	
	
	/**
	 * metodo crearProductoA
	 */
	private static void crearProductoA(){
	
		
	}
	/**
	 * metodo package
	 * @param productoB1
	 * 
	 */
	public Package crearProductoB(){
		return null;
		
	}
	

	/**
	 * 
	 */
	public FactoriaConcreta1() {
		
		productoA1= new ProductoA1();
		productoB1= new  ProductoB1();
		System.out.println("Creado en: FactoriaConcreta1");
	}
	

}
