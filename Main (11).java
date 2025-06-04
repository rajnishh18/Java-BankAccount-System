public class BankAccount {
	private String DepositorName;
	private long AccountNumber; 
	private String AccountType;
	private double BalanceAmount;

	//  Default constructor
	public BankAccount() {
		DepositorName = " ";
		AccountNumber = 0;
		AccountType = " ";
		BalanceAmount = -1;
	}

	// Parameterized constructor
	public BankAccount(String dName, long accno, String accoType, double balAmount) {
		DepositorName = dName;
		AccountNumber = accno;
		AccountType = accoType;
		BalanceAmount = balAmount;
	}

	// Initialize method
	public void initialize(String dName, long accno, String accoType, double balAmount) {
		DepositorName = dName;
		AccountNumber = accno;
		AccountType = accoType;
		BalanceAmount = balAmount;
	}

	//  Display account details
	public void display() {
		System.out.println("Depositor Name: " + DepositorName);
		System.out.println("Account Number: " + AccountNumber);
		System.out.println("Account Type: " + AccountType);
		System.out.println("Balance Amount: " + BalanceAmount);
	}

	//  Deposit money
	public void deposit(double amount) {
		BalanceAmount += amount;
	}

	// Withdraw money if sufficient balance
	public void withdraw(double amount) {
		if (amount <= BalanceAmount) {
			BalanceAmount -= amount;
		} else {
			System.out.println("Insufficient balance!");
		}
	}

	// Main method to test the class
	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount();
		acc1.initialize("Ram Kumar", 120147852, "Saving", 8000);

		BankAccount acc2 = new BankAccount("Piyush Kumar Singh", 1234567890, "Current", 70000);

		acc1.deposit(17000);
		acc1.display();

		System.out.println("**********************************");

		acc2.withdraw(20000);
		acc2.display();
	}
}
