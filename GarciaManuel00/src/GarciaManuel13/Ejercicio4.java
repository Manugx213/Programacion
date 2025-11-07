/* MANUEL GARCIA GARCIA
 * EJERCICIO 4
 * 28-10-2025
 */

package GarciaManuel13;

import java.util.Scanner;

public class Ejercicio4 
{

	public static void main(String[] args) 
	
	{
		double num1, num2, num3;
		
		
		Scanner programa = new Scanner (System.in);
		
		System.out.print ("Introduce un numero aleatorio con decimales: ");
		num1 = programa.nextDouble();
		
		System.out.print ("Introduce tu numero preferido, pero añadiendole un decimal: ");
		num2 = programa.nextDouble();
		
		System.out.print ("Inutroduce otro numero decimal: ");
		num3 = programa.nextDouble();
		
		
		long x = Math.round(num1);		//ROUND--> Redondea al numero mas cercano hasta 0,4 al menor, desde el 0,5 hasta el siguiente entero al mayor
		double y = Math.ceil(num2);		//CEIL--> Siempre redondea al numero entero mayor
		double r = Math.floor(num3);	//FLOOR--> Siempre redondea al numero entero menor	
	
		
		
		System.out.println("\nIntroduce un numero aleatorio con decimales: " + x);
		System.out.println("Introduce un numero aleatorio con decimales: " + y);
		System.out.println("Introduce un numero aleatorio con decimales: " + r);
		
		
		programa.close();
	}

}
