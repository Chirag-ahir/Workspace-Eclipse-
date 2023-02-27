package com.miit.employee;

import java.util.Comparator;

public class DobComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.dob.compareTo(o2.dob);
	}

}
