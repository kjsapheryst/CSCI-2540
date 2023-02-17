package activity1;
import java.util.*;
public class tempConverter {
	public static void main(String[] args) {
		// code: 1314
		int celsius, calc;	
		Scanner kbd = new Scanner(System.in);
		System.out.println("Please enter a temperature in degrees Celsius: ");
		celsius = kbd.nextInt();
		calc = (int) (celsius * ((double) 9)/5) + 32;
		System.out.println("Farenheit= " + calc);
	}
}
