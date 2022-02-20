
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
