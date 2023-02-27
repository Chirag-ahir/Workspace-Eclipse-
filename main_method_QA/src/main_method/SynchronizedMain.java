package main_method;
//can we synchronize main method ? Yes we can 
//can we final main method ? Yes we can

public class SynchronizedMain {
	public synchronized static void main(String[] args) {
		System.out.println("synchronized main method");
	}
}
