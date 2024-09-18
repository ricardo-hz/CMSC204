/**
 * Thrown when the password does not contain at least one digit
 * @author Ricardo Hernandez
 */
public class NoDigitException extends Exception {
	public NoDigitException() {
		super("The password must contain at least one digit");
	}
}
