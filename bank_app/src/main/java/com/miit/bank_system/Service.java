package com.miit.bank_system;

import com.miit.bank_exception.InsufficientAmount;

public interface Service {
	void deposit(int amount);
	void withdraw(int amount) throws InsufficientAmount;
	void viewbalance();
	
	public String getAcc_name();
	public void setAcc_name(String acc_name);
	
	public int getAcc_no();
	public void setAcc_no(int acc_no);
	
	public int getAcc_pin();
	public void setAcc_pin(int pin);
	
	public int getBalance();
	public void setBalance(int balance);
}
