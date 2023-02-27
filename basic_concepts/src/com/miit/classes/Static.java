package com.miit.classes;
//A static class is a class that is created inside a class, is called a static nested class in Java.

public class Static {

	public static class Age {
		public void display() {
			System.out.println("Your age is 45.");
		}
	}

	public static void main(String[] args) {
		Age A = new Age();
		A.display();
	}

}
