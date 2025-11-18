/* MANUEL GARCIA GARCIA
 * EJERCICIO 5
 * 11/11/2025
 */

package GarciaManuel26;

import java.util.Scanner;
public class Ejercicio5 

{

	public static void main(String[] args) 
	
	{
		String nombre;
		String apellidos;
		String ciclo;
		int nota;
		
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
		
		String resultado = "";
		
		switch (nota) {
		
		case 0, 1, 2, 3, 4 : {
			resultado= "(Insuficiente)";
			break;
		}
		
		case 5:
			resultado = "(Suficiente)";
			break;
			
		case 6:
			resultado = "(Bien)";
			break;
			
		case 7, 8: {
			resultado = "(Notable)";
			break;
		}
		
		case 9, 10: {
			resultado = "(Sobresaliente)";
			break;
		}
		}
		
		System.out.println("\nNombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Ciclo formativo: " + ciclo);
		System.out.println("Nota: " + nota + " " + resultado);
		
		programa.close();
	
	}

}
