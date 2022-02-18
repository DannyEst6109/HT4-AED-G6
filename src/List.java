
public interface List<E> {
	
	// Sera usado para empty del Stack
	// Sera usado para size del Stack tambien
	public int size();
	// post: returns number of elements in list
	
	// Sera el push del estack
	public void addLast(E value);
	// post: adds value to end of list
	
	// Sera el pop del stack
	public E removeLast();
	// pre: list is not empty
	// post: removes last value from list
	
	// Sera usado en stack como Peek
	public E getLast();
	// pre: list is not empty
	// post: removes last value from list
}
