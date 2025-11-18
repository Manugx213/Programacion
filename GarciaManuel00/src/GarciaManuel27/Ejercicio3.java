/* MANUEL GARCIA GARCIA
 * EJERCICIO 3 
 * 11/11/2025
 */

package GarciaManuel27;

import java.util.Scanner;
public class Ejercicio3 

{

	public static void main(String[] args) 
	
	{
		int num;
		
		Scanner nota = new Scanner (System.in);
		
		System.out.println("Indica un numero sin decimales: ");
		num = nota.nextInt();
		
		switch (num) {
		
		case 0, 1, 2, 3, 4 :
			System.out.println("Insuficiente");
			break;
		case 5:
			System.out.println("Suficiente");
			break;
		case 6 :
			System.out.println("Bien");
			break;
		case 7, 8 :
			System.out.println("Notable");
			break;
		case 9, 10 :
			System.out.println("Sobresaliente");
			break;
		default :
			System.out.println("\nLa nota introducida es incorrecta");
		}
		
		nota.close();
	}

}
