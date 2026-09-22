package service;

import repository.AccountRepository;

import java.util.List;

import model.Account;
public class AccountService {

	private AccountRepository accountRepository;
	
	public AccountService(AccountRepository accountRepository) {
		this.accountRepository=accountRepository;
	}
	public boolean deposit(long accountNumber, double amount) {
			Account ac1=accountRepository.findAccount(accountNumber);
			if (ac1 == null || amount <= 0) {
			    return false;
			}
			ac1.setBalance(ac1.getBalance()+amount);
		return true;
	}
	
	public boolean withdraw(long accountNumber,double amount) {
		Account ac1=accountRepository.findAccount(accountNumber);

		if (ac1 == null || amount <= 0 || amount > ac1.getBalance()) {
		    return false;
		}

		ac1.setBalance(ac1.getBalance() - amount);
		return true;
	}
	
	public boolean createAccount(long accountNumber, String accountHolderName) {
	    Account account = new Account(accountNumber, accountHolderName);
	    boolean b=accountRepository.addAccount(account);
	    return b;
	}
	public Account getAccount(long accountNumber) {
		return accountRepository.findAccount(accountNumber);
	}
	public List<Account> getAllAccounts(){
		return accountRepository.getAllAccounts();
	}
	public boolean closeAccount(long accountNumber) {
		return accountRepository.removeAccount(accountNumber);
	}
}
