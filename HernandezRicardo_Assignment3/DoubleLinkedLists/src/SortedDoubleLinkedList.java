/**
 * @author Ricardo Hernandez
 */
import java.util.Comparator;
import java.util.ListIterator;

/**
 * Implements a generic sorted double list using a provided Comparator. 
 * It extends BasicDoubleLinkedList class.
 */
public class SortedDoubleLinkedList<T> extends BasicDoubleLinkedList<T>{
	/**
	 * Creates an empty list that is associated with the specified comparator.
	 * @param compareableObject Comparator to compare data elements
	 */
	public SortedDoubleLinkedList(Comparator<T> compareableObject) {
		
	}
	
	/**
	 * Inserts the specified element at the correct position in the sorted list. 
	 * Notice we can insert the same element several times. Your implementation 
	 * must traverse the list only once in order to perform the insertion.
	 * Do not implement this method using iterators. Notice that you don't need 
	 * to call any of the super class methods in order to implement this method.
	 * @param data the data to be added to the list
	 */
	public void add (T data) {
		
	}
	
	/**
	 * This operation is invalid for a sorted list. An UnsupportedOperationException 
	 * will be generated using the message "Invalid operation for sorted list."
	 * @Overrides addToFront in class BasicDoubleLinkedList<T>
	 * @param data - the data for the Node within the linked list
	 * @throws UnsupportedOperationException - if method is called
	 */
	@Override
	public void addToFront(T data) throws UnsupportedOperationException{
		throw new UnsupportedOperationException("Invalid operation for sorted list");
	}
	
	/**
	 * This operation is invalid for a sorted list. An UnsupportedOperationException 
	 * will be generated using the message "Invalid operation for sorted list."
	 * @Overrides addToEnd in class BasicDoubleLinkedList<T>
	 * @param data - the data for the Node within the linked list
	 * @throws UnsupportedOperationException - if method is called
	 */
	@Override
	public void addToEnd(T data) throws UnsupportedOperationException{
		throw new UnsupportedOperationException("Invalid operation for sorted list");
	}
	
	/**
	 * Implements the iterator by calling the super class iterator method.
	 * @Overrides iterator in class BasicDoubleLinkedList<T>
	 * @return an iterator positioned at the head of the list
	 */
	@Override
	public ListIterator<T> iterator(){
		
	}
	
	/**
	 * Implements the remove operation by calling the super class remove method.
	 * @Overrides remove in class BasicDoubleLinkedList<T>
	 * @param data the data element to be removed
	 * @param comparator the comparator to determine equality of data elements
	 * @return a node containing the data or null
	 */
	@Override
	public Node remove(T data, Comparator<T> comparator) {
		
	}
}
