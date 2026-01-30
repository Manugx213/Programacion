package Matrix;

public class Matrix {
	
	// INDICA QUE NÚMERO ES MAYOR EN UNA MATRIZ //
	public static int numMayorMatriz (int[][] m1) {
		int mayor = 0;
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				if (m1[i][j] > mayor) {
					mayor = m1[i][j];
				}
			}
		}
		return mayor;
	} 
	
	// INDICA QUE NÚMERO ES MENOR EN UNA MATRIZ //
		public static int numMenorMatriz (int[][] m1) {
			int menor = m1[0][0];
			for (int i = 0; i < m1.length; i++) {
				for (int j = 0; j < m1[i].length; j++) {
					if (m1[i][j] < menor) {
						menor = m1[i][j];
					}
				}
			}
			return menor;
		} 
	
	// SUMA DOS MATRICES //
	public static int sumaMatriz (int[][] m1, int[][] m2) {
		int suma = 0;
		 for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				
				suma = m1[i][j] + m2[i][j];
				System.out.print(suma + " ");
			}
			System.out.println();
		 }
		 return suma;
	}
	
	// COMPARA VALORES //
	public static int comparaValores (int num1, int num2) {
		if (num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}
	

	public static void main(String[] args) {
		
		int[][] miMatriz1 = { { 10, 24, 4 , 30 },
							  { 8, 8, 36 , 36 }, 
							  { 3, 8, 9 , 91 } };	
		
		int[][] miMatriz2 = { { 8, 25, 1 , 6 },
				 			  { 10, 36, 0 , 47 }, 
				 			  { 19, 85, 34 , 13 } };
		
		
		System.out.println("La suma de ambas matrices es: ");
		sumaMatriz(miMatriz1, miMatriz2);
		System.out.printf("\nEl número %d es el mayor de m1. ", numMayorMatriz(miMatriz1));
		System.out.printf("\nEl número %d es el mayor de m2. ", numMayorMatriz(miMatriz2));
		System.out.printf("\nEl número %d es el menor de m1. ", numMenorMatriz(miMatriz1));
		System.out.printf("\nEl número %d es el menor de m2. ", numMenorMatriz(miMatriz2));
		System.out.printf("\nEl número %d es el mayor entre ambas matrices. ", comparaValores(numMayorMatriz(miMatriz1), numMayorMatriz(miMatriz2)));
		
	}

}
