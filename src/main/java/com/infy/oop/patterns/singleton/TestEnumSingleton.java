package com.infy.oop.patterns.singleton;

public class TestEnumSingleton {
	
	public static void main(String[] args) {
		
		EnumSingleton instance1 = EnumSingleton.INSTANCE;

		instance1.setValue(10);
		
		EnumSingleton instance2 = EnumSingleton.INSTANCE;
		instance2.setValue(20);
		
		
		System.out.println(instance1 == instance2);
		
	}

	/*
	 * The Singleton enum is a concise and thread-safe way to implement a Singleton pattern in Java. It's considered the best approach 
	 * when you need a Singleton because it handles many corner cases 
	 * (e.g., deserialization, reflection) that traditional Singleton patterns may not handle gracefully.
	 */
	
}
