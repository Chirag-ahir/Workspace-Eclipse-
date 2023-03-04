package dp_singleton;

public class SingletonDemo {

	public static void main(String[] args) {
		
		Singleton singleton = Singleton.getInstance("FOO");
		Singleton anotherSingleton = Singleton.getInstance("BAR");
		
		System.out.println(singleton.value);
		System.out.println(anotherSingleton.value);
		
	}

}
