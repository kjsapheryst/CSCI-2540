package activity3;
import java.util.*;
/** 
 * @author Kira Cornejo
 * QUIZ CODE: 1184
 */
public class Date {
	//private instances
	private int month;
	private int day;
	private int year;
	
	//default constructor
	public Date() {
		month = 1;
		day = 1;
		year = 2000;
	}
	
	//3-parameter constructor
	public Date(int givenMonth, int givenDay, int givenYear) {
		month = givenMonth;
		day = givenDay;
		year = givenYear;
	}
	
	//get methods for instance variables
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	public int getYear() {
		return year;
	}
	
	//set methods for instance variables
	public void setMonth(int newMonth) {
		month = newMonth;
	}
	public void setDay(int newDay) {
		day = newDay;
	}
	public void setYear(int newYear) {
		year = newYear;
	}
	
	//toString method to return "month/day/year" as string
	public String toString() {
		return month + "/" + day + "/" + year;
	}
	
	//printDate method
	public void printDate() {
		System.out.println(month + "/" + day + "/" + year);
	}
}
