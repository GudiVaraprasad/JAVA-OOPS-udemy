
class Account {
	
	private double balance = 0; // default is zero hence initialization not required.
	
	public void debit(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
		}
	}
	
	public void credit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}
	
	public void showBalance() {
		System.out.println("Current balance - " + balance);
	}
	
}

public class Main {

	public static void main(String[] args) {
		Account a1;
		
		a1 = new Account();
		
		a1.credit(2000);
		a1.debit(1000);
		
		a1.showBalance();
		
		a1.debit(-2000);
		
		a1.showBalance();
		
	}

}
