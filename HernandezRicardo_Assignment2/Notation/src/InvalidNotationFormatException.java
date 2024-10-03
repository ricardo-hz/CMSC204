/**
 * @author Ricardo Hernandez
 * This exception occurs when a Notation format is incorrect
 */
public class InvalidNotationFormatException extends Exception{
	public InvalidNotationFormatException() {
		super("The notation format is incorrect");
	}
}
