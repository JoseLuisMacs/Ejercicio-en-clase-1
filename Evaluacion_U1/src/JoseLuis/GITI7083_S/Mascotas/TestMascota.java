/**
 * 
 */
package JoseLuis.GITI7083_S.Mascotas;

import java.util.Scanner;

/**
 * @author Jose
 *
 */
public class TestMascota {

	public void Test(){
		Animal animal;
		Scanner scanner= new Scanner(System.in);
		System.out.println("Que mascota quieres"+"\n 1.-Gato"+"\n 2.-Leon"+"\n 3.-Perro");
		int selector = scanner.nextInt();
		
		
		switch (selector) {
		case 1:
			animal= new Gato();
			break;
		case 2:
			animal= new Leon();
			break;
			
		case 3:
			animal= new Perro();
			break;

		default:
			break;
		}
	}
	
	public static void main(String[] args) {
		new TestMascota().Test();
	}
}
