/**
 * @author Kira Cornejo
 * exception class
 */
package assg4_cornejok18;
@SuppressWarnings("serial")
public class StudentNotFoundException extends Exception {
	/**
	 * Default constructor
	 */
	public StudentNotFoundException() {
		super("Error: Student not found.");
	}
	
	/**
	 * One-Parameter Constructor
	 * @param message
	 */
	public StudentNotFoundException(String message) {
		super(message);
	}
	
}

