package com.miit.constructor;

public class Overloading {
	
	String name;
	int age;
	int id;
	
	Overloading(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	Overloading(String name, int age, int id){
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	void show() {
		System.out.println(name + " " + age + " " + id);
	}
	
	public static void main(String[] args) {
		Overloading O = new Overloading("Abhinav", 45);
		Overloading O1 = new Overloading("Abhinav", 45, 550);
		O.show();
		O1.show();
	}

}
