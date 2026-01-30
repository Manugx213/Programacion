/* MANUEL GARCIA GARCIA
 * 27/11/2025
 * EJERCICIO 6
 */

package GarciaManuel29;


public class Ejercicio6 {

	public static void main(String[] args) {
		
		int random = 0;
		int contadorPositivos = 0;
		int contadorNegativos = 0;
		
		for (int i = 0; i < 50; i++) {
			random = (int) (Math.random()*200) -100;
			
			if (random >= 0) {
				contadorPositivos++;
			} else {
				contadorNegativos++;
			}	
		}
		
		System.out.println("Existen " + contadorPositivos + " números positivos");
		System.out.println("Total de números : " + contadorNegativos + " números negativos");
	}
}
