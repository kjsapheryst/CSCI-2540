/** 
 * @author Kira Cornejo
 * QUIZ CODE: 5022
 */
package activity4;

public class Date implements Comparable <Date> {
	
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
	
	/**
	 * @param t : the other day
	 * Compare the day with another day
	 */
	public int compareTo(Date t) {
		if (this.year < t.year && this.month < t.month && this.day < t.day) {
			return -1;
		}
		else if(this.year > t.year && this.month > t.month && this.day > t.day) {
			return 1;
		}
		else {
			return 0;
		}
	}
}
