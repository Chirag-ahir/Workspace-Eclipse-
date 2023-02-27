package com.pizza.main;

import java.util.Scanner;

import com.pizza.dto.PizaDto;
import com.pizza.price.PriceMenu;

public class PizzaApp extends PizaDto {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		PriceMenu PM = new PriceMenu();
		PizaDto PPR = new PizaDto();

		Scanner sc = new Scanner(System.in);

		System.out.print("Please choose your pizza type: 1. Italian Pizza 2. MargeritaPizza 3. MacronniPizza: ");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			PM.addItalianPizza();
			break;
		case 2:
			PM.addMargeritaPizza();
			break;
		case 3:
			PM.addMacroniPizza();
			break;
		}

		for (int i = 0; i < 2; i++) {
			System.out.print("Please select your toppings: 1. Brocalli 2. Jalapeno 3. Pepperoni 4. exit: ");
			int Tchoice = sc.nextInt();
			switch (Tchoice) {
			case 1:
				PM.addBroccoli();
				break;
			case 2:
				PM.addJalapeno();
				break;
			case 3:
				PM.addPepperoni();
				break;
			case 4:
				break;
			}
		}

		PPR.getPizzaBill();

	}
}
