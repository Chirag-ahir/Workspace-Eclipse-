package com.miit.bank_system;
import com.miit.bank_exception.InsufficientAmount;

public class SavingAccount extends BankDetails implements Service{

	public SavingAccount(String acc_name, int acc_no, int pin, int balance) { //Constructor of SavingAccount
		super(acc_name, acc_no, pin, balance);
	}
	
	public void deposit(int amount) {
		balance+=amount;
	}
	
	public void withdraw(int amount) throws InsufficientAmount {
		if(balance > amount) {
			balance = balance - amount;
		}
		else {
			throw new InsufficientAmount("You don't have enough balance in your account!");
		}
	}
	
	public void viewbalance() {
		System.out.println("Blance remaining in your account: " + balance + "\n");
	}

}
