/**
 * Thrown when a password is valid but only contains 6-9 characters
 * @author Ricardo Hernandez
 */
public class WeakPasswordException extends Exception {
	public WeakPasswordException() {
		super("The password is OK but weak - it contains fewer than 10 characters.");
	}
}
