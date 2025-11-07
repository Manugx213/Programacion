package GarciaManuel1;

public class GarciaManuel14 
{

	public static void main(String[] args) 
	{
		// Datos lógicos: true / false
		// boolean nombrevariable;
		
		// negación,igualdad, distinto, mayor que, menor que o igual que, menor o igual que, AND, OR.
		
		// NEGACION: !  --> (!false) = true
		// IGUALDAD: == --> (true == false) = false / ¿es true igual a false? = false
		// DISTINTO: != --> (true != false) = true / ¿es true diferente/distinto a false? = true
		// MAYOR QUE: > --> (9>6) = true /  ¿es 9 mayor que 6? = true
		//									¿es 6 mayor que 6? = false
		// MENOR QUE: < --> (4<6) = true / 	¿es 4 menos que 6? = true
		// MAYOR O IGUAL QUE: >= --> (6>=6) / ¿ es 6 mayor o igual que 6? = true
		// MENOR O IGUAL QUE: <= --> (7<=6) / ¿ es 7 menor o igual que 6? = false
		// OR: || --> (   true ||  false ||  true ||  false ||  false ||  false   ) = true ( con que haya uno verdadero = resultado final TRUE
		// AND: && --> (   true  &&  false  &&  true  &&  true  &&  false   ) = false ( con que haya un falso = resultado false
		
		boolean datologicoUno = true;
		boolean datologicoDos = false;
		
		
		// Comprobaciones de negacion, igualdad y distinto
		
		System.out.println(!datologicoUno); // imprimira false
		System.out.println(datologicoUno == datologicoDos); // imprimira false
		System.out.println(datologicoUno != datologicoDos); // imprimira true
		System.out.println();
		
		// comprobaciones de mayor, menor o igual que
		
		System.out.println(17 > 5); // imprimira true
		System.out.println(17 < 5); // imprimira false
		System.out.println();
		System.out.println(10 >= 10); // imprimira true
		System.out.println(5 <= 3); // imprimira false
		System.out.println();
		
		// igualdad y distinto con numeros	
		
		System.out.println(5 == 2); // imprimira false
		System.out.println(5 != 2); // imprimira true
		System.out.println();
		
		// comprobaciones de tipo OR y AND
		
		System.out.println(true || false); //imprimira true
		System.out.println(true && false); //imprimira false
	}

}
