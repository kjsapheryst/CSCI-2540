/**
 * @author Kira Cornejo
 */
package activity5;
import java.util.*;
public class ExceptionPractice {
	public static void main(String[] args) {
		String input;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		input = keyboard.next();
		
		try {
			if(input.isEmpty()) {
				throw new EmptyStringException("Error: String is empty. Please try again.");
			}
			
			else {
				input = input.toUpperCase();
				System.out.println(input);
			}
		}
		catch(EmptyStringException e){
			System.out.println("Error: String is empty. Please try again.");
			System.exit(1);
		}
	}
}
