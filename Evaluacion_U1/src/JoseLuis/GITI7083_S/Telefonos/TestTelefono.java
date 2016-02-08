/**
 * 
 */
package JoseLuis.GITI7083_S.Telefonos;

import java.util.Scanner;

/**
 * @author Jose
 *
 */
public class TestTelefono {
	
	public void Test(){
		Telefono telefono;
		VideoPlayer videoPlayer;
	Scanner scanner= new Scanner(System.in);
	System.out.println("Elige el Telefono"+"\n 1.- Telefono Fijo"+"\n 2.-Telefono Movil"+"\n 3.-VideoPlayer");
	int seleccion= scanner.nextInt();
	
	
	switch (seleccion) {
	case 1:	
		telefono= new TelefonoFijo();
		break;
	case 2:
		telefono= new TelefonoMovil();
		break;
	case 3:
		videoPlayer= new VideoTelefono();
		break;
	

	default:
		break;
	}
	}
	
	public static void main(String[] args) {
		new TestTelefono().Test();
	}

}
