/**
 * 
 */
package JoseLuis.GITI7083_S.Canino;

import java.util.Scanner;

/**
 * @author Jose
 *
 */
public class TestCanino {
	
	public void Test(){
		Animal animal;
		Perro perro;
		Scanner scanner= new Scanner(System.in);
		new Perro().vacunar();
		new Perro().dormir();
		
	
	}
	
	public static void main(String[] args) {
		new TestCanino().Test();
	}

}
