package com.miit.constructor;

public class Parameterized {
	
	String name;
	int age;
	Parameterized(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void show() {
		System.out.println(name + " " + age);
	}
	
	public static void main(String[] args) {
		Parameterized P = new Parameterized("Abhinav", 45);
		P.show();
	}

}
