/* MANUEL GARCIA GARCIA
 * EJERCICIO 2
 * 28-10-2025
 */


package GarciaManuel12;

import java.util.Scanner;
public class Ejercicio2 

{

	public static void main(String[] args)
	
	{
		String nombre;
		int num;
		String estadio;
		String capitan;
		
		
		Scanner equipo = new Scanner (System.in);
		
		System.out.print ("¿Cual es el nombre del equipo? ");
		nombre = equipo.nextLine();
		
		System.out.print ("¿En que año fue fundado el equipo? ");
		num = equipo.nextInt();
		equipo.nextLine();
		
		System.out.print ("¿Cual es el nombre del estadio?");
		estadio = equipo.nextLine();
		
		
		System.out.print ("¿Como se llama vuestro capitán?");
		capitan = equipo.nextLine();
		
		
		
		System.out.println ("***************************************");
		System.out.println ("**** NOMBRE DEL EQUIPO: " + nombre + " **");
		System.out.println ("**** FUNDADO EN: " + num + " ***************");
		System.out.println ("**** ESTADIO: " + estadio + " ****************");
		System.out.println ("**** CAPITAN: " + capitan + " ****************");
		System.out.println ("***************************************");
		
		equipo.close();
	}

}
