import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	    // llamada al factory:
		StackFactory<Double> sFactory = new StackFactory<Double>();
		Stack<Double> miStack= sFactory.getStack("1");
		// Solicitar la implementacion deseada del Stack:
		//  AL: implementacion con ArrayList
		//  V:   implementacion con Vector
		//Creacion de scanner
		Scanner scan= new Scanner(System.in);
		/**
		 * Menu de seleccion
		 */

		int num;
		System.out.println("Biennvenidos al menu de seleccion");
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
		
		
		// Metodos de conversion de infix a postfix
		InfixToPostfix infix = new InfixToPostfix();
		
		// Recibe un infix y lo lee de un archivo .txt
		String Infix = infix.Leer();
		// Convierte la operacion de infix a postfix
		String postfix = infix.infixToPostFix(Infix);
		
		System.out.println("Infix Expression: " + Infix);
        System.out.println("Postfix Expression: " + postfix);
        
        ArrayList<String> lista = new ArrayList<String>();
        for (int n = 0; n < postfix.length(); n ++) { 
        	char c = postfix.charAt (n);
        	String charToString = String.valueOf(c);
        	
        	lista.add(charToString);
        	
        	//System.out.println (c); }
        }
        
        
        System.out.println("");
		
        
        // Calculadora
        Calculadora calculadora, calculadora1;
        //open one spooler--this should always work
        System.out.println("Creando una calculadora");
        calculadora = Calculadora.Instance();
        if(calculadora != null)
        	 System.out.println("Se creo exitosamente");
        	 //try to open another spooler --should fail
    	 System.out.println("Intentando crear otra calculadora");
    	 calculadora1 = Calculadora.Instance();
    	 
    	 if(calculadora1 == null)
    		 System.out.println("No hay instancias disponibles");
    	 
    	 for (String x : lista) {
			 
			 try {
				 double digito = Double.parseDouble(x);
				 miStack.push(digito); //push
				 //System.out.print(digito);
				 
			 }catch(NumberFormatException nfe){
				 double num2 = miStack.pop();
				 //System.out.print(num1);
				 double num1 = miStack.pop();
				 //System.out.print(num2);
				 //System.out.print(x);
				 double numero = calculadora.calculate(x, num1, num2);
				 //System.out.print(num);
				 miStack.push(numero);				 
			 }
		 }
		 
		 System.out.print(miStack.peek());
        	 
        
		 
	  }
}
