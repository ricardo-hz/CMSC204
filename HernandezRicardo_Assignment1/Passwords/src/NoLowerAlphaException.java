/**
 * Thrown when the password does not contain a lowercase alphabetic character
 * @author Ricardo Hernandez
 */
public class NoLowerAlphaException extends Exception {
	public NoLowerAlphaException() {
		super("The password must contain at least one lowercase alphabetic character");
	}
}
