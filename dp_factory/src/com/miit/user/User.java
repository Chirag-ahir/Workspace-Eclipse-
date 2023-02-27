package com.miit.user;

import com.miit.factory.SystemFactory;
import com.miit.factory.SystemType;

public class User {
	public static void main(String[] args) {
		
		// Create System with different configurations
		com.miit.factory.System pc = SystemFactory.getSystem(SystemType.PC, "16 GB", "120 GB", "2,23 HGZ", true, true);
		System.out.println("PC Config::" + pc);

		com.miit.factory.System laptop = SystemFactory.getSystem(SystemType.LAPTOP, "16 GB", "140 GB", "2,23 HGZ", true, true);
		System.out.println("Laptop Config::" + laptop);
	}
}
