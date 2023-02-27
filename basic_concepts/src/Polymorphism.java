
class Pizza {
	public void pizzaMethod() {
		System.out.println("The animal makes a sound");
	}
}

class Sister extends Pizza {
	public void pizzaMethod() {
		System.out.println("My sister makes Garlic pizza");
	}
}

class Brother extends Pizza {
	public void pizzaMethod() {
		System.out.println("My brother makes a sweet pizza");
	}
}

public class Polymorphism {
	public static void main(String[] args) {
		Pizza readyPizza = new Pizza();
		Pizza sisterPizza = new Sister();
		Pizza brotherPizza = new Brother();
		
		readyPizza.pizzaMethod();
		sisterPizza.pizzaMethod();
		brotherPizza.pizzaMethod();
		
	}
}
