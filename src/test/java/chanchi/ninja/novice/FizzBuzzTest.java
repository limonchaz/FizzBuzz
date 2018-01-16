package chanchi.ninja.novice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {

	private FizzBuzz fb = new FizzBuzz();
	
	@Test
    public void testOthers() {
		assertEquals("1",fb.isFizzBuzz(1));
        assertEquals("2",fb.isFizzBuzz(2));
        assertEquals("4",fb.isFizzBuzz(4));
        assertEquals("7",fb.isFizzBuzz(7));
    }
	
	@Test
    public void testFizz() {
        assertEquals("Fizz",fb.isFizzBuzz(3));
        assertEquals("Fizz",fb.isFizzBuzz(6));
        assertEquals("Fizz",fb.isFizzBuzz(9));
        assertEquals("Fizz",fb.isFizzBuzz(12));
    }
	
	@Test
    public void testBuzz() {
    	assertEquals("Buzz",fb.isFizzBuzz(5));
        assertEquals("Buzz",fb.isFizzBuzz(10));
        assertEquals("Buzz",fb.isFizzBuzz(20));
        assertEquals("Buzz",fb.isFizzBuzz(25));
    }
    
	@Test
    public void testFizzBuzz() {
		assertEquals("FizzBuzz",fb.isFizzBuzz(15));
        assertEquals("FizzBuzz",fb.isFizzBuzz(30));
        assertEquals("FizzBuzz",fb.isFizzBuzz(45));
        assertEquals("FizzBuzz",fb.isFizzBuzz(60));
    }
}
