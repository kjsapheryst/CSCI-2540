/**
 * @author Kira Cornejo
 */
package assg5_cornejok18;
import java.util.*;
public class RecursionTest {
	
	/**
	 * two parameter method, recursive
	 * print beginning to end
	 * @param input
	 * @param begIndex
	 * @return
	 */
	public static String substringRecursive(String input, int begIndex) {
		if(begIndex >= input.length()) {
			return " ";
		}
		
		else {
			return input.charAt(begIndex)+ substringRecursive(input, begIndex + 1);
		}
	}
	
	
	/**
	 * three parameter method, recursive
	 * print beginning to just before end
	 * @param input
	 * @param begIndex
	 * @param endIndex
	 * @return
	 */
	public static String substringRecursive(String input, int begIndex, int endIndex) {
		if(begIndex >= input.length() || begIndex >= endIndex) {
			return " ";
		}
		
		else {
			return input.charAt(begIndex) + substringRecursive(input, begIndex + 1, endIndex);
		}
	}

	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
		//variables
		int option = 0;
		String input;
		int begIndex;
		int endIndex;
		Scanner keyboard = new Scanner(System.in);
		
		//loop main menu
		while(option != 3) {
			System.out.println("**Menu: Please Select an Option: **");
			System.out.println("1. Test two-parameter substringRecursive method");
			System.out.println("2. Test three-parameter substringRecursive method");
			System.out.println("3. Exit");
			option = keyboard.nextInt();
			keyboard.nextLine();
			
			switch(option){
			case 1: //if user chooses option 1
				System.out.println("Please enter a string: ");
				input = keyboard.nextLine();
				System.out.println("Please enter a beginning index: ");
				begIndex = keyboard.nextInt();
				System.out.println("Output: " + substringRecursive(input, begIndex));
				System.out.println();
				break;
				
			case 2: //if user chooses option two
				System.out.println("Please enter a string: ");
				input = keyboard.nextLine();
				System.out.println("Please enter a beginning index: ");
				begIndex = keyboard.nextInt();
				System.out.println("Please enter an end index: ");
				endIndex = keyboard.nextInt();
				System.out.println("Output: " + substringRecursive(input, begIndex, endIndex));
				System.out.println();
				break;
			
			case 3: //if user chooses option 3, exit's program
				System.out.println("Exiting Program...");
				System.exit(0);
			}
		}
	}
}
