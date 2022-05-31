import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public final void testSubtract() {
		//fail("Not yet implemented");
		int a = 9876;
		int b = 4321;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = 5555;

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int a = 1234;
		int b = 8765;
		
			Calculator cal = new Calculator();
			int actual = cal.add(a, b);
			
			int expected = 9999;
			assertEquals (9999, actual);
			
	}
	@Test
	public void boundary() {
		//fail("Not yet implemented");
		int a = 0; 
		int b = 0;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		int expected = -0;
		assertEquals (0, actual);
	}
	@Test
	public void divide() {
		//fail("Not yet implemented");
		int a = 10; 
		int b = 2;
		
		Calculator cal = new Calculator();
		cal.divide(a, b);
		int expected = 5;
		assertEquals (5, expected);
}
	@Test
	public void multiply() {
		//fail("Not yet implemented");
		int a = 3; 
		int b = 3;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		int expected = 9;
		assertEquals (9, expected);
	
}
	}