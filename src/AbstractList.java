/**
 * AbstractList
 * Objetivo: Clase abstracta de las listas abstractas 
 * 
 * @author Carlos Martinez
 * @author Paulo Sánchez
 * @author Carlos Estrada 
 * @version 1.0 finalizado 22/02/2022
 */
abstract public class AbstractList<E> implements List<E> {
	public boolean empty()
	   // post: regresa true si el stack esta vacio
	   {
	      return size() == 0;
	   }
}
