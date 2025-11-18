package GarciaManuel1;

import java.util.Scanner;
public class pruebawhile 

{

	public static void main(String[] args) 
	
	{
		int in, fin, num ;
	
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Introduce el inicio: ");
		in = teclado.nextInt();
		
		System.out.print("Introduce el final: ");
		fin = teclado.nextInt();
		
		num = in;
		
		System.out.println("Secuencia de numeros desde " + in + " hasta " + fin);
		
		if (num <= fin) {
		while ( num <= fin) {
			System.out.print(num + " ");
			num++;
			}
		} else {
			while ( num >= fin) {
				System.out.print(num + " ");
				num--;
				}
		}
		
		teclado.close();
	}

}
