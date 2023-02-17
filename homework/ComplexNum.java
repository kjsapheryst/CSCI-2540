/** 
 * 
 * @author Kira Cornejo
 *
 */
package homework;
import java.util.*;

public class ComplexNum {
	
	//private instances
	private double real;
	private double imaginary;
	
	//default constructor
	public ComplexNum() {
		real = 0;
		imaginary = 0;
	}
	
	/**
	 *to get real
	 * @param inputReal
	 */
	public ComplexNum(double inputReal) {
		real = inputReal;
		imaginary = 0;
		
	}
	
	/**
	 * 
	 * @param givenReal
	 * @param givenImaginary
	 */
	public ComplexNum(double givenReal, double givenImaginary) {
		real = givenReal;
		imaginary = givenImaginary;
	}
	
	//get methods
	public double getReal() {
		return real;
	}
	public double getImaginary() {
		return imaginary;
	}
	
	/**
	 *set real
	 * @param newReal
	 */
	public void setReal(double newReal) {
		real = newReal;
	}
	/**
	 * set imaginary
	 * @param newImaginary
	 */
	public void setImaginary(double newImaginary) {
		imaginary = newImaginary;
	}
	
	/**
	 * add method
	 * @param a
	 * @return
	 */
	public ComplexNum add(ComplexNum a) {
		real = a.getReal() + this.getReal();
		imaginary = a.getImaginary() + this.getImaginary();
		return new ComplexNum(real,imaginary);
	}
	/**
	 * subtract method
	 * @param s
	 * @return
	 */
	public ComplexNum subtract(ComplexNum s) {
		real = s.getReal() + this.getReal();
		imaginary = s.getImaginary() + this.getImaginary();
		return new ComplexNum(real,imaginary);
	}
	/**
	 * multiplication method
	 * @param m
	 * @return
	 */
	public ComplexNum multiply(ComplexNum m) {
		real = m.getReal() + this.getReal();
		imaginary = m.getImaginary() + this.getImaginary();
		return new ComplexNum(real,imaginary);
	}
	
	/**
	 * negation method
	 * @param n
	 * @return
	 */
	public ComplexNum neg(ComplexNum n) {
		real = this.getReal() * -1;
		imaginary = this.getImaginary() * -1;
		return new ComplexNum(real, imaginary);
	}
	
	/**
	 * toString Method
	 */
	public String toString() {
		return real + "+" + imaginary + "i";
	}
	
	/**
	 * equals method
	 */
	public boolean equals(Object e) {
		if (e == null) {
			return false;
		}
		else if(e instanceof ComplexNum) {
			ComplexNum temp = (ComplexNum) e;
			return (this.getReal() == temp.getReal() && this.getImaginary() == temp.getImaginary());
		}
		else {
			return false;
		}
	}
}
