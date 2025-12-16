/* MANUEL GARCIA GARCIA
 * EJERCICIO 7
 * 13/11/2025
 */

package GarciaManuel28;

import java.util.Scanner;
public class Ejercicio7 {

	
	public static void main(String[] args) {
		
		int num = 0;
		double num1 = 0;
		double numentero = 0;
		
		
		Scanner entrada = new Scanner (System.in);
		num1 = (Math.random ()*50) + 1;
		numentero = Math.round(num1);
		
		do {
			System.out.print("Introduce un número entre 0 y 50: ");
			num = entrada.nextInt();
			
			if (num > numentero) {
				System.out.println("El número que estas buscando es mas pequeño.");
			}else if (num < numentero) {
				System.out.println("El número que estas buscando es mas grande.");
			}else {
				System.out.println("\nHas acertado el número!!");
			}
	
		}while (numentero != num);
		
		
		entrada.close();
	}

}
