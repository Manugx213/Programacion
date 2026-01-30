/* MANUEL GARCIA GARCIA
 * 27/11/2025
 * EJERCICIO 7
 */

package GarciaManuel29;


public class Ejercicio7 {

	public static void main(String[] args) {
		
		int random = 0;
		int contadorPositivos = 0;
		int contadorNegativos = 0;
		String positivos = "";
		String negativos = "";
		
		for (int i = 0; i < 50; i++) {
			random = (int) (Math.random()*200) -100;
			
			if (random >= 0) {
				contadorPositivos++;
				positivos = positivos + random + " ";
			} else {
				contadorNegativos++;
				negativos += random + " ";
			}	
		}
		
		System.out.println("POSITIVOS: " + positivos);
		System.out.println("NEGATIVOS: " + negativos);
		System.out.println("POSITIVOS: " + positivos + "Total de números positivos: " + contadorPositivos);
		System.out.println("NEGATIVOS: " + negativos + "Total de números negativos: " + contadorNegativos);
	}
}
