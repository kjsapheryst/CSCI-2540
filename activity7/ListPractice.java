package activity7;
import java.util.*;
import java.io.*;
public class ListPractice {
	public static void main(String[] args) {
		//creating the array
		ArrayList<String> Date = new ArrayList<String>();
		Iterator<String> iterator;
		
		//add elements from txt file
		String fileName1 = "activity7_input.txt";
		String fileName2 = "activity7_output.txt";
		Scanner inputStream = null;
		PrintWriter outputStream = null;
		String line;
		
		//input stream
		try {
			inputStream = new Scanner(new File(fileName1));
		}
		catch(FileNotFoundException error) {
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
		
		while(inputStream.hasNextLine()) {
			line = inputStream.nextLine();
			String[] dates = line.split(" ");
			outputStream.println(dates);
			Date.add(line);
		}
		inputStream.close();
		outputStream.close();
		
		
		//sort all elements in array
		Collections.sort(Date);
		//output array in sorted order
		System.out.println("List in Sorted Order: ");
		for(int i = 0; i < Date.size(); i++) {
			System.out.println(Date.get(i));
		}
		System.out.println();
		
		//to print all the dates with one line
		System.out.println("Print all dates on one line: ");
		iterator = Date.iterator();
		while(iterator.hasNext()) {
			String nextDate = iterator.next();
			System.out.print(nextDate + " \t");
		}
		
	}
}
