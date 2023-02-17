package InClassPractice;

public class recursionTest {
	public static void main(String[] args) {
		System.out.println("Factorial of: " + fact(5));
		System.out.println("How long is the string 'pirates': " + strLen("pirates"));

		System.out.println("Print 'pirates' backwards: " + strRev("pirates"));
		System.out.println(strRev1("pirates"));
		System.out.println("Fibinachi Sequence for 7: " + fib(7));
	}
	
	public static int fact(int n) {
		if(n == 1) {
			return 1;
		}
		else {
			return n*fact(n-1);
		}
	}
	
	public static int strLen(String s) {
		if((s.equals("") || s == null)) {
			return 0;
		}
		else {
			return 1 + strLen(s.substring(1));
		}
	}
	
	public static String strRev(String s) {
		if((s.equals("")) || s == null) {
			return s;
		}
		else {
			return strRev(s.substring(1) + s.charAt(0));
		}
	}
	
	public static String strRev1(String s) {
		if((s.equals("")) || s == null) {
			return s;
		}
		else {
			return s.charAt(s.length() - 1) + strRev1(s.substring(0,s.length() -1));
		}
	}
	
	public static int fib(int n) {
		if(n == 1) {
			return 1;
		}
		if(n == 2) {
			return 1;
		}
		return fib(n-1)+fib(n-2);
	}
}
