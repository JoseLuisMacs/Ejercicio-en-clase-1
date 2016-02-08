/**
 * 
 */
package JoseLuis.GITI7083_S.Canino;

/**
 * @author Jose
 * 
 * 
 * clase que hereda de Canino
 */
public class Perro extends Canino{
	
	
	public Perro() {
		System.out.println("Hola Soy un Perro ");
	}
		
	/**
	 * comportamientos que hereda
	 */
		@Override
		public Package comer() {
			// TODO Auto-generated method stub
			return super.comer();
		}
		
		@Override
		public Package hacerRuido() {
		// TODO Auto-generated method stub
		return super.hacerRuido();
		}
		
		/**
		 * comportamientos propios de la clase Perro
		 */
		public void sacarPaseo(){
			
		}
		
		public void vacunar(){
			System.out.println("y estoy Vacunado");
		}

}
