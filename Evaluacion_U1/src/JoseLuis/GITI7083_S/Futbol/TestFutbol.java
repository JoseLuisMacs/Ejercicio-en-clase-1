/**
 * 
 */
package JoseLuis.GITI7083_S.Futbol;

import java.util.Scanner;

/**
 * @author Jose
 *
 */
public class TestFutbol {

	public void test(){
		IntegranteSeleccionFutbol integranteSeleccionFutbol;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Integrantes de la seleccion de Futbol: ");
		integranteSeleccionFutbol= new Entrenador();
		integranteSeleccionFutbol= new Masajista();
		integranteSeleccionFutbol= new futbolista();
	}
	
	
	public static void main(String[] args) {
		new TestFutbol().test();
	}
}
