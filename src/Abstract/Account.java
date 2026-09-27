package Abstract;

public abstract class Account {

	int accountNumber;
	int balance;
	public Account(int accountNumber,int balance) {
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	public boolean deposit(int amount) {
		balance += amount;
		return true;
	}
	abstract public boolean  withdraw(int amount);
}
