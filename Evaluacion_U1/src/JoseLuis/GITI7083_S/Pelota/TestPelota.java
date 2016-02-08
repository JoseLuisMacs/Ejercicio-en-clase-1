/**
 * 
 */
package JoseLuis.GITI7083_S.Pelota;

import java.util.Scanner;

/**
 * @author Jose
 *
 */
public class TestPelota {
	public void Test(){
		Rebotable rebotable;
		Scanner scanner= new Scanner(System.in);
		System.out.println("Elige un Articulo: "+"\n 1.-Llanta"+"\n 2.-Pelota de Futbol");
		int seleccion= scanner.nextInt();
		
		
		switch (seleccion) {
		case 1:
			rebotable= new Llanta();
			break;
		case 2:
			rebotable= new PelotaFutbol();
			break;
		

		default:
			break;
		}
	}

	public static void main(String[] args) {
		new TestPelota().Test();
	}
}
