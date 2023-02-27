package com.miit.bank_exception;

@SuppressWarnings("serial")
public class InsufficientAmount extends Exception {
	public InsufficientAmount(String msg) {
		super(msg);
	}
}
