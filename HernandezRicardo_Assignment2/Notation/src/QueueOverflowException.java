/**
 * @author Ricardo Hernandez
 * This exception occurs when a enqueue method is called on a full queue.
 */
public class QueueOverflowException extends Exception {
	public QueueOverflowException() {
		super("Enqueue method was called on a full queue");
	}
}
