/**
 * 
 */
package JoseLuis.GITI7083_S.Proyecto;

import java.util.Scanner;

/**
 * @author Jose
 *
 */
public class TestProyecto {
	Proyecto proyecto;
	public void Test(){
		Scanner scanner = new Scanner(System.in);
		proyecto= new Proyecto();
	}
	
	public static void main(String[] args) {
		new TestProyecto().Test();
	}

}
