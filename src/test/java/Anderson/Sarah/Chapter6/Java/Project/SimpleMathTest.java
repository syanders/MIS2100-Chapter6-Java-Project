package Anderson.Sarah.Chapter6.Java.Project;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleMathTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testThatZeroNumeratorReturnsZero() {
		SimpleMath Math = new SimpleMath();
		
		assertEquals(0, Math.divide(0, 7),.001);
	}
	
	@Test
	public void testThatSmallerNumeratorReturnsDecimalValue() {
		SimpleMath Math = new SimpleMath();
		
		assertEquals(.25,Math.divide(1, 7),.001);
	}

	@Test(expected=ArithmeticException.class)
	public void testThatZeroDenominatorThrowsException() {
		SimpleMath Math = new SimpleMath();
		
		Math.divide(6,0);
	}
}
