package application;

import entities.Account;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc1 = new Account(1001, "Alex", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());

	    Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.1);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
	}

}
