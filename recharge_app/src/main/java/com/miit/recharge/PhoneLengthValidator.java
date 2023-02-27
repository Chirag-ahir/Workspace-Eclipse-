package com.miit.recharge;

import java.util.Scanner;

public class PhoneLengthValidator {

	Scanner sc = new Scanner(System.in);
	public String number;

	public void phoneNoLength() throws NumberNotValidException, AccountSuspendedException {

		PhoneOperatorValidator pov = new PhoneOperatorValidator();

		System.out.print("Please enter your number: ");
		String i = sc.next();

		if (i.length() < 10 || i.length() > 10) {
			throw new NumberNotValidException("Number Invalid");
		}
		else if (i.equals("9898207573")) {
			System.out.println("Please enter a valid number as one of this is blocked");
		} 
		else if(i.equals("9374135887")) {
			throw new AccountSuspendedException("Account is suspended");
		}
		else if (i.length() == 10) {
			number = i;
			pov.phoneOperator();
		}
		else {
			throw new ArithmeticException();
		}
	}

}
