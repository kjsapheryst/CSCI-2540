package InClassPractice;
import java.util.*;
import java.io.*;

public class FileInputTest {
	public static void main(String[] args) {
		String fileName = "input1.txt";
		Scanner input = null;
		
		try {
			input = new Scanner(new File(fileName));
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found!");
			System.exit(1);
		}
		
		while(input.hasNextLine()) {
			System.out.println(input.nextLine());
		}
	}
}
