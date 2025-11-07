

package Metodos;


public class Metodosvarios 
{

	public static void main(String[] args)
	
	{
		int num;
		boolean espar;
		
		num = 1;
		espar = par(num);
		
		System.out.println (espar);

		
	}
	
	// PAR : CALCULA SI UN VALOR ES PAR. DEVUELVE UN TIPO BOOLEAN //
	// ---------------------------------------------------------- //
	public static boolean par (int num)
	{
		boolean par;
		
		if (num%2==0) 
		{
			par = true;
		}
		
		else 
		{
			par = false;
		}
	
	return par;
	}
	
	//CALCULA SI UN NÚMERO ES IMPAR LLAMANDO AL METODO PAR CREADO ANTERIORMENTE//
	
	public static boolean impar (int num1)
	{
		
	return !par(num1);
	}
	
	// ----------- METODO FACTORIAL DE UN NUMERO -------------------//
	
}
