/**
 *
 @author Kira Cornejo
 * Subclass to StudentAccount
 */
package assg3_cornejok18;

public class RewardsAccount extends StudentAccount {

	//instances
	private double rewards;
	
	//default constructor
	public RewardsAccount() {
		super();
		rewards = 0;
	}
	
	/**
	 * RewardsAccount Method
	 * @param balance
	 */
	public RewardsAccount(double balance) {
		super(balance);
		if(balance >= 100) {
			rewards =  (balance * 0.04);
		}
	}
	
	/**
	 * get Rewards from user
	 * @return
	 */
	public double getRewards() {
		return rewards;
	}
	
	/**
	 * redeem rewards function
	 */
	public void redeemRewards() {
		if(rewards >= 20) {
			double balance = getBalance();
			setBalance(balance + rewards);
			rewards = 0;
		}
		
		else {
			System.out.println("Error: Rewards not yet redeemable. Please collect more rewards to try again later.");
		}
	}
	
	//override methods
	@Override
	public String toString() {
		return "Account Number: " + getacctNo() + "Current Balance: " + getBalance() + "Rewards Balance: " + rewards;
	}
	
	@Override
	public void deposit(double deposit) {
		if(deposit >= 100) {
			double balance = getBalance();
			setBalance((balance * 0.04) + balance);
		}
	}
	
	//print info to screen
	public void printInfo() {
		System.out.println("Account Number: " + getacctNo());
		System.out.println("Current balance: " + getBalance());
		System.out.println("Rewards Balance: " + rewards);
	}
}
