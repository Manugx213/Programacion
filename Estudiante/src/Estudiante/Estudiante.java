

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
	public boolean es_mayor_de_edad() {

		if (this.edad >= 18) {
			return true;
		}else {
			return false;
		}
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
		this.nombre = nombre;
	}
	
	public void setCarrera(String nuevaCarrera) {
		this.carrera = carrera;
	}
	
	public void setEdad(int nuevaEdad) {
		this.edad = edad;
	}
 	
	
}
	
			
