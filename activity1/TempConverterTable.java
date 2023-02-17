package activity1;
import java.util.*;
public class TempConverterTable {
	
	public static void convert(int calc) {
		for(int i = 0; i < 41; i++){
			calc = (int) (Math.round(i * ((double) 9)/5) + 32);
			System.out.print(i);
			System.out.print('\t');
			System.out.print('\t');
			System.out.println(calc);
		}
	}
	
	public static void main(String[] args) {
		int calc = 0;
		System.out.print("Celsius: " + '\t');
		System.out.println("Fahrenheit: " + '\t');
		convert(calc);
	}

}
