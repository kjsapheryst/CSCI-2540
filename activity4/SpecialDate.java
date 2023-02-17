/**
 * @author Kira Cornejo
 * QUIZ CODE: 5022
 */
package activity4;

public class SpecialDate extends Date{
	
	//private instances
	private String description;

	
	//default constructor
	public SpecialDate() {
		description = "A Special Date";
	}
	
	//four parameter constructor
	public SpecialDate(int month, int day, int year, String givendescription) {
		super(month, day, year);
		description = givendescription;
	}
	
	//get/set method
	public String getSpecialDate() {
		return description;
	}
	public void setSpecialDate(String newDescription) {
		description = newDescription;
	}
	
	//toString Method
	public String toString() {
		return getMonth() + "/" + getDay() + "/" + getYear() + ", " + description;
	}
	
	public void printDate() {
		System.out.println(getMonth() + "/" + getDay() + "/" + getYear() + ", " + description);
	}
	
}
