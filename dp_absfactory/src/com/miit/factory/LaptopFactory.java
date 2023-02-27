package com.miit.factory;

import com.miit.factimpl.Laptop;

/**
 *LaptopFactory implements AbstractComputerFactory and AbstractComputerFactory returns
 *reference of super interface Computer which shows one extra layer of abstraction.
 */
public class LaptopFactory implements AbstractSystemFactory {
 
	private String ram;
	private String hdd;
	private String cpu;
	private boolean isGraphicsEnabled;
	private boolean isBluetoothEnabled;
	
	public LaptopFactory(String ram, String hdd, String cpu, boolean isGraphicsEnabled, boolean isBluetoothEnabled) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
		this.isGraphicsEnabled = isGraphicsEnabled;
		this.isBluetoothEnabled = isBluetoothEnabled;
	}
 
	/**
	 * Overridden method of AbstractSystemFactory
	 * which returns reference of super interface System
	 */
	public System createSystem() {
		return new Laptop(ram, hdd, cpu, isGraphicsEnabled, isBluetoothEnabled);
	}
	
	
 
}