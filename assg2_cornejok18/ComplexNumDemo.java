/** 
 * 
 * @author Kira Cornejo
 *
 */
package assg2_cornejok18;

public class ComplexNumDemo {
	public static void main(String[] args) {
		
		//Test constructors of ComplexNum class
		ComplexNum a1 = new ComplexNum();
		ComplexNum s1 = new ComplexNum();
		ComplexNum m1 = new ComplexNum();
		ComplexNum n1 = new ComplexNum();
		
		//test addition
		a1.setReal(2.5);
		a1.setImaginary(3.5);
		//test subtraction
		s1.setReal(4.5);
		s1.setImaginary(1.5);
		//test multiplication
		m1.setReal(3.0);
		m1.setImaginary(4.0);
		//test negation
		n1.setReal(5.0);
		n1.setImaginary(2.5);
		
		//output test values
		System.out.println("Test values: ");
		System.out.println("Addition:" + "\t" + "Real: " + a1.getReal() + "; Imaginary: " + a1.getImaginary());
		System.out.println("Subtraction:" + "\t" + "Real: " + s1.getReal() + "; Imaginary: " + s1.getImaginary());
		System.out.println("Multiply:" + "\t" + "Real: " + m1.getReal() + "; Imaginary: " + m1.getImaginary());
		System.out.println("Negation:" +  "\t" + "Real: " + n1.getReal() + "; Imaginary: " + n1.getImaginary());
		System.out.println();
		//output test cases
		System.out.println("Test Cases: ");
		System.out.println("Add:      " + "\t" + a1.getReal() + " + " + a1.getImaginary() + "i");
		System.out.println("Subtract: " + "\t" + s1.getReal() + " - " + s1.getImaginary() + "i");
		System.out.println("Multiply: " + "\t" + m1.getReal() + " * " + m1.getImaginary() + "i");
		System.out.println("Negation: " + "\t" + "-" + n1.getReal() + " - " + n1.getImaginary() + "i");
	}
}
