package Abstract;

public class SavingsAccount extends Account {

	public SavingsAccount(int accountNumber, int balance) {
		super(accountNumber, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean withdraw(int amount) {
		// TODO Auto-generated method stub
		if(amount>balance) {
			return false;
		}
		balance-=amount;
		return true;
	}

}
