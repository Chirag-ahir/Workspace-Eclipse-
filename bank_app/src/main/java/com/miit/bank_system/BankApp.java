package com.miit.bank_system;
import java.util.Scanner;

import com.miit.bank_exception.InsufficientAmount;
import com.miit.bank_exception.NoSuchAccountFound;

public class BankApp {
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws NoSuchAccountFound, InsufficientAmount {

		int a = 1;
		Service ref[] = new Service[10]; //Array of service
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to online banking. We have two service: ");
		System.out.println("1. Saving account");
		System.out.println("2. Current account\n");
		System.out.print("Please select your account type: ");
		int op = sc.nextInt();

		if (op == 1) {
			System.out.print("Enter account holder name: ");
			String name = sc.next();

			System.out.print("Enter account no: ");
			int accno = sc.nextInt();
			System.out.print("Please set a pin: ");
			int pin = sc.nextInt();
			System.out.print("Enter initial amount: ");
			int amount = sc.nextInt();
			ref[0] = new SavingAccount(name, accno, pin, amount);
		} else {
			System.out.print("Enter account holder name: ");
			String name = sc.next();
			System.out.print("Enter account no: ");
			int accno = sc.nextInt();
			System.out.print("Please set a pin: ");
			int pin = sc.nextInt();
			System.out.print("Enter initial amount: ");
			int amount = sc.nextInt();
			// ref[0] = new CurrentAccount(name, accno, pin, amount);
		}

		do {
			System.out.println("");
			System.out.println("Choose your option from below");
			System.out.println("1. Deposit money");
			System.out.println("2. Withdraw money");
			System.out.println("3. View balance");
			System.out.println("4. Exit\n");
			System.out.print("Select from above: ");
			int ch = sc.nextInt();

			switch (ch) {
			case 1: {
				System.out.print("Enter account number: ");
				int accountNumber = sc.nextInt();
				System.out.print("Enter account pin: ");
				int accountPin = sc.nextInt();
				boolean flag = false;

				for (int i = 0; i < a; i++) {
					if (ref[i].getAcc_no() == accountNumber && ref[i].getAcc_pin() == accountPin) {
						System.out.print("Enter amount to be deposit: ");
						int amt = sc.nextInt();
						ref[i].deposit(amt);
						flag = true;
					} else {
						throw new NoSuchAccountFound("No such account found for this user!!");
					}
				}
				break;
			}
			case 2: {
				System.out.print("Enter account number: ");
				int accountNumber = sc.nextInt();
				System.out.print("Enter account pin: ");
				int accountPin = sc.nextInt();
				boolean flag = false;

				for (int i = 0; i < a; i++) {
					if (ref[i].getAcc_no() == accountNumber && ref[i].getAcc_pin() == accountPin) {
						System.out.print("Enter amount to be withdraw: ");
						int amt = sc.nextInt();
						ref[i].withdraw(amt);
						flag = true;
					} else {
						throw new NoSuchAccountFound("No such account found for this user!!");
					}
					if (flag = false) {
						System.out.println("No account found for this user!!");
					}
				}
				break;
			}
			case 3: {
				System.out.print("Enter account number: ");
				int accountNumber = sc.nextInt();
				System.out.print("Enter account pin: ");
				int accountPin = sc.nextInt();
				boolean flag = false;

				for (int i = 0; i < a; i++) {
					if (ref[i].getAcc_no() == accountNumber && ref[i].getAcc_pin() == accountPin) {
						ref[i].viewbalance();
						flag = true;
					} else {
						throw new NoSuchAccountFound("No account found for this user!!");
					}
					if (flag = false) {
						System.out.println("No account found for this user!!");
					}
				}
				break;
			}
			case 4: {
				System.out.println("Thank you for using online banking service.");
			}
			}
		} while (true);

	}
}
