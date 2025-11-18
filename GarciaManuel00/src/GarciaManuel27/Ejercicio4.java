/* MANUEL GARCIA GARCIA
 * EJERCICIO 4
 * 11/11/2025	
 */

package GarciaManuel27;

import java.util.Scanner;
public class Ejercicio4 

{
	public static void main (String[] args)
	
	{
		double nota1, nota2, nota3, nota4;
		
		Scanner media = new Scanner (System.in);
		
		System.out.print("Indica la nota del primer examen: ");
		nota1 = media.nextDouble();
		
		System.out.print("Indica la nota del segundo examen: ");
		nota2 = media.nextDouble();
		
		System.out.print("Indica la nota del tercer examen: ");
		nota3 = media.nextDouble();
		
		System.out.print("Indica la nota del cuarto examen: ");
		nota4 = media.nextDouble();
		
		double resultado;
		
		resultado = ( (nota1 + nota2 + nota3 + nota4) / 4 );
		
		if (resultado >= 8 ) {
			System.out.println("Su nota media es de " + resultado + ", puedes acceder a los estudios superiores");
		} else {
			System.out.println("Lo sentimos, no has superado la nota de corte.");
		}
		
		media.close();
	}
}
