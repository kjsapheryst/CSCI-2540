/**
 * @author Kira Cornejo
 */
package assg4_cornejok18;

public class Student {
	//instances
	private String ID;
	private String name;
	private char gender;
	private String dateOfBirth;
	private String major;
	

	/**
	 * First Student Constructor
	 * declared major instance
	 * @param givenID
	 * @param givenName
	 * @param givenGender
	 * @param givenDOB
	 * @param givenMajor
	 */
	public Student(String givenID, String givenName, char givenGender, String givenDOB, String givenMajor) {
		ID = givenID;
		name = givenName;
		gender = givenGender;
		dateOfBirth = givenDOB;
		major = givenMajor;
	}
	
	/**
	 * Second Student Constructor
	 * undeclared major instance
	 * @param givenID
	 * @param givenName
	 * @param givenGender
	 * @param givenDOB
	 */
	public Student(String givenID, String givenName, char givenGender, String givenDOB) {
		ID = givenID;
		name = givenName;
		gender = givenGender;
		dateOfBirth = givenDOB;
		major = "undeclared";
	}
	
	
	/**
	 * get methods for instance variables
	 * @return ID
	 * @return name
	 * @return gender
	 * @return dateOfBirth
	 * @return major
	 */
	public String getID() {
		return ID;
	}
	public String getName() {
		return name;
	}
	public char getGender() {
		return gender;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public String getMajor() {
		return major;
	}
	
	
	/**
	 * set methods for major instance variable
	 * @param newMajor
	 */
	public void setMajor(String newMajor) {
		major = newMajor;
	}
	
	
	/**
	 * toString method taking no parameter and return all information of student
	 */
	public String toString() {
		return ID + "," + name + "," + gender + "," + dateOfBirth + "," + major;
	}
	
	
	/**
	 * First static array
	 * Throws error if ID is not found in array
	 * @param arr
	 * @param NoOfStudents
	 * @param StudentName
	 * @return
	 * @throws StudentNotFoundException 
	 */
	public static int StudentSearchByName(Student[] arr, int NoOfStudents, String StudentName) throws StudentNotFoundException {
		for(int i = 0; i < NoOfStudents; i++) {
			if(arr[i].getName().equals(StudentName) ) {
			return i;
			}
		}
				throw new StudentNotFoundException("Error: Student not found.");
		}
	
	/**
	 * Second static array
	 * Throws error if ID is not found in array
	 * @param arr
	 * @param NoOfStudents
	 * @param StudentID
	 * @return
	 */
	public static int StudentSearchById(Student[] arr, int NoOfStudents, String StudentID) throws StudentNotFoundException {
		for(int i = 0; i < NoOfStudents; i++) {
			if(arr[i].getID().equals(StudentID)) {
				return i;
			}
		}
				throw new StudentNotFoundException("Error: Student not found.");

		}
	}
			


