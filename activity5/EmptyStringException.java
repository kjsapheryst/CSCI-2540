/**
 * @author Kira Cornejo
 */
package activity5;
import java.util.*;
public class EmptyStringException extends Exception {
	
	//default constructor
	public EmptyStringException() {
		super();
	}
	
	/**
	 * one-parameter constructor
	 * @param input
	 */
	public EmptyStringException(String input) {
		super(input);
	}
}
