package vehicle_app;

public class app {
	public static void main(String[] args) {
		SUV fortuner = new SUV("Fortuner", true);
		fortuner.acclerate(20);
		fortuner.acclerate(40);
		fortuner.acclerate(-80);
	}
}
