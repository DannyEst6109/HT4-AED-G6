
public class DoublyLinkedNode<E> {
	protected E data;
	protected DoublyLinkedNode<E> nextElement;
	protected DoublyLinkedNode<E> previousElement;
	
	// Iniciando el constructor 
	public DoublyLinkedNode(E v,
			DoublyLinkedNode<E> next,
			DoublyLinkedNode<E> previous)
			{
			data = v;
			nextElement = next;
			if (nextElement != null)
			nextElement.previousElement = this;
			previousElement = previous;
			if (previousElement != null)
			previousElement.nextElement = this;
			}
	
	// Creando objeto nodo vacio
	public DoublyLinkedNode(E v)
	// post: constructs a single element
	{
	this(v,null,null);
	}
	
	public E value()
	// post: returns value associated with this element
	{
	return data;
	}
	
	public void setNext(DoublyLinkedNode<E> next)
	// post: sets reference to new next value
	{
	nextElement = next;
	}
	
	
	public DoublyLinkedNode<E> previous()
	// post: returns reference to next value in list
	{
	return previousElement;
	}

}
