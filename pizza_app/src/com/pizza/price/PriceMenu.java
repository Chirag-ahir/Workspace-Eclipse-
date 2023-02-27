package com.pizza.price;

import com.pizza.dto.PizaDto;

public class PriceMenu extends PizaDto {

	public void addItalianPizza() {
		System.out.print("Italian pizza selected: ");
		PizaDto.pizza_price += italian_price;
		System.out.println(PriceMenu.pizza_price + "$");
	}

	public void addMacroniPizza() {
		System.out.print("Macroni pizza selected: ");
		PizaDto.pizza_price += macaroni_price;
		System.out.println(PizaDto.pizza_price + "$");
	}

	public void addMargeritaPizza() {
		System.out.print("Margerita pizza selected: ");
		PizaDto.pizza_price += margerita_price;
		System.out.println(PizaDto.pizza_price + "$");
	}

	public void addBroccoli() {
		System.out.print("Broccoli added as topping: ");
		PizaDto.topping_price += broccoli_price;
		System.out.println(this.broccoli_price + "$");
	}

	public void addJalapeno() {
		System.out.print("Jalapeno added as topping: ");
		PizaDto.topping_price += jalapeno_price;
		System.out.println(this.jalapeno_price + "$");
	}

	public void addPepperoni() {
		System.out.print("Pepperoni added as topping: ");
		PizaDto.topping_price += pepperoni_price;
		System.out.println(this.pepperoni_price + "$");
	}

}
