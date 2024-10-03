/**
 * @author Ricardo Hernandez
 * This exception occurs when a push method is called on a full stack.
 */
public class StackOverflowException extends Exception {
	public StackOverflowException() {
		super("Push method was called on a full stack");
	}
}
