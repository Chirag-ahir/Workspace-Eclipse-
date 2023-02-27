package com.miit.classes;

//final class Base {
class Base{
	void Display() {
		System.out.print("This is the Display() method of BaseClass.");
	}
}

class DerivedClass extends Base { // Compile-time error - can't inherit final class
	void Display() {
		System.out.print("This is Display() method of DerivedClass.");
	}
}

public class Final {
	public static void main(String[] arg) {
		DerivedClass d = new DerivedClass();
		d.Display();
	}
}