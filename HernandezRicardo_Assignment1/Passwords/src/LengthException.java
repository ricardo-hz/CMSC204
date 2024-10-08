/**
 * Thrown when the password does not meet the length requirement
 * @author Ricardo Hernandez
 */
public class LengthException extends Exception{
	public LengthException() {
		super("The password must be at least 6 characters long");
	}
}
