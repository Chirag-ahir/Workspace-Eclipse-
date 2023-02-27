package com.miit.factory;

public interface System {
	public abstract String ram();
	public abstract String hdd();
	public abstract String cpu();
	public boolean isGraphicsEnabled();
	public boolean isBluetoothEnabled();
}
