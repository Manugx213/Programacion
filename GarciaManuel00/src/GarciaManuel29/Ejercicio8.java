/* MANUEL GARCIA GARCIA
 * 27/11/2025
 * EJERCICIO 8
 */

package GarciaManuel29;

import java.util.Scanner;
public class Ejercicio8 {
	

	public static void main(String[] args) {
		
		int num = 0;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("El programa va a pedirte números enteros, Cuando quieras finalizar pulsa el 0.");
		
		do {
			System.out.println("Introduce un número entero: ");
			num = entrada.nextInt();
			
		} while (num != 0);
		
		entrada.close();
	}
}