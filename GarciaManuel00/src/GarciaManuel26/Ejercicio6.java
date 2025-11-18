/* MANUEL GARCIA GARCIA
 * EJERCICIO 6
 * 11/11/2025
 */

package GarciaManuel26;

import java.util.Scanner;
public class Ejercicio6

{

	public static void main(String[] args) 
	
	{
		String nombre;
		String apellidos;
		String ciclo;
		int nota;
		String resultado = "";
		
		Scanner programa = new Scanner (System.in);
		
		System.out.print("Indique su nombre: ");
		nombre = programa.nextLine();
		
		System.out.print("Indique sus apellidos: ");
		apellidos = programa.nextLine();
		
		System.out.print("Indique el ciclo formativo que estas cursando: ");
		ciclo = programa.nextLine();
		
		System.out.print("Indique la nota obtenida en el curso: ");
		nota = programa.nextInt();
		
		//-----------------------------------------------------------------//
		
		if (nota > 10 || nota < 0 ) {
			System.out.println("La nota académica indicada es incorrecta.");
		}	else if ( nota == 0 || nota == 1 || nota == 2 || nota == 3 || nota == 4) { 
			resultado = "Insuficiente";
		}	else if ( nota == 5 ) {
			resultado = "Suficiente";
		}	else if ( nota == 6 ) {
			resultado = "Bien";
		}	else if ( nota == 7 || nota == 8 ) {
			resultado = "Notable";
		}	else if ( nota == 9 ) {
			resultado = "Sobresaliente";
		}	else if ( nota == 10) {
			resultado = ("MATRICULA DE HONOR!!!");
		} 
			
			
		
		//-----------------------------------------------------------------//
		
		System.out.println("\nNombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Ciclo formativo: " + ciclo);
		System.out.println("Nota: " + nota + " --> " + resultado);
		
		programa.close();
	}
}
