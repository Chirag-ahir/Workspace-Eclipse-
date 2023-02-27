package com.miit.user;

import com.miit.factory.LaptopFactory;
import com.miit.factory.PCFactory;
import com.miit.factory.SystemFactory;

public class User {

	public static void main(String[] args) {

		// Client calls ComputerFactory to Create Computer with different configurations
		try {
			
			com.miit.factory.System pc = SystemFactory.getSystem(new PCFactory("16 GB", "120 GB", "2,23 HGZ", true, true));
			com.miit.factory.System laptop = SystemFactory.getSystem(new LaptopFactory("16 GB", "140 GB", "2,23 HGZ", true, true));
			
			System.out.println("PC Config::" + pc);
			System.out.println("Laptop Config::" + laptop);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
