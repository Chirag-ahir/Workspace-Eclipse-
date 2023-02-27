package com.miit.recharge;

public class RechargeConfirmationApp {
	public static void main(String[] args) {

		while (true) {
			PhoneLengthValidator plv = new PhoneLengthValidator();
			try {
				plv.phoneNoLength();
			} catch (NumberNotValidException | AccountSuspendedException e) {
				System.out.println("Invalid Entry");
			}
		}

	}
}
