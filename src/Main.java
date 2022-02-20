import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	    // llamada al factory:
		StackFactory<String> sFactory = new StackFactory<String>();
		Stack<String> miStack= sFactory.getStack("1");
		// Solicitar la implementacion deseada del Stack:
		//  AL: implementacion con ArrayList
		//  V:   implementacion con Vector
		//Creacion de scanner
		Scanner scan= new Scanner(System.in);
		/**
		 * Menu de seleccion
		 */

		int num;
		System.out.println("Biennvenidos al menú de seleccion");
		System.out.println("A continuacion le aparecerán las opciones de tipo de lista:");
		System.out.println("------------------------------------------------------------");
		System.out.println("1. Seleccionar ArrayLists")	;
		System.out.println("2.Seleccionar Vector");
		System.out.println("3. Seleccionar simplemente encadenada");
		System.out.println("4. Seleccionar doblemente encadenada");
		num= scan.nextInt();
		switch(num){
		case 1:
		miStack= sFactory.getStack("1");
		break;
		case 2:
		 miStack = sFactory.getStack("2");
		break;
		case 3:
		miStack= sFactory.getList("3");
		break;
		case 4:
		miStack= sFactory.getList("4");
		}
		
		
	    miStack.push("Adios");  //1
		miStack.push("Hola");   //2

		System.out.println(miStack.getClass());
		
	    String cadena = miStack.pop();
	    System.out.println(cadena);
		cadena = miStack.pop();
		System.out.println(cadena);
	  }
}
