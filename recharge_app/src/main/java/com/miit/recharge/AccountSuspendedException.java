package com.miit.recharge;

@SuppressWarnings("serial")
public class AccountSuspendedException extends Exception {

	public AccountSuspendedException(String string) {
		System.out.println("Account is suspended for this user. Please contact your customer care service.");
	}

}
