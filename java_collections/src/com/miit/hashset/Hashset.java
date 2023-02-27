package com.miit.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Hashset {
	public static void main(String[] args) {

		// Hashset not contains duplicate
		Set<String> emp = new HashSet<>();
		System.out.println(emp.add("monika"));
		System.out.println(emp.add("monika"));

		System.out.println(emp);

		// list contains duplicate
		List<String> emp1 = new ArrayList<>();
		System.out.println(emp1.add("monika"));
		System.out.println(emp1.add("monika"));
		
		
		

		System.out.println(emp1);
		
	}

}

/*
points to remember
HashSet stores the elements by using a mechanism called hashing.
HashSet contains unique elements only.
HashSet allows null value.
HashSet class is non synchronized.
HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
HashSet is the best approach for search operations.
The initial default capacity of HashSet is 16, and the load factor is 0.75.
*/
