/**
 * Node
 * Objetivo: Definir la interfaz de las listas simplemente encadenada a partir de la AbstractLis
 * 
 * @author Carlos Martinez
 * @author Paulo Sánchez
 * @author Carlos Estrada 
 * @version 1.0 finalizado 22/02/2022
 */
public class SinglyLinkedList<E> extends AbstractList<E>{
	protected Node<E> head;
	protected int count;
	
	public  SinglyLinkedList()
	// post: generates an empty list
	{
	head = null;
	count = 0;
	}
	
	// Sera usado para empty del Stack
	// Sera usado para size del Stack tambien
	public int size()
	// post: returns number of elements in list
	{
	return count;
	}
	
	// Sera el push del estack
	public void addLast(E value)
	// post: adds value to end of list
	{
	// location for new value
	Node<E> temp = new Node<E>(value,null);
	if (head != null)
	{
	// pointer to possible tail
	Node<E> finger = head;
	while (finger.next() != null)
	{
	finger = finger.next();
	}
	finger.setNext(temp);
	} else head = temp;
	count++;
	}

	
	// Sera el pop del stack
	public E removeLast()
	// pre: list is not empty
	// post: removes last value from list
	{
	Node<E> finger = head;
	Node<E> previous = null;
	
	while (finger.next() != null) // find end of list
	{
	previous = finger;
	finger = finger.next();
	}
	// finger is null, or points to end of list
	if (previous == null)
	{
	// has exactly one element
	head = null;
	}
	else
	{
	// pointer to last element is reset
	previous.setNext(null);
	}
	count--;
	return finger.value();
	}
	
	
	// Sera usado en stack como Peek
	public E getLast()
	// pre: list is not empty
	// post: removes last value from list
	{
	Node<E> finger = head;
	Node<E> previous = null;
	//Assert.pre(head != null,"List is not empty.");
	while (finger.next() != null) // find end of list
	{
	previous = finger;
	finger = finger.next();
	}
	return finger.value();
	}

}
