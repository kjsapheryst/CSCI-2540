/**
 * @author Kira Cornejo
 */
package assg4_cornejok18;
import java.io.*;
import java.util.*;
public class StudentApplication {
	public static void main(String[] args) throws StudentNotFoundException, Exception {
		String ID;
		String name;
		char gender;
		String dateOfBirth;
		String major;
		
		
		String fileName = "assgn4_input.txt";
		Scanner keyboard = new Scanner(System.in);
		Scanner inputStream = null;
		String line;
		int count = 0;
		
		String str = "assg4_input.txt";
		String[] Student = new String[100];
		Student = str.split(",");
		System.out.printf(str,  count);
		System.out.println("Total number of Students: " + count);

		inputStream = new Scanner(new File(fileName));
		while (inputStream.hasNextLine()) {
			line = inputStream.nextLine();
			System.out.println();
		}
		inputStream.close();
		
		
		/**
		 * main function
		 */
		int input = keyboard.nextInt();
		do {
			//print menu
			System.out.println("******Menu******");
			System.out.println("1. Search student by ID");
			System.out.println("2. Search student by name");
			System.out.println("3. Change student major");
			System.out.println("4. Exit");
		}
			
			while(input != 4);
		{
			switch(input) {
			case 1:
				System.out.println("Please enter Student ID: " );
				ID = keyboard.nextLine();
				if(str.contains(ID)) {
					System.out.println(ID);
				}
				else {
					throw new StudentNotFoundException("Error: Student Not Found.");
				}
				System.out.println();
			
			
			
			case 2:
				System.out.println("Please enter Student Name: ");
				name = keyboard.nextLine();
				if(str.contains(name)) {
					System.out.println(name);
				}
				else {
					throw new StudentNotFoundException("Error: Student Not Found.");
				}
			
			case 3:
				System.out.println("Please indicate new major: ");

			
			case 4:
				System.exit(0);
			}
		}
	}
}

