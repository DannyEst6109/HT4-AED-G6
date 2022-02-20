
class StackFactory<E> {
	public Stack<E> getStack(String entry) {
	    // seleccion de la implementacion a utilizar:
		if (entry.equals("1")) { // 1 elije ArrayList
	      return new StackArrayList<E>(); //regresa ArrayList
		}
		else if (entry.equals("2")){ // Elije Vector
			return new StackVector<E>(); //regresa Vector
		}else {// Sino elije lista
			return getList(entry);
		}
	      
	   }
	
	public Stack<E> getList(String entryList){
		   if (entryList.equals("3")) {         // Elije lista doblemente encadenada
			   return new DoublyLinkedListStack<E>();
		   }else { 								// escoge lista simplemente encadenada
			   return new SinglyLinkedListStack<E>();
		   }
	   }
}
