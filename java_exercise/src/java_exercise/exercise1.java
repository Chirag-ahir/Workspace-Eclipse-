package java_exercise;
//Creating a Package and Classes

public class exercise1 {

	private String name;

	// creating constructor
	public exercise1(String name) {
		this.name = name;
	}

	//creating method
	public void myFirstConstructor() {
		System.out.println("Hello world" + " " + name + " in my world!");
	}

	public static void main(String[] args) {
		exercise1 ex = new exercise1("chirag");
		ex.myFirstConstructor();
	}

}
