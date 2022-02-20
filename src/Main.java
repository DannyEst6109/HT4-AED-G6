import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
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
		
		
	    miStack.push("Adios");  //1
		miStack.push("Hola");   //2

		System.out.println(miStack.getClass());
		
	    String cadena = miStack.pop();
	    System.out.println(cadena);
		cadena = miStack.pop();
		System.out.println(cadena);
		
		
		//---------------LEER EN NOTACION INFIX
		//--------------DE ARCHIVO .txt
		
		ArrayList<String> lista = new ArrayList<>();
		
		 try(FileReader fileReader = new FileReader("Prueba.txt")){
		        int caracterLeido = fileReader.read();
		        while(caracterLeido!= -1) {
		            char caracter = (char) caracterLeido;
		            String caracter1 = String.valueOf(caracter);
		            lista.add(caracter1);
		            caracterLeido = fileReader.read();
		        }
		    }catch(IOException ex){
		        System.err.println("Erorr al leer el archivo");
		        ex.printStackTrace();

		    }

		 ArrayList<String>removed = new ArrayList<>();  
		 removed.add(" ");
		 
		 lista.removeAll(removed);
		 
		 System.out.println("La operacion a realizar es la siguiente");
		 System.out.println();

		 System.out.println(lista);
		 
		 ArrayList<String> numeros = new ArrayList<>();
		 ArrayList<String> opera = new ArrayList<>();
		 
		 for(String x:lista) {
			 
			 try {
				 Double.parseDouble(x);
				 numeros.add(x);
				 
			 }catch(NumberFormatException nfe){
				 opera.add(x);
			 }
			 
		 }
		 
		 int n = opera.size();
		 
		 for (int i=1;i<=n;i+=1) {
			 String k = opera.remove(opera.size()-1);
			 numeros.add(k);
		 }
		 
		 for(String i: numeros) {
			 System.out.print(i);
		 }
		 
	  }
}
