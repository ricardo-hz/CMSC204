/**
 * Thrown when the typed password and the password confirmation do not match. Should be thrown from GUI, not utility class.
 * @author Ricardo Hernandez
 */
public class UnmatchedException extends Exception {
	public UnmatchedException() {
		super("Passwords do not match");
	}
}
