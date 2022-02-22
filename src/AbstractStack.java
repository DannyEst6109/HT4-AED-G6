/**
 * AbstractStack
 * Objetivo: Definir la interfaz de los diferentes stacks
 * 
 * @author Carlos Martinez
 * @author Paulo Sánchez
 * @author Carlos Estrada 
 * @version 1.0 finalizado 22/02/2022
 */
abstract public class AbstractStack<E> 
implements Stack<E> {
	 public boolean empty()
	   // post: regresa true si el stack esta vacio
	   {
	      return size() == 0;
	   }
}
