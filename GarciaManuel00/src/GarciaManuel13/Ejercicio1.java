/* MANUEL GARCIA GARCIA
 * EJERCICIO 1
 * 28-10-2025
 */

package GarciaManuel13;

import java.util.Scanner;
public class Ejercicio1 

{

	public static void main(String[] args) 
	
	{
		String nombre;
		String apellidos;
		int fecha;
		double salario;
		int años;

		
	
		Scanner trabajo = new Scanner (System.in);
		
		System.out.print ("Indique su nombre: ");
		nombre = trabajo.nextLine();
		
		System.out.print ("Indique sus apellidos: ");
		apellidos = trabajo.nextLine();
		
		System.out.print ("Indique su fecha de nacimiento: ");
		fecha = trabajo.nextInt();
		
		System.out.print ("Indique su salario: ");
		salario = trabajo.nextDouble();
		
		System.out.print ("Indique su antiguedad en la empresa: ");
		años = trabajo.nextInt();
		
		
		double neto = salario * 0.85;
		double aumento = neto * 0.02;
		double total = neto + (aumento * años);
		
		
		
		System.out.println ("");
		System.out.println ("Estimad@ " + nombre + " " + apellidos + ", nacido en el año " + fecha + ", su salario bruto es," + salario +
							"\nteniendo en cuenta un IRPF del 15% su salario neto es " + neto + "€.");
		
		System.out.println ("Debido a sus " + años + " años trabajando en la empresa su salario " + 
							"\nse incrementará en un 2% por cada año. El aumento es de " + aumento + "€" +
							"\ny el salario total es " + total + "€");

		trabajo.close();
						

		

	}

}
