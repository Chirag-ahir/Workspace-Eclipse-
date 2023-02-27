package com.miit.recharge;

@SuppressWarnings("serial")
public class NumberNotValidException extends Exception {

	public NumberNotValidException(String string) {
		System.out.println("Number is invalid. please enter correct number");
	}

	
	
}
