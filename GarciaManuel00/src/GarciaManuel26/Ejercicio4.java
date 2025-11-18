/* MANUEL GARCIA GARCIA
 * EJERCICIO 4
 * 5/11/2025
 */

package GarciaManuel26;


import java.util.Scanner;
public class Ejercicio4

{

	public static void main(String[] args) 
	
	{
		String nombre, apellidos;
		double impor1, impor2, impor3, impor4;
		
		Scanner programa = new Scanner (System.in);
		
		System.out.print("Indica su nombre: ");
		nombre = programa.nextLine();
		
		System.out.print("Indica sus apellidos: ");
		apellidos = programa.nextLine();
		
		System.out.println("----------------------------------------------------");
		System.out.println("Veamos si cumple los requisitos para conseguir el vale descuento.");
		
		System.out.print("\nIndica el primer importe gastado en nuestra tienda: ");
		impor1 = programa.nextDouble();
		
		System.out.print("Indica el segundo importe gastado en nuestra tienda: ");
		impor2 = programa.nextDouble();
		
		System.out.print("Indica el tercer importe gastado en nuestra tienda: ");
		impor3 = programa.nextDouble();
		
		System.out.print("Indica el cuarto importe gastado en nuestra tienda: ");
		impor4 = programa.nextDouble();
		
		System.out.println("-----------------------------------------------------");
		 
		// ------------------------------------------------------------------------//
		
		double total = ( impor1 + impor2 + impor3 + impor4 );
		double media = ( total / 4 );
		
		if ( total >= 300 ) {
			System.out.println("Nombre: " + nombre);
			System.out.println("Apellidos: " + apellidos);
			System.out.println("Importe 1: " + impor1);
			System.out.println("Importe 2: " + impor2);
			System.out.println("Importe 3: " + impor3);
			System.out.println("Importe 4: " + impor4);
			System.out.println("");
			System.out.println("Importe medio gastado: " + media);
			System.out.println("");
			System.out.println("ENHORABUENA!!! HAS GANADO UN DESCUENTO DE 50 EUROS EN SU PROXIMA COMPRA.");
		} else {
			System.out.println("Nombre: " + nombre);
			System.out.println("Apellidos: " + apellidos);
			System.out.println("Importe 1: " + impor1);
			System.out.println("Importe 2: " + impor2);
			System.out.println("Importe 3: " + impor3);
			System.out.println("Importe 4: " + impor4);
			System.out.println("");
			System.out.println("Importe medio gastado: " + media);
			System.out.println("");
			System.out.println("Lo sentimos, no has alcanzao los 300 euros este mes, no dispone de ningun descuento.");
		}
		
		programa.close();
	}

}
