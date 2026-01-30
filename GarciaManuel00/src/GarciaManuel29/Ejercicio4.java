/* MANUEL GARCIA GARCIA
 * 27/11/2025
 * EJERCICIO 4
 */

package GarciaManuel29;

import java.util.Scanner;
public class Ejercicio4 {
	
	

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner (System.in);
		
		int num = 0;
		
		System.out.print("Introduce un número menor que 500: ");
		num = entrada.nextInt();
		
		
		contador(num);
		
		entrada.close();
	}
	
	
	public static void contador (int num) {
		int num1 = 0;
		while (num1 <= num  ) {
			num1++;
			if (num1 <= num) {
				System.out.printf("%-5d", num1);
			}
		}
	}
}

