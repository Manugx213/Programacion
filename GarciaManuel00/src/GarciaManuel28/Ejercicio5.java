/* MANUEL GARCIA GARCIA
 * EJERCICIO 5
 * 13/11/2025
 */

package GarciaManuel28;

import java.util.Scanner;
public class Ejercicio5 

{

	public static void main(String[] args) 
	
	{
		double num1 = 0;
		double contadorPositivos = 0, contadorNegativos = 0, contadorCeros = 0;
		double sumaPositivos = 0, sumaNegativos = 0;
		double mediaPositivos = 0, mediaNegativos = 0;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Este programa nos va a pedir 10 valores enteros.");
		System.out.println("Posteriormente mostraremos la media de los valores positivos y negativos introducidos.");
		System.out.println("Tambien mostrará la cantidad de 0 introducidos.");
		
		
		for (int num=0; num<10; num++ ) {
			
			
			System.out.print("Intronduce un valor entero: ");
			num1 = entrada.nextInt();
			
			if (num1>0) {
				contadorPositivos++;
				sumaPositivos = sumaPositivos + num1;
				
			}else if (num1<0) {
				contadorNegativos++;
				sumaNegativos = sumaNegativos + num1;
				
			}else {
				contadorCeros++;
			}
		}
		
			
		mediaPositivos = sumaPositivos / contadorPositivos;
		mediaNegativos = sumaNegativos / contadorNegativos;
		
		System.out.println("\nLa media de los números positivos es: " + mediaPositivos);
		System.out.println("La media de los números negativos es: " + mediaNegativos);
		System.out.println("La cantidad de ceros introducida es de: " + contadorCeros);
		
		entrada.close();
	}

}
