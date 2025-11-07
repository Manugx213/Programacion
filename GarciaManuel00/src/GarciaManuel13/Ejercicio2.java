/* MANUEL GARCIA GARCIA
 * EJERCICIO 2
 * 28-10-2025
 */

package GarciaManuel13;

import java.util.Scanner;
public class Ejercicio2 

{

	public static void main(String[] args) 
	
	{
		
		
		double euro, peseta;
		
		
		
		double euro1 = 1;
		double peseta1 = 166386;
		double peseta2 = euro1 * peseta1;
		
		
		
		
		System.out.println ("CONVERSOR DE EUROS A PESETAS");
		
		Scanner conversor = new Scanner (System.in);
		
		System.out.print ("Indique la cantidad de euros: ");
		euro = conversor.nextDouble();
		
		double pesetas = euro * peseta2;
		
		System.out.println (euro + " € es igual a " + pesetas + " pesetas");
		
		
		System.out.println ("");
		
		
		System.out.println ("CONVERSOR DE PESETAS A EUROS");
		
		System.out.print ("Indique la cantidad de pesetas: ");
		peseta = conversor.nextDouble();
		
		double euros = peseta / peseta1;
		
		System.out.println (peseta + " pesetas, es igual a " + euros + " €");
		
		
		conversor.close();
		
	}

}
