/* MANUEL GARCIA GARCIA
 * EXAMEN 2
 * 12/11/25
 */

package GarciaManuelExamen;

import java.util.Scanner;
public class GarciaManuelExamen2 
{
	public static void main (String[] args) 
	
	{
		int num, num1;
		int contador = 0;
		int num2 = 0;
	
		Scanner entrada = new Scanner (System.in);

		System.out.println("En este programa vamos a pedir valores enteros entre 1 y 100.");
		System.out.println("Cuando quieras finalizar el programa, pulsa el valor 0.");
		System.out.print("\nIndica el primer número de su elección: ");
		num = entrada.nextInt();
		num1= num;
		contador = contador +1;
		
		if ( num >= 1 || num <= 100 ) {
			while ( num != 0 ){
		
			System.out.print("Indica el número de su elección: ");
			num = entrada.nextInt();
			
			contador = contador +1; // CREAMOS UN CONTADOR PARA QUE CADA VEZ QUE SE REPITE EL BUCLE SUME 1.
			if ( num > 0 && num < 100) {
			 	
			
			num1 = num1 + num;
			num2 = num1 / (contador) ;	// RESTAMOS UNO PORQUE NOS CUENTA EL 0 COMO VALOR INTRODUCIDO.
			}
			
		}
		
		}else {
			System.out.println("El número introducido no es válido");
		}
		

		System.out.println("\nLa media aritmética de los números introducidos es: " + num2);
		
		entrada.close();
	}		
}
