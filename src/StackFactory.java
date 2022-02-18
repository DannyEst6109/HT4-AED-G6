
class StackFactory<E> {
	public Stack<E> getStack(String entry) {
	    // seleccion de la implementacion a utilizar:
		if (entry.equals("AL")) {
	      return new StackArrayList<E>(); //regresa ArrayList
		}
		else if (entry.equals("Vec")){
			return new StackVector<E>(); //regresa Vector
		}else {
			return new StackList<E>();
		}
	      
	   }
	
	public List<E> getList(String entryList){
		   if (entryList.equals("D")) {
			   return new DoublyLinkedList<E>();
		   }else {
			   return new SinglyLinkedList<E>();
		   }
	   }
}
