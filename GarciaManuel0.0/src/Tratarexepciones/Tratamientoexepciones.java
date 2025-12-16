package Tratarexepciones;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Tratamientoexepciones {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		int entero ;
		boolean error; 
		
		
		
		do {
		System.out.print("Dame un número entero: ");
		try {
			
			entero = teclado.nextInt();
			error = false;
		
		} catch (InputMismatchException ex1) { 
			System.out.println("No es un entero. Dame un entero.");
			error = true;
			entero = 0;
			teclado.nextLine();
		} catch (IllegalStateException ex2) {
			error = true;
			entero = 0;

		}
		
		
		}while ( error == true);
		
		System.out.print("El entero es:  " + entero);
		
		
		
		
		
		teclado.close();
	}

}
