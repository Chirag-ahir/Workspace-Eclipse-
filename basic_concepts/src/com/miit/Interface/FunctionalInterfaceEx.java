package com.miit.Interface;
//An interface that contains only one abstract method is known as functional interface. It can have any number of default and static methods.

interface sayabale {
	void say(String msg);
}

public class FunctionalInterfaceEx implements sayabale {

	public void say(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		FunctionalInterfaceEx file = new FunctionalInterfaceEx();
		file.say("Hello polar");
	}

}
