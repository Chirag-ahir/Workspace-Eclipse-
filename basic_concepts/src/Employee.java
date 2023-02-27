class EmployeeNew {
	
	String name;
	int age;
	
	public EmployeeNew(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public boolean equals(EmployeeNew e) {
		return((e.name == name) && (e.age == age));
	}
}
 
public class Employee{
	public static void main(String[] args)
	{

		EmployeeNew employee1 = new EmployeeNew("Sanket",34);
		EmployeeNew employee2 = new EmployeeNew("Harshil",20);
		
		EmployeeNew employee3 = new EmployeeNew("Parth",28);
		EmployeeNew employee4 = new EmployeeNew("Parth",28);
				
		System.out.println(employee1 == employee2);
		// == operator compare the memory location of both objects
		
		System.out.println(employee1.equals(employee2));
		// .eqlas method compare the data of both objects

		System.out.println(employee3.equals(employee4));
		
	}
}

