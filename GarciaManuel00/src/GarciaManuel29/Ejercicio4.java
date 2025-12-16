/* MANUEL GARCIA GARCIA
 * 27/11/2025
 * EJERCICIO 4
 */

package GarciaManuel29;

import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		
		int num = 0;
		int num1 = 0;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Introduce un número menor que 500: ");
		num = entrada.nextInt();
		
		while (num1 <= num  ) {
			num1++;
			if (num1 <= num) {
				System.out.printf("%-10d", num1);
			}
		}
		
		entrada.close();
	}

}
