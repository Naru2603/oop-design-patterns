package com.infy.oop.patterns.singleton;

public class EagerSingleton {
	
	private static EagerSingleton instance = new EagerSingleton();

	private EagerSingleton()
	{
		// since this is a private constructor.. only accessible in this class
	}
	
	public static EagerSingleton getInstance()
	{
		return instance;
	}
	
	//Drawback : The instance is created irrespective of it is required in runtime or not. 
}
