/**
 * 
 */
package utng.edu.mx.reevaluacion;

/**
 * @author Jose
 *
 */
public class Clente {

	public void usa(){
		IBanco banco = new IBanco() {
			
			@Override
			public void operacionesBancarias() {
				// TODO Auto-generated method stub
				
			}
		};
	}
	
	public void solicita(){
		ICredito credito = new ICredito() {

			@Override
			public void estadoCreaditicio() {
				// TODO Auto-generated method stub
				
			}
			
			
		};
	}
	
	public void verifica(){
		AVerificador verificar = new AVerificador() {
			
			@Override
		public	void getCredito() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
		public	void getBanco() {
				// TODO Auto-generated method stub
				
			}
		};
	}
	}

