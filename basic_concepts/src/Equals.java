// == use for premitive datatypes
// .equals method used incase of Reference datatypes

public class Equals {
	public static void main(String[] args) {
		
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		int i1 = 3;
		int i2 = 3;
				
		System.out.println(s1 == s2); //Comparing memory location of both String which are not same 
		System.out.println(i1 == i2); //Comparing values both integer which are same
		System.out.println(s1.equals(s2)); //Comparing values of both strings which are same

	}

}
