
interface Printable{
	void print();
}

interface Showable{
	void show();
}

class All implements Printable,Showable{
	public void print() {
		System.out.println("System is printing.");
	}
	public void show() {
		System.out.println("System is showing.");
	}
}

public class MultipleInheritanceInterface {

	public static void main(String[] args) {
		All obj = new All();
		obj.print();
		obj.show();
	}

}
