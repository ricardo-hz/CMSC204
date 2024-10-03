/**
 * @author Ricardo Hernandez
 * This exception is thrown when a method is called on an empty stack
 */
public class StackUnderflowException extends Exception {
	public StackUnderflowException() {
		super("Top or pop method was called on an empty stack.");
	}
}
