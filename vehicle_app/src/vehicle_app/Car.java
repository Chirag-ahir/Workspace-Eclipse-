package vehicle_app;

public class Car extends Vehicle{

	private int wheels;
	private String type;
	private int doors;
	private int gears;
	private boolean isManual;
	private int currentGear;
	
	public Car(String name, int wheels, int doors, int gears, boolean isManual, String type) {
		super(name);
		this.type = type;
		this.gears = gears;
		this.doors = doors;
		this.isManual = isManual;
		this.wheels = wheels;
		this.currentGear = 1;
	}
	
	public void getCarDetails() {
		System.out.println("Your car type is: " + type);
		System.out.println("Your car has: " + doors + " doors");
		System.out.println("You car has: " + wheels + " wheels");
		System.out.println("Your car has: " + gears + " gears");
		System.out.println("Is your car manual ? " + isManual);
	}
	
	public void changeGear(int newGear) {
		this.currentGear = newGear;
		System.out.println("Changed to gear " + this.currentGear);
	}
	
	public void changeSpeed(int newSpeed, int newDirection) {
		move(newSpeed,newDirection);
		System.out.println("Change method called: speed-->"+newSpeed + " direction-->" + newDirection);
	}
	
}
