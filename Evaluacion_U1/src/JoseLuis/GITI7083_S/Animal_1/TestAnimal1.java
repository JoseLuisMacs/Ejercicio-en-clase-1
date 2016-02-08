/**
 * 
 */
package JoseLuis.GITI7083_S.Animal_1;

import java.util.Scanner;

import JoseLuis.GITI7083_S.figuras.Circulo;
import JoseLuis.GITI7083_S.figuras.Figura;
import JoseLuis.GITI7083_S.figuras.TestFigura;

/**
 * @author Jose
 *
 */
public class TestAnimal1 {
	public void Test(){
		Animal animal;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Elige un Animal "+"\n 1.-Elefante"+"\n 2.-Leon"+"\n 3.-Pato");
	int	seleccion = scanner.nextInt();	
	
	
	switch (seleccion) {
	case 1:
		animal= new Elefante();
		break;
	case 2:
		animal= new Leon();
		break;
	case 3:
		animal= new Pato();
		break;

	default:
		break;
	}
	}


	public static void main(String[] args) {
		new TestAnimal1().Test();
	}
}
