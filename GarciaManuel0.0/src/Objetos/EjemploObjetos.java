package Objetos;

import java.awt.Rectangle;

public class EjemploObjetos {

	public static void main(String[] args) {
		
		Rectangle r1; //DECLARACIÓN
		
		r1 = new Rectangle();
		System.out.println(r1.toString());

		r1.x = 10;
		System.out.println(r1.toString());
		
		Rectangle r2;
		r2 = r1;
		System.out.println(r2.toString());
		
		r2.y = 5;
		System.out.println(r1.toString());
		
		r1.setLocation (5, 5);
		System.out.println(r1.toString());
		
		double dimX = r1.getX();
		System.out.println("El valor de X es: " + dimX);

	}
}
