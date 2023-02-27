package com.miit.classes;

abstract class Sum {
	public abstract int sum(int a, int b);
}

class Method extends Sum {
	public int sum(int a, int b) {
		System.out.println(a + b);
		return a+b;
	}
}

class Abstract {
	public static void main(String[] args) {
		Method M = new Method();
		M.sum(7, 9);
	}
}
