package InClassPractice;
import java.util.*;
import java.io.*;

//using BufferedReader to parse data
public class FileInput3 {
	public static void main(String[] args) {
		String fileName = "input1.txt";
		BufferedReader input = null;
		String line = null;
		
		try {
			input = new BufferedReader(new FileReader(fileName));
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found!");
			System.exit(1);
		}
		
		try {
			while((line = input.readLine()) != null) {
				System.out.println(line);
			}
		}
		catch(IOException e) {
			System.out.println("Error in reading data.");
			System.exit(1);
		}
	}
}

