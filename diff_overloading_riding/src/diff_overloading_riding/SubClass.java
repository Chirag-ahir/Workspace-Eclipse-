package diff_overloading_riding;

public class SubClass extends SuperClass {

	//var can not be override
	public String x = "B";

	public Object test() {
		return "B101";
	}

	//@Override // static method can not be override
	//in this case if subclass has same method as declare in superclass then subclass hide the method in superclass this is method hiding.
	public static String print() {
		return "B";
	}

}
