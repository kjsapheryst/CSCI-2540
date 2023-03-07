/**
 * @author Kira Cornejo
 */
package activity6;
import java.util.*;
public class RecursionPractice {
	/**
	 * Main method to test recursive method 
	 * @param args
	 */
	public static void main(String[] args) {
		String input;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("***Recursive Method Test*** ");
		System.out.print("Please enter a word: ");
		input = keyboard.nextLine();
		System.out.println("Odd String: " + oddString(input));
		System.out.println("Even String: " + evenString(input));
	}
	
	/**
	 * OddString Method
	 * @param oddInput
	 * @return
	 */
	public static String oddString(String oddInput) {
		if(oddInput.length() <= 1) {
			return oddInput.substring(0);
		}
		else {
			return oddInput.charAt(1) + oddString(oddInput.substring(2));
		}

	}
	
	/**
	 * EvenString Method
	 * @param evenInput
	 * @return
	 */
	public static String evenString(String evenInput) {
		if(evenInput.length() <= 1) {
			return evenInput.substring(0);
		}
		else {
			return evenInput.charAt(0) + evenString(evenInput.substring(2));
		}
	}
}
