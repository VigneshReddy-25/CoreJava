package Abstract;

public class CurrentAccount extends Account {

	static int overdraft=5000;
	public CurrentAccount(int accountNumber, int balance) {
		super(accountNumber, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean withdraw(int amount) {
		// TODO Auto-generated method stub
		if((balance+overdraft)<amount)
			return false;
		balance-=amount;
		return true;
	}

}
