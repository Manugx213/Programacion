package GarciaManuel1;

public class GarciaManuel15
{

	public static void main(String[] args) 
	
	{
		// Vamos a crear diferentes tipos de cadenas de variables
		// 1.
		
		String cadena = "Mi coche es negro";  // Una sola variable
		System.out.println ( cadena );
		
		// 2.
		
		String cadena1 = "Mi ";				 // Creamos 4 variables diferentes para sumarlas pudiendo seleccionar la que nosotros queremos utilizar
		String cadena2 = "Coche ";
		String cadena3 = "es ";
		String cadena4 = "negro ";
		System.out.println ( cadena1 + cadena2 + cadena3 + cadena4 );
		
		// 3.
		
		String cadenaconjunta = "Mi " + "coche " + "es " + "negro";		// Creamos 4 variables diferentes independitenes bajo una misma variable
		System.out.println ( cadenaconjunta );
		
		
		// 4. Suma de variables diferentes
		
		int num1 = 10;
		double num2 = 5.25;
		double resultado = num1 * num2;
		System.out.println ( cadena1 + cadena2 + cadena3 + cadena4 + " y tiene " + resultado + " caballos");
		
	}

}
