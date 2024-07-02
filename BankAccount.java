package Bank;

public class BankAccount {
	
	int Id = 101;
	String name = "Saiful";
	String Address = "Dhaka, Bangladesh";
	double initialBalance = 0.0;
	
	public double deposit(double amount) {
		
		if(amount >0) {
			initialBalance += amount;
			System.out.println(amount+ " tk Deposit Successfully");
			return initialBalance;
		}
		else {
			System.out.println("Please enter valid amount for deposit");
			return 0;
		}
		
		
	}
	
	public void withdraw(double amount) {
		
		if(amount <(initialBalance-500)) {
			initialBalance -= amount;
			System.out.println(amount+ " tk Withdraw Successfully");
		}
		else {
			System.out.println("Insufficient balance for withdraw ");
		}
	}

	

}
