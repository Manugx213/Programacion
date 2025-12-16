/*
 * 
 */
import java.time.LocalDate;
import libtarea3.CuentaBancaria;
import java.util.Scanner;
public class CuentasBancarias {


public static void main(String[] args) {

	double saldo= 0;
	double saldo1 = -200;
	LocalDate fechaHoy = LocalDate.now();
	LocalDate fechaError = LocalDate.of(2027, 9, 1);
	
	// 1.DECLARAMOS VARIABLES REFERENCIA //
	CuentaBancaria cuentaPrivada;
	CuentaBancaria cuentaConjunta;
	CuentaBancaria cuentaFamiliar;

	
	// 2.INSTANCIAMOS TRES OBJETOS DE LA CLASE CuentaBancaria //
	cuentaPrivada = new CuentaBancaria();
	cuentaConjunta = new CuentaBancaria();
	cuentaFamiliar = new CuentaBancaria();

	// 2.1 CREAMOS UNA CUENTA CON FECHA NO VÁLIDA (01/09/2027) //
	
	Scanner entrada = new Scanner (System.in);
	System.out.println("¿Cuanto dinero quieres ingresar para crear tu cuenta bancaria? ");
	saldo = entrada.nextDouble();

	if ( saldo < 0 )
	//System.out.println(cuentaPrivada);
		try {
			cuentaPrivada = new CuentaBancaria (saldo, fechaHoy);
			System.out.println("La cuenta se ha creado correctamente");
			System.out.println(cuentaPrivada);
		}catch (IllegalArgumentException ex1) {
			System.out.println("Error al crear la cuenta: " + ex1.getLocalizedMessage());
		}
	
	//System.out.println(cuentaPrivada);
		/* try {
			cuentaPrivada = new CuentaBancaria (saldo, fechaHoy);
		}catch (IllegalArgumentException ex1) {
			System.out.println("Error al crear la cuenta: " + ex1.getLocalizedMessage());
		} */

 	}
}

