package activity1;
import java.util.*;
/** 
 * 
 * @author Kira Cornejo
 *
 */
public class CountGrades {
	public static void main(String[] args) {
		int numOfGrades;
		Scanner kbd = new Scanner(System.in);
		System.out.println("Please enter number of grades: ");
		numOfGrades = kbd.nextInt();
		//if numOfGrades entered is "-" or 0
		if(numOfGrades <= 0) {
			System.out.println("Error: Please try again.");
		}
		//declare array for grades
		int[] grades = new int[numOfGrades];
		
		//Enter grades
		System.out.println("Enter a grade: ");
		//to calculate average of input grades
		double avg = 0;
		for(int i = 0; i < numOfGrades; i++) {
			grades[i] = kbd.nextInt();
			avg = avg + grades[i];
		}
		avg = avg / numOfGrades;
		System.out.println("The average grade is: " + avg);
		
		//to find above average grades
		System.out.println("The grades above the average are: ");
		for(int i = 0; i < numOfGrades; i++) {
			if(grades[i] >= avg) {
				System.out.println(grades[i]);
			}
		}
	}
}
