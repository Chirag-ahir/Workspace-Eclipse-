package com.miit.employee;

import java.util.Comparator;

public class IdComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		if (o1.id == o2.id) {
			return o1.name.compareTo(o2.name);
		}
		return o2.id - o1.id;

	}

}
