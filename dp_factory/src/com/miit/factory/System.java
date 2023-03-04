package com.miit.factory;

//This is our SuperType as a Interface 
//We can also define SuperType as a Interface 
//Now let's define a subtype of this superclass

public interface System {
	public abstract String ram();
	public abstract String hdd();
	public abstract String cpu();
	public boolean isGraphicsEnabled();
	public boolean isBluetoothEnabled();
}
