package com.miit.recharge;

import java.util.Scanner;

public class PhoneRechargeAmount {

	public double amount;
	public String operator;

	// PhoneLengthValidator plv = new PhoneLengthValidator();
	RechargeConfirmationApp rac = new RechargeConfirmationApp();

	Scanner sc = new Scanner(System.in);

	public void rechargeAmountJio() throws NullPointerException {
		System.out.print("Please pick your plan amount: ");
		double JioRechargeAmount = sc.nextDouble();

		if (JioRechargeAmount == 0.0) {
			throw new NullPointerException("Amount must be some value instead of zero");
		} else if (JioRechargeAmount > 600.0) {
			System.out.println("Amount should not be greater than 600.0");
		} else if (JioRechargeAmount < 50.0) {
			System.out.println("Amount should not be less than 50.0");
		} else {
			amount = JioRechargeAmount;
			operator = "Jio";
			System.out.println("We are processig your request. Please wait");
			System.out.println("Recharge info for: Your number" + " Your recharge successful for the payment of "
					+ amount + " Your current account balance is " + amount + " Thank you for stay connected with "
					+ operator + ". Have a happy life ahed.");
		}
	}

	public void rechargeAmoutAirtel() throws NullPointerException {
		System.out.print("Please enter your recharge amount: ");
		double AirtelRechargeAmount = sc.nextDouble();

		if (AirtelRechargeAmount == 0.0) {
			throw new NullPointerException("Amount must be some value instead of zero");
		} else if (AirtelRechargeAmount > 125.0) {
			System.out.println("Amount should not be greater than 125.00");
		} else if (AirtelRechargeAmount < 20.0) {
			System.out.println("Amount must be greater than 20.0 or atlease 20.0");
		} else {
			amount = AirtelRechargeAmount;
			operator = "Airtel";
			System.out.println("We are processig your request. Please wait");
			System.out.println(
					"Your recharge successful for the payment of " + amount + " Your current account balance is "
							+ amount + " Thank you for stay connected with " + operator + ". Have a happy life ahed.");
		}
	}

	public void rechargeAmoutVodafone() throws NullPointerException {
		System.out.print("Please enter your recharge amount: ");
		double VodafoneRechargeAmount = sc.nextDouble();

		if (VodafoneRechargeAmount == 0.0) {
			throw new NullPointerException("Amount must be some value instead of zero");
		} else if (VodafoneRechargeAmount > 450.0) {
			System.out.println("Amount should not be greater than 450.0 or should not be less than 50.0");
		} else if (VodafoneRechargeAmount < 50.0) {
			System.out.println("Amount should not be greater than 50.0");
		} else {
			amount = VodafoneRechargeAmount;
			operator = "Vodafone";
			System.out.println("We are processig your request. Please wait");

			System.out.println(
					"Your recharge successful for the payment of " + amount + " Your current account balance is "
							+ amount + " Thank you for stay connected with " + operator + ". Have a happy life ahed.");
		}
	}

}
