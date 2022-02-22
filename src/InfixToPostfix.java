/**
 * InfixtToPostfix
 * Objetivo: Traductor de expresion postfix a infix
 * 
 * @author Carlos Martinez
 * @author Paulo Sánchez
 * @author Carlos Estrada 
 * @version 1.0 finalizado 22/02/2022
 */
import java.util.Stack;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class InfixToPostfix {
	//Metodo para leer 
	public String Leer() {
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
		 
		 String infix = "";
		 
		 for(String x: lista) {
			 infix += x;
		 }
		 
		 return infix;
	}

    static int precedence(char c){
        switch (c){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public String infixToPostFix(String expression){

        String result = "";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i <expression.length() ; i++) {
            char c = expression.charAt(i);

            //check if char is operator
            if(precedence(c)>0){
                while(stack.isEmpty()==false && precedence(stack.peek())>=precedence(c)){
                    result += stack.pop();
                }
                stack.push(c);
            }else if(c==')'){
                char x = stack.pop();
                while(x!='('){
                    result += x;
                    x = stack.pop();
                }
            }else if(c=='('){
                stack.push(c);
            }else{
                //character is neither operator nor ( 
                result += c;
            }
        }
        for (int i = 0; i <=stack.size() ; i++) {
            result += stack.pop();
        }
        return result;
    }
}
