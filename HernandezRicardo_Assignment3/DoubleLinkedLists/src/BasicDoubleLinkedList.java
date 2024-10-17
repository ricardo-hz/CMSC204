/**
 * @author Ricardo Hernandez
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.ListIterator;

/**
 * This generic double-linked list that implements the Iterable interface and relies on a head (reference to first element of the list) and tail (reference to the last element of the list). Both are set to null when the list is empty. Both point to the same element when there is only one element in the list. The class must only define the following entities:
 * 1) an inner class Node, The inner Node class has only three fields: data, the prev and next references.
 * 2) an inner class named DoubleLinkedListIterator that implements ListIterator (for the iterator method), This inner class implements only the hasNext(), next(), hasPrevious() and previous() methods of ListIterator , all other methods can throw the UnsupportedOperationException:
All the entities are defined as protected so they can be accessed by the subclasses.
 */
public class BasicDoubleLinkedList<T> implements Iterable<T>{
	
	protected Node head;
	protected Node tail;
	protected int size;
	
	/**
	 * A generic inner class node
	 */
	protected class Node{
		protected T data;
		protected Node prev;
		protected Node next;
		
		/**
		 * Default constructor, sets head and tail to null
		 * @param data data
		 */
		public Node(T data) {
			this.prev = null;
			this.next = null;
			this.data = data;
		}
	}
	
	protected class DoubleLinkedListIterator<T> implements ListIterator<T>{

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public T next() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean hasPrevious() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public T previous() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int nextIndex() throws UnsupportedOperationException {
			throw new UnsupportedOperationException();
		}

		@Override
		public int previousIndex() throws UnsupportedOperationException {
			throw new UnsupportedOperationException();
		}

		@Override
		public void remove() throws UnsupportedOperationException{
			throw new UnsupportedOperationException();
			
		}

		@Override
		public void set(T e) throws UnsupportedOperationException {
			throw new UnsupportedOperationException();
		}

		@Override
		public void add(T e) throws UnsupportedOperationException{
			throw new UnsupportedOperationException();
		}
		
	}
	
	/**
	 * Returns the number of nodes in the list
	 * Notice: Do not traverse the list to compute the size. This method 
	 * just returns the value of the instance variable you use to keep track of size.
	 * @return The size of the linked list
	 */
	public int getSize() {
		return size;
	}
	
	/**
	 * Adds an element to the end of the list and updated the size of the list
	 * DO NOT use iterators to implement this method.
	 * @param data the data to be added to the list
	 */
	public void addToEnd(T data) {
		size++;
	}
	
	/**
	 * Adds element to the front of the list and updated the size of the list
	 * Do not use iterators to implement this method.
	 * @param data the data to be added to the list
	 */
	public void addToFront(T data) {
		
	}
	
	/**
	 * Returns but does not remove the first element from the list
	 * If there are no elements the method returns null.
	 * Do not implement this method using iterators.
	 * @return the data element or null
	 */
	public T getFirst() {
		
	}
	
	/**
	 * Returns but does not remove the last element from the list.
	 * If there are no elements the method returns null. 
	 * Do not implement this method using iterators.
	 * @return the data element or null
	 */
	public T getLast() {
		
	}
	
	/**
	 * This method returns an object of the DoubleLinkedListIterator. 
	 * (the inner class that implements java's ListIterator interface)
	 * @return a ListIterator object
	 */
	public ListIterator<T> iterator(){
		
	}
	
	/**
	 * Removes the first instance of the targetData from the list. Notice that you 
	 * must remove the elements by performing a single traversal over the list. 
	 * You may not use any of the other retrieval methods associated with the class 
	 * in order to complete the removal process. You must use the provided comparator 
	 * (do not use equals) to find those elements that match the target. Do not 
	 * implement this method using iterators.
	 * @param targetData the data element to be removed
	 * @param comparator the comparator to determine equality of data elements
	 * @return a node containing the targetData or null
	 */
	public Node remove(T targetData, Comparator<T> comparator) {
		
	}
	
	/**
	 * Removes and returns the first element from the list. If there are no elements 
	 * the method returns null. Do not implement this method using iterators.
	 * @return data element or null
	 */
	public T retrieveFirstElement() {
		
	}
	
	/**
	 * Removes and returns the first element from the list. If there are no elements 
	 * the method returns null. Do not implement this method using iterators.
	 * @return data element or null
	 */
	public T retrieveLastElement() {
		
	}
	
	/**
	 * Returns an arraylist of all the items in the Double Linked list
	 * @return an arraylist of the items in the list
	 */
	public ArrayList<T> toArrayList(){
		
	}
	
}
