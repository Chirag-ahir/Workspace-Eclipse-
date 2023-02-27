package com.miit.recharge;

import java.util.Arrays;
import java.util.Scanner;

public class PhoneOperatorValidator {

	PhoneRechargeAmount pra = new PhoneRechargeAmount();

	String arr[] = { "Jio", "Airtel", "Vodafone" };

	Scanner sc = new Scanner(System.in);

	public void phoneOperator() throws ArrayIndexOutOfBoundsException {

		System.out.print("Please select your operator from Jio, Airtel, Vodafone: ");
		String i = sc.next();

		if (Arrays.asList(arr).contains(i)) {

			if (i.equals("Vodafone")) {
				System.out.println("Recharge range for Vodafone plan is 50.0 to 450.0");
				pra.rechargeAmoutVodafone();
			} else if (i.equals("Airtel")) {
				System.out.println("Recharge range for Airtel plan is 10.0 to 125.0");
				pra.rechargeAmoutAirtel();
			} else if (i.equals("Jio")) {
				System.out.println("Recharge range for Jio plan is 50.0 to 600.0");
				pra.rechargeAmountJio();
			} else {
				System.out.println();
			}
		} else {
			throw new ArrayIndexOutOfBoundsException("No such operator found for your recharge.");
		}
	}

}
