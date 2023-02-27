package com.miit.bank_system;

public class BankDetails {
	
	String acc_name;
	int acc_no;
	int pin;
	int balance;
	
	public BankDetails(String acc_name, int acc_no, int pin, int balance) {
		super();
		this.acc_name = acc_name;
		this.acc_no = acc_no;
		this.pin = pin;
		this.balance = balance;
	}
	
	public String getAcc_name() {
		return acc_name;
	}

	public void setAcc_name(String acc_name) {
		this.acc_name = acc_name;
	}

	public int getAcc_no() {
		return acc_no;
	}

	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}
	
	public int getAcc_pin() {
		return pin;
	}

	public void setAcc_pin(int pin) {
		this.pin = pin;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
