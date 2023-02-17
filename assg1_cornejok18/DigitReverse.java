/** 
 * 
 * @author Kira Cornejo
 *
 */
package assg1_cornejok18;
import java.util.*;
public class DigitReverse {

	public static void main(String[] args) {
		int dig;
		Scanner kbd = new Scanner(System.in);
		//input(dig) from user
		System.out.println("Please enter a non-negative integer (-1 to exit): ");
		dig = kbd.nextInt();
		digitExtract(dig);
	}
	
	public static void digitExtract(int dig){
		int reverse;
		System.out.println("Your number in reversed order is: ");
		System.out.println(dig);
		while(dig > 0) {
				//to get first digit
				reverse = dig % 10;
				System.out.println(dig);
				//to remove digit
				dig /= 10;
			}
		if(dig == -1) {
			System.exit(dig);
		}
			
		}
	}
