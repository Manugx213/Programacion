package GarciaManuel1;

import java.util.Scanner;
public class GarciaManuel16 
{
	public static void main (String[] args) 
	
	{
		// System.out.println ();     IMPRIMIMOS CON UN SALTO DE LINEA YA QUE "ln" significa linea
		// System.out.print ();	   IMPRIMIMOS SIN NINGUN SALTO DE LINEA
		 
		// Vamos a llevar a cabo la recogida de diferentes datos
		
		int entero = 0;
		double real = 0.0;
		char caracter = ' ';
		String cadena = " ";
		boolean logico = true;
		
		
		Scanner entrada = new Scanner (System.in);
		
		// Numero entero
		System.out.print ("Introduzca un número entero: ");
		entero = entrada.nextInt();
		
		// Numero real
		System.out.print ("Introduzca un número real: ");
		real = entrada.nextDouble();
		
		// Caracter
		System.out.print ("Introduzca un caracter: ");
		caracter = entrada.next().charAt(0);
		
		// Cadena
		System.out.print ("Introduce un string: ");
		entrada.nextLine();    		// IMPORTANTE LLAMAR AL CARRO PARA QUE FUNCIONES. SI NO DA ERROR
		cadena = entrada.nextLine();
		
		
		System.out.print ("Introzuca un booleano: ");
		logico = entrada.nextBoolean();
		
		System.out.println (entero);
		System.out.println (real);
		System.out.println (caracter);
		System.out.println (cadena);
		System.out.println (logico);
		
		entrada.close();
	}
}
