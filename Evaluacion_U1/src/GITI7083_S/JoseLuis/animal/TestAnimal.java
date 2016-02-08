/**
 * 
 */
package GITI7083_S.JoseLuis.animal;

import java.nio.channels.SeekableByteChannel;
import java.util.Scanner;

/**
 * @author Jose
 *
 */
public class TestAnimal {

	public void Test(){
		IAnimal ianimal;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Elige un animal"+"\n"+"1.-Gato"+"\n 2.-Perro");
		int seleccion = scanner.nextInt();
		
		
		switch (seleccion) {
		case 1:
			ianimal = new Gato();
			break;
			
		case 2: 
			ianimal= new Perro();

		default:
			break;
		}
	}
	
	public static void main(String[] args) {
		new TestAnimal().Test();
	}

	
	
}
