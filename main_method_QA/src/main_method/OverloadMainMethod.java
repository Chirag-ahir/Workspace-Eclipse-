package main_method;

//1. can we overload main method in java ? yes we can overload main method
//if a class has multiple method of same name but different parameters is known as....

public class OverloadMainMethod {

	public static void main(String name) {
		System.out.println(name);
	}

	public static void main(int id, String name) {
		System.out.println(id);
		System.out.println(name);
	}

	public static void main(String[] args) {
		System.out.println("this is a jvm main method");
		main("jiya");
		main(101, "jiya");
	}
}
