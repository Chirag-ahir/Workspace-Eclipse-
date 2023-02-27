package com.miit.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StudentArray {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student(101, "abhinav", 21));
		students.add(new Student(102, "asit", 24));
		students.add(new Student(103, "sanket", 12));

		System.out.println("================= Sorting by age =================");
		Collections.sort(students, new AgeComparator());
		Iterator itr = students.iterator();
		while (itr.hasNext()) {
			Student st=(Student)itr.next(); 
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
		
		
		
		
	}

}
