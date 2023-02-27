// Parent class
class Parent {
	String name;
	void method()
	{
		System.out.println("Method from Parent");
	}
}

// Child class
class Child extends Parent {
	int id;

	// Overriding the parent method to print the signature of the child class
	void method()
	{
		System.out.println("Method from Child");
	}
}


public class UpcastingDowncasting {
	public static void main(String[] args)
	{
		// Upcasting calling parant through child
		Parent p = new Child();
		p.name = "JAVA";

		//Printing the parentclass name
		System.out.println(p.name);
		//parent class method is overriden method hence this will be executed
		p.method();

		// Trying to Downcasting Implicitly
		// Child c = new Parent(); calling child using parant- > compile time error

		// Downcasting Explicitly
		Child c = (Child)p;

		c.id = 1;
		System.out.println(c.name);
		System.out.println(c.id);
		c.method();
	}
}

