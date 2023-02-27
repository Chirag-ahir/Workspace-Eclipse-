package com.pizza.dto;

public class PizaDto {

	protected static int pizza_price;
	protected static int topping_price;
	protected int italian_price = 12;
	protected int macaroni_price = 9;
	protected int margerita_price = 7;
	protected int broccoli_price = 4;
	protected int jalapeno_price = 8;
	protected int pepperoni_price = 6;

	public void getPizzaBill() {
		System.out.println("--------------------------------");
		System.out.print("Your total checkout is: ");
		System.out.println(PizaDto.pizza_price + PizaDto.topping_price + "$");
	}

}
