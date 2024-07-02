package Bank;

public class CheckingAccount extends BankAccount{
	
	
	double withdrawalLimit = 5000.0;
	
	@Override
	public void withdraw(double amount) {
		
		if(amount <= withdrawalLimit) {
			initialBalance -= amount;
			System.out.println(amount+ " tk Withdraw Successfully");
		}
		else if(amount> withdrawalLimit) {
			
			System.out.println("Please enter amount in withdrawal limit");
		}
		
		
	}
}
