package main;

import repository.AccountRepository;
import service.AccountService;
import java.util.Scanner;
import model.Account;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountRepository accountRepository = new AccountRepository();
		Account account=new Account();
        AccountService accountService = new AccountService(accountRepository);
        Scanner sc=new Scanner(System.in);
        boolean bool=sc.nextBoolean();
        while(bool) {
        	System.out.println(accountService.createAccount(1001,"Vignesh") ? "Account Created Successfully..." : "Account not created...");
        	System.out.println(accountService.createAccount(1002,"Rahul")? "Account Created Successfully..." : "Account not created...");
        	System.out.println(accountService.createAccount(1003,"Anil")? "Account Created Successfully..." : "Account not created...");
        	System.out.println(accountService.createAccount(1001,"Vijay")? "Account Created Successfully..." : "Account not created...");
        	
        	System.out.println(accountService.deposit(1001, 5000) ? "Deposited Successfully..." : "Deposit Declained...");
        	System.out.println(accountService.withdraw(1001, 500) ? "Amount Withdrawn Successfull..." : "Withdrawn failed...");
        	System.out.println(accountService.withdraw(1001, 5000) ? "Amount Withdrawn Successfull..." : "Withdrawn failed...");
        	System.out.println(accountService.getAccount(1001).toString());
        	System.out.println(accountService.getAllAccounts().toString());
        	bool=sc.nextBoolean();
        }
	}

}
