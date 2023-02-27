package com.miit.factory;

import com.miit.factoryimpl.Laptop;
import com.miit.factoryimpl.PC;

public class SystemFactory {

	private SystemFactory() {

	}

	public static System getSystem(SystemType systemType, String ram, String hdd, String cpu, boolean isGraphicsEnabled, boolean isBluetoothEnabled) {
		switch (systemType) {
			case PC:
				return new PC(ram, hdd, cpu, isGraphicsEnabled, isBluetoothEnabled);
			case LAPTOP:
				return new Laptop(ram, hdd, cpu, isGraphicsEnabled, isBluetoothEnabled);
			default:
				throw new RuntimeException("Invalid Computer Type!!");
		}
	}

}
