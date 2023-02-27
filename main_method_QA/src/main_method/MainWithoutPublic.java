package main_method;
//can we declare main method with different modifier insted of public
//No we can't it will throw runtime error

public class MainWithoutPublic {
	@SuppressWarnings("unused")
	private static void main(String args) {
		System.out.println("Main method not found in class");
	}	
	public static void main(String[] args) {
		System.out.println("Main method not found in class");
	}
}
