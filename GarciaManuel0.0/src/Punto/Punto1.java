package Punto;

public class Punto1 {

	public static void main(String[] args) {
		
		Punto p1 = new Punto();
		Punto p3 = new Punto();
		Punto p2 = new Punto();
		
		p1.x = 5;
		p1.y = 0;
		
		p2.x = 10;
		p2.y = 10;
		
		p3.x = -3;
		p3.x = 7;
		
		System.out.println ("(" + p1.x + "," + p1.y + ")");
		System.out.println ("(" + p2.x + "," + p2.y + ")");
		System.out.println ("(" + p3.x + "," + p3.y + ")");
		
		
		System.out.println(p1.x - p3.x);
		System.out.println(p1.x * p3.x);
		System.out.println(p2.y -4);
		
		for ( int i=0; i<4; i++) {
			System.out.println(p1.x++);
		}
	}

}
