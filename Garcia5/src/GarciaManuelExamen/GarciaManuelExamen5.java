/* MANUEL GARCIA GARCIA
 * 28-01-2026
 * EXAMEN
 */

package GarciaManuelExamen;


import java.util.Random;
public class GarciaManuelExamen5 {
	
	// CREA LA MATRIZ
	// PASANDO COMO PARAMETRO EL Nº DE FILAS, EL Nº DE COLUMNAS Y LA CANTIDAD MIN Y MAX DE RANGO.
	public static int[][] crearMatriz (int filas, int columnas, int min, int max) {
		int[][] miMatriz = new int [filas][columnas];
		for (int i = 0; i < miMatriz.length; i++) {
			for (int j = 0; j < miMatriz[i].length; j++) {
				miMatriz[i][j] = new Random().nextInt(min,max)*10;
			}
		}
		return miMatriz;
	}	
	
	// ESCRIBIR MATRIZ
	public static void escribirMatriz (int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + "  ");
			}
			System.out.println();
		}
	}
	
	// CREA UN ARRAY DE STRING 
	public static String[] crearArraySemanal () {
		String[] semana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};	
		
		for (int i = 0; i < semana.length; i++) {
				System.out.print(semana[i] + "  ");	
		}
		System.out.println();
		return semana;
	}
	
	// CREA UN ARRAY DE NOMBRES DE PERSONA
	public static String[] crearArrayPersona () {
		String[] persona = {"Juan", "José", "Pedro", "Luis"};	
		
		for (int i = 0; i < persona.length; i++) {
				System.out.print(persona[i] + "  ");	
		}
		System.out.println();
		return persona;
	}
	
	// MOSTRAMOS EL TOTAL DE PRODUCCION POR DIA 
	public static void mostrarUnidadesTotalesDia (int[][] m, String[] s) {
		
	
		for (int i = 0; i < m.length; i++) {
		
			for (int j = 0; j < m[i].length; j++) {
				
			}
		}
	}
		
	
	
	
	
	// MOSTRAMOS EL TOTAL DE PRODUCCION POR DIA
	public static void mostrarUnidadesTotalesPersona (int[][] m, String[] p) {
		
		int totalProduccion = 0;
		int totalProduccionPersona = 0;
		String persona = " ";
		for (int i = 0; i < m.length; i++) {			
			totalProduccionPersona = totalProduccion;
			for (int j = 0; j < m[i].length; j++) {	
				persona = p[i];
				totalProduccion = totalProduccion + m[i][j];
			}
			System.out.printf("\n%s ha producido un total de %d unidades.", persona, (totalProduccion - totalProduccionPersona));
		}
	}
	
	public static void main(String[] args) {
		
		// MOSTRAMOS AMBOS ARRAY Y LA MATRIZ CREADA
		String[] semana = crearArraySemanal();
		System.out.println("-----------------------------------------");
		String[] persona = crearArrayPersona();
		System.out.println("-----------------------------------------");
		int[][] matrizUnidades = crearMatriz(4, 5, 10, 30);
		escribirMatriz(matrizUnidades);
		System.out.print("-----------------------------------------");
		mostrarUnidadesTotalesPersona (matrizUnidades, persona);
		System.out.println("\n-----------------------------------------");
		mostrarUnidadesTotalesDia (matrizUnidades, semana);
		
	}	
}
