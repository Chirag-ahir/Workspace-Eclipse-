package java_reflection;

class Employee {
	int id;
	String name;
}

public class GetClass {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws ClassNotFoundException {

		Employee e = new Employee();
		Class name = e.getClass();
		System.out.println(name);

		name = "hello".getClass();
		System.out.println(name);

		Class ename = Employee.class;
		System.out.println(ename);

	}
}
