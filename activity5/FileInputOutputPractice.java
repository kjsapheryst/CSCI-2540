/**
 * @author Kira Cornejo
 */
package activity5;
import java.util.*;
import java.io.*;
public class FileInputOutputPractice {
	public static void main(String[] args) {
		String fileName1 = "activity5_input.txt";
		String fileName2 = "activity5_output.txt";
		
		Scanner inputStream = null;
		PrintWriter outputStream = null;
		String line;
		
		//input stream
		try {
			inputStream = new Scanner(new File (fileName1));
		}
		catch(FileNotFoundException error){
			System.out.println("Error: Cannot open file." + fileName1);
			System.exit(1);
		}
		
		//output stream
		try {
			outputStream = new PrintWriter(fileName2);
		}
		catch(IOException error){
			System.out.println("Error: Cannot open file." + fileName2);
			System.exit(0);
		}
		
		//to enter lines of text
		while(inputStream.hasNextLine()) {
			line = inputStream.nextLine();
			line = line.toUpperCase();
			outputStream.println(line);
		}
		inputStream.close();
		outputStream.close();
	}
}
