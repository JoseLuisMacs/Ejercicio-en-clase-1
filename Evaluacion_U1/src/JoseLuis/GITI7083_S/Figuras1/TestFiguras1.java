/**
 * 
 */
package JoseLuis.GITI7083_S.Figuras1;

import java.util.Scanner;

/**
 * @author Jose
 *
 */
public class TestFiguras1 {
	
	public void Test(){
		Figura figura;
		Scanner scanner= new Scanner(System.in);
		System.out.println("Elige una figura: "+"\n 1.-Circulo"+"\n 2.-Cuadrado");
		int seleccion= scanner.nextInt();
		
		
		switch (seleccion) {
		case 1:
		 figura= new Circulo();
			break;
		case 2:
			figura= new Cuadrado();

		default:
			break;
		}
	}
	public static void main(String[] args) {
		new TestFiguras1().Test();
	}

}
