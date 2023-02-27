package com.miit.classes;
//Any normal class which does not have any abstract method or a class having an implementation for all of its methods is basically a concrete class. 

public class Concrete {

	static void sum(int a, int b) {
		System.out.println(a + b);

	}

	public static void main(String[] args) {
		Concrete.sum(8, 9);
	}
	
}
