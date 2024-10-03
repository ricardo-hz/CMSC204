/**
 * @author Ricardo Hernandez
 * This exception occurs occurs when a  dequeue method is called on an empty queue.
 */
public class QueueUnderflowException extends Exception {
	public QueueUnderflowException() {
		super("Dequeue method was called on an empty queue");
	}
}
