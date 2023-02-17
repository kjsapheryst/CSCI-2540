/**
 * @author Kira Cornejo
 * QUIZ CODE: 5022
 */
package activity4;

public class SpecialDateTest {
	public static void main(String[] args) {
		//Objects
		SpecialDate n1 = new SpecialDate();
		SpecialDate n2 = new SpecialDate(8,12,2013, "Mom's Birthday");
		Date n3 = new Date(4,5,2005);
		
		//print original tests
		System.out.println("Original Test Descriptions: ");
		System.out.println("Test 1(n1):" + "\t" + n1.getSpecialDate());
		System.out.println("Test 1(n2):" + "\t" + n2.getSpecialDate());
		
		//to change one test 2 output
		n2.setSpecialDate("Dad's Birthday!");
		System.out.println();
		System.out.println("Updated description for Test 2(n2):" + "\t" + n2.getSpecialDate());
		System.out.println();
		
		//compareTo method
		System.out.println("Comparing Date Values: ");
		if(n2.compareTo(n1) == 1) {
			System.out.println("n2 is after n1");
		}
		else if(n2.compareTo(n1) == 0){
			System.out.println("n2 is the same date as n1");
		}
		else {
			System.out.println("n2 is before n1");
		}
			
		if(n3.compareTo(n1) == 1) {
			System.out.println("n3 is after n1");
		}
		else if(n3.compareTo(n1) == 0) {
			System.out.println("n3 is the same date as n1");
		}
		else {
			System.out.println("n3 is before n1");
		}
		System.out.println();
		
		
		//Override: toString Method
		System.out.println("Test Dates with toString: ");
		System.out.println(n1.toString());
		System.out.println(n2.toString());
		System.out.println(n3.toString());
		System.out.println();
		
		//Override: printDate method
		System.out.println("Test Dates with printDate: "); 
		System.out.print("Test 1(n1):" + "\t");
		n1.printDate();
		System.out.print("Test 2(n2):" + "\t");
		n2.printDate();
		System.out.print("Test 3(n3):" + "\t");
		n3.printDate();
		
		
	}
	
}
