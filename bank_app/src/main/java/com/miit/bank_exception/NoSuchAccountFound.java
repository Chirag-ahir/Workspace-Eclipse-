package com.miit.bank_exception;

@SuppressWarnings("serial")
public class NoSuchAccountFound extends Exception {
	public NoSuchAccountFound(String msg) {
		super(msg);
	}
}
