package com.miit.classes;
//plain object java object: A class which contains only private variables and setter and getter methods to use those variables is called POJO class.

public class POJO {

	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		POJO P = new POJO();
		P.setAge(45);
		System.out.println(P.getAge());
	}

}
