/* MANUEL GARCIA GARCIA
 * EJERCICIO 6
 * 13/11/2025
 */

package GarciaManuel28;

import java.util.Scanner;

public class Ejercicio6 
{

	public static void main(String[] args) 
	{
		int num = 0, num1 = 0;
		
		
		Scanner entrada = new Scanner (System.in);
		//System.out.println("Introduce un número entero: ");
		//num = entrada.nextInt();
		
		do {
			System.out.print("\nIntroduce un número entero: ");
			num = entrada.nextInt();
			
			if (num >= 0) {
			num1 = num * num;
			System.out.println("El valor de " + num + " elevado a su cuadrado es: " + num1);
			
			}else {
				System.out.println("El número introducido no es válido.");
			}
			
		}while ( num > 0);
		
		entrada.close();
	}

}
