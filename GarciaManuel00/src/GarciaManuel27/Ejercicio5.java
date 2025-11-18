/* MANUEL GARCIA GARCIA
 * EJERCICIO 5
 * 11/11/2025
 */

package GarciaManuel27;

import java.util.Scanner;
public class Ejercicio5 

{

	public static void main(String[] args) 
	
	{
		double num1, num2;
		int operador;
		
		
		Scanner calculadora = new Scanner (System.in);
		
		System.out.print("Introduzca un número: ");
		num1 = calculadora.nextDouble();
		
		System.out.print("Introzuca otro número: ");
		num2 = calculadora.nextDouble();
		
		double resultadototal = 0;
		
		System.out.println("Indique que quiere realizar (Inserte un número):" +
							"\n(1) SUMA" + 
							"\n(2) RESTA" +
							"\n(3) MULTIPLICACIÓN" +
							"\n(4) DIVISIÓN");
		System.out.println("\nOpcion: ");
		operador = calculadora.nextInt();
		
		switch (operador) {
		
		case 1: resultadototal = num1 + num2;
		break;
		
		case 2: resultadototal = num1 - num2;
		break;
		
		case 3: resultadototal = num1 * num2;
		break;
		
		case 4: resultadototal = num1 / num2;
		break;
		
		default : System.out.println("\nNo hay mas opciones disponibles.");
		
		}
		 
		System.out.println("--------------------------------------------");
		System.out.println("Resultado de la operacion: " + resultadototal);
		
		calculadora.close();
	}

}
