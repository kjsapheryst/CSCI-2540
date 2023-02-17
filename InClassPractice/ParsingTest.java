package InClassPractice;

import java.util.StringTokenizer;

public class ParsingTest {
	public static void main(String[] args) {
		String str = "Disney World;Ireland;Greenville;beach;New York";
		
		//test to split method
		String[] strArr;
		strArr = str.split(";");
		System.out.println(strArr[0]);
		
		for(String s:strArr) {
			System.out.println(s);
		}
		
		System.out.println();
		
		//test to StringTokenizer class
		StringTokenizer st = new StringTokenizer(str, ";");
		
		while (st.hasMoreTokens()) {
			
		}
	}
}
