package com.infy.oop.patterns.singleton;

import java.io.Serializable;

public class LazySingleton implements Serializable{
	
	public static LazySingleton instance = null;

	private LazySingleton()
	{
		// since this is a private constructor.. only accessible in this class
	}
	
	public static LazySingleton getInstance()
	{
		if(instance == null)
		{
			instance = new LazySingleton();
		}
		return instance;
	}
	
	protected Object readResolve() {
		System.out.println("inside readresolve method!!!");
		return instance;
	}
	
	//Drawback : The instance is created irrespective of it is required in runtime or not. 
}
