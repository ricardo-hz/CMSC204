import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Stack;

/**
 * @author Ricardo Hernandez
 */
public class MyStack<T> implements StackInterface<T> {
	//Fields
	private int numElements = 0;
	private final int MAX_ELEMENTS;
	private Stack<T> stack = new Stack<>();
	//Constructor
	public MyStack(int size) {
		MAX_ELEMENTS = size;
		
	}
	
	//Methods
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return stack.size() == 0;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return (numElements == MAX_ELEMENTS);
	}

	@Override
	public T pop() throws StackUnderflowException {
		if(isEmpty()) {
			throw new StackUnderflowException();
		}
		else {
			numElements--;
			return stack.pop();
		}
	}

	@Override
	public T top() throws StackUnderflowException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return numElements;
	}

	@Override
	public boolean push(T e) throws StackOverflowException {
		// TODO Auto-generated method stub
		if(numElements == MAX_ELEMENTS) {
			throw new StackOverflowException();
		}
		else {
			stack.push(e);
			numElements++;
			return true;
		}
	}

	@Override
	public String toString(String delimiter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void fill(ArrayList<T> list) {
		// TODO Auto-generated method stub
		
	}

}
