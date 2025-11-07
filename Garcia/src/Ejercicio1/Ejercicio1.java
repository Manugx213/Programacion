/* MANUEL GARCÍA GARCÍA
 * EJERCICIO --> 1
 * 29/10/2025
 */

package Ejercicio1;

import java.util.Scanner;
public class Ejercicio1 

{

	public static void main(String[] args) 
	
	{
		
		double x;
		double operacion;
		
		double fuerza;
		int masa;
		double gravedad = 9.8;	 /* GRAVEDAD TIENE UN VALOR FIJO, POR LO QUE DEBERIA
									DE GUARDARSE EN UNA CONSTANTE*/
								 // NO RECUERDO COMO HACERLO
		
		double vueltas;
		double hercios;
		int segundos;
		
		double A; 				 // Area
		double PI = 3.1415;		 /* PI AL IGUAL QUE EN EL CASO DE GRAVEDAD AL TENER UN 
									VALOR FIJO, DEBERIA DE GUARDARSE EN UNA CONSTANTE*/
		double radio;
		

		Scanner programa = new Scanner (System.in);
		
		System.out.println ("CÁLCULO EXPRESIONES FÍSICAS/MATEMÁTICAS");
		System.out.println ("---------------------------------------");
		//----------------------------------------------------------------------//
		System.out.print ("Introduce el valor de X: ");
		x = programa.nextDouble();
		
		operacion = ( x + ( x / 4 )) / (6 - ( x / 2 )); // OPERACION MATEMATICA
		
		//----------------------------------------------------------------------//
		System.out.print ("Introduce la masa (kg): "); 
		masa = programa.nextInt();
		
		fuerza = masa * gravedad;  // FUERZA PESO
		
		//----------------------------------------------------------------------//
		System.out.print ("Introduce el tiempo (s): ");
		segundos = programa.nextInt();
		System.out.print ("Introduce la frecuencia (hz):");
		hercios = programa.nextDouble();
		
		vueltas = segundos * hercios; // NUMERO DE VUELTAS COMPLETAS
		
		//----------------------------------------------------------------------//
		System.out.print ("Introduce el radio del circulo (m): ");
		radio = programa.nextDouble();
		
		A = PI * ( radio * radio ); /* ÁREA DE UN CÍRCULO
									NO SE COMO ELEVAR AL CUADRADO,
									ES LA FORMA QUE PUEDO USAR PARA APROXIMARME
									LO MAXIMO AL RESULTADO*/
		
	
		System.out.println ( "" );
		System.out.println ( "RESULTADOS" );
		System.out.println ( "----------" );
		System.out.println ( "OPERACION: " + operacion );
		System.out.println ( "FUERZA_PESO: " + fuerza );
		System.out.println ( "NUMERO_VUELTAS: " + vueltas );
		System.out.println ( "AREA_CIRCULO: " + A);
		
		programa.close();
		
	}

}
