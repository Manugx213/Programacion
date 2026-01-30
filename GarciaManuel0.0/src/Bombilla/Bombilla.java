package Bombilla;

public class Bombilla {
	
	// ATRIBUTOS CONSTANTES DE CLASE // 
	public static final boolean DEFAULT_ESTADO_INICIAL = false;
	
	// ATRIBUTOS DE CLASE //
	private static int bombillasCreadas = 0;
	private static int bombillasEncendidas = 0;
	
	// ATRIBUTOS DE OBJETO //
	private boolean estado;
	private int vecesEncendida; 
	
	
	// ------------------------------------------------------------- //
	public Bombilla() {
		this(DEFAULT_ESTADO_INICIAL);
	}
	
	// COMPRUEBA SI LA BOMBILLA ESTA ENCENDIDA O APAGADA // 
	public Bombilla(boolean estado) {
		this.estado = estado;
		if(estado) {
			vecesEncendida = 1;
			bombillasEncendidas++;
		}else {
			vecesEncendida = 0;
		}
		bombillasCreadas++;
	}
	
	// -------------------------- GETTERS -------------------------------//
	
	public boolean getestado() {
		return this.estado;
	}
	
	public boolean getencendida() {
		return this.estado;
	}
	
	public boolean getapagada() {
		return this.estado;
	}
	
	public int getvecesEncendida() {
		return this.vecesEncendida;
	}
	
	public static int getbombillasCreadas() {
		return Bombilla.bombillasCreadas;
	}
	
	public static int getbombillasencendidas() {
		return Bombilla.bombillasEncendidas;
	}
	

	// ----------------------------- METODOS ----------------------------//
	public void encender() {
		if (estado) {
			estado = true;
			bombillasEncendidas++;
		}
	}
	
	public void apagar() {
		if (estado) {
			estado = false;
			bombillasEncendidas--;
		}
	}
	
	//                             MAIN                            //
	
	public static void main(String[] args) {
		
		Bombilla b1= new Bombilla ();
		Bombilla b2= new Bombilla (true);
		
		b1.encender();
		b2.apagar();
		
        System.out.println("Bombillas creadas: " + Bombilla.getbombillasCreadas());
        System.out.println("Bombillas encendidas: " + Bombilla.getbombillasencendidas());
        System.out.println("Veces encendida b1: " + b1.getvecesEncendida());
		
	}

	
	public String toString() {
		return "Bombilla [estado=" + estado + ", vecesEncendida=" + vecesEncendida + "]";
	}
	

	
	
	
}
