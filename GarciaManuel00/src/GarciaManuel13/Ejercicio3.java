/* MANUEL GARCIA GARCIA
 * EJERCICIO 3
 * 28-10-2025
 */

package GarciaManuel13;

import java.util.Scanner;
public class Ejercicio3 

{

	public static void main(String[] args) 
	
	{
		
		double num1;
		double num2;
		double x;
		
		
		Scanner programa = new Scanner (System.in);
		
		System.out.print ("Indica un numero aleatorio: ");
		num1 = programa.nextDouble();
		
		System.out.print ("Indica otro numero aleatorio: ");
		num2 = programa.nextDouble();
		
		x = num1;
		num1 = num2;
		num2 = x;
		
		
		System.out.println ("");
		
		System.out.println ("Imprime el valor del num1--> " + num1);
		System.out.println ("Imprime el valor del num2--> " + num2);
		
		programa.close();	

	}

}