package activity1;
import java.util.Scanner;
public class practice {
	public static void main(String[] args) {
	String str, date;
	char firstCh, lastCh;
	int len;

	Scanner kbd = new Scanner(System.in);
	System.out.println("Please enter a line of text: ");
	str = kbd.nextLine();

	len = str.length();
	firstCh = str.charAt(0);
	lastCh = str.charAt(str.length()-1);
	System.out.println("The length is:" + len);
	System.out.println("The first character is: " + firstCh);
	System.out.println("The last character is: " + lastCh);
	//////////////////////////
	System.out.println(str.substring(1,3)); //does not include c or s
	System.out.println(str.substring(1)); //does not include c
	////////////////////////
	System.out.print("Please enter today's date: ");
	date = kbd.nextLine();
	System.out.println(date);
	int index1, index2;
	index1 = date.indexOf('/');
	index2 = date.lastIndexOf('/');
	System.out.println("index1 = " + index1);
	System.out.println("index2 = " + index2);
	
	}
}
