/**
 *
 @author Kira Cornejo
 * Test Class
 */
package assg3_cornejok18;

public class StudentAccountDemo {
	public static void main(String[] args){
		//testing StudentAccount
		StudentAccount a1 = new StudentAccount();
		StudentAccount a2 = new StudentAccount();
		StudentAccount a3 = new StudentAccount();
		StudentAccount a4 = new StudentAccount();
		
//		//testing RewardsAccount
//		RewardsAccount a5 = new RewardsAccount();
//		RewardsAccount a6 = new RewardsAccount();
//		RewardsAccount a7 = new RewardsAccount();
//		RewardsAccount a8 = new RewardsAccount();
		
		//set methods for StudentAccount
		a1.setBalance(100);
		a2.setBalance(200);
		a3.setBalance(300);
		a4.setBalance(400);
		//output initial account balances
		System.out.println("Initial Account Balances: ");
		System.out.println("Account 1: $" + a1.getBalance());
		System.out.println("Account 2: $" + a2.getBalance());
		System.out.println("Account 3: $" + a3.getBalance());
		System.out.println("Account 4: $" + a4.getBalance());
		System.out.println();
		
		//deposit amount
		System.out.println("Updated Account Balances after deposit: ");
		a1.deposit(100);
		a2.deposit(200);
		a3.deposit(-50);
		a4.deposit(0);
		System.out.println();
		//output updated account balance
		System.out.println("Account Balances:");
		System.out.println("Account 1: $" + a1.getBalance());
		System.out.println("Account 2: $" + a2.getBalance());
		System.out.println("Account 3: $" + a3.getBalance());
		System.out.println("Account 4: $" + a4.getBalance());
		System.out.println();
		
		//charge amount
		System.out.println("Updated Account Balances after charge: ");
		a1.charge(50);
		a2.charge(100);
		a3.charge(-50);
		a4.charge(0);
		System.out.println();
		
		//output updated account balance
		System.out.println("Account Balances:");
		System.out.println("Account 1: $" + a1.getBalance());
		System.out.println("Account 2: $" + a2.getBalance());
		System.out.println("Account 3: $" + a3.getBalance());
		System.out.println("Account 4: $" + a4.getBalance());
		System.out.println();
		
		//transfer amount
		a1.transfer(a2, 20);
		System.out.println("Updated Account Balance after transfer: ");
		System.out.println("Account 2: $" + a2.getBalance());
		a2.transfer(a3, -30);
		System.out.println("Account 3: $" + a3.getBalance());
		a3.transfer(a4, 0);
		System.out.println("Account 4: $" + a4.getBalance());
		System.out.println();
		
		
		////////////////////////////////////////////////////
		
		//rewards balance from RewardsAccount
		System.out.println("Account 1: " + ((RewardsAccount)a1).getRewards());
		System.out.println("Account 2: " + ((RewardsAccount)a2).getRewards());
		System.out.println("Account 3: " + ((RewardsAccount)a3).getRewards());
		System.out.println("Account 4: " + ((RewardsAccount)a4).getRewards());
		System.out.println();
		
		//testing toString method in RewardsAccount
		System.out.println("Testing toString in RewardsAccount: ");
		System.out.println("Account 1: " + a1.toString());
		System.out.println("Account 2: " + a2.toString());
		System.out.println("Account 3: " + a3.toString());
		System.out.println("Account 4: " + a4.toString());
		System.out.println();
		
		//redeem account method in RewardsAccount
		System.out.println("Redeem Rewards: ");
//		System.out.println(a1.redeemRewards());
//		System.out.println(a2.redeemRewards());
//		System.out.println(a3.redeemRewards());
//		System.out.println(a4.redeemRewards());
		
		//testing printInfo method in RewardsAccount
		System.out.println("Testing printInfo in RewardsAccount:");
		a1.printInfo();
		a2.printInfo();
		a3.printInfo();
		a4.printInfo();
		
		
		
		
		
		
	}
}