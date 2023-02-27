package com.miit.employee_hashmap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Objects;

class Employee {

	int id;
	String name;
	int salary;

	Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id;
	}

}

public class EmpHashmap {
	public static void main(String[] args) {

		Employee e1 = new Employee(101, "rajan", 10000);
		Employee e2 = new Employee(101, "rajan", 10000);
		Employee e3 = new Employee(102, "shruti", 5000);
		Employee e4 = new Employee(103, "swati", 4000);

		HashMap<Employee, String> emp = new HashMap<>();
		emp.put(e1, "employee 1");
		emp.put(e2, "employee 2");
		emp.put(e3, "employee 3");
		emp.put(e4, "employee 4");

		for (Entry<Employee, String> entry : emp.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}

		

	}
}
