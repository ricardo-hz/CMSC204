import java.util.ArrayList;
import java.util.regex.*;

/**
 * Utility class for PasswordChecker GUI
 * @author Ricardo Hernandez
 */
public class PasswordCheckerUtility {
	//Fields
	private static int MINIMUM_PASSWORD_LENGTH = 6;
	//Methods
	/**
	 * Compare equality of two passwords
	 * @param password string to be checked for
	 * @param passwordConfirm string to be checked against password for
	 * @throws UnmatchedException thrown if not same (case sensitive)
	 */
	public static void comparePasswords(String password, String passwordConfirm) throws UnmatchedException {
		boolean equivalent = true;
		//The passwords cannot be equivalent if they are not the same length
		if(password.length() != passwordConfirm.length()) {
			equivalent = false;
		}
		/*
		 * Assuming the passwords are the same length, iterate through each char of 
		 * the passwords comparing equivalence
		 */
		else {
			for (int i = 0; i < password.length(); i++){
				if(password.charAt(i) != passwordConfirm.charAt(i)) {
					equivalent = false;
				}
			}
		}
		if(equivalent == false) {
			throw new UnmatchedException();
		}
	}
	
	/**
	 * Compare equality of two passwords
	 * @param password string to be checked for
	 * @param passwordConfirm string to be checked against password for
	 * @return true if both same (case sensitive), false otherwise
	 */
	public static boolean comparePasswordsWithReturn(String password, String passwordConfirm) {
		//The passwords cannot be equivalent if they are not the same length
		if(password.length() != passwordConfirm.length()) {
			return false;
		}
		/*
		 * Assuming the passwords are the same length, iterate through each char of 
		 * the passwords comparing equivalence
		 */
		else {
			for (int i = 0; i < password.length(); i++){
				if(password.charAt(i) != passwordConfirm.charAt(i)) {
					return false;
				}
			}
		}
		/*
		 * If "false" hasn't been returned yet, it's safe to assume the passwords are equivalent
		 */
		return true;
	}
	
	/**
	 * Checks the password alpha character requirement - Password must contain an uppercase alpha character
	 * @param password string to be checked for alpha character requirement
	 * @return true if meet alpha character requirement
	 * @throws noUpperAlphaException thrown if does not meet alpha character requirement
	 */
	public static boolean hasUpperAlpha(String password) throws NoUpperAlphaException{
		/*
		 * Iterate through each char in the password, if any is uppercase the loop terminates early
		 * due to the return statement
		 */
		for(int i = 0; i < password.length(); i++) {
			if(Character.isUpperCase(password.charAt(i))) {
				return true;
			}
		}
		/*
		 * If the loop is able to iterate completely without returning true, it's safe to assume that
		 * there are no uppercase letters in the password
		 */
		throw new NoUpperAlphaException();
	}
	
	/**
	 * Checks the password alpha character requirement - Password must contain at least one lowercase alpha character
	 * @param password string to be checked for lowercase alpha character
	 * @return true if meets lowercase requirement
	 * @throws noLowerAlphaException thrown if does not meet lowercase requirement
	 */
	public static boolean hasLowerAlpha(String password) throws NoLowerAlphaException{
		/*
		 * Iterate through each char in the password, if any char is lowercase the loop terminates early by
		 * returning true
		 */
		for(int i = 0; i < password.length(); i++) {
			if(Character.isLowerCase(password.charAt(i))) {
				return true;
			}
		}
		/*
		 * If the loop is able to iterate completely without returning true, it's safe to assume that there
		 * are no lowercase letters in the password
		 */
		throw new NoLowerAlphaException();
	}
	
	/**
	 * Checks the password Digit requirement - Password must contain a numeric character
	 * @param password string to be checked for Digit requirement
	 * @return true if meet Digit requirement
	 * @throws NoDigitException thrown if does not meet Digit requirement
	 */
	public static boolean hasDigit(String password) throws NoDigitException{
		//Iterate  through each character of the password, looking for a digit
		for(int i = 0; i < password.length(); i++) {
			if(Character.isDigit(password.charAt(i))) {
				return true;
			}
		}
		/*
		 * If the loop is able to iterate completely without returning true, it's safe to assume that there
		 * are no digits in the password
		 */
		throw new NoDigitException();
	}
	
	/**
	 * Checks the password SpecialCharacter requirement - Password must contain a Special Character
	 * @param password string to be checked for SpecialCharacter requirement
	 * @return true if meets SpecialCharacter requirement
	 * @throws NoSpecialCharacterException thrown if does not meet SpecialCharacter requirement
	 */
	public static boolean hasSpecialChar​(String password) throws NoSpecialCharacterException{
		Pattern pattern = Pattern.compile("[a-zA-Z0-9]*");
		Matcher matcher = pattern.matcher(password);
		if(matcher.matches()) {
			throw new NoSpecialCharacterException();
		}
		else {
			return true;
		}
	}
	
	/**
	 * Checks the password Sequence requirement - Password should not contain more than 2 of the same character in sequence
	 * @param password string to be checked for Sequence requirement
	 * @return false if does NOT meet Sequence requirement
	 * @throws InvalidSequenceException thrown if meets Sequence requirement
	 */
	public static boolean NoSameCharInSequence​(String password) throws InvalidSequenceException{
		//Using -2 in the conditional statement prevents the loop from searching out of bounds
		for(int i = 0; i < password.length() - 2; i++) {
			/*
			 * Iterate through each char in the password. If the char at index 'i' of the password is equal to the
			 * next two chars of the password, the loop will terminate early by throwing an exception
			 */
			if((password.charAt(i) == password.charAt(i + 1) && (password.charAt(i) == password.charAt(i+2)))) {
				throw new InvalidSequenceException();
			}
		}
		/*
		 * If the loop is able to complete without throwing an exception, it's safe to assume that the password
		 * does not break the repeating sequential character rule
		 */
		return true;
	}
	
	/**
	 * Return true if valid password (follows all the following rules), returns false if an invalid password 
	 * 1. At least 6 characters long
	 * 2. At least 1 numeric character
	 * 3. At least 1 uppercase alphabetic character
	 * 4. At least 1 lowercase alphabetic character
	 * 5. At least 1 special character
	 * 6. No more than 2 of the same character in a sequence - Hello@123 – OK AAAbb@123 – not OK Aaabb@123 – OK
	 * @param password string to be checked for validity
	 * @return true if valid password (follows all rules from above), false if an invalid password
	 * @throws LengthException thrown if length is less than 6 characters
	 * @throws NoUpperAlphaException thrown if no uppercase alphabetic
	 * @throws NoLowerAlphaException thrown if no lowercase alphabetic
	 * @throws NoDigitException thrown if no digit
	 * @throws NoSpecialCharacterException thrown if does not meet SpecialCharacter requirement
	 * @throws InvalidSequenceException thrown if more than 2 of same character
	 */
	public static boolean isValidPassword​(String password) throws LengthException, NoUpperAlphaException, 
	NoLowerAlphaException, NoDigitException, NoSpecialCharacterException, InvalidSequenceException{
		try {
			if(
				isValidLength(password) &&
				hasUpperAlpha(password) &&
				hasLowerAlpha(password) &&
				hasDigit(password) &&
				hasSpecialChar​(password) &&
				NoSameCharInSequence​(password)
			) {
				return true;
			}
			else {
				return false;
			}
		}
		catch(LengthException le) {
			throw new LengthException();
		}
		catch(NoUpperAlphaException nuae) {
			throw new NoUpperAlphaException();
		}
		catch(NoLowerAlphaException nlae) {
			throw new NoLowerAlphaException();
		}
		catch(NoDigitException nde) {
			throw new NoDigitException();
		}
		catch(NoSpecialCharacterException nsce) {
			throw new NoSpecialCharacterException();
		}
		catch(InvalidSequenceException ise) {
			throw new InvalidSequenceException();
		}
	}
	
	/**
	 * This method will accept an ArrayList of passwords as the parameter and return an ArrayList with 
	 * the status of any invalid passwords (weak passwords are not considered invalid). The ArrayList of 
	 * invalid passwords will be of the following format: password BLANK message of the exception thrown
	 * @param passwords list of passwords
	 * @return ArrayList of invalid passwords in the correct format
	 */
	public static ArrayList<String> getInvalidPasswords​(ArrayList<String> passwords){
		ArrayList<String> invalidPasswords = new ArrayList<String>();
		for(int i = 0; i < passwords.size(); i++) {
			try {
				isValidPassword​(passwords.get(i));
			}
			catch(Exception e){
				invalidPasswords.add(passwords.get(i) + " " + e.getMessage());
			}
		}
		return invalidPasswords;
	}
	
	/**
	 * Checks the password length requirement - The password must be at least 6 characters long
	 * @param password string to be checked for length
	 * @return true if meets minimum length requirement
	 * @throws LengthException thrown if does not meet minimum length requirement
	 */
	public static boolean isValidLength(String password) throws LengthException{
		//Throw an exception if password is too short instead of returning false
		if(password.length() < MINIMUM_PASSWORD_LENGTH) {
			throw new LengthException();
		}
		else {
			return true;
		}
	}
	
	/**
	 * Check if the password contains 6 to 9 characters
	 * @param password string to be checked for
	 * @return true if password contains 6 to 9 characters, false otherwise
	 */
	public static boolean hasBetweenSixAndNineChars (String password) {
		return(password.length() >= 6 && password.length() <= 9);
	}
	
	/**
	 * Checks if password is VALID and the length is NOT between 6-9 characters
	 * @param password string to be checked for weak password
	 * @return false if the password is valid and the length is NOT between 6 and 9 characters (inclusive)
	 * @throws WeakPasswordException Thrown  if length of password is between 6 and 9 (inclusive), ALTHOUGH the password may be VALID.
	 */
	public static boolean isWeakPassword(String password) throws WeakPasswordException{
		try {
			if(isValidPassword​(password) && (!(hasBetweenSixAndNineChars(password)))) {
				return false;
			}
			else{
				throw new WeakPasswordException();
			}
		}
		catch(Exception e) {
			throw new WeakPasswordException();
		}
	}
}
