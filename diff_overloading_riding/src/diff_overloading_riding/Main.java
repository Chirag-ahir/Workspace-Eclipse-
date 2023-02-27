package diff_overloading_riding;

public class Main {
	public static void main(String[] args) {

		SuperClass sc = new SubClass(); //here ref is of super class but object is of subclass.
		
		System.out.println(sc.x); //will call super class var
		System.out.println(sc.test()); //will call sub class method
		//System.out.println(sc.print()); //will call super class method
		
	}

}
