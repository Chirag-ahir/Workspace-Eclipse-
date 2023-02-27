package com.miit.cloning;

public class Marker implements Cloneable {

	int rollno;
	String name;

	public Marker(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) {
		try {
			Marker m1 = new Marker(12, "Hardik");
			Marker m2 = (Marker) m1.clone();

			System.out.println(m1.rollno + " " + m1.name);
			System.out.println(m2.rollno + " " + m2.name);
		} catch (CloneNotSupportedException c) {
		}
	}
}
