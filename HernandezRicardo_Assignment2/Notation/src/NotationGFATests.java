import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NotationGFATests {
	public MyQueue<String> stringQ;
	public MyStack<String> stringS;
	
	@BeforeEach
	void setUp() throws Exception {
		stringQ = new MyQueue<String>(5);
		stringQ.enqueue("a");
		stringS = new MyStack<String>(2);
		stringS.push("a");
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	 
	@Test
	public void testIsEmptyQueue() {
		assertEquals(false,stringQ.isEmpty());
		try {
			stringQ.dequeue();
		} catch (QueueUnderflowException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(true, stringQ.isEmpty());
	}
	@Test
	public void testDequeue() {
		try {
			assertEquals("a", stringQ.dequeue());
			 
			//Queue is empty, next statement should cause QueueUnderFlowException
			stringQ.dequeue();
			assertTrue("This should have caused an QueueUnderflowException", false);
		}
		catch (QueueUnderflowException e){
			assertTrue("This should have caused an QueueUnderflowException", true);
		}
		catch (Exception e){
			assertTrue("This should have caused an QueueUnderflowException", false);
		}
	}
	
	@Test
	public void testIsEmptyStack() {
		assertEquals(false,stringS.isEmpty());
		try {
			stringS.pop();
		} catch (StackUnderflowException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(true, stringS.isEmpty());
	}

	@Test
	public void testIsFull() {
		assertEquals(false, stringS.isFull());
		try {
			stringS.push("b");
		} catch (StackOverflowException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(true, stringS.isFull());
	}


}
