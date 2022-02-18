

public class DoublyLinkedList<E> extends AbstractList<E> {
	protected int count;
	protected DoublyLinkedNode<E> head;
	protected DoublyLinkedNode<E> tail;
	
	// post: constructs an empty list
	{
	head = null;
	tail = null;
	count = 0;
	}
	
	// Sera usado para Push
	public void addLast(E value)
	// pre: value is not null
	// post: adds new value to tail of list
	{
	// construct new element
	tail = new DoublyLinkedNode<E>(value, null, tail);
	// fix up head
	if (head == null) head = tail;
	count++;
	}
	
	
	// Equivalente a pop en el stack
	public E removeLast()
	// pre: list is not empty
	// post: removes value from tail of list
	{
	//Assert.pre(!isEmpty(),"List is not empty.");
	DoublyLinkedNode<E> temp = tail;
	tail = tail.previous();
	if (tail == null) {
	head = null;
	} else {
	tail.setNext(null);
	}
	count--;
	return temp.value();
	}
	
	
	// Equivalente a peek en el stack
		public E getLast()
		// pre: list is not empty
		// post: removes value from tail of list
		{
		//Assert.pre(!isEmpty(),"List is not empty.");
		DoublyLinkedNode<E> temp = tail;		
		return temp.value();
		}
		
		// Sera usado para empty del Stack
		// Sera usado para size del Stack tambien
		public int size()
		// post: returns number of elements in list
		{
		return count;
		}

}
