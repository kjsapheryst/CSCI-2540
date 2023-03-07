package activity6;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
public class StudentTest {

	private Student one;
	private Student two;
		
	@Before
	public void setUp() {
		one = new Student();
		two = new Student(1, "Caleb Cornejo");
	}
			
	@Test
	public void testDefaultConstructor() {
	//test get methods
		assertEquals("Default Student ID: ", 0, one.getId());
		assertEquals("Default Student Name: ", "unknown", one.getName());
	}

	@Test
	public void testTwoParamConstructor() {
		assertEquals("Default Student ID: ", 1, two.getId());
		assertEquals("Default Student Name: ", "Caleb Cornejo", two.getName());
	}
		
	@Test
	public void testToString() {
		assertEquals("To String Test 1:", one.toString(), one.toString());
		assertEquals("To String Test 2: ", two.toString(), two.toString());
	}
}


