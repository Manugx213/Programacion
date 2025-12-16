/* MANUEL GARCIA GARCIA
 * EJERCICIO 8
 * 13/11/2025
 */

package GarciaManuel28;

import java.util.Scanner;
public class Ejercicio8 {

	public static void main(String[] args) {
		
		String nombre, apellidos, ciudad = "", ciudad1 = "", ciudadMax = "";
		int edad = 0, rutas = 0, num = 0;
		double distancia = 0, distancia1 = 0, distanciamedia = 0, distanciaMax = 0;
		
		int contador1 = 0;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Introduce tu nombre: ");
		nombre = entrada.nextLine();
		System.out.print("Introduce tus apellidos: ");
		apellidos = entrada.nextLine();
		System.out.print("Introduce tu edad: ");
		edad = entrada.nextInt();
		
		if (edad >= 17 && edad <= 45) {
			System.out.print("Número de rutas realizadas: ");
			rutas = entrada.nextInt();
		}else {
			System.out.println("\nEsa edad no es correcta.");
		}
		
		System.out.println("\nA continuación pediremos al usuario, la distancia, el número de participantes"
				+ " y la ciudad en la cual se ha hecho dicha caminata. De las últimas 5 rutas.");
		
		for ( num = 0; num < 5; num++) {
			
			
			if (num >= 0) {
			contador1++;
			
			System.out.print("\n¿Cual es la distancia de la ruta? ");
			distancia = entrada.nextDouble();	
			entrada.nextLine();
				
			distancia1 = distancia1 + distancia;
			
			System.out.print("¿En que ciudad lo has hecho? ");
			ciudad = entrada.nextLine();
			
			
			
			ciudad1 = ciudad1 += ciudad + " / ";
			
			
			}else {
				System.out.println("Eso es imposible.");
			}
			
			entrada.close();
			
			if (distancia > distanciaMax) {
				distanciaMax = distancia;
				ciudadMax = ciudad;
			}
		}
		
		
		
		distanciamedia = distancia1 / contador1;
		
		System.out.println("\n-------------------------------------------------------");
		System.out.println("Informe de " + nombre + " " + apellidos + ", " + edad + " años.");
		System.out.println("El total de rutas realizadas es de: " + rutas + " rutas");
		System.out.println("Esta es la distancia total recorrida: " + distancia1);
		System.out.println("La distancia media recorrida es de: " + distanciamedia);
		System.out.println("Estas son las ciudades donde has hecho las 5 ultimas rutas: " + ciudad1);
		System.out.println("La distancia maxima recorrida es de: " + distanciaMax);
		System.out.println("La ciudad donde has recorrido la maxima distancia es: " + ciudadMax);
		
		
	}
}
