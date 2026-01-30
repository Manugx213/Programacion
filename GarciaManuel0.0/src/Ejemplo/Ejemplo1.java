package Ejemplo;


public class Ejemplo1 {

	public static void main(String[] args) {

		//int [] miArray = {5, 8 , 4};
		
		// ARRAY DE LAS TEMPERATURAS Y LOS MESES //
		int[] temperatura = new int[30];
		String [] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio"
							, "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" };
		
		int tempMax = 0;
		int tempMin = temperatura[0];
		String mesMax = "";
		String mesMin = "";
		// FOR PARA RECORRER LOS MESES //  
		for (int j = 0; j < meses.length; j++) {
			System.out.print("\n" + meses[j] + " --> ");
			int maximo = 0;
			int minimo = temperatura[0];
		// FOR PARA RECORRER LAS TEMPERATURAS //
		for (int i = 0; i < temperatura.length; i++) {
				temperatura[i] = (int)(Math.random() * 37) ;
			System.out.print(temperatura[i] + " ");
			
			// CALCULA LA TEMPERATURA MAXIMA DE CADA MES //
			if ( temperatura[i] > maximo) {
				maximo = temperatura[i];
			}
			// CALCULA LA TEMPERATURA MAXIMA ANUAL //
			if (maximo > tempMax) {
				mesMax = meses[j]; // GUARDAMOS EL MES EN EL QUE LA TEMPERATURA ES MAS ALTA //
				tempMax = maximo;
			}
			// CALCULA LA TEMPERATURA MINIMA DE CADA MES //
			if (temperatura[i] < minimo) {
				minimo = temperatura[i];
			}
			// CALCULA LA TEMPERATURA MINIMA ANUAL //
			if (minimo <= tempMin) {
				mesMin = meses[j]; // GUARDAMOS EL MES EN EL QUE LA TEMPERATURA ES MAS BAJA //
				tempMin = minimo;
			}
			}
		System.out.println("\n // La temperatura mas alta es: " + maximo );
		System.out.println(" // La temperatura mas baja es: " + minimo );
		}
		
		System.out.println("\nLa temperatura maxima anual es de " + tempMax + "ºC, en el mes de " + mesMax );
		System.out.println("La temperatura minima anual es de " + tempMin + "ºC, en el mes de " + mesMin );
	}
}
