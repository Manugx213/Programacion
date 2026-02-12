

package Estudiante;


// CREACION DE LA CLASE //
public class Estudiante {
	
	//ATRIBUTOS DE LA CLASE //
	public String nombre;
	public String carrera;
	public int edad;

	// CONSTRUCTOR //
	public Estudiante(String nombre, String carrera, int edad) {
		this.nombre = nombre;
		this.carrera = carrera;
		this.edad = edad;
	}
	
	// METODOS //
	// INDICA SI UN ESTUDIANTE ES MAYOR DE EDAD //
	public boolean esMayorEdad() {
		
		if (edad >= 18) {
			return true;	
		}else {
			return false;
		}
	}
	// IMPRIME EL NOMBRE DEL ESTUDIANTE, LA EDAD, Y SI ES MAYOR DE EDAD O NO //
	public void mostrarEdad() {
		if (this.esMayorEdad()) {
			System.out.printf("%s es mayor de edad, tiene %d años\n\n", this.nombre, this.edad);
		}else {
			System.out.printf("%s no es mayor de edad, tiene %d años\n\n", this.nombre, this.edad);
		}
	}
	
	// CAMBIO DE CARRERA //
	public String cambiarCarrera (String nuevaCarrera) {
		setCarrera(nuevaCarrera);
		return nuevaCarrera;
	}
	

	// GETTERS //
	public String getNombre() {
		return this.nombre;
	}
	
	public String getCarrera() {
		return this.carrera;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	// SETTERS //
	public void setNombre(String nuevoNombre) {
		this.nombre = nuevoNombre;
	}
	
	public void setCarrera(String nuevaCarrera) {
		this.carrera = nuevaCarrera;
	}
	
	public void setEdad(int nuevaEdad) {
		this.edad = nuevaEdad;
	}
 	
	
	public String toString() {
		return String.format (
				"Nombre = %s\nEdad = %d\nCarrera = %s",
					this.nombre,
					this.edad,
					this.carrera
				);
		
	}
}
	
			
