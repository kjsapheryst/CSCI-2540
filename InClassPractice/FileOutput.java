package InClassPractice;
import java.util.*;
import java.io.*;
public class FileOutput {

	public static void main(String[] args) {
		PrintWriter output = null;
		try {
			output = new PrintWriter("output.txt");
		}
		catch(IOException e) {
			System.out.println("Fail to write to the output file.");
			System.exit(1);
		}
		
		output.println("Test to write to the output file");
		output.println("Done");
	}
}
