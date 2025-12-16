/* MANUEL GARCIA GARCIA
 * 27/11/2025
 * EJERCICIO 5
 */

package GarciaManuel29;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		double positivos = 0, negativos= 0;
		double resultado = 0;
		int contador = 0;
		
		for (int num = -50 ; num < 50; num++) {
			
			contador++;
			
			double min = Math.ceil(-50);
			double max = Math.floor(50);
			double random = Math.floor(Math.random() * (max - min + 1)) + min;
			
			if (random >0) {
				
			} else {
				
			}
			
			System.out.println("Estos números son positivos\n" + random);
			System.out.println("Estos números son negativos\n "+ random);
		}
	}
}
