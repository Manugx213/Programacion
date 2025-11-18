/* MANUEL GARCIA GARCIA
 * EJERCICIO 1
 * 11/11/2025
 */

package GarciaManuel27;

import java.util.Scanner;
public class Ejercicio1 

{

	public static void main(String[] args) 
	
	{
		String nombre;
		String apellidos;
		int edad;
		double salario;
		double exp;
		double proyecto;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Indique su nombre: ");
		nombre = entrada.nextLine();
		
		System.out.print("Indique sus apellidos: ");
		apellidos = entrada.nextLine();
		
		System.out.print("Indique su edad: ");
		edad = entrada.nextInt();
		
		System.out.print("Indique el salario que le gustaria cobrar: ");
		salario = entrada.nextDouble();
		
		//---------------------------------------------------------------//
		
		if ( edad > 45 || salario > 30000 ) {
			System.out.println("\nLo sentimos pero no cumple nuestro perfil.");
		} else {
			System.out.println("\nPefecto, estas entre los candidatos finales.");
			
			System.out.print("\n¿Cuantos años de experencia tienes? ");
			exp = entrada.nextDouble();
			System.out.print("¿En cuantos proyectos has trabajado en anterioridad? ");
			proyecto = entrada.nextDouble();
			
			if (exp >= 2 || proyecto >= 3) {
				System.out.println("\nEnhorabuena " + nombre + " " + apellidos+
						". Has sido contratado.");
			} else {
				System.out.println("Lo sentimos pero no cumple nuestro perfil");
			}
			
		}
		
		entrada.close();
	}

}
