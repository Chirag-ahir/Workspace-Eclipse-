package dp_factory;

public class SelectNetwork {
	
	public cellularplan getPlan(String planType) {
	
		if (planType.equalsIgnoreCase("abcNetwork")) {
			return new AbcNetwork();
		} else if (planType.equalsIgnoreCase("xyzNetwork")) {
			return new XyzNetwork();
		} else if (planType.equalsIgnoreCase("pqrNetwork")) {
			return new PqrNetwork();
		}
		return null;
	}
	
}
