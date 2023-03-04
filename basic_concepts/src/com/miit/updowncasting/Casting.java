package com.miit.updowncasting;

class Base {
	public void methodOne() {
		System.out.print("A");
		methodTwo();
	}

	public void methodTwo() {
		System.out.print("B");
	}
}

class Derived extends Base {
	public void methodOne() {
		super.methodOne();
		System.out.print("C");
	}

	public void methodTwo() {
		super.methodTwo();
		System.out.print("D");
	}

	public void methodThree() {
		super.methodTwo();
		System.out.print("D");
	}
}

public class Casting {
	public static void main(String args[]) {
		
		Base b = new Derived(); // Upcasting
		b.methodOne();
		System.out.println();
//		b.methodTwo();
//		System.out.println();
		Base b2 = new Base();
		b2.methodOne();
//		b2.methodTwo();
		
		System.out.println();
		Derived d = (Derived) b; // Downcasting
		d.methodOne();
		
	}
}
