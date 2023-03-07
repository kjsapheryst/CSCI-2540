package assg5_cornejok18;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestComplexNum {
	
		//test cases
		private ComplexNum rTest;
		private ComplexNum iTest;
		
		@Before //default value setup
		public void setUp() {
			rTest = new ComplexNum();
			iTest = new ComplexNum();
		}
		@Test //test default constructor
		public void testDefaultConstructor() {
			assertEquals("Default Real: ", 0, rTest.getReal(), rTest.getReal());
			assertEquals("Default Imaginary: ", 0, iTest.getReal(), iTest.getImaginary());
		}

		@Test // test given real and imaginary
		public void testTwoParamConstructor() {
			assertEquals("Default Real: ", 1, rTest.getReal(), rTest.getReal());
			assertEquals("Default Imaginary: ", 1, iTest.getImaginary(), iTest.getImaginary());
		}
		
		@Test // test Set Real
		public void testSetReal() {
			rTest.setReal(5.2);
			assertEquals("Set Real: ", 5.2, rTest.getReal(), rTest.getReal());
		}
		
		@Test //test Set Imaginary
		public void testSetImaginary() {
			iTest.setImaginary(2.1);
			assertEquals("Set Imaginary: ", 2.1, iTest.getImaginary(), iTest.getImaginary());
		}
		
		//****************ADD****************
		@Before
		public void setUp2() {
			rTest = new ComplexNum(2.0, 1.5);
			iTest = new ComplexNum(1.5, 2.0);
		}
		
		@Test
		public void addTest() {
			rTest.add(rTest);
			iTest.add(iTest);
			assertEquals("Add Real: ", rTest.toString(), rTest.toString());
			assertEquals("Add Imaginary: ", iTest.toString(), iTest.toString());
		}
		
		//****************SUB****************
		@Before
		public void setUp3() {
			rTest = new ComplexNum(4.0, 2.5);
			iTest = new ComplexNum(3.5, 4.5);
		}
		
		@Test
		public void subTest() {
			rTest.subtract(rTest);
			iTest.subtract(iTest);
			assertEquals("Subtract Real: ", rTest.toString(), rTest.toString());
			assertEquals("Subtract Imaginary: ", iTest.toString(), iTest.toString());
		}
		
		//*****************MUL***************
		@Before
		public void setUp4() {
			rTest = new ComplexNum(6.0, 5.3);
			iTest = new ComplexNum(8.0, 7.2);
		}
		
		@Test
		public void mulTest() {
			rTest.multiply(rTest);
			iTest.multiply(iTest);
			assertEquals("Multiply Real: ", rTest.toString(), rTest.toString());
			assertEquals("Multiple Imaginary: ", iTest.toString(), iTest.toString());
		}
		
		//****************DIV*****************
		@Before
		public void setUp5() {
			rTest = new ComplexNum(4.3, 3.1);
			iTest = new ComplexNum(2.8, 3.7);
			assertEquals("Divide Real: ", rTest.toString(), rTest.toString());
			assertEquals("Divide Imaginary ", iTest.toString(), iTest.toString());
		}
		
		//****************NEG******************
		@Before
		public void setUp6() {
			rTest = new ComplexNum(5.2, 4.8);
			iTest = new ComplexNum(3.8, 5.7);
		}
		
		@Test
		public void negTest() {
			rTest.neg(rTest);
			iTest.neg(iTest);
			assertEquals("Negation Real: ", rTest.toString(), rTest.toString());
			assertEquals("Negation Imaginary: ", iTest.toString(), iTest.toString());
		}
		
		//************************************
		@Test
		public void testToString() {
			assertEquals("To String Test Real: ", rTest.toString(), rTest.toString());
			assertEquals("To String Test Imaginary: ", iTest.toString(), iTest.toString());
		}
		
		@Test
		public void testEquals() {
			assertEquals("Equals Test Real: ", false,  rTest.equals(iTest));
			assertEquals("Equals Test Imaginary: ", false, iTest.equals(rTest));
		}
}
