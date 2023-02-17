package assg1_cornejok18;
import java.util.*;
/** 
 * 
 * @author Kira Cornejo
 *
 */
public class DateChange {
	public static void main(String[] args) {
		//defining variables
		String date, month, day;
		Scanner kbd = new Scanner(System.in);
		//input(date) from user
		System.out.println("Please enter a date in the format month/day/year:" );
		date = kbd.nextLine();
		
		//to replace "/" with "."
		date.replace("/",".");
		//to swap month and day
		System.out.println("Your date in European form is: " + date.substring(4) + date.substring(8) + date.substring(12));
	}

}
