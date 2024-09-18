
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * STUDENT tests for the methods of PasswordChecker
 * @author Ricardo Hernandez
 *
 */
public class PasswordCheckerTest_STUDENT {
	
	ArrayList<String> passwords1, passwords2;
	@Before
	public void setUp() throws Exception {
		passwords1 = new ArrayList<String>();
		passwords2 = new ArrayList<String>();
		//Passwords for length testing
		passwords1.add("Ab1$"); //Index 0
		passwords1.add("Abc1$#d"); //Index 1
		//Passwords for digit testing
		passwords1.add("UFe89#fmx"); //Index 2
		passwords1.add("efoinwfpiIUEFapa$"); //Index 3
		//Password that is valid but between 6 and 9 chars (weak password)
		passwords1.add("1#t*G$M3!2"); //Index 4
		passwords1.add("pL@t%@135"); //Index 5
		//Password that is valid
		passwords1.add("P&wrh&1$66"); //Index 6
		passwords1.add("s!274&W8x!"); //Index 7
		//Passwords for lowercase testing
		passwords1.add("3*&65yp!7M"); //Index 8
		passwords1.add("3*&65yp!7M".toUpperCase()); //Index 9
		//Password that has no uppercase but is otherwise valid
		passwords1.add("%7k@E%c$73"); //Index 10
		passwords1.add(passwords1.get(10).toLowerCase()); //Index 11
		//Password that contains an invalid sequence
		passwords1.add("0n%76P4%V%"); //Index 12
		passwords1.add("0n%%%76P4V"); //Index 13
		
		//Array of passwords to test getInvalidPasswords
		passwords2.add("W!@yJ7p87$");//Index 0, valid password so it should not be returned by method
		passwords2.add("5#$4yO1B@d".toLowerCase());//Index 1, No uppercase
		passwords2.add("uMPiN*!%*T");//Index 2, No digit
		passwords2.add("83O9iJItmu");//Index 3, No special char
		passwords2.add("WWW!@yJ7p87$");//Index 4, Invalid sequence
	}

	@After
	public void tearDown() throws Exception {
		passwords1 = passwords2 = null;
	}

	/**
	 * Test if the password is less than 6 characters long.
	 * This test should throw a LengthException for second case.
	 */
	@Test
	public void testIsValidPasswordTooShort()
	{
		//TEST 1 OF ISVALIDPASSWORDTOOSHORT
		try {
			//This should throw an exception
			PasswordCheckerUtility.isValidLength(passwords1.get(0));
		}
		catch(LengthException le) {
			//If an exception is thrown, this test will pass
			assertTrue(true);
		}
		//TEST 2 OF ISVALIDPASSWORDTOOSHORT
		try {
			assertTrue(PasswordCheckerUtility.isValidLength(passwords1.get(1)));
		}
		catch(LengthException le) {
			fail("The second password failed the test.");
		}
	}
	
	/**
	 * Test if the password has at least one uppercase alpha character
	 * This test should throw a NoUpperAlphaException for second case
	 */
	@Test
	public void testIsValidPasswordNoUpperAlpha()
	{
		//TEST 1
		try {
			assertTrue(PasswordCheckerUtility.hasUpperAlpha(passwords1.get(10)));
		}
		catch(NoUpperAlphaException nuae) {
			fail("Password 10 threw a no upper alpha exception.");
		}
		//TEST 2
		try {
			PasswordCheckerUtility.hasUpperAlpha(passwords1.get(11));
		}
		catch(NoUpperAlphaException nuae) {
			assertTrue(true);
		}
	}
	
	/**
	 * Test if the password has at least one lowercase alpha character
	 * This test should throw a NoLowerAlphaException for second case
	 */
	@Test
	public void testIsValidPasswordNoLowerAlpha()
	{
		//TEST1
		try {
			assertTrue(PasswordCheckerUtility.hasLowerAlpha(passwords1.get(8)));
		}
		catch(NoLowerAlphaException nlae) {
			fail("Password at index 8 failed the lower alpha test.");
		}
		//TEST 2
		try {
			PasswordCheckerUtility.hasLowerAlpha(passwords1.get(9));
		}
		catch(NoLowerAlphaException nlae) {
			assertTrue(true);
		}
	}
	/**
	 * Test if the password has more than 2 of the same character in sequence
	 * This test should throw a InvalidSequenceException for second case
	 */
	@Test
	public void testIsWeakPassword()
	{
		//TEST 1
		assertTrue(PasswordCheckerUtility.hasBetweenSixAndNineChars(passwords1.get(5)));
		//TEST 2
		assertFalse(PasswordCheckerUtility.hasBetweenSixAndNineChars(passwords1.get(4)));
	}
	
	/**
	 * Test if the password has more than 2 of the same character in sequence
	 * This test should throw a InvalidSequenceException for second case
	 */
	@Test
	public void testIsValidPasswordInvalidSequence()
	{
		//TEST 1
		try {
			assertTrue(PasswordCheckerUtility.NoSameCharInSequence​(passwords1.get(12)));
		}
		catch(InvalidSequenceException ise) {
			fail("Password at index 12 threw an invalid sequence exception");
		}
		//TEST 2
		try {
			assertFalse(PasswordCheckerUtility.NoSameCharInSequence​(passwords1.get(13)));
		}
		/*
		 * This password should throw an exception. If the try catch block makes it here, that means the
		 * test passed
		 */
		catch(InvalidSequenceException ise) {
			assertTrue(true);
		}
	}
	
	/**
	 * Test if the password has at least one digit
	 * One test should throw a NoDigitException
	 */
	@Test
	public void testIsValidPasswordNoDigit()
	{
		//TEST 1
		try {
			assertTrue(PasswordCheckerUtility.hasDigit(passwords1.get(2)));
		}
		catch(NoDigitException nde) {
			fail("Password at index 2 has failed");
		}
		//TEST 2
		//This password should throw an exception
		try {
			PasswordCheckerUtility.hasDigit(passwords1.get(3));
		}
		catch(NoDigitException nde) {
			/*
			 * If the try-catch block makes it down here, an exception was thrown which means
			 * the test passed
			 */
			assertTrue(true);
		}
	}
	
	/**
	 * Test correct passwords
	 * This test should not throw an exception
	 */
	@Test
	public void testIsValidPasswordSuccessful()
	{
		try {
			assertTrue(PasswordCheckerUtility.isValidPassword​(passwords1.get(6)));
			assertTrue(PasswordCheckerUtility.isValidPassword​(passwords1.get(7)));
		}
		catch(Exception e) {
			fail("An exception was thrown, this test should not throw an exception");
		}
	}
	
	/**
	 * Test the invalidPasswords method
	 * Check the results of the ArrayList of Strings returned by the validPasswords method
	 */
	@Test
	public void testInvalidPasswords() {
		ArrayList<String> invalidPasswords = new ArrayList<String>();
		invalidPasswords.add(passwords2.get(1) + " The password must contain at least one uppercase alphabetic character");
		invalidPasswords.add(passwords2.get(2) + " The password must contain at least one digit");
		invalidPasswords.add(passwords2.get(3) + " The password must contain at least one special character");
		invalidPasswords.add(passwords2.get(4) + " The password cannot contain more than two of the same character in sequence");
		assertTrue(PasswordCheckerUtility.getInvalidPasswords​(passwords2).equals(invalidPasswords));
	}
	
}
