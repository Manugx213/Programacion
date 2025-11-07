/* MANUEL GARCIA GARCIA
 * EJERCICIO 1
 * 28-10-2025
 */


package GarciaManuel12;

import java.util.Scanner;
public class Ejercicio1 
{
	
	public static void main (String[] args)
	
	{
	
	String nombre;
	String apellidos;
	int edad;
	String direccion;
	double altura;
	double peso;
	
			
	 Scanner entrada = new Scanner (System.in);
	 
	 System.out.print ("¿Como te llamas? ");
	 nombre = entrada.nextLine();
	 
	 System.out.print ("¿Como son tus apellidos? ");
	 apellidos = entrada.nextLine();
	 
	 System.out.print ("¿Qué edad tienes? ");
	 edad = entrada.nextInt();
	 
	 entrada.nextLine();
	 
	 System.out.print ("¿Donde vives? ");
	 direccion = entrada.nextLine();
	 
	 System.out.print ("¿Cuanto mides? ");
	 altura = entrada.nextDouble();
	 
	 System.out.print ("¿Cuanto pesas? ");
	 peso = entrada.nextDouble();
	 
	 
	 System.out.println ("Hola " + nombre + " " + apellidos + " encantado de conocerte, tienes " 
			 			+ edad + " años " + " y vives en " + direccion + ".");
	 
	 System.out.println ("Mides " + altura + "m," + 
			 			" y pesas " + peso + "kg.");
	 
	entrada.close();
	
			
	}
}
