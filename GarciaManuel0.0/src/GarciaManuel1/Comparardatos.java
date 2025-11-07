package GarciaManuel1;


import java.util.Scanner;			// TENEMOS QUE IMPORTAR LOS PAQUETES NECESARIOS //
import java.util.regex.Matcher; 
import java.util.regex.Pattern;
public class Comparardatos 

{

	public static void main(String[] args) 
	
	{
		Scanner comprueba = new Scanner (System.in);
		
		// CREAMOS EL PATRON
		Pattern patron = Pattern.compile ("[0-9]{8}[a-zA-Z]{1}");
		
		String posibledni;
		System.out.print ( "Indice su DNI: ");
		posibledni = comprueba.nextLine();
		
		// PREPARAMOS LA CADENA DE CARACTERES PARA COMPARAR
		Matcher texto = patron.matcher(posibledni);
		
		// HACEMOS LA COMPARACION OBTENIENDO EL RESULTADO
		if (texto.matches()) 
		
			{
				System.out.println ("El formato de dni es correcto.");
			}
		
		else 
		
			{
				System.out.println ("El formato de dni no es correcto.");
			}
		
	comprueba.close();	
		
	}

}
