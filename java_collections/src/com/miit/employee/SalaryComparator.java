package com.miit.employee;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o2.salary.compareTo(o1.salary);
	}

}
