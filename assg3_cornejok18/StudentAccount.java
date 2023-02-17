/**
 *
 @author Kira Cornejo
 * Main Program
 */
package assg3_cornejok18;

public class StudentAccount implements Comparable <StudentAccount> {

	//instances
	private long acctNo;
	private double balance;
	private int counter; //to track account number
	
	//default constructor
	public StudentAccount() {
		balance = 0;
		acctNo = 0;
	}
	
	/**
	 * to get initial account balance from user
	 * @param initBalance
	 */
	public StudentAccount(double initBalance) {
		balance = initBalance;
	}
	
	/**
	 * get methods
	 * @return acctNo
	 * @return balance
	 * @return counter
	 */
	public long getacctNo() {
		return acctNo;
	}
	public double getBalance() {
		return balance;
	}
	public static int getCounter(int counter) {
		return counter++;
	}
	
	/**
	 * set methods
	 * @param newBalance
	 */
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	
	/**
	 * If amount is greater than 0.
	 * If less than 0 or negative output message
	 * @param deposit
	 */
	public void deposit(double deposit) {
		if(deposit > 0) {
			balance += deposit;
			return;
		}
		
		else{
			System.out.println("Error: Amount is less than 0. Please try again.");
		}
	}

	/**
	 * charge method
	 * @param charge
	 */
	public void charge(double charge) {
		if(charge > 0) {
			setBalance(getBalance() - charge);
		}
		
		else {
			System.out.println("Error: Amount is less than 0. Please try again.");
		}
	}
	
	/**
	 * transfer amount parameter
	 * add's charge to transfer amount
	 * @param charge
	 * @param transfer
	 */
	public void transfer(StudentAccount charge, int transfer) {
		if(transfer > 0) {
			setBalance(getBalance() - transfer);
			charge.setBalance(getBalance() + transfer);
		}
		
		else {
			return;
		}
	}
	
	@Override
	public String toString() {
		return "Account Number: " + acctNo + "Current Balance: " + balance;
	}
	
	/**
	 * printInfo method
	 */
	public void printInfo() {
		System.out.println("Account number: " + acctNo);
		System.out.println("Current Balance: " + balance);
	}
	
	/**
	 * 
	 * other method: compareTo method
	 * @param comp
	 * @return
	 */
	public int compareTo(StudentAccount comp) {
		if(this.balance == comp.balance) {
			return 0;
		}
		
		else if(this.balance > comp.balance) {
			return 1;
		}
		
		else {
			return -1;
		}
	}
}

