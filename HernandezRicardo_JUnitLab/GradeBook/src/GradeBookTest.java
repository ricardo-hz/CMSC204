import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradeBookTest {
	/*
	 * Create at least two objects of Gradebook of size 5
	 * NOTE: Placed outside of setUp to allow for recognition
	 * of objects by tearDown method
	 */
	GradeBook gradebook1 = new GradeBook(5);
	GradeBook gradebook2 = new GradeBook(5);

	@Before
	public void setUp() throws Exception {
		/*
		 * Call the addScore method for each of the Gradebook
		 * classes at least twice but no more than five times
		 */
		gradebook1.addScore(0);
		gradebook1.addScore(20);
		gradebook1.addScore(40);
		gradebook1.addScore(60);
		gradebook1.addScore(80);
		//Add gb2 scores
		gradebook2.addScore(10.8);		
		gradebook2.addScore(25.6);
		gradebook2.addScore(48.999);
		gradebook2.addScore(93.001);

	}

	@After
	public void tearDown() throws Exception {
		/*
		 * In the teardown method of GradeBookTester, set the two
		 * objects of Gradebook to null
		 */
		gradebook1 = gradebook2 = null;

	}
	
	@Test
	public void testAddScore() throws Exception{
		/*
		 * Use the toString method to compare the contents of what
		 * is in the scores array vs. what is expected to be in the
		 * scores array
		 */
		assertTrue(gradebook1.toString().equals("0.0 20.0 40.0 60.0 80.0"));
		assertTrue(gradebook2.toString().equals("10.8 25.6 48.999 93.001"));
		/*
		 * Compare the scoreSize to the expected number of scores entered
		 */
		assertEquals(5, gradebook1.getScoreSize());
		assertEquals(4, gradebook2.getScoreSize());
	}
	
	@Test
	public void testSum() throws Exception{
		/*
		 * Compare what is returned by sum() to the expected sum of the 
		 * scores entered
		 */
		assertEquals(200, gradebook1.sum(), 0);
		assertEquals((10.8 + 25.6 + 48.999 + 93.001),gradebook2.sum(),0.01);
		
	}
	
	@Test
	public void testMinimum() throws Exception{
		/*
		 * Compare what is returned by minimum() to the expected minimum
		 * of the scores entered
		 */
		assertEquals(0, gradebook1.minimum(), 0.01);
		assertEquals(10.8, gradebook2.minimum(), 0.01);
	}
	
	@Test
	public void testFinalScore() throws Exception{
		/*
		 * Compare what is returned by finalScore() to the
		 * expected finalscore of the scores entered
		 * 
		 * The finalScore is the sum of the scores, with the lowest score
		 * dropped if there are at least two scores, or 0 if there are no
		 * scores
		 */
		assertEquals(200, gradebook1.finalScore(), 0.01);
		assertEquals(25.6 + 48.999 + 93.001, gradebook2.finalScore(), 0.01);
	}
}
