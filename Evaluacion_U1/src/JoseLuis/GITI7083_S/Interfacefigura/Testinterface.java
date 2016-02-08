/**
 * 
 */
package JoseLuis.GITI7083_S.Interfacefigura;

import java.util.Scanner;

/**
 * @author Jose
 *
 */
public class Testinterface implements Figura {

	
	Cuadrado cuadrado;
	Circulo circulo;
	Triangulo triangulo;
	
	public Testinterface() {
		// TODO Auto-generated constructor stub
		
	}
	
	
	public void test(){
		cuadrado= new Cuadrado();
		triangulo= new Triangulo();
		circulo= new Circulo();
		Figura figura;
		Scanner scaner = new Scanner(System.in);
		System.out.println("Teclea la figura que deceas ");
		int seleccion =scaner.nextInt();
		
		
		
		switch (seleccion) {
		case 1:
			figura= new Cuadrado();
						break;
						
		case 2:
			figura= new Circulo();
						break;

		case 3:
			figura= new Triangulo();
						break;
		default:
			break;
		}
	}
	
	
	public static void main(String[] args) {
		 new Testinterface().test();
		 
	}
}
