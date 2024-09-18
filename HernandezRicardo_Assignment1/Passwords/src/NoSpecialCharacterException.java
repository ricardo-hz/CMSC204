/**
 * Thrown when the password does not contain at least one special character
 * @author Ricardo Hernandez
 */
public class NoSpecialCharacterException extends Exception{
	public NoSpecialCharacterException() {
		super("The password must contain at least one special character");
	}
}
