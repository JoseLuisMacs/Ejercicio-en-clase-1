/**
 * 
 */
package JoseLuis.GITI7083_S.Acciones;

import java.util.Scanner;

/**
 * @author Jose
 *
 */
public class TestAcciones {
	
	
	public void Test(){
		AccionesHumano accionHumano;
		AccionesSeresVivos accionesSereVivos;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Elige el ser Vivo"+"\n 1.-Humano"+"\n 2.-Animal");
		int seleccion=scanner.nextInt();
		switch (seleccion) {
		case 1:
			Scanner scanner2= new Scanner(System.in);
			System.out.println("Elige al Humano "+"\n 1.-Mujer"+"\n 2.-Hombre");
			int select= scanner2.nextInt();
			switch (select) {
			case 1:
				accionHumano= new Mujer();
				
				break;
			case 2:
				accionHumano= new Hombre();
				break;

			default:
				break;
			}
			
			
			break;
		case 2:
			Scanner scanner3 = new Scanner(System.in);
			System.out.println("Elige el Animal"+"\n 1.-Perro"+"\n 2.-Gato");
			int select2 = scanner3.nextInt();
			
			switch (select2) {
			case 1:
				accionesSereVivos= new Perro();
				break;
				
			case 2:
				accionesSereVivos= new Gato();
				break;

			default:
				break;
			}

		default:
			break;
		}
		
	}
public static void main(String[] args) {
	new TestAcciones().Test();
}
}
