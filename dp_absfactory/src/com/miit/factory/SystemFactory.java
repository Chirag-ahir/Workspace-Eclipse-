package com.miit.factory;

/**
 * This SystemFactory internally makes calls to AbstractSystemFactory which
 * shows one extra layer of abstraction
 */
public class SystemFactory {

	public static System getSystem(AbstractSystemFactory abstractSystemFactory) {
		return abstractSystemFactory.createSystem();
	}
	
}
