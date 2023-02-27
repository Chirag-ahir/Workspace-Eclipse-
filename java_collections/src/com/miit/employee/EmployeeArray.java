package com.miit.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class EmployeeArray {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		ArrayList<Employee> employee = new ArrayList<>();
		employee.add(new Employee(102, "nirav", "PM", 12000, "2002-02-25"));
		employee.add(new Employee(103, "swati", "TPM", 4000, "1999-10-15"));
		employee.add(new Employee(102, "umang", "PM", 19000, "2000-02-12"));
		employee.add(new Employee(101, "abhinav", "PM", 6000, "2006-05-02"));
		employee.add(new Employee(102, "umang", "PM", 7500, "2001-02-12"));

		System.out.println("================short employee based on duplicate ID================");
		Collections.sort(employee, new IdComparator());
		Iterator itr = employee.iterator();
		while (itr.hasNext()) {
			Employee e = (Employee) itr.next();
			System.out.println(e.id + " " + e.name + " " + e.position + " " + e.salary + " " + e.dob);
		}

		System.out.println("================short employee based on dob================");
		Collections.sort(employee, new DobComparator());
		Iterator itr1 = employee.iterator();
		while (itr1.hasNext()) {
			Employee e = (Employee) itr1.next();
			System.out.println(e.id + " " + e.name + " " + e.position + " " + e.salary + " " + e.dob);
		}

		System.out.println("================find second highest salary================");
		Collections.sort(employee, new SalaryComparator());
		Iterator itr2 = employee.iterator();

		@SuppressWarnings("unused")
		Employee ef = (Employee) itr2.next();
		Employee es = (Employee) itr2.next();
		System.out.println(es.id + " " + es.name + " " + es.position + " " + es.salary + " " + es.dob);

	}
}
