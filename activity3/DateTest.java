package activity3;
import java.util.*;
/** 
 * @author Kira Cornejo
 * QUIZ CODE: 1184
 */
public class DateTest {
	public static void main(String[] args) {
		//Test constructors of Date class
		Date d1 = new Date();
		Date d2 = new Date(2,2,1000);
		Date d3 = new Date(3,3,3000);
		
		//Test toString method
		System.out.println("Date 2: " + d2.toString());
		System.out.println();
		
		//Change dates get/set methods of month, day, year
		d2.setMonth(4);
		d2.setDay(4);
		d2.setYear(4000);
		
		System.out.println("Change d2 date to: ");
		System.out.println("Month: " + d2.getMonth());
		System.out.println("Day: " + d2.getDay());
		System.out.println("Year: " + d2.getYear());
		System.out.println();
		
		//Updated output of date
		d1.printDate();
		d2.printDate();
		d3.printDate();
	}
}


