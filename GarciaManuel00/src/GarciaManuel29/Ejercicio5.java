/* MANUEL GARCIA GARCIA
 * 27/11/2025
 * EJERCICIO 5
 */

package GarciaManuel29;

import java.util.Scanner;
public class Ejercicio5 {

	    public static void main(String[] args) {
	    	
	    	Scanner entrada = new Scanner (System.in);
	    	
	    	System.out.println("Introduce un numero entero para calcular su factorial:");
	    	int num = entrada.nextInt();
	    	
	    	int factorial = 1;
	    	for ( int i = 1; i <= num; i++) {
	    		factorial = factorial * (i); 
	    	}
	    	
	    	System.out.println(factorial);
	    	
	    	entrada.close();
	    	}
	}