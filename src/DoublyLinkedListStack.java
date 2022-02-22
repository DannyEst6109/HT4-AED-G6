/**
 * DoublyLinkedListStack
 * Objetivo: Definir la interfaz de las listas doblemente encadenadas para el stack
 * 
 * @author Carlos Martinez
 * @author Paulo Sánchez
 * @author Carlos Estrada 
 * @version 1.0 finalizado 22/02/2022
 */
public class DoublyLinkedListStack<E> extends AbstractStack<E> {
	private DoublyLinkedList<E> lista = new DoublyLinkedList<E>();
	
	
	public void push(E item) {
		lista.addLast(item);
		
	}

	public E pop() {
		// TODO Auto-generated method stub
		return lista.removeLast();
	}


	public E peek() {
		// TODO Auto-generated method stub
		return lista.getLast();
	}

	
	public int size() {
		// TODO Auto-generated method stub
		return lista.size();
	}

}
