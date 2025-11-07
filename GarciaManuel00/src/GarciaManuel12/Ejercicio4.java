/* MANUEL GARCIA GARCIA
 * EJERCICIO 1
 * 28-10-2025
 */


package GarciaManuel12;

public class Ejercicio4 

{
	public enum  medidas { Pequeña, Mediana, Grande, Extragrande } // DECLARAMOS EL ENUM
	
	public static void main(String[] args) 
	
	{
		
		medidas S = medidas.Pequeña;	// ASIGNAMOS UNA VARIABLE A CADA TIPO ENUM
		medidas M = medidas.Mediana;
		medidas L = medidas.Grande;
		medidas XL = medidas.Extragrande;
		
		
		System.out.println ("TIPOS DE MEDIDAS");
		System.out.println ("----------------");
		
		System.out.println ("Talla S --> " + S );
		
		System.out.println ("Talla M --> " + M );
		
		System.out.println ("Talla L --> " + L );
		
		System.out.println ("Talla XL --> " + XL );
		
	}

}
