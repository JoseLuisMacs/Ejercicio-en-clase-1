/**
 * 
 */
package JoseLuis.GITI7083_S.Factory;





/**
 *@author Jose
 *
 */
/**
 * 
 * implementa de  AbstractFactory
 *
 */
public class FactorialConcreta2 implements AbstractFactory{
	 
	ProductoB2 productoB2;
	 ProductoA2 productoA2;
	
	/**
	 * @param productoA2
	 */
	public Package crearProductoAa(){
		return null;
		
	}
	
	/**
	 * @param productoB2
	 */
	public Package crearProductoBb(){
		return null;
		
	}

	/**
	 * 
	 */
	
		// TODO Auto-generated constructor stub
	
	public FactorialConcreta2() {
		productoA2= new ProductoA2();
		productoB2= new ProductoB2();
		System.out.println("Creado en la: FactorialConcreta2");
	}

}
