package Estudiante;

public class Principal {

	public static void main(String[] args) {
		
		Estudiante estudiante1 = new Estudiante("Manuel", "Arquitectura", 32);		
		Estudiante estudiante2 = new Estudiante("Jaime", "Programador", 15);
		
		
		System.out.println(estudiante1);
		estudiante1.mostrarEdad();
		
		System.out.println(estudiante2);
		estudiante2.mostrarEdad();
		System.out.printf("La nueva carrera de %s es %s", estudiante2, estudiante2.cambiarCarrera("Psicologia"));
		
		
	}
}
