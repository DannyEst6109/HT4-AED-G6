/**
 * Calculadora
 * Objetivo: Lograr operar una operaccion postfix 
 * 
 * @author Carlos Martinez
 * @author Paulo Sánchez
 * @author Carlos Estrada 
 * @version 1.0 finalizado 22/02/2022
 */
public class Calculadora {
	
	//this is a prototype for a printer-spooler class
	 //such that only one instance can ever exist
	 static boolean instance_flag = false; //true if 1 instance
	 //the constructor is privatized-
	 //but need not have any content
	 private Calculadora() { }
	//static Instance method returns one instance or null
	 static public Calculadora Instance()
	 {
	 if (! instance_flag)
	 {
	 instance_flag = true;
	 return new Calculadora(); //only callable from within
	 }
	 else
	 return null; //return no further instances
	 }
	 //-------------------------------------------
	 public void finalize()
	 {
	 instance_flag = false;
	 }



	public double calculate(String operation, double num1, double num2) {
		double calc = 0.25;
		String suma = "+";
		String resta = "-";
		String multi = "*";
		String div = "/";
		
		if (operation.equals(suma)) {
			calc = num1 + num2;
		}
		if (operation.equals(resta)) {
			calc = num1 - num2;
		}
		if(operation.equals(multi)) {
			calc = num1*num2;
		}
		if(operation.equals(div)) {
			calc = num1/num2;
		}
		return calc;
	}
}
