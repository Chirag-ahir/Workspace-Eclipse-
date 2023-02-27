package com.miit.employee;

public class Employee {

	Integer id;
	String name;
	String position;
	Integer salary;
	String dob;

	Employee(int id, String name, String position, int salary, String dob) {
		super();
		this.id = id;
		this.name = name;
		this.position = position;
		this.salary = salary;
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", position=" + position + ", salary=" + salary + ", dob="
				+ dob + "]";
	}

}
