package com.miit.factory;

import com.miit.factimpl.PC;

/**
 *PCFactory implements AbstractComputerFactory and AbstractComputerFactory returns
 *reference of super interface Computer which shows one extra layer of abstraction.
 */
public class PCFactory implements AbstractSystemFactory{

	private String ram;
	private String hdd;
	private String cpu;
	private boolean isGraphicsEnabled;
	private boolean isBluetoothEnabled;
	
	public PCFactory(String ram, String hdd, String cpu, boolean isGraphicsEnabled, boolean isBluetoothEnabled) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
		this.isGraphicsEnabled = isGraphicsEnabled;
		this.isBluetoothEnabled = isBluetoothEnabled;
	}
	
	/**
	 * Overridden method of AbstractComputerFactory
	 * which returns reference of super interface Computer
	 */
	public System createSystem() {
		return new PC(ram, hdd, cpu, isGraphicsEnabled, isBluetoothEnabled);
	}

}
