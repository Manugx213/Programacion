/* MANUEL GARCIA GARCIA
 * EJERCICIO 4
 * 13/11/2025
 */

package GarciaManuel28;

import java.util.Scanner;
public class Ejercicio4 

{

	public static void main(String[] args) 
	
	{
		int num1 = 0, num2 = 0, contador= 0;
		String positivos = "";
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("El programa consta de pedir valores enteros aleatorio.");
		System.out.println("Cuando quieras finalizar el programa pulsa el número 0.");
		System.out.print("\nIntroduce el primer número: ");
		num1 = entrada.nextInt();
		num2 = num1; // GUARDAMOS EL VALOR DE NUM1 EN NUM2
		contador = contador + 1; // CREAMOS UN CONTADOR	
		
		double media = 0;
		
		while ( num1 != 0 ) {  //CREAMOS EL BUCLE INDICANDO QUE LOS NÚMEROS TIENEN QUE SER DIFERENTES DE 0. 0 PARA EL PROGRAMA
			if (num1 >= 0) {
				positivos += num1 + " / ";  // GUARDAMOS LOS NÚMEROS INTRODUCIDOS POR EL USUARIO EN UNA VARIABLE STRING
			}
			
			contador = contador +1; // INDICAMOS AL BUCLE QUE CADA VEZ QUE SE REPITA LA OPERACION SUMARA 1 A NUESTRO CONTADOR.
			
			System.out.print("Introduce otro número: ");
			num1 = entrada.nextInt();
			
			num2 = num2 + num1; // INDICA LA SUMA DE TODOS LOS VALORES INTRODUCIDOS
			media = num2 / ( contador - 1); // INDICA LA MEDIA DE TODOS LOS VALORES INTRODUCIDOS
		}
		
		if ( num1 >= 0) {
			System.out.println("\nEstos números son positivos: " + positivos );
		}
		
		System.out.println("La cantidad de números introducidos es: " + (contador - 1)); // RESTAMOS 1 YA QUE NUESTRO CUENTA EL 0 COMO UN VALOR
		System.out.println("El resultado de la suma es: " + num2); 
		System.out.println("La media de todos los números es: " + media);
	
		entrada.close();
	}

}
