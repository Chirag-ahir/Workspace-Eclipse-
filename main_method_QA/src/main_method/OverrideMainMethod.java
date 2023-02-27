package main_method;
//can we override main method in java ? no we can't 
//method overriding of static method is not possible in java

class ChildClass{
	public static void main(String[] args) {
		System.out.println("Method of child class");
	}
}

public class OverrideMainMethod extends ChildClass{
	//@Override
	public static void main(String[] args) {
		System.out.println("Mthod of parent class");
	}
}
