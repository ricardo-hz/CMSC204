import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Ricardo Hernandez
 */
public class MyQueue<T> implements QueueInterface<T>{
	//Fields
	private int numElements;
	private final int MAX_ELEMENTS;
	private ArrayList<T> queue= new ArrayList<>();
	
	//Constructor
	public MyQueue(int size) {
		numElements = 0;
		MAX_ELEMENTS = size;
		queue= new ArrayList<>(size);
	}
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (queue.size() == 0);
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return (numElements == MAX_ELEMENTS);
	}

	@Override
	public T dequeue() throws QueueUnderflowException {
		// TODO Auto-generated method stub
		if(this.numElements == 0) {
			throw new QueueUnderflowException();
		}
		else {
			numElements--;
			return queue.removeFirst();
		}
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return numElements;
	}

	@Override
	public boolean enqueue(T e) throws QueueOverflowException {
		// TODO Auto-generated method stub
		if(queue.size() == MAX_ELEMENTS) {
			throw new QueueOverflowException();
		}
		else {
			numElements++;
			queue.add(e);
			return true;
		}
	}

	@Override
	public String toString(String delimiter) {
		// TODO Auto-generated method stub
		return queue.toString();
	}

	@Override
	public void fill(ArrayList<T> list) {
		// TODO Auto-generated method stub
		
	}

}
