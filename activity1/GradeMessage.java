package activity1;
import java.util.*;
public class GradeMessage {
	
	public static void message(char grade) {
		switch(grade)
		{
		case 'A', 'a':
			System.out.println("Great job!");
			break;
		case 'B', 'b':
			System.out.println("Good job!");
			break;
		case 'C', 'c':
			System.out.println("You pass the course!");
			break;
		case 'D', 'd':
		case 'F', 'f':
			System.out.println("Sorry you have to retake the course.");
		default:
			System.out.println("Invalid grade.");
		}
	}
	
	public static void main(String[] args) {
		char grade;
		Scanner kbd = new Scanner(System.in);
		System.out.println("Please enter a letter grade: ");
		grade = kbd.next().charAt(0);
		message(grade);
	}

}
