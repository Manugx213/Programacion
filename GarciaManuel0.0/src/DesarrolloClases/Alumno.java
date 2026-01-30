package DesarrolloClases;

import java.time.*;

public class Alumno {

	// ATRIBUTO DE CLASE CONSTANTES //
	public static final int MAX_ALUMNOS = 100000;
	public static final byte MAX_ALUM_GRUPO = 50;
	public static final byte MIN_ALUM_GRUPO = 10;
	public static final LocalTime HORA_MAXIMA_CENTRO;
	
	// ATRIBUTO DE CLASE VARIABLES //
	enum ingles { a1, a2, b1, b2, c1, c2 };
	private static boolean NIVEL_INGLES;
	private static short numAlumnos;
	
	// ATRIBUTO DE OBJETO CONSTANTE //
	private final String dni;
	private final LocalTime HORA_MAX_CENTRO_X_ALUMNO;
	
	// ATRIBUTO DE OBJETO VARIABLE //
	private String nombre;
	private String apellidos;
	private LocalDate fecha_nacimiento;
	private float peso;
	private float altura;
	private boolean mayorEdad;
	private byte numHermanos;
	
	
}
