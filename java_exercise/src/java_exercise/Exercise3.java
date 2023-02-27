package java_exercise;
//Inheritance and constructors

class Computer {
	protected int ram;
	protected int storage;
	protected boolean hasKeyboard;

	public Computer(int storage, int ram, boolean hasKeyboard) {
		super();
		this.storage = storage;
		this.ram = ram;
		this.hasKeyboard = hasKeyboard;
	}

	public void increaseRAM(int n) {
		this.ram = this.ram + n;
	}

	public void increaseStorage(int x) {
		this.storage = this.storage + x;
	}
}

class Laptop extends Computer {

	private double weight;

	public Laptop(int storage, int ram, boolean hasKeyboard, double weight) {
		super(storage, ram, hasKeyboard);
		this.weight = weight;
	}

	public boolean isClunky() {
		if (weight > 5.0) {
			return true;
		} else {
			return false;
		}
	}

}

class Mobile extends Computer {

	private int numberOfSelfies;

	public Mobile(int storage, int ram, boolean hasKeyboard, int numberOfSelfies) {
		super(storage, ram, hasKeyboard);
		this.numberOfSelfies = numberOfSelfies;
	}

	public void takeSelfie() {
		this.numberOfSelfies = this.numberOfSelfies + 1;
	}

	public int getNumberOfSelfies() {
		return this.numberOfSelfies;
	}

	public void getDetails() {
		System.out.println("--------------Mobile details--------------");
		System.out.println("storage: " + storage);
		System.out.println("ram: " + ram);
		System.out.println("is keyboard: " + hasKeyboard);
		System.out.println("how many selfie: " + numberOfSelfies + "\n");
	}
}

public class Exercise3 {
	public static void main(String[] args) {

		Laptop l = new Laptop(128, 6, true, 2);
		Mobile m = new Mobile(256, 4, false, 5);

		System.out.println(l.isClunky());
		m.getDetails();

		m.takeSelfie();
		m.getDetails();

		System.out.println(m.getNumberOfSelfies());
	}
}