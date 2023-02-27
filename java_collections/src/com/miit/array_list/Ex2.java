package com.miit.array_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Ex2 {
	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();

		System.out.println("Enter 5 number: ");
		try (Scanner sc = new Scanner(System.in)) {
			for (int i = 0; i < 5; i++) {
				int n = sc.nextInt();

				if (!numbers.contains(n)) {
					numbers.add(n);
				}
			}
		}
		System.out.println("your arraylist: " + numbers);
		Collections.sort(numbers);
		System.out.println("your sorted array: " + numbers);

	}
}
